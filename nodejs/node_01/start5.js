const keys = ["이름", "주소", "전화번호"];

const stydent = { 이름: "홍길동", 주소: "서울시", 전화번호: "010-111-1111" };

console.log(student["이름"]);
console.log(student[keys[0]]);

for (let i = 0; i < keys.length; i++) {
  console.log(keys[i], student[keys[i]]);
}

//json 데이터인 student 의 이름 속성을 별도로 추출하여 개별 변수로 선언하기
const { 이름 } = student;
console.log(이름);

// json 타입 데이터를 리턴하는 함수
const studentFun = () => {
  return {
    aname: "이몽룡",
    주소: "남원시",
    나이: 20,
  };
};
const { aname, 나이 } = studentFun();
console.log(aname, 나이);
