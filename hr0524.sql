select sum (salary), avg(salary), count (salary),
max(salary),min(salary) from employees;
select count(*),count(commission_pct) from employees;
select count(*),count(nvl(commission_pct,0))from employees;
select avg(commission_pct),avg(nvl(commission_pct,0)) from employees;
select department_id, count(department_id),avg(salary) from employees group by department_id;
select * from employees where department_id is null;
select count(department_id),count(nvl(department_id,0)) from employees group by department_id;
select department_id,avg(salary),avg(nvl(salary,0)) from employees group by department_id;
--�μ���ȣ�� 100 ���� ���� ������ �� �μ���ȣ�� �׷����� �׷캰 ��� ��� ������ ����غ���.
select department_id,avg(salary) from employees where department_id<100 group by department_id;