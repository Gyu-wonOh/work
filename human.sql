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

