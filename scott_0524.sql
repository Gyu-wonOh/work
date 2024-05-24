select * from tab;
--사원,부서 테이블의 구조를 출력해 보자. 
desc EMP;
desc DEPT;
--모든 부서정보를 출력해보자.
select * from DEPT;
--모든 사원정보를 출력해보자.
select * from EMP;
--모든 사원의 이름을 출력해보자.
select enname from EMP;
--회사의 부서번호를 출력해 보자.
select DEPTNO from dept;
--사원의 관리자,월급,커미션을 출력해 보자.
select mgr,sal,comm from emp;
--부서의 이름과 지역을 출력해 보자.
select dname,loc from DEPT;
--연봉등급과 최저 임금을 출력해 보자.
select * from SALGRADE;
select GRADE,LOSAL from SALGRADE;
--회사에 존재하는 사원의 직업을 출력해보자.
select * from emp;
select ENNAME,JOB from EMP;
--사원이 존재하는 부서 번호를 중복없이 출력해보자.
select distinct deptno from EMP where enname is not null; 
--관리하는 사원이 존재하는 관리자 아이디를 중복없이 출력해보자.
select * from EMP;
select distinct EMPNO from EMP where MGR is not null;
--연봉 등급이 3일때 받을 수 있는 최대 최소 연봉을 출력해보자.
select HISAL,LOSAL from SALGRADE where GRADE =3;
--연봉이 2100이상인 사원의 정보를 출력하시오. 
select * from EMP where SAL >2100;
--부서가 20인 곳에서 일하는 사원들의 사원 정보를 출력해 보자.
select * from EMP where DEPTNO =20;
--관리자가 없는 사원의 정보를 출력해보자.
select * from EMP where MGR is null;
--커미션이 없는 사원의 정보를 출력해보자.
select * from EMP where COMM is null or COMM =0;
--사원의 봉급을 50증가한 형태로 출력해 보자. 
select enname, SAL, SAL+50 from EMP; 
--사원의 현연봉보다 10%증가한 형태로 출력해 보자. 
select sal,sal*1.1 from EMP;
--사원의 봉급을 50증가한 형태로 컬럼명을 upgradeSalary로 출력해 보자.
select enname, SAL, SAL+50 as upgradeSalary from EMP;
--사원의 봉급과 커미션을 합한 형태로 컬럼명을 upgradeSalary로  출력해 보자. 
select enname,sal,comm,sal+nvl(comm,0) as upgradeSalary from EMP;
--‘XXXx 사번의 사원은 관리자가 xxx사번 입니다.’의 형태로 결과를 출력해 보자.
select* from emp;
select empno||'사번의 사원은 관리자가'||mgr||'사번 입니다.' from emp;
--관리자가 없는 사원이 사장이다. 사장의 관리자 번호를 9999로 출력 되도록 sql를 
--nvl,nvl2,decode 함수를 이용해서 각각 구현해 보자. 
--nvl
select empno,enname,nvl(MGR,9999) from emp;
--nvl2
select empno,enname,nvl2(mgr,mgr,9999)as MGR from emp;
--decode
select empno,enname,decode(MGR,null,9999,MGR)as MGR from emp;
--추가로 지급되는 돈(commission)이 없으면 0으로 출력 하도록 구현해 보자.
select empno,enname,decode(comm,null,0,comm) as comm from emp;
--연봉이 800보다 같거나 많고 1000보다 같거나 작은 사원 정보를 출력해 보자.
select *from emp where sal between 800 and 1000;
--부서 번호가 20이면서 직업이 MANAGER인 사원 정보를 출력해 보자.
select * from emp;
select * from emp where deptno =20 and job = 'MANAGER';
--부서 번호가 20이거나 직업이 MANAGER인 사원 정보를 출력해 보자. 
select * from emp where deptno =20 or job = 'MANAGER';
--직업이 Manager가 아닌 사원 정보를 출력해 보자. 
select *from emp where job != 'MANAGER';
--커미션이 0,500,1400와 같은 사원정보를 출력해 보자.
select *from emp where comm in (0,500,1400);
--연봉이 8000보다 같거나 많고 10000보다 같거나 작은 사원 정보를 출력해 보자. 
select *from emp;
select *from emp where sal >= 8000 and sal <= 10000;
--연봉이 700보다 작거나 1000보다 큰 사원 정보를 출력해 보자.
select * from emp where sal <=700 or sal>=1000;'
--사원의 이름이 SCOTT인 사원정보를 출력해 보자.
select * from emp where enname ='SCOTT';
--사원 이름이 ‘A’로 시작하는 사원 정보를 출력해 보자.
select * from emp where enname like 'A%';
--이름에 S가 들어가는 사원 정보를 출력해 보자.
select * from emp where enname like '%S%';
--이름에 L이 들어가지 않은 사원 정보를 출력해 보자. 
select * from emp where enname not like '%L%';
--이름에 세번째 문자가 I 인  사원 정보를 출력해 보자.
select * from emp where enname like '__I%';
--사원의 이름이 E~G로 시작하는 사원정보를 출력해 보자.
select * from emp where enname between 'E' and 'H' and enname != 'H';
--사원의 입사일이 2004년 5월 20일~2007년 10월 10일까지의 사원 정보를 출력해 보자.
select * from emp;
select * from emp where HIRDATE between '2004-05-20' and '2007-10-10'; 
--입사일이 83년 이후이거나 job이 SALESMAN인 모든사원을 출력해 보자.
select * from emp where job = 'SALESMAN';
--20번 부서가 아닌 모든 사원 정보를 출력해 보자.
select * from emp where deptno !=20;
--급여가 600에서 3000사이가 아닌 사원의 정보를 출력해보자.
select * from emp where sal not between 600 and 3000;
--상사가 없는 사원을 출력해 보자.
select * from emp where MGR is null;
--매니저가 7782,2902,2698,7566인 사원 정보를 출력해 보자.
select * from emp where mgr in ( 7782,2902,2698,7566);
--부서번호가 40,10,20이 아닌 사원정보를 출력해 보자. 
select *from emp where deptno not in ( 40,10,20);
--사원 이름이 5 글자인 사원정보를 출력해 보자.
select * from emp where enname like '_____';
--직업이 N으로 끝나는 사원정보를 출력해 보자.
select * from emp where enname like '%N';
--사원 이름에 A가 들어간 사원정보를 출력해 보자.
select * from emp where enname like '%A%';
--이름이 S로 시작하는 사원정보를 출력해 보자. 
select * from emp where enname like 'S%';
--관리자번호을 내림차 순으로 정렬하여 사원 정보를 출력해 보자.
select * from emp order by MGR asc; 
--급여가 많은 순으로 사원 정보를 내림차순 출력해보자.
select * from emp order by SAL desc; 
--사번, 이름, 관리자 번호, 봉급 정보가 출력되고 관리자 번호를 오름차순, 부서번호는 
--오름차순으로 정렬하여 사원정보가 출력되도록 구현해 보자. 
select empno,enname,mgr,sal from emp order by mgr asc,deptno asc;
--사원 정보를 부서번호는 오름차순으로 정렬하고 같은 부서 사원은 사원번호 오름차순으로 정렬해 보자.
select *from emp;
select *from emp order by deptno asc, empno asc;
--직급이 ‘SALESMAN’이면 15%, ‘MANAGER’이면 10%, 이외의 직종은 5% 급여를 인상하여 사원정보를 출력해 보자.
select enname, job ,sal,deptno,
    case 
        when job = 'SALESMAN' then sal*1.15
        when job = 'MANAGER' then sal*1.1
        else sal*1.05
        end as upgradeSalary
    from emp;
