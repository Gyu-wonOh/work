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