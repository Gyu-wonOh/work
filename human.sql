drop table human;
create table human(
            name nvarchar2(100),
            age number(3),
            height number(7,3),
            birthday date
);

insert into human(name,age,height,birthday)
values('김수호',20,160.4,to_date('2005:05:05:02:25:50','YYYY:MM:DD HH24:MI:SS'));
insert into human(name,age,height,birthday)
values('나수호',24,170.8,to_date('2000:10:15 12:25:10','YYYY:MM:DD
HH24:MI:SS'));
insert into human(name,age,height,birthday)
values('박수호',27,188.6,to_date('1995:12:04 13:45:14','YYYY:MM:DD
HH24:MI:SS'));

INSERT INTO human (name, age, height, birthday) VALUES ('Alice', 30, 1.675, TO_DATE('1993-05-15', 'YYYY-MM-DD'));
INSERT INTO human (name, age, height, birthday) VALUES ('Bob', 25, 1.800, TO_DATE('1998-08-22', 'YYYY-MM-DD'));
INSERT INTO human (name, age, height, birthday) VALUES ('Charlie', 40, 1.600, TO_DATE('1983-12-10', 'YYYY-MM-DD'));
commit;

select * from human;
select * from human;
DROP TABLE customer CASCADE CONSTRAINTS;

create table customer(

    id number,

    name nvarchar2(30),

    height number(5,2),

    birthday date

);

?

drop table hobby;

create table hobby(

    id number,

    hobby nvarchar2(100)

);

drop sequence id_counter;

create sequence id_counter;

select * from hobby;
select * from customer;

select * from customer,hobby where customer.id=hobby.id;
--게시판 테이블
drop table board;

CREATE TABLE board (
bGroupKind VARCHAR2(255),
bId NUMBER PRIMARY KEY,
bName VARCHAR2(255) NOT NULL,
bTitle VARCHAR2(255) NOT NULL,
bContent VARCHAR2(4000) NOT NULL,
bEtc VARCHAR2(4000) NULL,
bWriteTime DATE DEFAULT sysdate,
bUpdateTime DATE DEFAULT null,
bHit NUMBER DEFAULT 0,
bGroup NUMBER ,
bStep NUMBER DEFAULT 0,
bIndent NUMBER DEFAULT 0,
bDelete VARCHAR2(1) DEFAULT 'Y',
bLike NUMBER DEFAULT 0,
bDislike NUMBER DEFAULT 0
);
create sequence bId;

select * from board;
insert into board (bGroupKind, bId, bName, bTitle, bContent, bWriteTime, bGroup)
select bGroupKind, bId.nextval, bName, bTitle, bContent, bWriteTime,bid.currval from board where bid = bgroup;
--select * from board(bgroupkind,bid,bname,btitle,bcontent,bwritetime,bgroup);
--insert into board(bgroupkind,bid.nextval,bname,btitle,bcontent,bwritetime,bgroup);
--select bgroupkind,bid.nextval,bname,btitle,bcontent,bwritetime,bid.currval from board where bid=bgroup;
commit;
select * from board;

SELECT *
FROM board
WHERE 1=1
ORDER BY bGroup DESC, bStep ASC
OFFSET (3 - 1) * 10 ROWS
FETCH NEXT 10 ROWS ONLY;

select (*) count


drop sequence rid;
CREATE SEQUENCE rId;

drop table reply;
CREATE TABLE reply (
rId NUMBER PRIMARY KEY,
bId NUMBER NOT NULL,
rContent VARCHAR2(1000) NOT NULL,
rName VARCHAR2(100) NOT NULL,
rWriteTime date DEFAULT sysdate,
rUpdateTime date,
rEtc VARCHAR2(1000),
rGroup NUMBER NOT NULL,
rStep NUMBER DEFAULT 0,
rIndent NUMBER DEFAULT 0,
rDelete CHAR(1) DEFAULT 'N'
);

select * from reply;

--security--
--users-- 테이블 생성 및 데이터 삽입:
drop table users;
create table users(
username varchar2(30) not null,
password varchar2(100) not null,
enabled integer not null -- 아이디 사용여부 0이면 사용 불가 1이면 사용가능
);
insert into users values('user','1111',1);
insert into users values('member','1111',1);
insert into users values('admin','1111',1);
commit;

--users 테이블은 사용자 정보를 저장합니다.
각 행은 사용자 이름 (username), 비밀번호 (password), 사용 여부 (enabled)를 나타냅니다.
사용 여부가 0이면 사용 불가능, 1이면 사용 가능을 의미합니다.
authorities 테이블 생성 및 데이터 삽입:
drop table authorities;
create table authorities(
username varchar2(30) not null,
authority varchar2(50) not null
);
insert into authorities values('user','ROLE_MEMBER');
insert into authorities values('member','ROLE_MEMBER');
insert into authorities values('admin','ROLE_MEMBER');
insert into authorities values('admin','ROLE_ADMIN');
commit;
select * from users;
select * from authorities;
select * from board;
delete board where bId=101;

select * from board;

drop table human_2;
create table human_2(
    id number,
    name nvarchar2(100),
    age number(3),
    height number(7,3),
    birthday date    
);
 drop sequence id_count;
 create sequence id_count;
 select * from human_2;
 
 insert into human_2(id,name,age,height,birthday)
values(id_count.nextval,'김수호',20,160.4,to_date('2005:05:05:02:25:50','YYYY:MM:DD HH24:MI:SS'));
insert into human_2(id,name,age,height,birthday)
values(id_count.nextval,'나수호',24,170.8,to_date('2000:10:15 12:25:10','YYYY:MM:DD
HH24:MI:SS'));
insert into human_2(id,name,age,height,birthday)
values(id_count.nextval,'박수호',27,188.6,to_date('1995:12:04 13:45:14','YYYY:MM:DD
HH24:MI:SS'));
commit;