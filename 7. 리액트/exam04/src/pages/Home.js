import React from 'react';
import { Link } from 'react-router-dom';
// 이동 기록이 남지 않아 성능에 좋다
const Home = () => {
    return (
        <>
            <h1>Home!</h1>
            <Link to="/about">About 페이지 이동</Link>
        </>
    );
};

export default React.memo(Home);