select *from tab;
rollback;
select * from tab;
commit;
select * from tab;
create table human(
name nvarchar2(50),
age number(5),
height number(4,1),
birthday date
);
insert into human (name,age,height,birthday) values 
('È«±æµ¿',30,152.1,to_date('2000:02:03 00:00:00','YYYY:MM:DD HH24:MI:SS'));
commit;
select * from tab;
select * from human;
insert into human values ('È«±æ³²',31,156.4,to_date('2001:02:03 00:00:00',
'yyyy:mm:dd hh24:mi:ss'));
select * from human;
drop table chemical_stock
create table chemical_stock(
name nvarchar2(50),
Q_ty number(5),
min number(3),
in_date date
);
insert into chemical_stock values('¾Æ¼¼Æ®»ê',500,100,to_date('2023-03-15', 'YYYY-MM-DD' ));
insert into chemical_stock values('¼ö»êÈ­³ªÆ®·ý',300,50,to_date('2023-04-20', 'YYYY-MM-DD' ));
insert into chemical_stock values('È²»ê',200,80,to_date('2023-05-10', 'YYYY-MM-DD' ));
insert into chemical_stock values('¿°È­Ä®½·',400,120,to_date('2023-06-05', 'YYYY-MM-DD' ));
insert into chemical_stock values('¿°»ê',600,200,to_date('2023-07-08', 'YYYY-MM-DD' ));
select * from chemical_stock;
commit;
drop table library_bill
create table library_bill(
book_name varchar2(100),
writer varchar2(50),
lent date,
due date,
return date,
over_due number(3)
);
insert into library_bill(book_name,writer,lent,due,return,over_due) values('ÁË¿Í¹ú','Åç½ºÅäÀÌ',to_date('2023-03-01','yyyy-mm-dd'),to_date('2023-03-15','yyyy-mm-dd'),to_date('2023-03-20','yyyy-mm-dd'),500);
insert into library_bill(book_name,writer,lent,due,return,over_due) values('ÇØ¸®Æ÷ÅÍ¿Í ¸¶¹ý»çÀÇ µ¹','J.K·Ñ¸µ',to_date('2023-04-10','yyyy-mm-dd'),to_date('2023-04-24','yyyy-mm-dd'),to_date('2023-04-23','yyyy-mm-dd'),0);
insert into library_bill(book_name,writer,lent,due,return,over_due) values('¹ÝÁöÀÇÁ¦¿Õ','J.R.R. ÅçÅ²',to_date('2023-05-15','yyyy-mm-dd'),to_date('2023-05-29','yyyy-mm-dd'),to_date('2023-05-29','yyyy-mm-dd'),0);
insert into library_bill(book_name,writer,lent,due,return,over_due) values('»¡°£ ¸Ó¸® ¾Ø','L.M. ¸ù°í¸Þ¸®',to_date('2023-06-20','yyyy-mm-dd'),to_date('2023-07-04','yyyy-mm-dd'),NULL,NULL);
insert into library_bill(book_name,writer,lent,due,return,over_due) values('»ê»ï','¹Ú¿Ï¼­',to_date('2023-07-10','yyyy-mm-dd'),to_date('2023-07-24','yyyy-mm-dd'),NULL,NULL);
select * from library_bill;
commit;
drop table oder_list
create table oder_list(
no number(8),
customer varchar2(50),
oder_date date,
product varchar2(50),
Q_ty number(3),
price_krw number(10),
total_price_krw number(10)
);
insert into oder_list values (2023001,'È«±æµ¿',to_date('2023-03-05','yyyy-mm-dd'),'³ëÆ®ºÏ',1,1200000, 1200000);
insert into oder_list values (2023002,'±è¿µÈñ',to_date('2023-03-08','yyyy-mm-dd'),'½º¸¶Æ®Æù',2,800000,1600000);
insert into oder_list values (2023003,'¹ÚÃ¶¼ö',to_date('2023-03-15','yyyy-mm-dd'),'ÇìµåÆù',3,150000,450000);
insert into oder_list values (2023004,'ÀÌÁöÈÆ',to_date('2023-03-20','yyyy-mm-dd'),'¸¶¿ì½º',1,30000,30000);
insert into oder_list values (2023005,'±è¹ÎÁö',to_date('2023-03-25','yyyy-mm-dd'),'Å°º¸µå',1,50000,50000);
select *from oder_list;
commit;

