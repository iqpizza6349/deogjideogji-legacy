import React, {Component} from "react";
import {GoogleLogin} from 'react-google-login';
import styled from 'styled-components';

const clientId = process.env.REACT_APP_GOOGLE_ID;

class GoggleButton extends Component {

    constructor(props) {
        super(props);

        this.state = {
            id: '',
            name: '',
            provider: '',
        }
    }

    // Google Login
    responseGoogle = (res) => {
        console.log(res);
    }

    // Login Fail
    responseFail = (err) => {
        console.error(err);
    }

    render() {
        return (
            <Container>
                <GoogleLogin
                    clientId={clientId}
                    buttonText="Sign in with Google"
                    onSuccess={this.responseGoogle}
                    onFailure={this.responseFail}
                    theme="dark"
                />
            </Container>
        );
    }
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

export default GoggleButton;