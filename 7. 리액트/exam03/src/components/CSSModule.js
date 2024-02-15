import { useState } from 'react';
import styles from './CSSModule.module.scss'; // 확장자를 .modules.scss로 하면 해시화하여 중복X
// import classNames from 'classnames';
import classNames from 'classnames/bind';
const CSSModule = ({ name }) => {
  const cx = classNames.bind(styles);
  const [active, setActive] = useState(false);
  return (
    <>
    <header className={cx('wrap', {on: active})}>
      반갑습니다.
      <span className="title">{name}</span>님..
    </header>
    <button type="button" onClick={() => setActive(!active)}>클릭!</button>
    </>
  );
};

 // onclick보다 useCallback을 쓰는 게 좋다.
export default CSSModule;
