import './App.css';
import Template from "./component/Template";
import Logo from "./component/Logo";
import GoggleButton from "./component/oauth/google/GoggleButton";

function App() {
  return (
    <div className="App">
      <Template children={
          <div>
              <div>
                  <Logo/>
              </div>
              <div>
                    <GoggleButton/>
              </div>
          </div>
      }/>
    </div>
  );
}

export default App;
