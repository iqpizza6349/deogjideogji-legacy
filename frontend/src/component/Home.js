import Template from "./Template";
import Logo from "./Logo";
import GoogleButton from "./oauth/google/GoogleButton";

const Home = () => {
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