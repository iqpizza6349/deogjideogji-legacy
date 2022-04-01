import React, {Component} from "react";
import imgfile from './img/deogjideogji_logo.png';

class Logo extends Component {
    render() {
        return (
            <div className="logo">
                <img className="logo_img" src={imgfile} alt=""/>
            </div>
        );
    }
}

export default Logo;