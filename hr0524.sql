select sum (salary), avg(salary), count (salary),
max(salary),min(salary) from employees;
select count(*),count(commission_pct) from employees;
select count(*),count(nvl(commission_pct,0))from employees;
select avg(commission_pct),avg(nvl(commission_pct,0)) from employees;
select department_id, count(department_id),avg(salary) from employees group by department_id;
select * from employees where department_id is null;
select count(department_id),count(nvl(department_id,0)) from employees group by department_id;
select department_id,avg(salary),avg(nvl(salary,0)) from employees group by department_id;
--부서번호가 100 보다 작은 데이터 중 부서번호로 그룹지어 그룹별 사원 평균 봉급을 출력해보자.
select department_id,avg(salary) from employees where department_id<100 group by department_id;
5/27
--함수
-- 절대값 출력
select -10,abs(-10) from dual;
-- 소수점 아래를 버림
select floor(11.123)from dual;
--소수점 반올림
select round(11.123),round(11.129,2) from dual;
--trunc 소수점 버림
select round(123.129), trunc(123.129,-1) from dual;