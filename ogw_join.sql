drop table BTable;
create table BTable( 
    BNO number(10),
    BKind nvarchar2(30),
    BName nvarchar2(30),
    BArea nvarchar2(30),
    GNo number(10)
     );
drop table GTable;
create table GTable(
    GNo number(10),
    GPrice number(10)
    );
    insert into BTable values (1,'왕포도','김명천','번동',1);
    insert into BTable values (2,'청포도','김진우','홍일동',3);
    insert into BTable values (3,'청포도','김태수','쌍문동',2);
    insert into BTable values (4,'왕포도','박지민','상계동',2);
    insert into BTable values (5,'청포도','김명천','평창동',1);
    insert into BTable values (6,'왕포도','김진우','오류동',3);
    insert into BTable values (7,'왕포도','김태수','대림동',1);
    insert into BTable values (8,'청포도','김태수','청담동',2);
    insert into GTable values (1,'30000'); 
    insert into GTable values (2,'25000'); 
    insert into GTable values (3,'20000'); 
commit; 
select * from tab;
select * from bTable;
select * from gTable;

select  * from  GTable, BTable;
select Gtable.*,Btable.bkind 
from Gtable,btable 
where GTable.gno=1;

--동등 조인 
select *
from btable, Gtable
where gtable.gno = btable.gno;