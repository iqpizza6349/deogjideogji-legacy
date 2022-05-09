import Template from "./Template";
import Logo from "./Logo";
import GoogleButton from "./oauth/google/GoogleButton";
import {Navigate} from "react-router-dom";

const Home = () => {

    if (!!localStorage.getItem("token") === true) {
        return (
            <Navigate to="/sad"/>
        );
    }

    return (
        <div className="App">
            <Template children={
                <div>
                    <div>
                        <Logo/>
                    </div>
                    <div>
                        <GoogleButton/>
                    </div>
                </div>
            }/>
        </div>
    );
}

export default Home;