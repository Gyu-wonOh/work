select* from tab;
select* from countries;
select* from locations;
select* from regions;
select street_address from locations;
select job_id title from jobs;
--��� ����� �̸��� ���� ����� ����.
select first_name,last_name from employees;
--����� ����� �̸����� ����غ���.
select employee_id,email from employees;
--���� �̷¿� �ִ� ������� ���,����������,������������ ����غ���.
select employee_id, start_date, end_date from job_history;
--������ ������,�ּ�,�ִ�޿��� ����غ���.
select job_title, min_salary,max_salary from jobs;
--���� ���̵� 'AC_MGR'�� ���������� ����غ���.
select * from jobs where job_id= 'AC_MGR';
--�۾����̵� 'FI_ACCOUNT'�� �ƴ� �۾����̵� ������ ����Ͻÿ�. 
select * from jobs where job_id != 'FI_ACCOUNT';
--2003�� 9�� 17�� ���Ŀ� �Ի��� ����� ���,�����, ��ȭ��ȣ�� ����Ͻÿ�.
select * from employees where hire_date>'2003-09-17';
 --������ 10000�̻��� ����� ���̵�� �̸��� ������ ��� �Ͻÿ�.
select employee_id,first_name,salary from employees
 where salary>10000;
  --�μ���ȣ�� 50�� ��� ������ ��� �Ͻÿ�.
select * from employees where department_id=50;
select *from employees;
select *from employees where manager_id = null;
select *from employees where manager_id is null;
select *from employees where manager_id is not null;
select * from employees where department_id is null;
select * from employees where commission_pct is not null and salary>=10000;
select salary,salary+20 new_salary,10+10 plus,'���'
from employees;
select salary,salary*1.1 from employees; 
select salary, salary+salary, salary*2 from employees;
select salary, salary*3 from employees;
--����� ������ 50������ ���·� �÷����� upgradeSalary�� ����� ����.
select salary,salary+50 as upgradeSalary from employees;
--����� ������ ���� 10%������ ���·� �÷����� upgradeSalary�� ����� ����.
select salary,salary*1.1 as upgradeSalary from employees;
select first_name,last_name,first_name||last_Name as fullname from employees;
 --������ 8000 �ʰ� �̸鼭 10000 �̸��� ����� ������ ����� ����.
 select * from employees where salary >8000 and salary<10000;
 --������ 7000���� �̰ų� 10000�ʰ��� ����� ������ ����� ����.
 select * from employees where salary<=7000 or salary>10000;
--�μ��� 80�� �ƴ� ��� ������ ����� ����.
select*from employees where department_id!=80;
select*from employees where not department_id=80;
--Ŀ�̼��� �����鼭 2008�� ������ �Ի��� ��� ������ ����� ����.
select *from employees where hire_date<'2008-01-01' and commission_pct is not null;
-- ��� ���̵�(REGION_ID) 1, 3, 4�� ���� ������ ����غ���.
select*from countries where region_id=1 or region_id=2 or region_id=3 or region_id=4;
select * from employees;
--�� ������� commission +1
select commission_pct+1,commission_pct from employees;
--between
select *from employees where salary between 8000 and 10000;
select * from employees where salary >=8000 and salary<=10000;
select * from employees where first_name between 'E' and 'H';

--nvl(��Ȯ��Į����,���϶� ������ ��)
select nvl(commission_pct,0)+1,nvl(commission_pct,0) from employees;
--nvl2(���� Ȯ���ϴ� coloumn�̸�, null�ƴҶ� ǥ�Ⱚ,null�϶� ǥ�Ⱚ)
select nvl2(commission_pct,'�ξƴ�','��') from employees;
select nvl2(commission_pct,commission_pct,0)+1 as addOne from employees;
select decode(commission_pct,null,0,commission_pct)+1 add_One from employees;
 --��� ���̺��� 10,20,30 �μ��� ����+ ���μ��Դϴ�.��  ������ �μ��� ���׹ۿ� �μ� �Դϴ�.���� ��� �ǵ��� ������ ������ ����. 
select distinct department_id from employees;
select decode(department_id,
                10,'10�� �μ�',
                20,'20�� �μ�',
                30,'30�� �μ�',department_id||'�������μ�')as �μ���ȣ from employees;
select first_name, commission_pct,
        case
            when commission_pct <=0.1 then '��'
            when commission_pct <=0.2 then '��'
            when commission_pct > 0.2 then '��'
            when commission_pct is null then 'null�̴�'
            else '���� ���� ���� ������'
            end as PCT
        from employees;
select department_name, department_id from departments;

select decode(location_id,
        1500, 'SanFrancisco',
        1700, 'Seattle',
        2400, 'London' , 'ETC CITY')as department_city from departments;
select * from employees;
select job_id,salary,
        case
            when salary> 10000 then 'HIGH'
            ELSE 'LOW'
            end as upgrade_salary
         from employees;
--  EXTRACT(YEAR FROM hire_date)        
select employee_id, hire_date,
        case
            when EXTRACT(YEAR FROM hire_date)>'2005' then '2005�� ���� �Ի�'
            when EXTRACT(YEAR FROM hire_date)='2005' then '2005�� �Ի�'
            when EXTRACT(YEAR FROM hire_date)<'2005' then '2005�� ���� �Ի�'
            end as �Ի�ñ�
from employees;
commit;
--5/24
--in ������:select * form ���̺�� where Į���� in(��1,��2,��3); r��1,��2,��3�� ������ ���� ���.

--Ŀ��� ������ 0.1,0.25,0.2,0.3 �� �� �ϳ��� ���� ��������� ����� ����.
select * from employees where commission_pct in (0.1,0.25,0.2,0.3);
select * from employees where commission_pct =0.1 or commission_pct=0.25 or commission_pct= 0.2
or commission_pct = 0.3;
--Ŀ��� ������ 0.1,0.25,0.2,0.3�� �ƴ� ��������� ����� ����.
select *from employees where commission_pct not in (0.1,0.25,0.2,0.3);
select *from employees where commission_pct!=0.1 and commission_pct!=0.25 and commission_pct!= 0.2
and commission_pct!=0.3;
--��� ���̵�(REGION_ID) 1, 3, 4�� �ƴ� ���� ������ ����� ����.
select * from countries where region_id not in (1,3,4);
--�μ��� 80,50,null�� ��������� ����� ����.
select * from employees where department_id in (50,80) 
or department_id is null;
 --null�� �����Ͽ� ����ϰ� ������ nulló�� �Լ��� ����Ѵ�.
select * from employees where nvl(department_id,0) in (50,80,0);
--like ������
--select * from ���̺�� where ���� LIKE '����';
select * from employees;
--��ȭ��ȣ(phone_Numeber)�� 011�� �����ϴ� ��������� ����� ����
select *from employees where phone_number like '011%';
-- �̸��� �ּ� �տ��� 3��° ���ڰ� E�� ��������� ����� ����. 
select *from employees where email like '__E%';
--job title�� ��Account���� �� �ִ� ���������� ����� ����.
select * from jobs where job_title like '%Account%';
 --��ȭ��ȣ�� .1343. �� ���� ���� ��� ����ڸ� ����� ����. 
 select * from employees where phone_number not like '%.1343.%';
--�̸��� ���ĺ� a,A �� �� �ִ� ��� ����
select* from employees where first_name like '%a%' or first_name like '%A%';
--order by��
select * from employees;
--�⺻���� �������� ����
select first_name 
from employees
order by first_name;
--�������� ����;
select first_name 
from employees
order by first_name asc;
--�������� ����;
select first_name 
from employees
order by first_name desc;
select * from employees order by department_id asc,salary asc;
select first_name, salary,department_id from employees order by department_id asc, salary desc;
--�μ���ȣ�� ������������ ���ĵǵ��� �μ������� ����غ���.
select * from departments order by department_id;
select * from departments order by department_id asc;
--������ ������������ ��������� ����غ���.
select * from employees order by salary desc;
--���ĺ� �������������� �����̸��� �����Ͽ� ���������� ����غ���.
select * from countries order by country_name;
--����� ������������ ����̷� �����͵��� ����غ���. ������� ���� ���� �Ի����� ������������ ��������.
select * from job_history;
select * from job_history order by end_date asc, start_date desc;
--������ ������������ ������ ������ Ŀ�̼� ������ ������������ �����Ͽ� ��������� ����غ���.
select * from employees order by salary DESC , commission_pct asc;
-- select ����

--insert, update, delete �� ����ϱ�
--employees ���̺�� ������ ������ �����͸� ������ copyTable�� ������.
create table copyTable as select *from employees;
select * from copyTable;--���̺��� ����� ����������� Ȯ��;
desc copyTable;--���̺� ������ �������� Ȯ��
--��� Į�� ��ſ� �κ� Į���� ���̺�� ����� �ʹٸ� ������ ���� �ϸ�ȴ�.
--������ �����ϸ� Ư���� ���� ���� ����� �����͸� ��� ���ο� ���̺��� �����,
create table copyTable3 as select * from employees where hire_date<'2004-01-01';
select * from copyTable3;
create table copyTable4 as select * from employees where 1<>1;
select * from copyTable4;
insert into copyTable select * from employees;
select * from copytable;
--��� ����� ������  10%�λ��� ����. copytable�� �̿��ؼ� ���� ���� ����� ����.
select * from copyTable;
update copyTable set salary = salary*1.1;
select *from copyTable;
--2004�� ������ ���� ��� ����� ������ 10%�λ��� ����.
update copyTable set salary = salary*1.1 where hire_date<'2004-01-01';
select *from copyTable;
--������ ������Ʈ: 2004�� ������ ���� ��� ����� ������ 10%�λ�, ��ȭ��ȣ 01011112222�� ����
update copyTable set salary= salary*1.1,phone_number='01011112222' where hire_date<'2004-01-01';
--����� 100���� ����� ������ 10%�λ��ϰ� ��ȭ��ȣ ����
update copyTable set salary = salary*1.1,phone_number='01011112222' where employee_id =100;
--delete
--�����ȣ�� 110 �̸��� ����� �����غ���.
delete copyTable where employee_id<110;
delete copyTable;
--drop table ���̺� ����
--copyTable ,copyTable2 ���̺��� �����غ���.
drop table copyTable;
drop table copytable3;
drop table copytable4;
select * from tab;

select * from tab;
desc 