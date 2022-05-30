-- 여기는 root 화면
-- root 는 oracle 의 sys 와 같은 역할
/*
mySQL 사용자와 DB(data 저장소)의 관계가 연결 아니다
오라클에서는 사용자에게 default Table Space 지정하여
로그인을하면 자동으로 기본 DB가 연결된다

사용자는 단순히 DB 서버에 접속하는 권한을 부여받을 뿐이고
어떤 DB를 사용할 것인지 처음 시작할 때 연결을 해주어야 한다
*/

-- DB 저장소 생성
CREATE DATABASE myDB;

-- 일반 사용자 생성
-- mySQL 은 전통적으로 root 사용자로 접속하여 DB 관리한다
-- 최근 추세는 root 사용자는 DB, USER 생성만을 담당하고 
-- DB 관리는 일반 사용자등 생성하여 실행하도록 권장한다
-- mySQL은 사용자를 생설할 때 어떤 방법으로 접속할 것인지 명시해야 한다
-- callor 사용자는 localhost 에서만 mySQL 서버에 접속할 수 있다
CREATE USER 'callor'@'localhost'
identified by '!Korea8080'






