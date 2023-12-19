// 효과를 적용할 HTML 태그(요소) 찾기
const number = document.getElementById("number");
const increase = document.getElementById("increase");
const decrease = document.getElementById("decrease");

// logging : 현재 상태 모니터링
console.log(number);
console.log(increase);
console.log(decrease);
number.innerText = 100;
// increase.innerText = 'Inc';
// decrease.innerText = 'Dec';

// 이벤트가 발생하면 이벤트를 처리하는 메소드를 
// 이벤트리스너 또는 이벤트핸들러라고 부른다.
// 이벤트핸들러는 자바스크립트가 부르므로 콜백함수
// increase버튼 위젯에서 마우스를 누르면 마우스 누른 처리를 하는 함수가 호출된다.
// 그렇게 하기 위해 이벤트처리 익명함수 또는 표준함수 등록
increase.onclick = () => {
    // console.log("increase가 클릭됨")
    // alert('increase 클릭')

    // 현재 number위젯의 값 얻기
    // HTML위젯의 텍스트는 기본적으로 문자열.
    // 숫자로 변환 필요
    const current = parseInt(number.innerText, 10)
    number.innerText = current + 1
    number.style.fontSize = '50px'

}
decrease.onclick = () => {
    // console.log("decrease가 클릭됨")

    const current = parseInt(number.innerText, 10)
    number.innerText = current - 1

    /* CSS를 자바스크립트로 다루실 때는
        1. CSS 속성이름은 미니카멜표기법 적용.
        2. 모든 속성값은 문자열로 입력
    */
    number.style.backgroundColor = 'lightgreen'
    number.style.textAlign = 'center'
}