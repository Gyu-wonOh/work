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


create table Student(  --학생

Dept_ID varchar2(20),    --fk추가(학과)

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

create table Professor( --교수

Professor_ID varchar2(5) not null primary key,

Name varchar2(30) not null,

Position varchar2(30) not null,

Dept_ID varchar2(30), -- fk 학과

Telephone varchar2(30) unique,

Email varchar2(30) unique,

Duty varchar2(20),

Mgr varchar2(10)); --fk 교수

?

alter table Professor

add CONSTRAINT Dept_ID_fk1 foreign key(Dept_ID) REFERENCES Department(Dept_ID);

?

alter table Professor

add CONSTRAINT Mgr_fk2 foreign key(Mgr) references Professor(Professor_ID); 

alter table Professor drop constraint Mgr_fk2;

?

create table Department(  --학과 테이블 생성완료

Dept_ID varchar2(20) not null primary key,

Dept_Name varchar2(40),

Dept_Tel varchar2(18));

?

create table Course( --과목 테이블

Course_ID varchar2(20) not null primary key,

Title varchar2(30) not null,

C_Number number(5) not null,

Professor_ID varchar2(10), --fk 교수

Course_Fees number(10));

?

?

alter table Course

add CONSTRAINT Professor_ID_fk3 foreign key(Professor_ID) references Professor(Professor_ID);

?

?

create table SG_Scores( -- 수강 테이블

Student_ID varchar2(10) not null, --fk1 학생

Course_ID varchar2(10), --fk2 과목

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
*  Department 테이블 견본 데이터
***********************************************************/
INSERT INTO Department VALUES ('컴공','컴퓨터공학과',  '765-4100');
INSERT INTO Department VALUES ('정통','정보통신공학과','765-4200');
INSERT INTO Department VALUES ('경영','경영학과',      '765-4400');
INSERT INTO Department VALUES ('행정','세무행정학과',  '765-4500');

/**********************************************************
*  Student 테이블 견본 데이터
***********************************************************/
INSERT INTO Student  VALUES
('컴공','1','C1001','김대현','920101-1******','서울시 송파구', '01-932-9999', 
 'c1001@cyber.ac.kr',Null,'2010/03/01');
INSERT INTO Student  VALUES
('컴공','1','C1002','신지애','920521-2******','대전시 대덕구', '041-343-8838',
 'c10032cyber.ac.kr','H', '2010/03/01');
INSERT INTO Student  VALUES
('컴공','2','C0901','이정민','911109-2******','대구시 수성구', Null,          
 'c0901@cyber.ac.kr',Null,'2009/03/06');
INSERT INTO Student  VALUES
('컴공','2','C0902','박주영','920917-1******','경남 진해시',   '010-555-1616',          
 'c0902@cyber.ac.kr',Null,'2009/03/06');
INSERT INTO Student  VALUES
('컴공','3','C0801','한영삼','900708-1******','부산시 동래구', '016-999-0101',          
 'c0801@cyber.ac.kr',Null,'2008/03/05');
INSERT INTO Student  VALUES
('컴공','3','C0802','서희경','890205-2******','서울시 영등포구','010-333-0707',         
 'c0802@cyber.ac.kr',Null,'2008/03/05');
INSERT INTO Student  VALUES
('정통','1','T1001','김병호','891124-1******','대구시 달서구',  '011-222-0303',         
  Null,              Null,'2010/03/05');
INSERT INTO Student  VALUES
('정통','2','T0901','이정필','901117-1******','충남 천안시',    Null,          
 't0901@cyber.ac.kr',Null,'2009/03/06');
INSERT INTO Student  VALUES
('경영','1','B1001','김빛나','930422-2******','서울시 은평구',  Null,
  Null,              Null,'2010/03/05');
INSERT INTO Student  VALUES
('경영','2','B0901','배상문','761225-1******','대전시 동구읍',  Null,         
 'b0901@cyber.ac.kr',Null,'2009/03/06');
INSERT INTO Student  VALUES
('행정','1','A1001','이미나','901217-2******','전남 광양시',    '010-888-5050',         
  Null,              Null,'2008/03/05');

/**********************************************************
*  Professor 테이블 견본 데이터
***********************************************************/
INSERT INTO Professor VALUES
 ('P11', '신기술', '교수',    '컴공','765-4111','ksshin@cyber.ac.kr','학과장','P00');
INSERT INTO Professor VALUES
 ('P12', '이대호', '부교수',  '컴공','765-4112','dhlee@cyber.ac.kr', Null,    'P11');
INSERT INTO Professor VALUES
 ('P13', '유소연', '전임강사','컴공','765-4113','syyoo@cyber.ac.kr',Null,    'P11');
INSERT INTO Professor VALUES
 ('P21', '박지성', '부교수',  '정통','765-4211','jspark@cyber.ac.kr','학과장','P00');
INSERT INTO Professor VALUES
 ('P22', '김하늘', '조교수',  '정통','765-4212','hnkim@cyber.ac.kr',  Null,    'P21');
INSERT INTO Professor VALUES
 ('P23', '이상혁', '전임강사','정통','765-4213','shlee@cyber.ac.kr', Null,    'P21');
INSERT INTO Professor VALUES
 ('P41', '안연홍', '부교수',  '경영','765-4411','yhahn@cyber.ac.kr','학과장', 'P00');
INSERT INTO Professor VALUES
 ('P51', '함영애', '부교수',  '행정','765-4511','yaham@cyber.ac.kr','학과장', 'P00');

/**********************************************************
*  Course 테이블 견본 데이터
***********************************************************/
INSERT INTO Course VALUES ('L1011','컴퓨터구조',    2,'P11',Null);
INSERT INTO Course VALUES ('L1012','웹디자인',      2, Null,20000);
INSERT INTO Course VALUES ('L1021','데이터베이스',  2,'P12',Null);
INSERT INTO Course VALUES ('L1022','정보통신개론',  2,'P21',Null);
INSERT INTO Course VALUES ('L1031','SQL',           3,'P12',30000);
INSERT INTO Course VALUES ('L1032','자바프로그래밍',3,'P13',Null);
INSERT INTO Course VALUES ('L1041','컴퓨터네트워크',2,'P21',Null);
INSERT INTO Course VALUES ('L1042','Delphi',        3,'P13',50000);
INSERT INTO Course VALUES ('L1051','웹서버관리',    2,'P11',Null);
INSERT INTO Course VALUES ('L1052','전자상거래',    3,'P22',30000);
INSERT INTO Course VALUES ('L2031','게임이론',      3,'P23',50000);
INSERT INTO Course VALUES ('L0011','TOEIC연구',     2, Null,Null);
INSERT INTO Course VALUES ('L0012','문학과 여행',   2, Null,Null);
INSERT INTO Course VALUES ('L0013','문학개론',      2, Null,Null);

/**********************************************************
*  SG_Scores 테이블 견본 데이터
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
*  Course_Temp 테이블 견본 데이터
***********************************************************/
INSERT INTO Course_Temp VALUES ('L1031','SQL응용',       3,'P12',50000);
INSERT INTO Course_Temp VALUES ('L1032','JAVA',          3,'P13',30000);
INSERT INTO Course_Temp VALUES ('L1043','JSP 프로그래밍',3, NULL,50000);
INSERT INTO Course_Temp VALUES ('L2033','게임프로그래밍',3,'P23',40000);
INSERT INTO Course_Temp VALUES ('L4011','경영정보시스템',3,'P41',30000);
INSERT INTO Course_Temp VALUES ('L4012','세무행정학',    3,'P51',50000);

 /**********************************************************
*  Course_Grade 테이블 견본 데이터
***********************************************************/
INSERT INTO SCORE_GRADE VALUES (90,100,'A');
INSERT INTO SCORE_GRADE VALUES (80,89,'B');
INSERT INTO SCORE_GRADE VALUES (70,79,'C');
INSERT INTO SCORE_GRADE VALUES (60,69,'D');
INSERT INTO SCORE_GRADE VALUES (0,59,'F');

COMMIT;
--7장.txt
--1. department 테이블의 모든 데이터를 출력하시오.
select * from department;
--2. professor 테이블의 중복되지 않은 Dept_id컬럼의 값들을 출력하시오[1명 이상의 교수가 존재하는 학과명 출력]
select distinct Dept_id from professor;
--3. professor 테이블의 중복되지 않은 dept_id컬럼의 값을 출력하시오  단 부제목(컬럼)은 "소속학과"로 출력한다.
select distinct dept_id 소속학과 from professor;
--4. course 테이블에서 과목코드(course_id),과목명(title),학점수(c_Number)를 출력하시오.
select course_id 과목코드,title 과목명 ,c_number 학점 from course;
--5. course 테이블에서 과목코드(Course_id),과목명(title),학점(c_Number)를 과목 오름차 순으로 출력하시오.
select course_id 과목코드,title 과목명, c_number 학점 from course order by course_id asc, title asc;
--6. course테이블에서 과목코드(course_id),과목명(title),학점 수(c_Number),
--과목별 수강료(학점수*30000+추가수강료)를 출력하되,과목별 수강료를 내림차순, 과목코드는  오름차순으로 출력하시오.
select course_id,title,c_number*30000+nvl(course_fees,0) 수강료 from course order by course_id asc, 수강료 desc; 
select * from course;
select *from course_temp;
--7. 125*32+12500의 수식을 계산하시오.
select 125*32+12500 sum from dual;
--8. Professor테이블로 부터 '컴공' 학과의 교수명을 출력하시오.
select name,dept_id from professor where dept_id='컴공';
--9. course테이블로 부터 추가 수강료가 30000원 이상인 과목명을 출력하되, 추가 수강료를 내림차순으로 출력하시오.
select * from tab;
select title ,course_fees from course where course_fees>=30000 order by course_fees desc;
--10. Student 테이블에서 '컴공'학과 2학년 학생의 학과,학년,성명을 출력하시오.
select dept_id 학과, year, name 성명 from Student where dept_id='컴공' and year ='2';
desc Student;
--11. professor 테이블로부터 소속학과, 교수명, 전화번호를 자연어로 출력하되, 학과코드(dept_id)순으로 출력하시오.
select dept_id,name,telephone from professor order by dept_id;
--12. Student 테이블로 부터'이'씨 성의 학생명단을 출력하시오.
select * from Student where name like '이%';
--13. Student 테이블로 부터 성명(name)컬럼의 중간 글자가 '정'자인 학생을 검색하여 출력하시오.
select * from Student where name like '%정%';
--14. professor 테이블에서 학과 코드(dept_id)가 '컴공','정통' 학과에 재직중인 교수의 명단을 
--학과코드순으로 출력하시오(in 사용)
select *from professor where dept_id in('컴공','정통') order by dept_id;
--15. 14번을  관계연산자와 논리 연산자로 검색하시오.
select *from professor where dept_id = '컴공' or dept_id='정통' order by dept_id;
--16. SG_scores 테이블에서 성적(score)이 90점부터 94점까지의 범위내 성적을 성적순으로 출력하시오.(between 사용)
select * from SG_scores where score between 90 and 94 order by score;
--17. 16번을 관계연산자와 논리연산자로 처리하시오.
select * from SG_scores where score >=90 and score<=94 order by score;
--18. course 테이블로 부터 추가수강료가 널인 행을 검색하여 출력하시오.
select * from course  where course_fees is null;
--서브쿼리
--1. SG_Scores 테이블의 'L1031' 'SQL' 과목의 행들을 출력하고, 'L1031'과목의 평균 점수보다 
--높은 점수를 출력하시오.(서브쿼리)
Select avg(score) from SG_Scores where course_id='L1031';--88.5
select * from SG_Scores where score>(Select avg(score) from SG_Scores where course_id='L1031');

--2. SG_Scores 테이블의 'L1031' 'SQL' 과목에서 최고점을 받은 학생들의 학번, 과목코드, 성적, 성적취득
--일자를 출력하시오.
SELECT * FROM SG_SCORES;
select MAX(SCORE) from SG_scores where course_id ='L1031';--96
select student_id,course_id,grade,score_assigned 
from SG_Scores
where SCORE =(select MAX(SCORE) from SG_scores where course_id ='L1031');
--3. in연산자를 사용해서 SG_Scores 테이블의 년도별 최고점을 받은 학생들의 학번,과목코드,성적,성적취득일자를 출력하시오.
select max(score)from SG_Scores;
select student_id,course_id,score,score_assigned 
from SG_Scores
where score in(
select max(score) from SG_Scores group by score_assigned 
);
--4. any나 some연산자를 사용해서 SG_Scores 테이블의 'L1031' 'SQL' 과목에서 성적이 최하점보다 높은 점수의 학생에 
--대하여 학번, 과목코드, 성적, 성적취득일자를 출력하시오.
select student_id , course_id, score,score_assigned from SG_Scores where score> some(select score from SG_scores where course_id='L1031');
--5. all를 이용하여 SG_Scores 테이블의 'L1031' 'SQL' 과목에서 최고점을 받은 학생들의 학번,과목코드,성적, 성적취득일자를 출려하시오.
select score from SG_Scores where course_id='L1031';--96-96-85-77
select student_id,course_id,score,score_assigned
from SG_Scores
where score>=all(select score from SG_Scores where course_id='L1031');
--6. exists를 이용해서 Professor 테이블과 course 테이블을 이용하여 강의를 담당하고 있는 교수의 명단을 출력하시오.
select * from professor
where exists(
select * from course where course.professor_id = professor.professor_id);
--7. Professor 테이블과 course테이블을 이용하여 강의를 담당하고 있지 않은 교수의 명단을 출력하시오.
select * from professor 
where not exists(
    select * from course where course.professor_id = professor.professor_id);
--8. Student 테이블에서 '컴공'학과에 재학중인 학생들을 Comtuter_student 테이블을 생성하고,저장하시오.
create table  Computer_student as select * from Student where dept_id='컴공';
select * from computer_student;
--9. Course테이블과 동일한 T_Course빈 테이블을 생성하시오.
drop table T_course;
create table T_course as select * from COURSE where 1!=1;
select * from T_course;

--databaseUpdate
--1.새로운  과목이 개설되었다. T_Course 테이블에 추가하시오, 과목코드는 'L1061'
--이고, 과목명이 'ERP실무',3학점이며 담당교수가 'P12'이고, 추가 수강료는 50000원이다.
select * from T_course;
ALTER TABLE T_COURSE ADD PRIMARY KEY(COURSE_ID);
DESC COURSE;
insert into T_course values ('L1061','ERP실무',3,'P12',50000);
--2.새로운  과목이 개설되었다. T_Course 테이블에 추가하시오, 과목코드는 'L1062'이고
--과목명이 '그룹웨어구축',3학점이며, 담당교수가'P13'이고, 추가 수강료는 40000원이다.
insert into T_course values ('L1062','그룹웨어구축',3,'P13',40000);
--3.학번이 'B091'인 'L1061'과목의 85점에 대한 성적성취날짜는 2010년 06월 28일이다.
--이정보를 SG_Scores 테이블에 입력하시오.
DESC SG_Scores; 
SELECT * FROM COURSE;
SELECT * FROM STUDENT;
insert into course values('L1061','ERP실무',3,'P12',50000);
insert into student values('컴공','2','B901','최상혁','921023-1******','서울시 서초구','02-720-4287','B901@cyber.ac.kr',null,'10/02/09');
insert into SG_Scores values ('B901','L1061',85,NULL,TO_DATE('2010/06/28','YYYY/MM/DD'));
--4.과목코드가 'L3041', 과목명이 '임베디드시스템',3학점이며,담당교수번호가 'P31',
--추가 수강료는 30000원일 때, 이 정보를 Course테이블에 입력하시오.
select * from professor;
insert into professor values ('p31','임베식','교수','컴공','765-4421','baelim@cyber.ac.kr',null,'p11');

insert into course values ('L3041','임베디드시스템',3,'p31',30000);
select * from course;
--5.과목코드가 'L3041',과목명이 '임베디드시스템',3학점이며,담당교수번호가 'P31',
--추가 수강료는 30000원일때, 이 정보를 Course 테이블에 입력하시오.
select * from professor;
insert into professor values ('p31','임베식','교수','컴공','765-4421','baelim@cyber.ac.kr',null,'p11');

insert into course values ('L3041','임베디드시스템',3,'p31',30000);
select * from course;

--6.과목코드가 'L1031'이고, 과목명이 'SQl',3학점이며,담당교수가'P12'이고, 
--추가 수강료는 30000원이다. 이 정보를 Course테이블에 입력하시오.
select *from  course;
insert into course values ('L1031','SQL',3,'p12',30000);
--7. 컴퓨터 공학과에 신임교수가 채용되었다. 교수번호는 'P14', 교수명은 '조성우',
--직위는 '전임강사',전화번호는'765-4114'일때, 이정보를 Professor테이블에 입력하시오.
insert into professor values ('p14','조성우','전임강사','컴공','765-4114','sungwoo@cyber.ac.kr'
,null,'p13');
select * from professor;
--8. '컴공' 학과 2학년에 편입한 '박은혜' 학생을 student테이블에 입력하시오. 
--학번은 'C0931'이고, 주민등록번호는 '911119-2******',eMail주소는 'C0931@cyber.ac.kr'이다.
select * from student;
insert into Student values ('컴공','2','C0931','박은혜','911119-2******',null,null,'C0931@cyber.ac.kr',null,'09/03/06');
--10. 컴퓨터공학과에 외국인을 초빙강사로 채용하였다. 교수번호가 'P91',교수명은 'Bill Gates', 
--직위는 '초빙강사'이며,전화번호는 '765-4119'일 때, 이 초빙강사의 정보를 입력하시오.
insert into professor values ('p91','Bill Gates','초빙강사','컴공','765-4119','billgates@cyber.ac.kr'
,null,'p14');
select * from professor;
--11. 2010년 6월 28일에 취득한 'C0931'학번의 'L1031'과목의 
--97점이 누락하여 추가 입력하고자 한다. 누가 언제 입력하는 지의 정보를 추가하시오.

--12. subquery가 있는 insert문을 사용하여 Course 테이블로부터 교수번호가 'P12'인 
--교수의 개설과목의 정보를  T_Course테이블에 저장하시오.
drop table T_course;

insert into T_course select *from course;
insert into T_course select * from course where professor_id in(select professor_id from professor where professor_id='P12');
--13. Department 테이블의 학과명(Dept_name)을 '컴퓨터정보계열'로 수정하시오.
--14. Course테이블의 과목명'Delphi'를 '델파이'로 변경하시오.
--15. 학번이 'C0901'이고,과목코드가 'L1042'의 성적이 85점을 105점으로 잘못 입력하였다.SG_Scores 테이블의 성적을 변경하시오.
--16. Course 테이블의 추가 수강료(Course_fees)가 평균값보다 높은 경우 5000원을 삭감하시오.
--17. T_Course테이블의 모든 행을 삭제하시오.(삭제후 rollback 하시오.)
--18. Course 테이블의 과목코드(Course_ID)가 'L0012' 이고,과목명(title)이 '문학과 여행'인 과목을 삭제하시오.
--19. DepartMent 테이블에서 '컴공' 확과의 행을 삭제하시오.
--21. Course_temp 테이블에 새로 개설된 과목과 변경된 과목을 이용하여  Course테이블에 병합하시오.(merge이용) select * from course;의 결과는 17개가 된다.