--다음 문제를 scott 에서 찾아 풀어 보자. 다음을 join형태로 풀보자. 

--사원들의 이름과 사번을 출력해보자.
select *from EMP;
--job이 CLERK인 사원들의 이름과 부서명을 출력해 보자.
select *from tab;
select *from dept;
select EMP.ENNAME,emp.job ,dept.dname from EMP,dept where emp.job = 'CLERK' and emp.deptno= dept.deptno ;
--연봉이 2600이상인 사원의 이름과 부서명을 출력해 보자.
select emp.enname,dept.dname from emp,dept where emp.sal >= 2600;
--사원 이름과 급여와 급여등급(호봉)을 출력해 보자. 
select * from salgrade;
select emp.enname,salgrade.grade from emp,salgrade where salgrade.losal<= emp.sal
and salgrade.hisal>=emp.sal;
--사원의 봉급과 상사의 봉급을 출력해 보자.
select 사원.enname, 사원.sal,상사.enname,상사.sal from emp 사원,emp 상사
where 사원.mgr = 상사.empno;
--사원번호와 관리자의 사원번호를 출력해보자. 단, 관리자가 없어도 출력해 보자.
select 사원.empno,상사.empno from emp 사원, emp 상사 where 사원.mgr =상사.empno;
--사원이름과 사원이 다니는 부서명을 출력해보자. 단, 사원이 존재하지 않는 부서는 
--부서명만 출력해 보자. 
--부서번호가 20인 사원의 사번,부서번호,부서위치를 출력해 보자.