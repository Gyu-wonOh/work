--���� ������ scott ���� ã�� Ǯ�� ����. ������ join���·� Ǯ����. 

--������� �̸��� ����� ����غ���.
select *from EMP;
--job�� CLERK�� ������� �̸��� �μ����� ����� ����.
select *from tab;
select *from dept;
select EMP.ENNAME,emp.job ,dept.dname from EMP,dept where emp.job = 'CLERK' and emp.deptno= dept.deptno ;
--������ 2600�̻��� ����� �̸��� �μ����� ����� ����.
select emp.enname,dept.dname from emp,dept where emp.sal >= 2600;
--��� �̸��� �޿��� �޿����(ȣ��)�� ����� ����. 
select * from salgrade;
select emp.enname,salgrade.grade from emp,salgrade where salgrade.losal<= emp.sal
and salgrade.hisal>=emp.sal;
--����� ���ް� ����� ������ ����� ����.
select ���.enname, ���.sal,���.enname,���.sal from emp ���,emp ���
where ���.mgr = ���.empno;
--�����ȣ�� �������� �����ȣ�� ����غ���. ��, �����ڰ� ��� ����� ����.
select ���.empno,���.empno from emp ���, emp ��� where ���.mgr =���.empno;
--����̸��� ����� �ٴϴ� �μ����� ����غ���. ��, ����� �������� �ʴ� �μ��� 
--�μ��� ����� ����. 
--�μ���ȣ�� 20�� ����� ���,�μ���ȣ,�μ���ġ�� ����� ����.