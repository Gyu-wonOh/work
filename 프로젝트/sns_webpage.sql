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
commit;