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