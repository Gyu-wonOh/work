--������ ���Ἲ
--primary key
create table pkTable1( 
col1 number primary key, --�÷� col1�� �⺻Ű�� �ȴ�. 
col2 number, 
col3 number 
);
insert into pkTable1 values(1,1,1); 
insert into pkTable1 values(2,1,1);  --col1�÷��� 2���� ��� ��� ����. 
insert into pkTable1 values(2,3,4);  --col1�÷��� 2���� �־ �� ��� ����. 
commit; 
select * from pktable1;
create table pkTable2(
    col1 number,
    col2 number,
    col3 number,
    primary key(col1,col2)-- col1,col2 2���� Į���� �������� �ϳ��� Ű�� �ȴ�.
    );
insert into pkTable2 values(1,1,1); 
insert into pkTable2 values(2,1,1); 
insert into pkTable2 values(2,3,4); 
insert into pkTable2  values(2,3,6); --col1,col2�÷���  2,3�� �־ �� ����. 
insert into pkTable2 values(1,1,6); --col1,col2�÷��� 1,1�� �־ �� ����. 
insert into pkTable2 values(1,2,4); --1,2�� col1,col2�÷��� ��� �� ����. 
commit;
select * from pktable2;

create table pkTable3( 
col1 number, 
col2 number, 
col3 number 
); 
alter table pkTable3 add primary key(col1,col2);
--foreign key
create table fkTable2(
col1 number, 
col2 number, 
col3 number primary key --�÷� col3�� �⺻Ű�� �ȴ�. 
);
create table fkTable1( 
col1 number primary key, --�÷� col1�� �⺻Ű�� �ȴ�. 
col2 number, 
col3 number references fkTable2(col3 ) 
);
--������ �߰�
insert into fkTable2 values(1,1,1); 
insert into fkTable2 values(2,1,2); 
insert into fkTable2 values(2,1,2);  --col3�� pk���� �������� ����� ������� ���� 
insert into fkTable1 values(1,1,1); 
insert into fkTable1 values(2,1,1); 
insert into fkTable1 values(2,1,1); -- pk ������ ���� �ʴ´�. 
insert into fkTable1 values(3,1,5); -- fk �����Ǿ� �־ ���� �ʴ´�. --fkTable2���̺� col3�÷����� 1�� 2�� ��� �־ 5�� ���� �� ����. 
select col3 from fkTable2; --�� ����� 1,2 ����� �ִ�. 
insert into fkTable1 values(3,1,2); -- fk �����Ǿ� �־ ����.
insert into fkTable2 values(2,1,5);
insert into fkTable1 values(4,1,5);
--���� Ǯ��
create table grapeList(
    BNo number,
    BKind varchar2(25),
    BName varchar2(25),
    BArea varchar2(25),
    GNo number
    );
create table Bgrde(
    GNo number,
    Gprice number
    );
Alter table Bgrde
Add CONSTRAINT Bgrde_GNo primary key (GNo);
Alter table grapeList
Add CONSTRAINT grapeList primary key (BNo);
Alter table grapeList
Add constraint grapeList_GNo foreign key(GNo)
REFERENCES Bgrde(GNo);
insert into Bgrde values(1,30000);
insert into Bgrde values(2,25000);
insert into Bgrde values(3,20000);
select * from Bgrde;
insert into grapeList values(1,'������','���õ','����',1);
insert into grapeList values(2,'û����','������','ȫ�ϵ�',3);
insert into grapeList values(3,'û����','���¼�','�ֹ���',2);
insert into grapeList values(4,'������','������','��赿',2);
insert into grapeList values(5,'û����','���õ','��â��',1);
insert into grapeList values(6,'������','������','������',3);
insert into grapeList values(7,'������','���¼�','�븲��',1);
insert into grapeList values(8,'û����','���¼�','û�㵿',2);
select * from grapeList;
commit;
--unique, not null, not null,unique, check, default
create table test4(
 a1 number unique,
 a2 number not null,
 a3 number not null unique,
 a4 number check(a4>0),
 a5 number default 1
 );
 --default ��: a5Į���� ���� ���� ������ default ���� ��
 insert into test4(a1,a2,a3,a4) values(2,2,2,2); -- default�� 1�� ��
 select *from test4;
 --�Ϲ����� �Է�
 insert into test4(a1,a2,a3,a4,a5) values(1,1,1,1,null);
 select * from test4;
 --check (a4>0)
 insert into test4(a1,a2,a3,a4,a5) values(-2,-2,-2,-2,-2);--�� ��
 --a4 Į���� check ������ ����� �Ǿ� �־ ������ ���� �� ����.
 insert into test4(a1,a2,a3,a4,a5) values(-2,-2,-2,1,-2);
 select * from test4;
 -- not null unique a3 Į���� �̹� ��� �ִ� ���̳� null�� ������ �� ����.
 --�� �ִ� �����Ϳ� �ߓ����� ���� �ٸ� ���� �־�� �����Ѵ�.
insert into test4(a1,a2,a3,a4,a5) values(3,3,null,3,3); --  null�̾ �ȵ�
insert into test4(a1,a2,a3,a4,a5) values(3,3,1,3,3); -- ������ a3�÷��� 1���� �־ �ȵ�
insert into test4(a1,a2,a3,a4,a5) values(3,3,3,3,3); -- ��
--not null : a2�÷��� null�� ���� ���ϵ��� �����Ͽ���. 
insert into test4(a1,a2,a3,a4,a5) values(4,null,4,4,4);
insert into test4(a1,a2,a3,a4,a5) values(4,4,4,4,4); -- �� 
--a1�÷��� unique �� �����Ǿ� �ִ�. 
insert into test4(a1,a2,a3,a4,a5) values(null,5,5,5,5); -- �� 
insert into test4(a1,a2,a3,a4,a5) values(null,6,6,6,6); -- �� --unique������ �÷����� null�� ������ ����
 ?unique������ �Ǿ� �־� ���� �����ʹ� �ȵ���. 
insert into test4(a1,a2,a3,a4,a5) values(4,4,4,4,4); -- �� ��
--�ٸ� �����ʹ� �� 
insert into test4(a1,a2,a3,a4,a5) values(7,7,7,7,7); 
select * from test4; 
 --sequence
create sequence testSequence;
select testSequence.nextval from dual;
select testSequence.currval from dual;

create sequence testSequence2;
select testSequence2.nextval from dual;
select testSequence2.currval from dual;
drop sequence testsequence;
drop sequence testsequence2;

create sequence ctable_seq;
select ctable_seq.nextval from dual;
select * from ctable;
select ctable_seq.currval from dual;
create table ctable(
    c_count number,
    c_comment nvarchar2(10)
    );
insert into ctable values (ctable_seq.nextval,'����'); 
insert into ctable values (ctable_seq.nextval,'2��° ������'); 
insert into ctable values (ctable_seq.nextval,'������'); 
commit;     
    drop sequence ctable_seq; 
create table test7(
a1 number , a2 number, a3 number, a4 number
);
create index idx_test7_ala2 on test7(a1,a2); --nonunique index
create unique index idx_test8_a3 on test7(a3); -- unique index
select * from test7; --�ε��� �Ⱦ�
select * from test7 where a1=1; -- �ε��� ���
select * from test7 where a1=1 and a2=1; -- �ε��� ���
select * from test7 where a2=1 ; -- �ε��� ���
select * from test7 where a3=1 ; -- �ε��� ���
select * from test7 where a4=1 ; -- �ε��� ���
select * from test7 where a3=1 ; -- �ε��� ���
 select '|' || trim('   hello 
 ')from dual;
 select rtrim('   hello   ')||'|'from dual;
--hr ���̺� �����ϱ�
--���� ������ hr �����ͺ��̽��� Ǯ���.
--1.  2000�⿡ �Ի��ؼ� �ְ��ӱ��� 10000�� �Ѵ� �������� ���ϰ� �ִ� ����� ����Ͻÿ�.
select * from employees;
select * from jobs;

select * from employees 
where to_char(hire_date,'YYYY')=2000 
and job_id in (select job_id from jobs where max_salary > 10000);
--2.  �Ŵ����� �̸��� MICHAEL�� �μ��� ����Ͻÿ�. 
select * from departments;
select * from employees;
select * from employees where upper(first_name) like '%MICHAEL%';
select * from departments where manager_id in 
(select employee_id from employees where upper(first_name) like '%MICHAEL%');
--3.  ������ �����ӱ��� ��� 105�� ����� �ӱݺ��� ���� ������ ����Ͻÿ�. 
select * from jobs where min_salary< ( select salary from employees where employee_id = 105); 
select salary from employees where employee_id = 105;
--4.  �����ּҿ� ����ǥ�ð� ���ԵǾ� �ִ� ����� ����Ͻÿ�.
select * from employees where email like '%\_%' escape '\';
select email from employees;
--5.  ��� �̸��� �ش� ����� �Ŵ��� �̸��� ����Ͻÿ�.
select e1.first_name Employee, e2.first_name Manager 
from employees e1, employees e2 where  e1.manager_id  = e2.employee_id;
--6.30�� �μ��� �Ի��� ����� ���� �������� ����Ͻÿ�.
select to_char(hire_date,'yyyy'),count(*) from employees
where department_id=30 group by to_char(hire_date,'yyyy');
--7.  �� �μ��� �������� ������� �� �������� ���غ���.
select department_id department, job_id job, sum(salary) TotalSalary from employees
group by department_id, job_id
order by department_id, job_id;
--8.  ������ �����ӱݰ� �ְ��ӱ� ������ ������ ������ ����� �̸��� �������� ����Ͻÿ�.
select first_name,job_title from employees e,jobs j
where salary between min_salary and max_salary order by first_name;
--9. Ŀ�̼��� ���� ����� ���� ���� ����� ���� ������� ����Ͻÿ�.
select count(commission_pct) NoEmployeesWithCommission,
count(*)- count(commission_pct) NoemployeeswithoutCommission from employees;
--10.  2�� 28�Ͽ� �Ի��� ����� �̸�, ������, �μ����� ����Ͻÿ�
select * from employees;
select first_name, job_title, department_name from employees e, jobs j,departments d
where e. job_id =j.job_id and e.department_id =d.department_id 
and to_char(hire_date,'ddmm')='2802';
--11.�����ӱ��� 10000���� ���� ������ ���λ����� ����Ͻÿ�.
select * from jobs;
select * from jobs where min_salary >10000;
--12. 2002��~2005�� ���̿� �Ի��� ����� �̸��� �Ի����� ����Ͻÿ�.
select first_name, hire_date from employees 
where to_char(hire_date,'yyyy') between '2002' and '2005'
order by hire_date;
--13. IT Programmer�̰ų� Sales Man�� ����� �̸��� �Ի����� ����Ͻÿ�.
select first_name,hire_date from employees 
where job_id in('IT_PROG','SA_MAN');
--14.  2008�� 1�� 1�� ���Ŀ� �Ի��� ����� ����Ͻÿ�.
select * from employees where to_char(hire_date, 'yyyy-mm-dd')>'2008-01-01';
--��¥ �������� ��� �ü���� ���� �Է¼����� �ٸ��� to_char �Ǵ� to_date �Լ��� ����Ͽ� ������ ���¸� Ȯ�� �� 
--����� ��
--15. ����� 150,160���� ����� ����Ͻÿ�.
select *from employees where employee_id in(150,160);
--16. �ӱ��� 10000���� ���� ����� �̸� �ӱ�, Ŀ�̼� �Ի����� ����Ͻÿ�.
select first_name , salary,commission_pct,hire_date from employees where salary <10000;
--17.  �ְ� �ӱ��� 10000~20000�� ������ ������, �����ӱݰ� �ְ��ӱ��� ������ 
--����Ͻÿ�.
select job_title,max_salary-min_salary difference from jobs 
where max_salary between 10000 and 20000;
--18.  ��� �̸��� �ӱ��� ����ϵ� �ӱ��� 1000������ ����Ͻÿ�.
select first_name,salary,round(salary,-3) from employees;
--19.  �������� �������� �Ͽ� ������������ ���� ���λ����� ����Ͻÿ�.
select * from jobs order by job_title desc;
--20. ���̳� �̸��� s�� �����ϴ� ����� ����Ͻÿ�.
select first_name, last_name from employees 
where first_name like 'S%' or last_name like 'S%';
--21. 5���� �Ի��� ����� ����Ͻÿ�.
select * from employees where to_char(hire_date,'mm')='05';
--22. Ŀ�̼��� ���� �ʰ�, �ӱ��� 5000~10000�̸鼭 30�� �μ��� �Ҽӵ� ����� ����Ͻÿ�.
select *from employees where commission_pct is null and salary between 5000 and 10000 and department_id= '30';
--23. ������� �̸��� ù ���޳��� ����Ͻÿ�. �ſ� 1���� ���� ���̴�. 
select first_name, hire_date,Last_Day(hire_date)+1 from employees;
--24. ����� �̸��� �ټӿ����� ����Ͻÿ�.
select first_name,hire_date, floor((sysdate-hire_date)/365) from employees;
--25. 2001�⿡ �Ի��� ����� �̸��� ����Ͻÿ�.
select first_name, hire_date from employees where to_char(hire_date,'yyyy')='2001';
--26. ù���ڴ� �빮�ڷ� ������ ���ڴ� �ҹ��ڷ� ��ȯ�Ͽ� ���� �̸��� ����Ͻÿ�.
--initcap ���
select initcap(first_name), initcap(last_name) from employees;
--27.�������� ù �ܾ ����Ͻÿ�.
SELECT JOB_TITLE, SUBSTR( JOB_TITLE, 1, INSTR(JOB_TITLE || ' ', ' ')-1) FROM JOBS;
--28.���� 3��° ���� ���Ŀ� 'b'�� ���Ե� ����� �̸� ���̸� ����Ͻÿ�.
select first_name, last_name from employees where instr(LAST_NAME,'b')>3;
--29.  �̸��� �̸����ּҰ� ��ҹ��� ������� ���� ����� �̸��� �빮�ڷ�, 
--�̸����ּҴ� �ҹ��ڷ� ����Ͻÿ�. 
select upper(first_name),lower(email) from employees;
--30. ���� �Ի��� ����� ����Ͻÿ�
select * from employees where to_char(hire_date,'yyyy')=to_char(sysdate,'yyyy');
--31. ���� ��¥�� 2011�� 1�� 1���� ��ĥ �������� ����Ͻÿ�.
select Sysdate - to_date('2011-01-01') from dual;
--32. ���� �� �޸��� �� ���� ����� �Ի��Ͽ����� ����Ͻÿ�. 
SELECT TO_CHAR(HIRE_DATE,'MM'), COUNT (*) FROM EMPLOYEES 
WHERE TO_CHAR(HIRE_DATE,'YYYY')= TO_CHAR(SYSDATE,'YYYY') 
GROUP BY TO_CHAR(HIRE_DATE,'MM');







