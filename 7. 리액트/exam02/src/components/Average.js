import React, { useState, useMemo, useCallback } from 'react';

function getAverage(list) {
    const total = list.reduce((a,b) => a + b, 0);

    const avg = Math.round((total * 100) / list.length) / 100; // 소수점 둘째자리까지
    console.log('getAverage함수 호출');
    return avg;
}

const Average = () => {
    const [number, setNumber] = useState(0);
    const [list, setList] = useState([]);
    
    const onChange = useCallback((e) => setNumber(parseInt(e.currentTarget.value)), []); // 한번만 정의하고 다시 하지 않음
    /*
    const onClick = useCallback(() => {
        setList(list.concat([number]));
        setNumber('');
    }, [list, number]); // 값이 바뀌었을 때만 값을 새로 정의한다.
    */
    const onClick = useCallback(() => {
        setList(() => list.concat(number));
        setNumber('');
    }, [number]);
    
    const avg = useMemo(() => getAverage(list), [list]); // 입력중에도 렌더링되는 문제를 해결하기 위해서 사용
    /* 메모제이션 - 캐싱 기법 */

  return (
    <div>
      <div>
        <input type="number" onChange={onChange} value={number} />
        <button type="button" onClick={onClick}>
          평균구하기
        </button>
      </div>
      <ul>
        {list.map((number, i) => (
          <li key={i}>{number}</li>
        ))}
      </ul>
      {/* <div>평균 : {getAverage(list)}</div> */}
      <div>평균 : {avg}</div>
    </div>
  );
};


export default React.memo(Average);
