import React from "react";
import { useNavigate, Navigate, NavLink } from "react-router-dom";
import classnames from "classnames";
const Header = () => {
    const navigate = useNavigate();
    const isLogin = true;

    if (!isLogin) {
        return <Navigate to="/login" />
    }
    
    return (
        <>
            <h1>헤더 영역</h1>
            <button type="button" onClick={() => navigate('/login', { replace: true })}>로그인</button>
            <button type="button" onClick={() => navigate(-1)}>BACK</button>
            <button type="button" onClick={() => navigate(+1)}>FORWARD</button>

            {/* About 페이지에서만 on class를 갖도록 */}
            <NavLink to="/about" className ={({isActive}) => classnames({on: isActive})}>About 페이지</NavLink>
        </>
    );
};

export default React.memo(Header);