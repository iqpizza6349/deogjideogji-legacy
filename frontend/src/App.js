import './App.css';
import Template from "./component/Template";
import Logo from "./component/Logo";
import GoogleButton from "./component/oauth/google/GoogleButton";

function App() {
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

export default App;
