import './App.css';
import Home from "./component/Home";
import Any from "./component/Any";
import {Navigate, Route, Routes} from "react-router-dom";
import React from "react";

const App = () => {
  return (
      <div>
          <Routes>
              <Route path="/" element={<Home/>}/>
              <Route
                  path="sad/"
                  element={<Any isLogin/>}
              />
          </Routes>
      </div>
  );
}

export default App;
