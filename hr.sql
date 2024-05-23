select* from tab;
select* from countries;
select* from locations;
select* from regions;
select street_address from locations;
select job_id title from jobs;
--모든 사원의 이름과 성을 출력해 보자.
select first_name,last_name from employees;
--사원의 사번과 이메일을 출력해보자.
select employee_id,email from employees;
--직업 이력에 있는 사원들의 사번,직업시작일,직업종료일을 출력해보자.
select employee_id, start_date, end_date from job_history;
--직업별 직업명,최소,최대급여를 출력해보자.
select job_title, min_salary,max_salary from jobs;
--직업 아이디가 'AC_MGR'인 직업정보를 출력해보자.
select * from jobs where job_id= 'AC_MGR';
--작업아이디가 'FI_ACCOUNT'이 아닌 작업아이디 정보을 출력하시오. 
select * from jobs where job_id != 'FI_ACCOUNT';
--2003년 9월 17일 이후에 입사한 사원의 사번,고용일, 전화번호를 출력하시오.
select * from employees where hire_date>'2003-09-17';
 --봉급이 10000이상인 사원의 아이디와 이름과 봉급을 출력 하시오.
select employee_id,first_name,salary from employees
 where salary>10000;
  --부서번호가 50인 사원 정보를 출력 하시오.
select * from employees where department_id=50;
select *from employees;
select *from employees where manager_id = null;
select *from employees where manager_id is null;
select *from employees where manager_id is not null;
select * from employees where department_id is null;
select * from employees where commission_pct is not null and salary>=10000;
select salary,salary+20 new_salary,10+10 plus,'출력'
from employees;
select salary,salary*1.1 from employees; 
select salary, salary+salary, salary*2 from employees;
select salary, salary*3 from employees;
--사원의 봉급을 50증가한 형태로 컬럼명을 upgradeSalary로 출력해 보자.
select salary,salary+50 as upgradeSalary from employees;
--사원의 현봉급 보다 10%증가한 형태로 컬럼명을 upgradeSalary로 출력해 보자.
select salary,salary*1.1 as upgradeSalary from employees;
select first_name,last_name,first_name||last_Name as fullname from employees;
 --월급이 8000 초과 이면서 10000 미만인 사원의 정보를 출력해 보자.
 select * from employees where salary >8000 and salary<10000;
 --월급이 7000이하 이거나 10000초과인 사원의 정보를 출력해 보자.
 select * from employees where salary<=7000 or salary>10000;
--부서가 80이 아닌 사원 정보를 출력해 보자.
select*from employees where department_id!=80;
select*from employees where not department_id=80;
--커미션을 받으면서 2008년 이전에 입사한 사원 정보를 출력해 보자.
select *from employees where hire_date<'2008-01-01' and commission_pct is not null;
-- 대륙 아이디가(REGION_ID) 1, 3, 4인 나라 정보를 출력해보자.
select*from countries where region_id=1 or region_id=2 or region_id=3 or region_id=4;
select * from employees;
--전 사원에게 commission +1
select commission_pct+1,commission_pct from employees;
--between
select *from employees where salary between 8000 and 10000;
select * from employees where salary >=8000 and salary<=10000;
select * from employees where first_name between 'E' and 'H';

--nvl(널확인칼럼명,널일때 변경할 값)
select nvl(commission_pct,0)+1,nvl(commission_pct,0) from employees;
--nvl2(널을 확인하는 coloumn이름, null아닐때 표기값,null일때 표기값)
select nvl2(commission_pct,'널아님','널') from employees;
select nvl2(commission_pct,commission_pct,0)+1 as addOne from employees;
select decode(commission_pct,null,0,commission_pct)+1 add_One from employees;
 --사원 테이블에서 10,20,30 부서는 숫자+ ‘부서입니다.’  나머지 부서는 ‘그밖에 부서 입니다.’가 출력 되도록 쿼리를 구현해 보자. 
select distinct department_id from employees;
select decode(department_id,
                10,'10번 부서',
                20,'20번 부서',
                30,'30번 부서',department_id||'나머지부서')as 부서번호 from employees;
select first_name, commission_pct,
        case
            when commission_pct <=0.1 then '하'
            when commission_pct <=0.2 then '중'
            when commission_pct > 0.2 then '상'
            when commission_pct is null then 'null이다'
            else '선택 받지 못한 데이터'
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
            when EXTRACT(YEAR FROM hire_date)>'2005' then '2005년 이후 입사'
            when EXTRACT(YEAR FROM hire_date)='2005' then '2005년 입사'
            when EXTRACT(YEAR FROM hire_date)<'2005' then '2005년 이전 입사'
            end as 입사시기
from employees;
commit;