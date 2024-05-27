--크로스 조인
--두 테이블이 가지고 있는 모든 데이터를 합쳐서 만들 수 있는 모든 데이터를 만들어 보여주는 작업이다.
select * from employees;--107
select * from departments;--27
select count(*) from employees,departments;--107*27
--동등조인 equi join
select * from employees;
select employees.first_name,department_name 
from employees,departments 
where employees.department_id= departments.department_id;
--employees.department_id 가 null인 사원이 존재하여 106개가 출력
select count(*) from employees,departments
where employees.department_id=departments.department_id;--106

select *from employees where employees.department_id is null;
--모든 사원 정보와 해당 사원의 부서 정보를 모두 출력해보자.
select * from employees,departments
where employees.department_id=departments.department_id;
--다음과 같은 방법으로 접근 가능하다. sql은 대소문자 구분을 하지 않지만 데이터는 구분한다,
--sql 문법에 사용되는 ValUes values는 같으나 데이터의 값으로 사용되는 문자열로서는 다른 것으로 본다.
select employees.employee_id, d.* from employees,departments D
where employees.department_id= D.department_id ;
--부서가 100인 사원의 이름과, 부서이름을 출력해보자.
select employees.department_id,employees.first_name,department_name from employees,departments
where employees.department_id=departments.department_id
and employees.department_id=100;
--급여가 10000이하인 사원의 사번,봉급과 부서이름을 사번으로 정렬 하여 출력해 보자.
select employees.employee_id, employees.first_name, employees.salary,departments.department_id,
departments.department_name from employees,departments 
where employees.department_id =departments.department_id order by employee_id;
--국가별(contries) 대륙(region)정보를 출력해 보시오. 
select *from countries;
select *from regions;
select *from countries, regions
where countries.region_id=regions.region_id;
--사원의 사번,봉급,직종 이름, 해당 직종의 최소급여, 최대급여 정보를 출력해 보자. 
select *from employees;--사원 테이블
select *from jobs; --직종 테이블
select employees.employee_id, employees.salary, jobs.job_Title, 
jobs.min_salary, jobs.max_salary 
from jobs,employees 
where jobs.job_id=employees.job_id;
--self join
select employee_id, first_name,manager_id 
from employees 사원;
select employee_id,first_name
from employees 관리자;
select 사원.employee_id,사원.first_name,관리자.employee_id, 관리자.first_name 
from employees 사원, employees 관리자
where 사원. manager_id=관리자.employee_id;
-- 사원의 a.employee_id,a.first_name,a.manager_id정보를 출력해보자.
select a.employee_id, a.first_name,a.manager_id from employees a;
--모든 사원이 짝을 이루었을 때 발생할 수 있는 데이터를 모두 출력하려면 테이블을 하나 더 만들어서
-- 사원과 사원 테이블을 크로스 조인하면 된다.
select a. employee_id, a.first_name, a. manager_id, b.employee_id,b.first_name, b.manager_id
from employees a,employees b;
--107*107개의  모든 사원들이 짝을 이룬 데이터 중 a.manager_id와 b.manager_id가 같은 데이터만 
--남기면 회사의 모든 사원 짝 중 사원과 관리자로 이루어진 짝만 남겨진다.
select a. employee_id,a.first_name,a.manager_id,
b.employee_id,b.first_name,b.manager_id from employees a, employees b
where a.manager_id=b.employee_id;
select e1.employee_id,e1.manager_id
from employees e1
where e1.employee_id =101;
select e2.employee_id,e2.first_name--10,steven 출력
from employees e2
where e2.employee_id=100;

--outer join
select * from employees;
select * from departments;
select count(*) from employees; --107
--사원의 부서이름
 select employees.employee_id,departments.department_name
 from employees, departments
 where employees.department_id= departments.department_id;
 select count(*)
 from employees, departments
 where employees.department_id= departments.department_id;
select *
from employees
where department_id is null;
--left outer join 왼쪽 데이터가 있으나 오른쪽은 null로 채워지는 테이블 생성
select employees.department_id,employees.first_name,department_name 
from employees,departments 
where employees.department_id =departments.department_id(+);
--데이터수 확인
select count(*)
from employees,departments
where employees.department_id= departments.department_id(+);
--right outer join
select employees.department_id,employees.first_name,department_name 
from employees,departments 
where employees.department_id(+) = departments.department_id;
--중복제거후 사원이 있는 부서의 수
select distinct(employees.department_id) from employees;
--회사 전체의 부서의 수
select distinct(department_id) from departments;--27
--사원이 없는 부서/부서가 없는 사원 모두 출력 full outer join
select employees.department_id,employees.first_name,department_name from
employees full outer join departments
on employees.department_id = departments.department_id;
--사원의 부서명을 출력하시오
--1.외부조인 사용
--2. nvl
select *from employees;
select* from departments;
select employees.*,departments.*,nvl(department_name,'대기중')
from employees,departments 
where employees.department_id= departments.department_id(+);
--sub쿼리
--2번 대륙에 있는  모든 정보
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
-- 지역 아이디가 1700인 부서들에서 일하는 사원 정보를 출력해 보자. 
select * from employees where department_id in(
select department_id from departments where location_id =1700) order by employee_id;
-- 지역 아이디가 1700인 부서들에서 일하지 않는 사원 정보를 출력해 보자.
select * from employees where department_id not in(
select department_id from departments where location_id =1700) order by employee_id;
- 최대급여를 받는 사원의 정보를 출력해 보자. 
select * from employees where salary = (
select max(salary) from employees 
);
--범위 조회
select *from jobs;
select * from jobs where job_id in ('AD_PRES', 'SA_MAN', 'IT_PROG') 
order by min_salary; 

select * from employees; 

select employees.employee_id,employees.salary,j.*
from employees,( 
select * from jobs where job_id in ('AD_PRES', 'SA_MAN', 'IT_PROG') 
order by min_salary)j 
where employees.salary>= j.min_salary and employees.salary <= j. max_salary;
