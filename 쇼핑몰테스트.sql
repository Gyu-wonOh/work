drop table user;

create table shopuser(
    id nvarchar2(20),
    pw number(6),
    name nvarchar2(50),
    gender nvarchar2(20),
    birthday date,
    email nvarchar2(50),
    phoneNumeber nvarchar2(50),
    address nvarchar2(50)
    );
    
insert into shopuser values('kkk',1234,'지름신','남',TO_DATE('1994-07-19 20:09:13','YYYY-MM-DD HH24:MI:SS'),
'kkk@naver.com','010-7904-4871','인천광역시 부평구 경원대로 74');
commit;
select * from shopuser;