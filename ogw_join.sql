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
    insert into BTable values (1,'������','���õ','����',1);
    insert into BTable values (2,'û����','������','ȫ�ϵ�',3);
    insert into BTable values (3,'û����','���¼�','�ֹ���',2);
    insert into BTable values (4,'������','������','��赿',2);
    insert into BTable values (5,'û����','���õ','��â��',1);
    insert into BTable values (6,'������','������','������',3);
    insert into BTable values (7,'������','���¼�','�븲��',1);
    insert into BTable values (8,'û����','���¼�','û�㵿',2);
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

--���� ���� 
select *
from btable, Gtable
where gtable.gno = btable.gno;