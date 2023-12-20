import "./App.css";
import React from "react";

import Left_Component from "./components/left_side_component/left_side_component";
import Main_Component from "./components/maincomponent/maincomponent";
import Right_Component from "./components/right_side_component/right_side_component";
import useScript from "./components/js_link/js_comp_link";
function App() {
  return (
    <>
      useScript('script.js')
      <div className="container">
        <Left_Component />
        <Main_Component />
        <Right_Component />
      </div>
    </>
  );
}

export default App;
