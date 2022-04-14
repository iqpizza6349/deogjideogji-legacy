import React from "react";
import {GoogleLogin} from 'react-google-login';
import styled from 'styled-components';
import axios from 'axios';
import {useNavigate} from "react-router-dom";

const clientId = process.env.REACT_APP_GOOGLE_ID;

const GoogleButton = () => {

    const navigate = useNavigate();

    // Google Login
    const responseGoogle = (response) => {
        let oauthData = response.profileObj;

        const data = {
            email: oauthData.email,
            name: oauthData.name,
            image_url: oauthData.imageUrl
        }

        let config = {
            headers: {
                'Content-Type': "application/json"
            }
        };

        const googleLogin = async () => {
            const res = await axios.post(process.env.REACT_APP_GOOGLE_REDIRECT, data, config);

            console.log(res.status);
            return res;
        }

        googleLogin().then(res => {
            if (res.status === 201 || res.status === 409) {
                localStorage.setItem("token", response.googleId);
                navigate('/sad');
            }
        }).catch(error => {
            console.log(error);
        });
    }

    // Login Fail
    const responseFail = (err) => {
        console.error(err);
    }

    return (
        <Container>
            <GoogleLogin
                clientId={clientId}
                buttonText="Sign in with Google"
                onSuccess={responseGoogle}
                onFailure={responseFail}
                theme="dark"
            />
        </Container>
    );
}

const Container = styled.div`
    width: 200px;
    height: 20px;
    flex-flow: column wrap;
    position: absolute;
    margin: 0 auto;
    bottom: 120px;
    left: calc(50% - 100px);
`

export default GoogleButton;