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

commit;

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
bGroup NUMBER, 
bStep NUMBER, 
bIndent NUMBER, 
bDelete VARCHAR2(1) DEFAULT 'Y', 
bLike NUMBER DEFAULT 0, 
bDislike NUMBER DEFAULT 0 
);
select * from board;
create sequence bId;