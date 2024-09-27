--사용자 정보
drop table sns_user;
create table sns_user(
    email NVARCHAR2(100),
    phoneNumber nvarchar2(100),
    name nvarchar2(100),
    nickname nvarchar2(100),
    password nvarchar2(100),
    u_delete nvarchar2(1) default 'Y'
    );
select *from sns_user;
--게시물
drop table sns_post;
create table sns_post(
    pId number,
    nickname nvarchar2(100),
    imgId nvarchar2(100),
    pContent nvarchar2(100),
    writeTime date default sysdate,
    updateTime DATE
    );
drop sequence pId;
create sequence pId;
select *from sns_post;    
--댓글
drop table sns_reply;
create table sns_reply(
rId number,
pId number,
rContent nvarchar2(1000),
writeTime date default sysdate,
updateTime date,
like number,
rDelete nvarchar2(1) default 'Y'
);
commit;