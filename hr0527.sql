--ũ�ν� ����
--�� ���̺��� ������ �ִ� ��� �����͸� ���ļ� ���� �� �ִ� ��� �����͸� ����� �����ִ� �۾��̴�.
select * from employees;--107
select * from departments;--27
select count(*) from employees,departments;--107*27
--�������� equi join
select * from employees;
select employees.first_name,department_name 
from employees,departments 
where employees.department_id= departments.department_id;
--employees.department_id �� null�� ����� �����Ͽ� 106���� ���
select count(*) from employees,departments
where employees.department_id=departments.department_id;--106

select *from employees where employees.department_id is null;
--��� ��� ������ �ش� ����� �μ� ������ ��� ����غ���.
select * from employees,departments
where employees.department_id=departments.department_id;
--������ ���� ������� ���� �����ϴ�. sql�� ��ҹ��� ������ ���� ������ �����ʹ� �����Ѵ�,
--sql ������ ���Ǵ� ValUes values�� ������ �������� ������ ���Ǵ� ���ڿ��μ��� �ٸ� ������ ����.
select employees.employee_id, d.* from employees,departments D
where employees.department_id= D.department_id ;
--�μ��� 100�� ����� �̸���, �μ��̸��� ����غ���.
select employees.department_id,employees.first_name,department_name from employees,departments
where employees.department_id=departments.department_id
and employees.department_id=100;
--�޿��� 10000������ ����� ���,���ް� �μ��̸��� ������� ���� �Ͽ� ����� ����.
select employees.employee_id, employees.first_name, employees.salary,departments.department_id,
departments.department_name from employees,departments 
where employees.department_id =departments.department_id order by employee_id;
--������(contries) ���(region)������ ����� ���ÿ�. 
select *from countries;
select *from regions;
select *from countries, regions
where countries.region_id=regions.region_id;
--����� ���,����,���� �̸�, �ش� ������ �ּұ޿�, �ִ�޿� ������ ����� ����. 
select *from employees;--��� ���̺�
select *from jobs; --���� ���̺�
select employees.employee_id, employees.salary, jobs.job_Title, 
jobs.min_salary, jobs.max_salary 
from jobs,employees 
where jobs.job_id=employees.job_id;
--self join
select employee_id, first_name,manager_id 
from employees ���;
select employee_id,first_name
from employees ������;
select ���.employee_id,���.first_name,������.employee_id, ������.first_name 
from employees ���, employees ������
where ���. manager_id=������.employee_id;
-- ����� a.employee_id,a.first_name,a.manager_id������ ����غ���.
select a.employee_id, a.first_name,a.manager_id from employees a;
--��� ����� ¦�� �̷���� �� �߻��� �� �ִ� �����͸� ��� ����Ϸ��� ���̺��� �ϳ� �� ����
-- ����� ��� ���̺��� ũ�ν� �����ϸ� �ȴ�.
select a. employee_id, a.first_name, a. manager_id, b.employee_id,b.first_name, b.manager_id
from employees a,employees b;
--107*107����  ��� ������� ¦�� �̷� ������ �� a.manager_id�� b.manager_id�� ���� �����͸� 
--����� ȸ���� ��� ��� ¦ �� ����� �����ڷ� �̷���� ¦�� ��������.
select a. employee_id,a.first_name,a.manager_id,
b.employee_id,b.first_name,b.manager_id from employees a, employees b
where a.manager_id=b.employee_id;
select e1.employee_id,e1.manager_id
from employees e1
where e1.employee_id =101;
select e2.employee_id,e2.first_name--10,steven ���
from employees e2
where e2.employee_id=100;

--outer join
select * from employees;
select * from departments;
select count(*) from employees; --107
--����� �μ��̸�
 select employees.employee_id,departments.department_name
 from employees, departments
 where employees.department_id= departments.department_id;
 select count(*)
 from employees, departments
 where employees.department_id= departments.department_id;
select *
from employees
where department_id is null;
--left outer join ���� �����Ͱ� ������ �������� null�� ä������ ���̺� ����
select employees.department_id,employees.first_name,department_name 
from employees,departments 
where employees.department_id =departments.department_id(+);
--�����ͼ� Ȯ��
select count(*)
from employees,departments
where employees.department_id= departments.department_id(+);
--right outer join
select employees.department_id,employees.first_name,department_name 
from employees,departments 
where employees.department_id(+) = departments.department_id;
--�ߺ������� ����� �ִ� �μ��� ��
select distinct(employees.department_id) from employees;
--ȸ�� ��ü�� �μ��� ��
select distinct(department_id) from departments;--27
--����� ���� �μ�/�μ��� ���� ��� ��� ��� full outer join
select employees.department_id,employees.first_name,department_name from
employees full outer join departments
on employees.department_id = departments.department_id;
--����� �μ����� ����Ͻÿ�
--1.�ܺ����� ���
--2. nvl
select *from employees;
select* from departments;
select employees.*,departments.*,nvl(department_name,'�����')
from employees,departments 
where employees.department_id= departments.department_id(+);
--sub����
--2�� ����� �ִ�  ��� ����
select *from regions;
select * from locations;
select * from countries;
select country_id from countries where region_id=2;--'AR','BR','CA',MX','US'
select * from locations where COUNTRY_ID in ('AR','BR','CA','MX','US');
select * from regions where region_id = 2; 
select * from locations where country_id in(
select country_id from countries where region_id=3
);
select *from regions;--asia =3;
select * from countries;
select * from locations where country_id in( 
select country_id from countries where region_id =3);
-- ���� ���̵� 1700�� �μ��鿡�� ���ϴ� ��� ������ ����� ����. 
select * from employees where department_id in(
select department_id from departments where location_id =1700) order by employee_id;
-- ���� ���̵� 1700�� �μ��鿡�� ������ �ʴ� ��� ������ ����� ����.
select * from employees where department_id not in(
select department_id from departments where location_id =1700) order by employee_id;
- �ִ�޿��� �޴� ����� ������ ����� ����. 
select * from employees where salary = (
select max(salary) from employees 
);
--���� ��ȸ
select *from jobs;
select * from jobs where job_id in ('AD_PRES', 'SA_MAN', 'IT_PROG') 
order by min_salary; 

select * from employees; 

select employees.employee_id,employees.salary,j.*
from employees,( 
select * from jobs where job_id in ('AD_PRES', 'SA_MAN', 'IT_PROG') 
order by min_salary)j 
where employees.salary>= j.min_salary and employees.salary <= j. max_salary;
