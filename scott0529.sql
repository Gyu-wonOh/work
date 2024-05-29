select *from tab;
desc emp;
desc dept;
--select to_date('28-sep-1981,'dd-mon-yyyy') from dual;
select to_date('28-9-1981','dd-mm=yyyy') from dual;

select *from emp;
select *from dept;

desc emp;
select empno,enname from emp;
select enname, sal, hirdate from emp;
--산술 연산자
select enname,sal*12+nvl(comm,0)as annsal from emp;
select enname,sal*12+nvl(comm,0) annsal from emp;
select enname || ' is a ' || job newName from emp;
--distinct
select distinct deptno from emp;
select * from dept;
select job from emp;
select distinct job from emp;
--비교연산자
select * from emp 
where deptno=10;
select * from emp 
where sal >=3000;
select *from emp 
where upper(enname) =upper('JAMES');
select enname,hirdate from emp
where hirdate>= to_date('1982-01-01','yyyy-mm-dd');
--and 연산자
select enname,empno,job,deptno from emp
where deptno =10 and job ='CLERK';
select * from emp
where hirdate>'1982-01-01' or job ='MANAGER';
--부서번호가 10 번이 나닌 사원의 번호, 이름 부서번호 조회
select empno , enneame, deptno from emp
where deptno =10;
--이름이 'J'로 시작하는 사원의 번호와 이름 조회
select* from emp
where enname like 'J%';
--이름이 'A'가 들어가는 사원의 번호와 이름 조회
select * from emp
where enname like '%A%';
--이름에 ‘A’가 포함되지 않은 사원의 번호, 이름 조회
select * from emp
where enname NOT like '%A%';
--이름이 ‘N’으로 끝나는 사원의 번호와 이름 조회
select * from emp
where enname like '%N';
--이름의 두번째 문자가 ‘A’인 사원의 번호와 이름 조회
select empno,enname from emp
where enname like '_A%';
--커미션이 300,500,1400중 하나인 사원의 번호,이름,커미션 조회
select empno,enname, comm from emp
where comm in (300,500,1400);

select empno,enname, comm from emp
where comm not in (300,500,1400);

select empno,enname, comm from emp
where comm not in (300,500,1400)or comm is null;
select empno,enname, comm from emp
where nvl(comm,0) not in (300,500,1400)or comm is null;
--between and 연산자
--급여가 500 이상, 4000이하인 사원의 번호, 이름, 급여조회
select  empno,enname,sal from emp
where sal >=500 and sal <=4000;

--급여가  500 에서 4000사이가 아닌 사원의 번호, 이름, 급여조회
select empno, enname,sal from emp
where sal <500 or sal>4000;
--급여 500미만 4000초과
select empno,enname, sal from emp
where sal not between 500 and 4000;
--상사가 없는 사원의 이름과 상사조회
select *from emp
where mgr is null;
--상사가 있는 사원의 이름과 상사조회
select * from emp
where mgr is not null;
--급여 순으로 사원번호 ,이름,급여 조회
select empno,enname,sal from emp order by sal asc;
--사원번호, 이름 급여 조회 급여 내림차순으로 정렬
select empno, enname,sal from emp
order by sal desc;
--이름의 알파벳순으로 번호, 이름, 급여 조회
select * from emp
order by enname asc;
--입사일이 오래된 순으로 번호, 이름, 입사일 조회
select empno , enname, hirdate from emp
order by hirdate asc;
--급여는 많은 순, 이름은 알파벳순으로 정렬하여 번호, 급여, 이름조회
select empno,sal,enname from emp order by sal desc,enname asc;
--숫자함수
--round 소수점이하 세째자리에서 반올림해서 둘째자리까지 나타냄
select round(123.123,0) from dual;
--trunc 소수점 둘째자리까지 나타내고 그 아래는 버림
select trunc(123.1234,2) from dual;
--mod(나머지) 함수 
select enname,sal, mod(sal,100) from emp;
select * from emp 
where mod(empno,2)=1;
--문자열을 모두 대문자로 변경하여 조회-'Welcome to Oracle 10g'

select upper('welcom to oracle 10g') from dual;
--사원명을 대문자로 변경 조회
select upper(enname) from emp;
--문자열을 모두 소문자로 변경하여 조회
select lower(enname) from emp;
select initcap(enname) from emp;
--문자열 길이를 확인하는 length함수
select length(enname) from emp;
--특정문자가 출현하는 위치 INSTR 함수 
select instr('welcome to Oracle 10g','o',3,2) from dual;
select instr('welcome to Oracle 10g','o',1,1) from dual;
--사원명에  ‘A’자가 나오는 위치 조회- 이름에 ‘A’가 속해 있지 않으면 0(zero) 반환
select enname,instr(enname,'A',1,1) from emp;
--문자의 일부분을 추출하는 SUBSTR 함수
select substr('Welcom to Oracle 10g',4,3) from dual;--5
--사번, 입사일, 입사년도 조회
select empno, substr(hirdate,4,5), substr(hirdate,1,2) from emp;
--이름의 뒤에서 세번째부터 두 글자 조회
select enname,substr(enname,-3,2) from emp;
--특정문자를 왼쪽삽입하는 LPAD함수(오른쪽정렬후)
select lpad('Oracle 10g',20,'#') from dual;
--왼쪽에서 특정 문자를 삭제하는 LTRIM 함수
select ltrim('      a'),ltrim('lllla','l'), rtrim('a       '),trim('       a    ') from dual;
--직원 이름이 5글자인 직원의 이름 소문자와 입사일, 급여  검색
select lower(enname),hirdate,sal from emp
where length(enname)=5;
--오늘 날짜
select sysdate from dual;
-- 어제 날짜
select sysdate-1 from dual;
--직원의 이름 입사일 , 근무 일수 조회
select enname, hirdate, sysdate- hirdate 
from emp;
--직원의 근무 개월 수 조회
select months_between(sysdate,hirdate) from emp;
--입사한 지 6개월 후
select hirdate, add_months(hirdate,6) from emp;
select hirdate, add_months(hirdate,-6) from emp;

select last_day(hirdate) from emp;
select next_day(hirdate,7) from emp;
--decode
--부서번호가 10 이면 ‘accounting’, 20 이면 ‘research’, 
--30 이면 ‘sales’, 40이면 ‘operations’의 부서명을 DNAME으로 하여 이름, 부서번호, 부서명 조회
select enname, deptno,
 decode( deptno, 
        10, 'accounting',
        20, 'research',
        30, 'sales',
        40, 'operations',
        '없음'
        ) dname
from emp ;
-- 직급이 'manager'이면 15%, clerk이면 5% 인상
--'up sal'로 하여 이름, 직급, 'up sal'조회
select enname, job,sal,decode(job,
                            'MANAGER',SAL*1.15,
                            'CLERK',sal*1.05,
                            sal) as upsal
from emp;
--case
--부서번호가 10 이면 ‘accounting’, 20 이면 ‘research’, 
--30 이면 ‘sales’, 40이면 ‘operations’의 부서명을 DNAME으로 하여 이름, 부서번호, 부서명 조회
select enname, deptno,
 case  
        when deptno = 10 then 'accounting'
        when deptno = 20 then 'research'
        when deptno = 30 then 'sales'
        when deptno = 40 then 'operations'
       else  '없음'
        end dname
from emp ;
-- 직급이 'manager'이면 15%, clerk이면 5% 인상
--'up sal'로 하여 이름, 직급, 'up sal'조회
select enname,job,sal,case
                            when JOB='MANAGER' THEN SAL*1.15
                            when job ='CLERK' THEN SAL*1.05
                            else sal
                            end upsal
from emp;
--직급이 ‘CLERK’이면 20%, ‘ANALYST’이면 15%, ‘MANAGER’이면 10% 인상 
--이외의 직급은 5%인상 하여 이름, 직급, 급여, 인상된 급여를 조회하시오
select enname, job ,sal, case
                        when job = 'CLERK' THEN SAL*1.2
                        when job = 'ANALYST' THEN SAL*1.15
                        when job = 'MANAGER' THEN SAL*1.1
                        ELSE SAL*1.05
                        end upsal
from emp;
--그룹함수
--직원 총 수와 커미션을 받는 사원의 수 조회
select count(empno),count(comm) from emp;
select comm
from emp;
--10번 부서의 커미션을 받는 사원의 수 조회
select count(empno),count(comm) from emp
where deptno= 10;
--부서의 커미션을 받는 사원의 수 조회
select count(empno),count(comm) from emp
group by deptno;
--오후
select count(distinct job from emp;
--총급여 평균
select sum(sal),avg(sal) from emp;
--직종별 총합, 평균
select job, sum(sal), avg(sal) from emp
group by job;
--커미션을 받는 사원들의 수를 계산
select deptno,job,count(comm) from emp group by deptno,job order by deptno asc;
--부서별 최대급여, 최소급여
select deptno, min(sal),max(sal) from emp group by deptno;
--having절
--부서별 평균 급여가 2000 이상인 부서번호와 평균급여 산출
select deptno,avg(sal) from emp group by deptno having avg(sal)>=2000 order by deptno;
--1000이상의 급여를 받는 사원들의 부서별 평균 급여가 2000 이상인 부서 번호와 평균 급여 출력
select deptno,avg(sal) from emp where sal>1000 group by deptno having avg(sal)>2000;
--직책이 clerk이 아닌 사원에 대한 부서별 급여 합이 6500 이상인 부서와 급여 합 반환.
select deptno,sum(sal)
from emp
where job != 'CLERK'
group by deptno having sum(sal)>=6500;
--부서별 최대 급여가 4000이상인 부서의 부서번호와 평균급여 출력
select deptno, max(sal) from emp 
group by deptno 
having max(sal)>4000;
--10과 20 부서에서 최대급여를 받는 사람의 최대급여를 구하여 정렬하시오
select deptno, max(sal) from emp 
where deptno=10 or deptno=20 
group by deptno;
--사원명 부서명
select * from emp;
select * from dept;
select emp.enname, dept.dname from emp,dept
where emp.deptno =dept.deptno;
--ansi
select emp.enname,dept.dname
from emp inner join dept
on emp.deptno=dept.deptno;
-- 이름이 ‘SCOTT’인 사원의 이름과 부서명 조회 
select emp.enname, dept.dname from emp,dept where emp.enname='SCOTT' AND
emp.deptno=dept.deptno;
-- 연봉이 3000이상인 사람의 이름과 부서명
select emp.enname, dept.dname from emp,dept where emp.sal>3000 AND
emp.deptno=dept.deptno;
--emp dept 동등조인
select* from emp;
select* from dept;
select * from emp,dept
where emp.deptno =dept.deptno;
--범위 조인
select *from emp;--emp sal
select * from salgrade; --emp테이블의 sal 값이 losal과 hisal 사이의 등급 값
select * from emp,salgrade
where emp.sal>=salgrade.losal and emp.sal<=salgrade.hisal
order by empno;
--self조인
select 사원.* from emp 사원;-- 사원
select 관리자.* from emp 관리자;--관리자
--사원 관리하는 사람은 사원  사원 관리자
--7499의 관리자는 7698
select 사원.empno ,사원.enname,관리자.empno as MGR_No,관리자.enname as MGR_NAME from emp 사원,emp 관리자
where 사원. MGR=관리자.empno
order by MGR_NO; 

select distinct deptno from emp;
select * from dept;
--outer join
select * from emp,dept
where emp.deptno(+)=dept.deptno;
--ansi
select *
from emp right join dept on emp.deptno=dept.deptno;

select distinct emp.deptno from emp,dept
where emp.deptno=dept.deptno;
--사원의 이름과 부서번호, 부서명 조회 
select emp.enname,emp.deptno,dept.dname 
from emp,dept
where emp.deptno=dept.deptno;
--부서번호가 30인 사원의 이름, 직급, 부서번호, 부서위치 조회 
select emp.enname,emp.job,emp.deptno,dept.loc 
from emp,dept
where emp.deptno=dept.deptno and emp.deptno=30;
--커미션을 받는 사원의 이름, 커미션, 부서명, 위치 출력 
select emp.enname,emp.comm,dept.dname,dept.loc 
from emp,dept
where emp.deptno=dept.deptno and emp.comm is not null;
--달라스에서 근무하는 사원의 이름, 직급, 부서번호, 부서이름 출력
select emp.enname,emp.job,emp.deptno,dept.dname
from emp,dept
where emp.deptno=dept.deptno and trim(dept.loc) ='DALLAS';
--이름에 'A'가 들어가는 사원의 이름, 부서이름 출력
select emp.enname,dept.dname
from emp,dept
where emp.deptno= dept.deptno and emp.enname like '%A%';
--사원이름과 직급, 급여, 호봉 출력
select emp.enname, emp.job, emp.sal, salgrade.grade
from emp,salgrade;
--사원명, 부서번호, 해당사원과 같은 부서에서 근무하는 사원 출력 
select 사원.empno,사원.enname,사원.deptno,동료사원.*
from emp 사원,emp 동료사원
where 사원.deptno=동료사원.deptno and 사원.empno!=동료사원.empno
order by 사원.empno;
--사원별 동료사원의 수
SELECT 
    사원.enname AS 사원명, 
    COUNT(동료사원.empno) AS 동료수 
FROM 
    emp 사원,  emp 동료사원 
where
    사원.deptno = 동료사원.deptno 
    AND 사원.empno != 동료사원.empno 
GROUP BY 
    사원.enname 
ORDER BY 
    사원.enname;
--서브쿼리
--Jones 가 있는 부서의 이름 조회
select dname from dept where deptno in (
select deptno from emp where enname =upper('Jones'));--20 
--10번 부서에서 근무하는 사원의 이름과 부서명 출력
select emp.enname,dept.dname from dept,emp where emp.deptno=dept.deptno and emp.deptno =10;
--평균급여보다 많이 받는 사원의 이름과 급여 출력
select emp. enname ,emp.sal from emp
where sal>(select avg(sal) from emp);
-- 평균급여보다 많이 받는 사원의 이름과 급여를 고액순으로 출력
select emp. enname ,emp.sal from emp
where sal>(select avg(sal) from emp)
order by sal desc;
--10번 부서의 최대 급여와 같은 급여를 받는 사원번호와 이름 출력
select empno, enname 
from emp
where sal=(select max(sal) from emp where deptno=10);
--30번 부서 사원의 최대 급여보다 더 많이 받는 사원의 이름, 급여 출력
--max 사용
select enname,sal
from emp
where sal>(select max(sal) from emp where deptno = 30);
--all사용
select enname,sal
from emp
where sal> all(select sal from emp where deptno = 30);
--급여가 3000 이상인 사원이 소속된 부서 사원의 이름, 급여, 부서번호 출력
select enname,sal,deptno 
from emp 
where deptno in(select deptno from emp where sal >3000);
--급여가 3000 이상인 사원의 부서번호 출력
select deptno from emp where sal >3000;
--30번 부서 사원의 최대 급여보다 더 많이 받는 사원의 이름, 급여 출력
--30번 부서의 사원 급여 최소값보다 더 많이 받는 사원의 이름, 급여 출력
select enname,sal from emp where sal> any(select sal from emp where deptno=30);
--SCOTT의 급여 이상을 받는 사원의 이름, 급여 출력
select enname,sal from emp 
where sal>(select sal from emp where enname='SCOTT');
--직급이 사원(clerk)인 사람의 부서번호, 부서명, 지역 조회
select deptno, dname,loc
from dept
where deptno in (select deptno from emp where job ='CLERK');
--이름에 T를 포함하고 있는 사원과 같은 부서에 근무하는 사원의 번호와 이름 출력
select empno, enname
from emp
where deptno in (
    select deptno from emp where enname like '%T%'
 )and deptno not in( 
    select deptno from emp where enname like '%T%'
); 

--부서위치가 DALLAS인 모든 사원의 이름, 부서번호 조회
select enname,deptno
from emp
where deptno =(select deptno from dept where loc ='DALLAS');
--Sales 부서의 모든 사원의 이름과 급여 출력
select enname,sal
from emp
where deptno=(select deptno from dept where UPPER(dname) ='SALES');
--King의 부하사원들의 이름과 급여, 상사 조회
select enname, sal, mgr
from emp
where mgr =(select empno from emp where enname = 'KING');
--급여가 평균 급여보다 많고 이름에 S가 들어가는 사원과 동일한 부서에 근무하는 모든 사원의 번호, 이름, 급여 출력
 select empno,enname,sal 
 from emp 
 where sal>=(select avg(sal)from emp) and enname like '%S%';