import {Navigate} from "react-router-dom";
import {toast} from "react-toastify";
import 'react-toastify/dist/ReactToastify.css';

toast.configure();

const Any = () => {
    if (!!localStorage.getItem("token") === false) {
        return <Navigate to="/"/>
    }

    function loginSuccess() {
        const notify = () => {
            toast.success("로그인 성공", {
                autoClose: 3000,
            });
        }

        return notify();
    }

    loginSuccess();
    return (
        <div>
            Hello, There
        </div>
    );
}

export default Any;