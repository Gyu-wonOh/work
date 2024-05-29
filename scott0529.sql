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
--��� ������
select enname,sal*12+nvl(comm,0)as annsal from emp;
select enname,sal*12+nvl(comm,0) annsal from emp;
select enname || ' is a ' || job newName from emp;
--distinct
select distinct deptno from emp;
select * from dept;
select job from emp;
select distinct job from emp;
--�񱳿�����
select * from emp 
where deptno=10;
select * from emp 
where sal >=3000;
select *from emp 
where upper(enname) =upper('JAMES');
select enname,hirdate from emp
where hirdate>= to_date('1982-01-01','yyyy-mm-dd');
--and ������
select enname,empno,job,deptno from emp
where deptno =10 and job ='CLERK';
select * from emp
where hirdate>'1982-01-01' or job ='MANAGER';
--�μ���ȣ�� 10 ���� ���� ����� ��ȣ, �̸� �μ���ȣ ��ȸ
select empno , enneame, deptno from emp
where deptno =10;
--�̸��� 'J'�� �����ϴ� ����� ��ȣ�� �̸� ��ȸ
select* from emp
where enname like 'J%';
--�̸��� 'A'�� ���� ����� ��ȣ�� �̸� ��ȸ
select * from emp
where enname like '%A%';
--�̸��� ��A���� ���Ե��� ���� ����� ��ȣ, �̸� ��ȸ
select * from emp
where enname NOT like '%A%';
--�̸��� ��N������ ������ ����� ��ȣ�� �̸� ��ȸ
select * from emp
where enname like '%N';
--�̸��� �ι�° ���ڰ� ��A���� ����� ��ȣ�� �̸� ��ȸ
select empno,enname from emp
where enname like '_A%';
--Ŀ�̼��� 300,500,1400�� �ϳ��� ����� ��ȣ,�̸�,Ŀ�̼� ��ȸ
select empno,enname, comm from emp
where comm in (300,500,1400);

select empno,enname, comm from emp
where comm not in (300,500,1400);

select empno,enname, comm from emp
where comm not in (300,500,1400)or comm is null;
select empno,enname, comm from emp
where nvl(comm,0) not in (300,500,1400)or comm is null;
--between and ������
--�޿��� 500 �̻�, 4000������ ����� ��ȣ, �̸�, �޿���ȸ
select  empno,enname,sal from emp
where sal >=500 and sal <=4000;

--�޿���  500 ���� 4000���̰� �ƴ� ����� ��ȣ, �̸�, �޿���ȸ
select empno, enname,sal from emp
where sal <500 or sal>4000;
--�޿� 500�̸� 4000�ʰ�
select empno,enname, sal from emp
where sal not between 500 and 4000;
--��簡 ���� ����� �̸��� �����ȸ
select *from emp
where mgr is null;
--��簡 �ִ� ����� �̸��� �����ȸ
select * from emp
where mgr is not null;
--�޿� ������ �����ȣ ,�̸�,�޿� ��ȸ
select empno,enname,sal from emp order by sal asc;
--�����ȣ, �̸� �޿� ��ȸ �޿� ������������ ����
select empno, enname,sal from emp
order by sal desc;
--�̸��� ���ĺ������� ��ȣ, �̸�, �޿� ��ȸ
select * from emp
order by enname asc;
--�Ի����� ������ ������ ��ȣ, �̸�, �Ի��� ��ȸ
select empno , enname, hirdate from emp
order by hirdate asc;
--�޿��� ���� ��, �̸��� ���ĺ������� �����Ͽ� ��ȣ, �޿�, �̸���ȸ
select empno,sal,enname from emp order by sal desc,enname asc;
--�����Լ�
--round �Ҽ������� ��°�ڸ����� �ݿø��ؼ� ��°�ڸ����� ��Ÿ��
select round(123.123,0) from dual;
--trunc �Ҽ��� ��°�ڸ����� ��Ÿ���� �� �Ʒ��� ����
select trunc(123.1234,2) from dual;
--mod(������) �Լ� 
select enname,sal, mod(sal,100) from emp;
select * from emp 
where mod(empno,2)=1;
--���ڿ��� ��� �빮�ڷ� �����Ͽ� ��ȸ-'Welcome to Oracle 10g'

select upper('welcom to oracle 10g') from dual;
--������� �빮�ڷ� ���� ��ȸ
select upper(enname) from emp;
--���ڿ��� ��� �ҹ��ڷ� �����Ͽ� ��ȸ
select lower(enname) from emp;
select initcap(enname) from emp;
--���ڿ� ���̸� Ȯ���ϴ� length�Լ�
select length(enname) from emp;
--Ư�����ڰ� �����ϴ� ��ġ INSTR �Լ� 
select instr('welcome to Oracle 10g','o',3,2) from dual;
select instr('welcome to Oracle 10g','o',1,1) from dual;
--�����  ��A���ڰ� ������ ��ġ ��ȸ- �̸��� ��A���� ���� ���� ������ 0(zero) ��ȯ
select enname,instr(enname,'A',1,1) from emp;
--������ �Ϻκ��� �����ϴ� SUBSTR �Լ�
select substr('Welcom to Oracle 10g',4,3) from dual;--5
--���, �Ի���, �Ի�⵵ ��ȸ
select empno, substr(hirdate,4,5), substr(hirdate,1,2) from emp;
--�̸��� �ڿ��� ����°���� �� ���� ��ȸ
select enname,substr(enname,-3,2) from emp;
--Ư�����ڸ� ���ʻ����ϴ� LPAD�Լ�(������������)
select lpad('Oracle 10g',20,'#') from dual;
--���ʿ��� Ư�� ���ڸ� �����ϴ� LTRIM �Լ�
select ltrim('      a'),ltrim('lllla','l'), rtrim('a       '),trim('       a    ') from dual;
--���� �̸��� 5������ ������ �̸� �ҹ��ڿ� �Ի���, �޿�  �˻�
select lower(enname),hirdate,sal from emp
where length(enname)=5;
--���� ��¥
select sysdate from dual;
-- ���� ��¥
select sysdate-1 from dual;
--������ �̸� �Ի��� , �ٹ� �ϼ� ��ȸ
select enname, hirdate, sysdate- hirdate 
from emp;
--������ �ٹ� ���� �� ��ȸ
select months_between(sysdate,hirdate) from emp;
--�Ի��� �� 6���� ��
select hirdate, add_months(hirdate,6) from emp;
select hirdate, add_months(hirdate,-6) from emp;

select last_day(hirdate) from emp;
select next_day(hirdate,7) from emp;
--decode
--�μ���ȣ�� 10 �̸� ��accounting��, 20 �̸� ��research��, 
--30 �̸� ��sales��, 40�̸� ��operations���� �μ����� DNAME���� �Ͽ� �̸�, �μ���ȣ, �μ��� ��ȸ
select enname, deptno,
 decode( deptno, 
        10, 'accounting',
        20, 'research',
        30, 'sales',
        40, 'operations',
        '����'
        ) dname
from emp ;
-- ������ 'manager'�̸� 15%, clerk�̸� 5% �λ�
--'up sal'�� �Ͽ� �̸�, ����, 'up sal'��ȸ
select enname, job,sal,decode(job,
                            'MANAGER',SAL*1.15,
                            'CLERK',sal*1.05,
                            sal) as upsal
from emp;
--case
--�μ���ȣ�� 10 �̸� ��accounting��, 20 �̸� ��research��, 
--30 �̸� ��sales��, 40�̸� ��operations���� �μ����� DNAME���� �Ͽ� �̸�, �μ���ȣ, �μ��� ��ȸ
select enname, deptno,
 case  
        when deptno = 10 then 'accounting'
        when deptno = 20 then 'research'
        when deptno = 30 then 'sales'
        when deptno = 40 then 'operations'
       else  '����'
        end dname
from emp ;
-- ������ 'manager'�̸� 15%, clerk�̸� 5% �λ�
--'up sal'�� �Ͽ� �̸�, ����, 'up sal'��ȸ
select enname,job,sal,case
                            when JOB='MANAGER' THEN SAL*1.15
                            when job ='CLERK' THEN SAL*1.05
                            else sal
                            end upsal
from emp;
--������ ��CLERK���̸� 20%, ��ANALYST���̸� 15%, ��MANAGER���̸� 10% �λ� 
--�̿��� ������ 5%�λ� �Ͽ� �̸�, ����, �޿�, �λ�� �޿��� ��ȸ�Ͻÿ�
select enname, job ,sal, case
                        when job = 'CLERK' THEN SAL*1.2
                        when job = 'ANALYST' THEN SAL*1.15
                        when job = 'MANAGER' THEN SAL*1.1
                        ELSE SAL*1.05
                        end upsal
from emp;
--�׷��Լ�
--���� �� ���� Ŀ�̼��� �޴� ����� �� ��ȸ
select count(empno),count(comm) from emp;
select comm
from emp;
--10�� �μ��� Ŀ�̼��� �޴� ����� �� ��ȸ
select count(empno),count(comm) from emp
where deptno= 10;
--�μ��� Ŀ�̼��� �޴� ����� �� ��ȸ
select count(empno),count(comm) from emp
group by deptno;
--����
select count(distinct job from emp;
--�ѱ޿� ���
select sum(sal),avg(sal) from emp;
--������ ����, ���
select job, sum(sal), avg(sal) from emp
group by job;
--Ŀ�̼��� �޴� ������� ���� ���
select deptno,job,count(comm) from emp group by deptno,job order by deptno asc;
--�μ��� �ִ�޿�, �ּұ޿�
select deptno, min(sal),max(sal) from emp group by deptno;
--having��
--�μ��� ��� �޿��� 2000 �̻��� �μ���ȣ�� ��ձ޿� ����
select deptno,avg(sal) from emp group by deptno having avg(sal)>=2000 order by deptno;
--1000�̻��� �޿��� �޴� ������� �μ��� ��� �޿��� 2000 �̻��� �μ� ��ȣ�� ��� �޿� ���
select deptno,avg(sal) from emp where sal>1000 group by deptno having avg(sal)>2000;
--��å�� clerk�� �ƴ� ����� ���� �μ��� �޿� ���� 6500 �̻��� �μ��� �޿� �� ��ȯ.
select deptno,sum(sal)
from emp
where job != 'CLERK'
group by deptno having sum(sal)>=6500;
--�μ��� �ִ� �޿��� 4000�̻��� �μ��� �μ���ȣ�� ��ձ޿� ���
select deptno, max(sal) from emp 
group by deptno 
having max(sal)>4000;
--10�� 20 �μ����� �ִ�޿��� �޴� ����� �ִ�޿��� ���Ͽ� �����Ͻÿ�
select deptno, max(sal) from emp 
where deptno=10 or deptno=20 
group by deptno;
--����� �μ���
select * from emp;
select * from dept;
select emp.enname, dept.dname from emp,dept
where emp.deptno =dept.deptno;
--ansi
select emp.enname,dept.dname
from emp inner join dept
on emp.deptno=dept.deptno;
-- �̸��� ��SCOTT���� ����� �̸��� �μ��� ��ȸ 
select emp.enname, dept.dname from emp,dept where emp.enname='SCOTT' AND
emp.deptno=dept.deptno;
-- ������ 3000�̻��� ����� �̸��� �μ���
select emp.enname, dept.dname from emp,dept where emp.sal>3000 AND
emp.deptno=dept.deptno;
--emp dept ��������
select* from emp;
select* from dept;
select * from emp,dept
where emp.deptno =dept.deptno;
--���� ����
select *from emp;--emp sal
select * from salgrade; --emp���̺��� sal ���� losal�� hisal ������ ��� ��
select * from emp,salgrade
where emp.sal>=salgrade.losal and emp.sal<=salgrade.hisal
order by empno;
--self����
select ���.* from emp ���;-- ���
select ������.* from emp ������;--������
--��� �����ϴ� ����� ���  ��� ������
--7499�� �����ڴ� 7698
select ���.empno ,���.enname,������.empno as MGR_No,������.enname as MGR_NAME from emp ���,emp ������
where ���. MGR=������.empno
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
--����� �̸��� �μ���ȣ, �μ��� ��ȸ 
select emp.enname,emp.deptno,dept.dname 
from emp,dept
where emp.deptno=dept.deptno;
--�μ���ȣ�� 30�� ����� �̸�, ����, �μ���ȣ, �μ���ġ ��ȸ 
select emp.enname,emp.job,emp.deptno,dept.loc 
from emp,dept
where emp.deptno=dept.deptno and emp.deptno=30;
--Ŀ�̼��� �޴� ����� �̸�, Ŀ�̼�, �μ���, ��ġ ��� 
select emp.enname,emp.comm,dept.dname,dept.loc 
from emp,dept
where emp.deptno=dept.deptno and emp.comm is not null;
--�޶󽺿��� �ٹ��ϴ� ����� �̸�, ����, �μ���ȣ, �μ��̸� ���
select emp.enname,emp.job,emp.deptno,dept.dname
from emp,dept
where emp.deptno=dept.deptno and trim(dept.loc) ='DALLAS';
--�̸��� 'A'�� ���� ����� �̸�, �μ��̸� ���
select emp.enname,dept.dname
from emp,dept
where emp.deptno= dept.deptno and emp.enname like '%A%';
--����̸��� ����, �޿�, ȣ�� ���
select emp.enname, emp.job, emp.sal, salgrade.grade
from emp,salgrade;
--�����, �μ���ȣ, �ش����� ���� �μ����� �ٹ��ϴ� ��� ��� 
select ���.empno,���.enname,���.deptno,������.*
from emp ���,emp ������
where ���.deptno=������.deptno and ���.empno!=������.empno
order by ���.empno;
--����� �������� ��
SELECT 
    ���.enname AS �����, 
    COUNT(������.empno) AS ����� 
FROM 
    emp ���,  emp ������ 
where
    ���.deptno = ������.deptno 
    AND ���.empno != ������.empno 
GROUP BY 
    ���.enname 
ORDER BY 
    ���.enname;
--��������
--Jones �� �ִ� �μ��� �̸� ��ȸ
select dname from dept where deptno in (
select deptno from emp where enname =upper('Jones'));--20 
--10�� �μ����� �ٹ��ϴ� ����� �̸��� �μ��� ���
select emp.enname,dept.dname from dept,emp where emp.deptno=dept.deptno and emp.deptno =10;
--��ձ޿����� ���� �޴� ����� �̸��� �޿� ���
select emp. enname ,emp.sal from emp
where sal>(select avg(sal) from emp);
-- ��ձ޿����� ���� �޴� ����� �̸��� �޿��� ��׼����� ���
select emp. enname ,emp.sal from emp
where sal>(select avg(sal) from emp)
order by sal desc;
--10�� �μ��� �ִ� �޿��� ���� �޿��� �޴� �����ȣ�� �̸� ���
select empno, enname 
from emp
where sal=(select max(sal) from emp where deptno=10);
--30�� �μ� ����� �ִ� �޿����� �� ���� �޴� ����� �̸�, �޿� ���
--max ���
select enname,sal
from emp
where sal>(select max(sal) from emp where deptno = 30);
--all���
select enname,sal
from emp
where sal> all(select sal from emp where deptno = 30);
--�޿��� 3000 �̻��� ����� �Ҽӵ� �μ� ����� �̸�, �޿�, �μ���ȣ ���
select enname,sal,deptno 
from emp 
where deptno in(select deptno from emp where sal >3000);
--�޿��� 3000 �̻��� ����� �μ���ȣ ���
select deptno from emp where sal >3000;
--30�� �μ� ����� �ִ� �޿����� �� ���� �޴� ����� �̸�, �޿� ���
--30�� �μ��� ��� �޿� �ּҰ����� �� ���� �޴� ����� �̸�, �޿� ���
select enname,sal from emp where sal> any(select sal from emp where deptno=30);
--SCOTT�� �޿� �̻��� �޴� ����� �̸�, �޿� ���
select enname,sal from emp 
where sal>(select sal from emp where enname='SCOTT');
--������ ���(clerk)�� ����� �μ���ȣ, �μ���, ���� ��ȸ
select deptno, dname,loc
from dept
where deptno in (select deptno from emp where job ='CLERK');
--�̸��� T�� �����ϰ� �ִ� ����� ���� �μ��� �ٹ��ϴ� ����� ��ȣ�� �̸� ���
select empno, enname
from emp
where deptno in (
    select deptno from emp where enname like '%T%'
 )and deptno not in( 
    select deptno from emp where enname like '%T%'
); 

--�μ���ġ�� DALLAS�� ��� ����� �̸�, �μ���ȣ ��ȸ
select enname,deptno
from emp
where deptno =(select deptno from dept where loc ='DALLAS');
--Sales �μ��� ��� ����� �̸��� �޿� ���
select enname,sal
from emp
where deptno=(select deptno from dept where UPPER(dname) ='SALES');
--King�� ���ϻ������ �̸��� �޿�, ��� ��ȸ
select enname, sal, mgr
from emp
where mgr =(select empno from emp where enname = 'KING');
--�޿��� ��� �޿����� ���� �̸��� S�� ���� ����� ������ �μ��� �ٹ��ϴ� ��� ����� ��ȣ, �̸�, �޿� ���
 select empno,enname,sal 
 from emp 
 where sal>=(select avg(sal)from emp) and enname like '%S%';