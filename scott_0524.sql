select * from tab;
--���,�μ� ���̺��� ������ ����� ����. 
desc EMP;
desc DEPT;
--��� �μ������� ����غ���.
select * from DEPT;
--��� ��������� ����غ���.
select * from EMP;
--��� ����� �̸��� ����غ���.
select enname from EMP;
--ȸ���� �μ���ȣ�� ����� ����.
select DEPTNO from dept;
--����� ������,����,Ŀ�̼��� ����� ����.
select mgr,sal,comm from emp;
--�μ��� �̸��� ������ ����� ����.
select dname,loc from DEPT;
--������ް� ���� �ӱ��� ����� ����.
select * from SALGRADE;
select GRADE,LOSAL from SALGRADE;
--ȸ�翡 �����ϴ� ����� ������ ����غ���.
select * from emp;
select ENNAME,JOB from EMP;
--����� �����ϴ� �μ� ��ȣ�� �ߺ����� ����غ���.
select distinct deptno from EMP where enname is not null; 
--�����ϴ� ����� �����ϴ� ������ ���̵� �ߺ����� ����غ���.
select * from EMP;
select distinct EMPNO from EMP where MGR is not null;
--���� ����� 3�϶� ���� �� �ִ� �ִ� �ּ� ������ ����غ���.
select HISAL,LOSAL from SALGRADE where GRADE =3;
--������ 2100�̻��� ����� ������ ����Ͻÿ�. 
select * from EMP where SAL >2100;
--�μ��� 20�� ������ ���ϴ� ������� ��� ������ ����� ����.
select * from EMP where DEPTNO =20;
--�����ڰ� ���� ����� ������ ����غ���.
select * from EMP where MGR is null;
--Ŀ�̼��� ���� ����� ������ ����غ���.
select * from EMP where COMM is null or COMM =0;
--����� ������ 50������ ���·� ����� ����. 
select enname, SAL, SAL+50 from EMP; 
--����� ���������� 10%������ ���·� ����� ����. 
select sal,sal*1.1 from EMP;
--����� ������ 50������ ���·� �÷����� upgradeSalary�� ����� ����.
select enname, SAL, SAL+50 as upgradeSalary from EMP;
--����� ���ް� Ŀ�̼��� ���� ���·� �÷����� upgradeSalary��  ����� ����. 
select enname,sal,comm,sal+nvl(comm,0) as upgradeSalary from EMP;
--��XXXx ����� ����� �����ڰ� xxx��� �Դϴ�.���� ���·� ����� ����� ����.
select* from emp;
select empno||'����� ����� �����ڰ�'||mgr||'��� �Դϴ�.' from emp;
--�����ڰ� ���� ����� �����̴�. ������ ������ ��ȣ�� 9999�� ��� �ǵ��� sql�� 
--nvl,nvl2,decode �Լ��� �̿��ؼ� ���� ������ ����. 
--nvl
select empno,enname,nvl(MGR,9999) from emp;
--nvl2
select empno,enname,nvl2(mgr,mgr,9999)as MGR from emp;
--decode
select empno,enname,decode(MGR,null,9999,MGR)as MGR from emp;
--�߰��� ���޵Ǵ� ��(commission)�� ������ 0���� ��� �ϵ��� ������ ����.
select empno,enname,decode(comm,null,0,comm) as comm from emp;
--������ 800���� ���ų� ���� 1000���� ���ų� ���� ��� ������ ����� ����.
select *from emp where sal between 800 and 1000;
--�μ� ��ȣ�� 20�̸鼭 ������ MANAGER�� ��� ������ ����� ����.
select * from emp;
select * from emp where deptno =20 and job = 'MANAGER';
--�μ� ��ȣ�� 20�̰ų� ������ MANAGER�� ��� ������ ����� ����. 
select * from emp where deptno =20 or job = 'MANAGER';
--������ Manager�� �ƴ� ��� ������ ����� ����. 
select *from emp where job != 'MANAGER';
--Ŀ�̼��� 0,500,1400�� ���� ��������� ����� ����.
select *from emp where comm in (0,500,1400);
--������ 8000���� ���ų� ���� 10000���� ���ų� ���� ��� ������ ����� ����. 
select *from emp;
select *from emp where sal >= 8000 and sal <= 10000;
--������ 700���� �۰ų� 1000���� ū ��� ������ ����� ����.
select * from emp where sal <=700 or sal>=1000;'
--����� �̸��� SCOTT�� ��������� ����� ����.
select * from emp where enname ='SCOTT';
--��� �̸��� ��A���� �����ϴ� ��� ������ ����� ����.
select * from emp where enname like 'A%';
--�̸��� S�� ���� ��� ������ ����� ����.
select * from emp where enname like '%S%';
--�̸��� L�� ���� ���� ��� ������ ����� ����. 
select * from emp where enname not like '%L%';
--�̸��� ����° ���ڰ� I ��  ��� ������ ����� ����.
select * from emp where enname like '__I%';
--����� �̸��� E~G�� �����ϴ� ��������� ����� ����.
select * from emp where enname between 'E' and 'H' and enname != 'H';
--����� �Ի����� 2004�� 5�� 20��~2007�� 10�� 10�ϱ����� ��� ������ ����� ����.
select * from emp;
select * from emp where HIRDATE between '2004-05-20' and '2007-10-10'; 
--�Ի����� 83�� �����̰ų� job�� SALESMAN�� ������� ����� ����.
select * from emp where job = 'SALESMAN';
--20�� �μ��� �ƴ� ��� ��� ������ ����� ����.
select * from emp where deptno !=20;
--�޿��� 600���� 3000���̰� �ƴ� ����� ������ ����غ���.
select * from emp where sal not between 600 and 3000;
--��簡 ���� ����� ����� ����.
select * from emp where MGR is null;
--�Ŵ����� 7782,2902,2698,7566�� ��� ������ ����� ����.
select * from emp where mgr in ( 7782,2902,2698,7566);
--�μ���ȣ�� 40,10,20�� �ƴ� ��������� ����� ����. 
select *from emp where deptno not in ( 40,10,20);
--��� �̸��� 5 ������ ��������� ����� ����.
select * from emp where enname like '_____';
--������ N���� ������ ��������� ����� ����.
select * from emp where enname like '%N';
--��� �̸��� A�� �� ��������� ����� ����.
select * from emp where enname like '%A%';
--�̸��� S�� �����ϴ� ��������� ����� ����. 
select * from emp where enname like 'S%';
--�����ڹ�ȣ�� ������ ������ �����Ͽ� ��� ������ ����� ����.
select * from emp order by MGR asc; 
--�޿��� ���� ������ ��� ������ �������� ����غ���.
select * from emp order by SAL desc; 
--���, �̸�, ������ ��ȣ, ���� ������ ��µǰ� ������ ��ȣ�� ��������, �μ���ȣ�� 
--������������ �����Ͽ� ��������� ��µǵ��� ������ ����. 
select empno,enname,mgr,sal from emp order by mgr asc,deptno asc;
--��� ������ �μ���ȣ�� ������������ �����ϰ� ���� �μ� ����� �����ȣ ������������ ������ ����.
select *from emp;
select *from emp order by deptno asc, empno asc;
--������ ��SALESMAN���̸� 15%, ��MANAGER���̸� 10%, �̿��� ������ 5% �޿��� �λ��Ͽ� ��������� ����� ����.
select enname, job ,sal,deptno,
    case 
        when job = 'SALESMAN' then sal*1.15
        when job = 'MANAGER' then sal*1.1
        else sal*1.05
        end as upgradeSalary
    from emp;
