select * from tab;
CREATE TABLE Score_Grade (
LOW NUMBER(3),
HIGH NUMBER(3),
GRADE CHAR(2));


CREATE TABLE Course_Temp
AS
SELECT *
FROM Course
WHERE 10=20;


create table Student(  --�л�

Dept_ID varchar2(20),    --fk�߰�(�а�)

Year varchar2(5),

Student_ID varchar2(10) not null primary key,

Name varchar2(20) not null,

ID_Number varchar2(20) not null unique, 

Address varchar2(50),

Telephone varchar2(20),

Email varchar2(20) unique, 

Status varchar2(3),

I_Date date,

constraint Dept_ID_fk foreign key(Dept_ID) REFERENCES Department(Dept_ID));?


?

create table Professor( --����

Professor_ID varchar2(5) not null primary key,

Name varchar2(30) not null,

Position varchar2(30) not null,

Dept_ID varchar2(30), -- fk �а�

Telephone varchar2(30) unique,

Email varchar2(30) unique,

Duty varchar2(20),

Mgr varchar2(10)); --fk ����

?

alter table Professor

add CONSTRAINT Dept_ID_fk1 foreign key(Dept_ID) REFERENCES Department(Dept_ID);

?

alter table Professor

add CONSTRAINT Mgr_fk2 foreign key(Mgr) references Professor(Professor_ID); 

alter table Professor drop constraint Mgr_fk2;

?

create table Department(  --�а� ���̺� �����Ϸ�

Dept_ID varchar2(20) not null primary key,

Dept_Name varchar2(40),

Dept_Tel varchar2(18));

?

create table Course( --���� ���̺�

Course_ID varchar2(20) not null primary key,

Title varchar2(30) not null,

C_Number number(5) not null,

Professor_ID varchar2(10), --fk ����

Course_Fees number(10));

?

?

alter table Course

add CONSTRAINT Professor_ID_fk3 foreign key(Professor_ID) references Professor(Professor_ID);

?

?

create table SG_Scores( -- ���� ���̺�

Student_ID varchar2(10) not null, --fk1 �л�

Course_ID varchar2(10), --fk2 ����

Score number(5),

Grade varchar2(5),

Score_Assigned date,

constraint Student_ID_fk foreign key(Student_ID) references Student(Student_ID),

constraint Course_ID_fk foreign key(Course_ID) references Course(Course_ID));


CREATE TABLE Score_Grade (

LOW NUMBER(3),

HIGH NUMBER(3),

GRADE CHAR(2));

?

?

CREATE TABLE Course_Temp

AS

SELECT *

FROM Course

WHERE 10=20;

select * from tab;
commit;

/**********************************************************
*  Department ���̺� �ߺ� ������
***********************************************************/
INSERT INTO Department VALUES ('�İ�','��ǻ�Ͱ��а�',  '765-4100');
INSERT INTO Department VALUES ('����','������Ű��а�','765-4200');
INSERT INTO Department VALUES ('�濵','�濵�а�',      '765-4400');
INSERT INTO Department VALUES ('����','���������а�',  '765-4500');

/**********************************************************
*  Student ���̺� �ߺ� ������
***********************************************************/
INSERT INTO Student  VALUES
('�İ�','1','C1001','�����','920101-1******','����� ���ı�', '01-932-9999', 
 'c1001@cyber.ac.kr',Null,'2010/03/01');
INSERT INTO Student  VALUES
('�İ�','1','C1002','������','920521-2******','������ �����', '041-343-8838',
 'c10032cyber.ac.kr','H', '2010/03/01');
INSERT INTO Student  VALUES
('�İ�','2','C0901','������','911109-2******','�뱸�� ������', Null,          
 'c0901@cyber.ac.kr',Null,'2009/03/06');
INSERT INTO Student  VALUES
('�İ�','2','C0902','���ֿ�','920917-1******','�泲 ���ؽ�',   '010-555-1616',          
 'c0902@cyber.ac.kr',Null,'2009/03/06');
INSERT INTO Student  VALUES
('�İ�','3','C0801','�ѿ���','900708-1******','�λ�� ������', '016-999-0101',          
 'c0801@cyber.ac.kr',Null,'2008/03/05');
INSERT INTO Student  VALUES
('�İ�','3','C0802','�����','890205-2******','����� ��������','010-333-0707',         
 'c0802@cyber.ac.kr',Null,'2008/03/05');
INSERT INTO Student  VALUES
('����','1','T1001','�躴ȣ','891124-1******','�뱸�� �޼���',  '011-222-0303',         
  Null,              Null,'2010/03/05');
INSERT INTO Student  VALUES
('����','2','T0901','������','901117-1******','�泲 õ�Ƚ�',    Null,          
 't0901@cyber.ac.kr',Null,'2009/03/06');
INSERT INTO Student  VALUES
('�濵','1','B1001','�����','930422-2******','����� ����',  Null,
  Null,              Null,'2010/03/05');
INSERT INTO Student  VALUES
('�濵','2','B0901','���','761225-1******','������ ������',  Null,         
 'b0901@cyber.ac.kr',Null,'2009/03/06');
INSERT INTO Student  VALUES
('����','1','A1001','�̹̳�','901217-2******','���� �����',    '010-888-5050',         
  Null,              Null,'2008/03/05');

/**********************************************************
*  Professor ���̺� �ߺ� ������
***********************************************************/
INSERT INTO Professor VALUES
 ('P11', '�ű��', '����',    '�İ�','765-4111','ksshin@cyber.ac.kr','�а���','P00');
INSERT INTO Professor VALUES
 ('P12', '�̴�ȣ', '�α���',  '�İ�','765-4112','dhlee@cyber.ac.kr', Null,    'P11');
INSERT INTO Professor VALUES
 ('P13', '���ҿ�', '���Ӱ���','�İ�','765-4113','syyoo@cyber.ac.kr',Null,    'P11');
INSERT INTO Professor VALUES
 ('P21', '������', '�α���',  '����','765-4211','jspark@cyber.ac.kr','�а���','P00');
INSERT INTO Professor VALUES
 ('P22', '���ϴ�', '������',  '����','765-4212','hnkim@cyber.ac.kr',  Null,    'P21');
INSERT INTO Professor VALUES
 ('P23', '�̻���', '���Ӱ���','����','765-4213','shlee@cyber.ac.kr', Null,    'P21');
INSERT INTO Professor VALUES
 ('P41', '�ȿ�ȫ', '�α���',  '�濵','765-4411','yhahn@cyber.ac.kr','�а���', 'P00');
INSERT INTO Professor VALUES
 ('P51', '�Կ���', '�α���',  '����','765-4511','yaham@cyber.ac.kr','�а���', 'P00');

/**********************************************************
*  Course ���̺� �ߺ� ������
***********************************************************/
INSERT INTO Course VALUES ('L1011','��ǻ�ͱ���',    2,'P11',Null);
INSERT INTO Course VALUES ('L1012','��������',      2, Null,20000);
INSERT INTO Course VALUES ('L1021','�����ͺ��̽�',  2,'P12',Null);
INSERT INTO Course VALUES ('L1022','������Ű���',  2,'P21',Null);
INSERT INTO Course VALUES ('L1031','SQL',           3,'P12',30000);
INSERT INTO Course VALUES ('L1032','�ڹ����α׷���',3,'P13',Null);
INSERT INTO Course VALUES ('L1041','��ǻ�ͳ�Ʈ��ũ',2,'P21',Null);
INSERT INTO Course VALUES ('L1042','Delphi',        3,'P13',50000);
INSERT INTO Course VALUES ('L1051','����������',    2,'P11',Null);
INSERT INTO Course VALUES ('L1052','���ڻ�ŷ�',    3,'P22',30000);
INSERT INTO Course VALUES ('L2031','�����̷�',      3,'P23',50000);
INSERT INTO Course VALUES ('L0011','TOEIC����',     2, Null,Null);
INSERT INTO Course VALUES ('L0012','���а� ����',   2, Null,Null);
INSERT INTO Course VALUES ('L0013','���а���',      2, Null,Null);

/**********************************************************
*  SG_Scores ���̺� �ߺ� ������
***********************************************************/
INSERT INTO SG_Scores VALUES ('C0901','L1011', 97, Null, '2009/06/29');
INSERT INTO SG_Scores VALUES ('C0902','L1011', 89, Null, '2009/06/29');
INSERT INTO SG_Scores VALUES ('C0901','L1012', 82, Null, '2009/06/29');
INSERT INTO SG_Scores VALUES ('C0902','L1012', 94, Null, '2009/06/29');
INSERT INTO SG_Scores VALUES ('C0801','L1031', 96, Null, '2009/06/29');
INSERT INTO SG_Scores VALUES ('C0802','L1031', 96, Null, '2009/06/29');
INSERT INTO SG_Scores VALUES ('C0801','L1032', 78, Null, '2009/06/29');
INSERT INTO SG_Scores VALUES ('C0802','L1032', 90, Null, '2009/06/29');
INSERT INTO SG_Scores VALUES ('C0901','L1021', 96, Null, '2009/12/23');
INSERT INTO SG_Scores VALUES ('C0902','L1021', 86, Null, '2009/12/23');
INSERT INTO SG_Scores VALUES ('C0901','L1022', 97, Null, '2009/12/23');
INSERT INTO SG_Scores VALUES ('C0902','L1022', 87, Null, '2009/12/23');
INSERT INTO SG_Scores VALUES ('C0801','L1041', 87, Null, '2009/12/23');
INSERT INTO SG_Scores VALUES ('C0802','L1041', 99, Null, '2009/12/23');
INSERT INTO SG_Scores VALUES ('C0801','L1042', 83, Null, '2009/12/23');
INSERT INTO SG_Scores VALUES ('C0802','L1042', 98, Null, '2009/12/23');
INSERT INTO SG_Scores VALUES ('C0901','L1031', 85, Null, '2010/06/28');
INSERT INTO SG_Scores VALUES ('C0902','L1031', 77, Null, '2010/06/28');
INSERT INTO SG_Scores VALUES ('C0901','L1032', 93, Null, '2010/06/28');
INSERT INTO SG_Scores VALUES ('C0902','L1032', 97, Null, '2010/06/28');
INSERT INTO SG_Scores VALUES ('C0801','L1051', 87, Null, '2010/06/28');
INSERT INTO SG_Scores VALUES ('C0802','L1051', 77, Null, '2010/06/28');
INSERT INTO SG_Scores VALUES ('C0801','L1052', 89, Null, '2010/06/28'); 
INSERT INTO SG_Scores VALUES ('C0802','L1052', 89, Null, '2010/06/28'); 
INSERT INTO SG_Scores VALUES ('C0901','L1041', 93, Null, '2010/12/27');
INSERT INTO SG_Scores VALUES ('C0902','L1041', 87, Null, '2010/12/27');
INSERT INTO SG_Scores VALUES ('C0901','L1042',105, Null, '2010/12/27');
INSERT INTO SG_Scores VALUES ('C0902','L1042', 98, Null, '2010/12/27');
INSERT INTO SG_Scores VALUES ('C0801','L0011', 68, Null, '2010/12/27');
INSERT INTO SG_Scores VALUES ('C0802','L0011', 98, Null, '2010/12/27');

 /**********************************************************
*  Course_Temp ���̺� �ߺ� ������
***********************************************************/
INSERT INTO Course_Temp VALUES ('L1031','SQL����',       3,'P12',50000);
INSERT INTO Course_Temp VALUES ('L1032','JAVA',          3,'P13',30000);
INSERT INTO Course_Temp VALUES ('L1043','JSP ���α׷���',3, NULL,50000);
INSERT INTO Course_Temp VALUES ('L2033','�������α׷���',3,'P23',40000);
INSERT INTO Course_Temp VALUES ('L4011','�濵�����ý���',3,'P41',30000);
INSERT INTO Course_Temp VALUES ('L4012','����������',    3,'P51',50000);

 /**********************************************************
*  Course_Grade ���̺� �ߺ� ������
***********************************************************/
INSERT INTO SCORE_GRADE VALUES (90,100,'A');
INSERT INTO SCORE_GRADE VALUES (80,89,'B');
INSERT INTO SCORE_GRADE VALUES (70,79,'C');
INSERT INTO SCORE_GRADE VALUES (60,69,'D');
INSERT INTO SCORE_GRADE VALUES (0,59,'F');

COMMIT;
--7��.txt
--1. department ���̺��� ��� �����͸� ����Ͻÿ�.
select * from department;
--2. professor ���̺��� �ߺ����� ���� Dept_id�÷��� ������ ����Ͻÿ�[1�� �̻��� ������ �����ϴ� �а��� ���]
select distinct Dept_id from professor;
--3. professor ���̺��� �ߺ����� ���� dept_id�÷��� ���� ����Ͻÿ�  �� ������(�÷�)�� "�Ҽ��а�"�� ����Ѵ�.
select distinct dept_id �Ҽ��а� from professor;
--4. course ���̺��� �����ڵ�(course_id),�����(title),������(c_Number)�� ����Ͻÿ�.
select course_id �����ڵ�,title ����� ,c_number ���� from course;
--5. course ���̺��� �����ڵ�(Course_id),�����(title),����(c_Number)�� ���� ������ ������ ����Ͻÿ�.
select course_id �����ڵ�,title �����, c_number ���� from course order by course_id asc, title asc;
--6. course���̺��� �����ڵ�(course_id),�����(title),���� ��(c_Number),
--���� ������(������*30000+�߰�������)�� ����ϵ�,���� �����Ḧ ��������, �����ڵ��  ������������ ����Ͻÿ�.
select course_id,title,c_number*30000+nvl(course_fees,0) ������ from course order by course_id asc, ������ desc; 
select * from course;
select *from course_temp;
--7. 125*32+12500�� ������ ����Ͻÿ�.
select 125*32+12500 sum from dual;
--8. Professor���̺�� ���� '�İ�' �а��� �������� ����Ͻÿ�.
select name,dept_id from professor where dept_id='�İ�';
--9. course���̺�� ���� �߰� �����ᰡ 30000�� �̻��� ������� ����ϵ�, �߰� �����Ḧ ������������ ����Ͻÿ�.
select * from tab;
select title ,course_fees from course where course_fees>=30000 order by course_fees desc;
--10. Student ���̺��� '�İ�'�а� 2�г� �л��� �а�,�г�,������ ����Ͻÿ�.
select dept_id �а�, year, name ���� from Student where dept_id='�İ�' and year ='2';
desc Student;
--11. professor ���̺�κ��� �Ҽ��а�, ������, ��ȭ��ȣ�� �ڿ���� ����ϵ�, �а��ڵ�(dept_id)������ ����Ͻÿ�.
select dept_id,name,telephone from professor order by dept_id;
--12. Student ���̺�� ����'��'�� ���� �л������ ����Ͻÿ�.
select * from Student where name like '��%';
--13. Student ���̺�� ���� ����(name)�÷��� �߰� ���ڰ� '��'���� �л��� �˻��Ͽ� ����Ͻÿ�.
select * from Student where name like '%��%';
--14. professor ���̺��� �а� �ڵ�(dept_id)�� '�İ�','����' �а��� �������� ������ ����� 
--�а��ڵ������ ����Ͻÿ�(in ���)
select *from professor where dept_id in('�İ�','����') order by dept_id;
--15. 14����  ���迬���ڿ� �� �����ڷ� �˻��Ͻÿ�.
select *from professor where dept_id = '�İ�' or dept_id='����' order by dept_id;
--16. SG_scores ���̺��� ����(score)�� 90������ 94�������� ������ ������ ���������� ����Ͻÿ�.(between ���)
select * from SG_scores where score between 90 and 94 order by score;
--17. 16���� ���迬���ڿ� �������ڷ� ó���Ͻÿ�.
select * from SG_scores where score >=90 and score<=94 order by score;
--18. course ���̺�� ���� �߰������ᰡ ���� ���� �˻��Ͽ� ����Ͻÿ�.
select * from course  where course_fees is null;
--��������
--1. SG_Scores ���̺��� 'L1031' 'SQL' ������ ����� ����ϰ�, 'L1031'������ ��� �������� 
--���� ������ ����Ͻÿ�.(��������)
Select avg(score) from SG_Scores where course_id='L1031';--88.5
select * from SG_Scores where score>(Select avg(score) from SG_Scores where course_id='L1031');

--2. SG_Scores ���̺��� 'L1031' 'SQL' ���񿡼� �ְ����� ���� �л����� �й�, �����ڵ�, ����, �������
--���ڸ� ����Ͻÿ�.
SELECT * FROM SG_SCORES;
select MAX(SCORE) from SG_scores where course_id ='L1031';--96
select student_id,course_id,grade,score_assigned 
from SG_Scores
where SCORE =(select MAX(SCORE) from SG_scores where course_id ='L1031');
--3. in�����ڸ� ����ؼ� SG_Scores ���̺��� �⵵�� �ְ����� ���� �л����� �й�,�����ڵ�,����,����������ڸ� ����Ͻÿ�.
select max(score)from SG_Scores;
select student_id,course_id,score,score_assigned 
from SG_Scores
where score in(
select max(score) from SG_Scores group by score_assigned 
);
--4. any�� some�����ڸ� ����ؼ� SG_Scores ���̺��� 'L1031' 'SQL' ���񿡼� ������ ���������� ���� ������ �л��� 
--���Ͽ� �й�, �����ڵ�, ����, ����������ڸ� ����Ͻÿ�.
select student_id , course_id, score,score_assigned from SG_Scores where score> some(select score from SG_scores where course_id='L1031');
--5. all�� �̿��Ͽ� SG_Scores ���̺��� 'L1031' 'SQL' ���񿡼� �ְ����� ���� �л����� �й�,�����ڵ�,����, ����������ڸ� ����Ͻÿ�.
select score from SG_Scores where course_id='L1031';--96-96-85-77
select student_id,course_id,score,score_assigned
from SG_Scores
where score>=all(select score from SG_Scores where course_id='L1031');
--6. exists�� �̿��ؼ� Professor ���̺�� course ���̺��� �̿��Ͽ� ���Ǹ� ����ϰ� �ִ� ������ ����� ����Ͻÿ�.
select * from professor
where exists(
select * from course where course.professor_id = professor.professor_id);
--7. Professor ���̺�� course���̺��� �̿��Ͽ� ���Ǹ� ����ϰ� ���� ���� ������ ����� ����Ͻÿ�.
select * from professor 
where not exists(
    select * from course where course.professor_id = professor.professor_id);
--8. Student ���̺��� '�İ�'�а��� �������� �л����� Comtuter_student ���̺��� �����ϰ�,�����Ͻÿ�.
create table  Computer_student as select * from Student where dept_id='�İ�';
select * from computer_student;
--9. Course���̺�� ������ T_Course�� ���̺��� �����Ͻÿ�.
drop table T_course;
create table T_course as select * from COURSE where 1!=1;
select * from T_course;

--databaseUpdate
--1.���ο�  ������ �����Ǿ���. T_Course ���̺� �߰��Ͻÿ�, �����ڵ�� 'L1061'
--�̰�, ������� 'ERP�ǹ�',3�����̸� ��米���� 'P12'�̰�, �߰� ������� 50000���̴�.
select * from T_course;
ALTER TABLE T_COURSE ADD PRIMARY KEY(COURSE_ID);
DESC COURSE;
insert into T_course values ('L1061','ERP�ǹ�',3,'P12',50000);
--2.���ο�  ������ �����Ǿ���. T_Course ���̺� �߰��Ͻÿ�, �����ڵ�� 'L1062'�̰�
--������� '�׷�����',3�����̸�, ��米����'P13'�̰�, �߰� ������� 40000���̴�.
insert into T_course values ('L1062','�׷�����',3,'P13',40000);
--3.�й��� 'B091'�� 'L1061'������ 85���� ���� �������볯¥�� 2010�� 06�� 28���̴�.
--�������� SG_Scores ���̺� �Է��Ͻÿ�.
DESC SG_Scores; 
SELECT * FROM COURSE;
SELECT * FROM STUDENT;
insert into course values('L1061','ERP�ǹ�',3,'P12',50000);
insert into student values('�İ�','2','B901','�ֻ���','921023-1******','����� ���ʱ�','02-720-4287','B901@cyber.ac.kr',null,'10/02/09');
insert into SG_Scores values ('B901','L1061',85,NULL,TO_DATE('2010/06/28','YYYY/MM/DD'));
--4.�����ڵ尡 'L3041', ������� '�Ӻ����ý���',3�����̸�,��米����ȣ�� 'P31',
--�߰� ������� 30000���� ��, �� ������ Course���̺� �Է��Ͻÿ�.
select * from professor;
insert into professor values ('p31','�Ӻ���','����','�İ�','765-4421','baelim@cyber.ac.kr',null,'p11');

insert into course values ('L3041','�Ӻ����ý���',3,'p31',30000);
select * from course;
--5.�����ڵ尡 'L3041',������� '�Ӻ����ý���',3�����̸�,��米����ȣ�� 'P31',
--�߰� ������� 30000���϶�, �� ������ Course ���̺� �Է��Ͻÿ�.
select * from professor;
insert into professor values ('p31','�Ӻ���','����','�İ�','765-4421','baelim@cyber.ac.kr',null,'p11');

insert into course values ('L3041','�Ӻ����ý���',3,'p31',30000);
select * from course;

--6.�����ڵ尡 'L1031'�̰�, ������� 'SQl',3�����̸�,��米����'P12'�̰�, 
--�߰� ������� 30000���̴�. �� ������ Course���̺� �Է��Ͻÿ�.
select *from  course;
insert into course values ('L1031','SQL',3,'p12',30000);
--7. ��ǻ�� ���а��� ���ӱ����� ä��Ǿ���. ������ȣ�� 'P14', �������� '������',
--������ '���Ӱ���',��ȭ��ȣ��'765-4114'�϶�, �������� Professor���̺� �Է��Ͻÿ�.
insert into professor values ('p14','������','���Ӱ���','�İ�','765-4114','sungwoo@cyber.ac.kr'
,null,'p13');
select * from professor;
--8. '�İ�' �а� 2�г⿡ ������ '������' �л��� student���̺� �Է��Ͻÿ�. 
--�й��� 'C0931'�̰�, �ֹε�Ϲ�ȣ�� '911119-2******',eMail�ּҴ� 'C0931@cyber.ac.kr'�̴�.
select * from student;
insert into Student values ('�İ�','2','C0931','������','911119-2******',null,null,'C0931@cyber.ac.kr',null,'09/03/06');
--10. ��ǻ�Ͱ��а��� �ܱ����� �ʺ������ ä���Ͽ���. ������ȣ�� 'P91',�������� 'Bill Gates', 
--������ '�ʺ�����'�̸�,��ȭ��ȣ�� '765-4119'�� ��, �� �ʺ������� ������ �Է��Ͻÿ�.
insert into professor values ('p91','Bill Gates','�ʺ�����','�İ�','765-4119','billgates@cyber.ac.kr'
,null,'p14');
select * from professor;
--11. 2010�� 6�� 28�Ͽ� ����� 'C0931'�й��� 'L1031'������ 
--97���� �����Ͽ� �߰� �Է��ϰ��� �Ѵ�. ���� ���� �Է��ϴ� ���� ������ �߰��Ͻÿ�.

--12. subquery�� �ִ� insert���� ����Ͽ� Course ���̺�κ��� ������ȣ�� 'P12'�� 
--������ ���������� ������  T_Course���̺� �����Ͻÿ�.
drop table T_course;

insert into T_course select *from course;
insert into T_course select * from course where professor_id in(select professor_id from professor where professor_id='P12');
--13. Department ���̺��� �а���(Dept_name)�� '��ǻ�������迭'�� �����Ͻÿ�.
--14. Course���̺��� �����'Delphi'�� '������'�� �����Ͻÿ�.
--15. �й��� 'C0901'�̰�,�����ڵ尡 'L1042'�� ������ 85���� 105������ �߸� �Է��Ͽ���.SG_Scores ���̺��� ������ �����Ͻÿ�.
--16. Course ���̺��� �߰� ������(Course_fees)�� ��հ����� ���� ��� 5000���� �谨�Ͻÿ�.
--17. T_Course���̺��� ��� ���� �����Ͻÿ�.(������ rollback �Ͻÿ�.)
--18. Course ���̺��� �����ڵ�(Course_ID)�� 'L0012' �̰�,�����(title)�� '���а� ����'�� ������ �����Ͻÿ�.
--19. DepartMent ���̺��� '�İ�' Ȯ���� ���� �����Ͻÿ�.
--21. Course_temp ���̺� ���� ������ ����� ����� ������ �̿��Ͽ�  Course���̺� �����Ͻÿ�.(merge�̿�) select * from course;�� ����� 17���� �ȴ�.