import './App.css';
import Home from "./component/Home";
import Any from "./component/Any";
import {Route, Routes} from "react-router-dom";

const App = () => {
  return (
      <Routes>
        <Route path="/*" element={<Home/>}/>
        <Route path="sad/*" element={<Any/>}/>
      </Routes>
  );
}

export default App;
