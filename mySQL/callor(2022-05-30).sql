-- 여기는 callor 화면

-- MYSQL 은 DB와 관련된 명령을 실행할 때
-- 가장 먼저 어떤 DB를 사용할 것인지 알려줘야 한다
USE MYDB;

drop table tbl_test;
-- 테이블을 생셩할 때 칼럼의 이름은 사전에 있는 키워드는 가급적
-- 사용하지 않는 것이 좋다
-- 사전에 있는 키워드를 사용할 때는 접두사를 부착하여 사용하는 것이 좋다 

CREATE TABLE tbl_test (
	ID BIGINT primary key auto_increment,
    t_NAME VARCHAR(30)
);
/*
DBMS 중에서 가장 많이 사용하는 오라클과 함께
MYSQL 을 사용하는데
MYSQL 에서 사용하는 방식이 DBMS 의 업계표준으로
정착이 된 상태 

대부분의 DBMS 들은 먼저 Datebase 를 생성하고
사용자가 Database에 접근할 수 있는 권한을 부여하고
사용자는 Datebase를 사용하겠다고 선언을 한 후
DB 관련된 명령을 사용한다 
*/

insert into tbl_test ( t_name )
values ('홍길동');

select * from tbl_test;
-- 당중데이터 insert 하기 
insert into tbl_test ( t_name)
values ('이몽룡'), ('성춘향'), ('장영자'), ('서시'), ('장희빈');

/*
tbl_test 의 ID 칼럼은 auto_increment 로 설정되었기 때문에
데이터를 insert 할 때마다 자동으로 Sequence 값이 생성되어 추가된다. 
5.x mySQL 에서는 auto-increment 칼럼에 이슈가 있었다
5.x 숫자 타입은 주로 INT 형을 사용하는데 INT 형은 정수 11자리이다
때문에 정수형 11자리 범위를 벗어나는 경우 데이터 insert 가 불가능해지는
문제가 있었다 
5.7 버전 이후에는 bigint 형 타입이 도입되어 문제를 해결하였다
DB table 을 만들 때 auto_increment 칼럼에는 반드시 bigint 형을 지정하자

mySQL 숫자형 데이터 타입
TINYINT : 1Byte : -128 ~ 127 까지만 저장가능
SMALLINT : 2Byte : -32768 ~ 32767 까지
MEDIUMINT : 3BYTE
INT : 4Byte :
BIGINT : 8Byte : -2의 7승 -1 부터 2의 7승 까지 
*/

/*
AUTO INCREMENT 칼럼을 만들 때 주의할 점
데이터 타입은 BIGINT 로 설정
가급적 PRIMARY KEY 로 설정할 것
PK 아닌 경우는 반드시 NOT NULL 과 UNIQUE를 같이 설정한다
PK 또는 NOT NULL AND UNIQUE 설정이 되지 않았을 경우
테이블 생성에서 오류가 난다
*/

create table tbl_student (
ST_NUM	VARCHAR(5),
ST_NAME	VARCHAR(20),
ST_DEPT	VARCHAR(10),
ST_GRADE int,
ST_TEL	VARCHAR(15),
ST_ADDR	VARCHAR(125)
);



