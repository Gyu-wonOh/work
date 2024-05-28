--데이터 무결성
--primary key
create table pkTable1( 
col1 number primary key, --컬럼 col1은 기본키가 된다. 
col2 number, 
col3 number 
);
insert into pkTable1 values(1,1,1); 
insert into pkTable1 values(2,1,1);  --col1컬럼에 2값이 없어서 들어 간다. 
insert into pkTable1 values(2,3,4);  --col1컬럼에 2값이 있어서 안 들어 간다. 
commit; 
select * from pktable1;
create table pkTable2(
    col1 number,
    col2 number,
    col3 number,
    primary key(col1,col2)-- col1,col2 2개의 칼럼이 합쳐져서 하나의 키가 된다.
    );
insert into pkTable2 values(1,1,1); 
insert into pkTable2 values(2,1,1); 
insert into pkTable2 values(2,3,4); 
insert into pkTable2  values(2,3,6); --col1,col2컬럼에  2,3이 있어서 안 들어간다. 
insert into pkTable2 values(1,1,6); --col1,col2컬럼에 1,1이 있어서 안 들어간다. 
insert into pkTable2 values(1,2,4); --1,2는 col1,col2컬럼에 없어서 들어가 진다. 
commit;
select * from pktable2;

create table pkTable3( 
col1 number, 
col2 number, 
col3 number 
); 
alter table pkTable3 add primary key(col1,col2);
--foreign key
create table fkTable2(
col1 number, 
col2 number, 
col3 number primary key --컬럼 col3은 기본키가 된다. 
);
create table fkTable1( 
col1 number primary key, --컬럼 col1은 기본키가 된다. 
col2 number, 
col3 number references fkTable2(col3 ) 
);
--데이터 추가
insert into fkTable2 values(1,1,1); 
insert into fkTable2 values(2,1,2); 
insert into fkTable2 values(2,1,2);  --col3이 pk여서 제약조건 위배로 실행되지 않음 
insert into fkTable1 values(1,1,1); 
insert into fkTable1 values(2,1,1); 
insert into fkTable1 values(2,1,1); -- pk 때문에 들어가지 않는다. 
insert into fkTable1 values(3,1,5); -- fk 설정되어 있어서 들어가지 않는다. --fkTable2테이블에 col3컬럼에는 1과 2만 들어 있어서 5를 넣을 수 없다. 
select col3 from fkTable2; --의 결과는 1,2 만들어 있다. 
insert into fkTable1 values(3,1,2); -- fk 설정되어 있어서 들어간다.
insert into fkTable2 values(2,1,5);
insert into fkTable1 values(4,1,5);
--예제 풀이
create table grapeList(
    BNo number,
    BKind varchar2(25),
    BName varchar2(25),
    BArea varchar2(25),
    GNo number
    );
create table Bgrde(
    GNo number,
    Gprice number
    );
Alter table Bgrde
Add CONSTRAINT Bgrde_GNo primary key (GNo);
Alter table grapeList
Add CONSTRAINT grapeList primary key (BNo);
Alter table grapeList
Add constraint grapeList_GNo foreign key(GNo)
REFERENCES Bgrde(GNo);
insert into Bgrde values(1,30000);
insert into Bgrde values(2,25000);
insert into Bgrde values(3,20000);
select * from Bgrde;
insert into grapeList values(1,'왕포도','김명천','번동',1);
insert into grapeList values(2,'청포도','김진우','홍일동',3);
insert into grapeList values(3,'청포도','김태수','쌍문동',2);
insert into grapeList values(4,'왕포도','박지민','상계동',2);
insert into grapeList values(5,'청포도','김명천','평창동',1);
insert into grapeList values(6,'왕포도','김진우','오류동',3);
insert into grapeList values(7,'왕포도','김태수','대림동',1);
insert into grapeList values(8,'청포도','김태수','청담동',2);
select * from grapeList;
commit;
--unique, not null, not null,unique, check, default
create table test4(
 a1 number unique,
 a2 number not null,
 a3 number not null unique,
 a4 number check(a4>0),
 a5 number default 1
 );
 --default 값: a5칼럼에 값을 넣지 않으면 default 값이 들어감
 insert into test4(a1,a2,a3,a4) values(2,2,2,2); -- default값 1이 들어감
 select *from test4;
 --일반적인 입력
 insert into test4(a1,a2,a3,a4,a5) values(1,1,1,1,null);
 select * from test4;
 --check (a4>0)
 insert into test4(a1,a2,a3,a4,a5) values(-2,-2,-2,-2,-2);--안 들어감
 --a4 칼럼에 check 범위가 양수로 되어 있어서 음수를 넣을 수 없음.
 insert into test4(a1,a2,a3,a4,a5) values(-2,-2,-2,1,-2);
 select * from test4;
 -- not null unique a3 칼럼에 이미 들어 있는 값이나 null를 넣으면 안 들어간다.
 --들어가 있는 데이터와 중볻되지 않은 다른 값을 넣어야 동작한다.
insert into test4(a1,a2,a3,a4,a5) values(3,3,null,3,3); --  null이어서 안들어감
insert into test4(a1,a2,a3,a4,a5) values(3,3,1,3,3); -- 이전에 a3컬럼에 1값을 넣어서 안들어감
insert into test4(a1,a2,a3,a4,a5) values(3,3,3,3,3); -- 들어감
--not null : a2컬럼에 null를 넣지 못하도록 설정하였다. 
insert into test4(a1,a2,a3,a4,a5) values(4,null,4,4,4);
insert into test4(a1,a2,a3,a4,a5) values(4,4,4,4,4); -- 들어감 
--a1컬럼에 unique 가 설정되어 있다. 
insert into test4(a1,a2,a3,a4,a5) values(null,5,5,5,5); -- 들어감 
insert into test4(a1,a2,a3,a4,a5) values(null,6,6,6,6); -- 들어감 --unique설정된 컬럼에서 null은 여러개 들어간다
 ?unique설정이 되어 있어 다음 데이터는 안들어간다. 
insert into test4(a1,a2,a3,a4,a5) values(4,4,4,4,4); -- 안 들어감
--다른 데이터는 들어감 
insert into test4(a1,a2,a3,a4,a5) values(7,7,7,7,7); 
select * from test4; 
 --sequence
create sequence testSequence;
select testSequence.nextval from dual;
select testSequence.currval from dual;

create sequence testSequence2;
select testSequence2.nextval from dual;
select testSequence2.currval from dual;
drop sequence testsequence;
drop sequence testsequence2;

create sequence ctable_seq;
select ctable_seq.nextval from dual;
select * from ctable;
select ctable_seq.currval from dual;
create table ctable(
    c_count number,
    c_comment nvarchar2(10)
    );
insert into ctable values (ctable_seq.nextval,'시작'); 
insert into ctable values (ctable_seq.nextval,'2번째 데이터'); 
insert into ctable values (ctable_seq.nextval,'마지막'); 
commit;     
    drop sequence ctable_seq; 
create table test7(
a1 number , a2 number, a3 number, a4 number
);
create index idx_test7_ala2 on test7(a1,a2); --nonunique index
create unique index idx_test8_a3 on test7(a3); -- unique index
select * from test7; --인덱스 안씀
select * from test7 where a1=1; -- 인덱스 사용
select * from test7 where a1=1 and a2=1; -- 인덱스 사용
select * from test7 where a2=1 ; -- 인덱스 사용
select * from test7 where a3=1 ; -- 인덱스 사용
select * from test7 where a4=1 ; -- 인덱스 사용
select * from test7 where a3=1 ; -- 인덱스 사용
 select '|' || trim('   hello 
 ')from dual;
 select rtrim('   hello   ')||'|'from dual;
--hr 테이블 이해하기
--다음 문제를 hr 데이터베이스로 풀어보자.
--1.  2000년에 입사해서 최고임금이 10000이 넘는 직종에서 일하고 있는 사원을 출력하시오.
select * from employees;
select * from jobs;

select * from employees 
where to_char(hire_date,'YYYY')=2000 
and job_id in (select job_id from jobs where max_salary > 10000);
--2.  매니저의 이름이 MICHAEL인 부서를 출력하시오. 
select * from departments;
select * from employees;
select * from employees where upper(first_name) like '%MICHAEL%';
select * from departments where manager_id in 
(select employee_id from employees where upper(first_name) like '%MICHAEL%');
--3.  직종의 최저임금이 사번 105번 사원의 임금보다 적은 직종를 출력하시오. 
select * from jobs where min_salary< ( select salary from employees where employee_id = 105); 
select salary from employees where employee_id = 105;
--4.  메일주소에 밑줄표시가 포함되어 있는 사원을 출력하시오.
select * from employees where email like '%\_%' escape '\';
select email from employees;
--5.  사원 이름과 해당 사원의 매니저 이름을 출력하시오.
select e1.first_name Employee, e2.first_name Manager 
from employees e1, employees e2 where  e1.manager_id  = e2.employee_id;
--6.30번 부서에 입사한 사원의 수를 연도별로 출력하시오.
select to_char(hire_date,'yyyy'),count(*) from employees
where department_id=30 group by to_char(hire_date,'yyyy');
--7.  각 부서의 직종별로 사원들의 총 봉급합을 구해보자.
select department_id department, job_id job, sum(salary) TotalSalary from employees
group by department_id, job_id
order by department_id, job_id;
--8.  업무별 최저임금과 최고임금 사이의 봉급을 가지는 사원의 이름과 업무명을 출력하시오.
select first_name,job_title from employees e,jobs j
where salary between min_salary and max_salary order by first_name;
--9. 커미션을 받은 사원과 받지 않은 사웡이 각각 몇명인지 출력하시오.
select count(commission_pct) NoEmployeesWithCommission,
count(*)- count(commission_pct) NoemployeeswithoutCommission from employees;
--10.  2월 28일에 입사한 사원의 이름, 업무명, 부서명을 출력하시오
select * from employees;
select first_name, job_title, department_name from employees e, jobs j,departments d
where e. job_id =j.job_id and e.department_id =d.department_id 
and to_char(hire_date,'ddmm')='2802';
--11.최저임금이 10000보다 높은 업무의 세부사항을 출력하시오.
select * from jobs;
select * from jobs where min_salary >10000;
--12. 2002년~2005년 사이에 입사한 사원의 이름과 입사일을 출력하시오.
select first_name, hire_date from employees 
where to_char(hire_date,'yyyy') between '2002' and '2005'
order by hire_date;
--13. IT Programmer이거나 Sales Man인 사원의 이름과 입사일을 출력하시오.
select first_name,hire_date from employees 
where job_id in('IT_PROG','SA_MAN');
--14.  2008년 1월 1일 이후에 입사한 사원을 출력하시오.
select * from employees where to_char(hire_date, 'yyyy-mm-dd')>'2008-01-01';
--날짜 데이터의 경우 운영체제에 따라 입력순서가 다르니 to_char 또는 to_date 함수를 사용하여 데이터 형태를 확정 후 
--사용할 것
--15. 사번이 150,160번인 사원을 출력하시오.
select *from employees where employee_id in(150,160);
--16. 임금이 10000보다 적은 사원의 이름 임금, 커미션 입사일을 출력하시오.
select first_name , salary,commission_pct,hire_date from employees where salary <10000;
--17.  최고 임금이 10000~20000인 업무의 업무명, 최저임금과 최고임금의 차액을 
--출력하시오.
select job_title,max_salary-min_salary difference from jobs 
where max_salary between 10000 and 20000;
--18.  사원 이름과 임금을 출력하되 임금을 1000단위로 출력하시오.
select first_name,salary,round(salary,-3) from employees;
--19.  업무명을 기준으로 하여 내림차순으로 업무 세부사항을 출력하시오.
select * from jobs order by job_title desc;
--20. 성이나 이름이 s로 시작하는 사원을 출력하시오.
select first_name, last_name from employees 
where first_name like 'S%' or last_name like 'S%';
--21. 5월에 입사한 사원을 출력하시오.
select * from employees where to_char(hire_date,'mm')='05';
--22. 커미션을 받지 않고, 임금이 5000~10000이면서 30번 부서에 소속된 사원을 출력하시오.
select *from employees where commission_pct is null and salary between 5000 and 10000 and department_id= '30';
--23. 사원들의 이름과 첫 월급날을 출력하시오. 매월 1일이 월급 날이다. 
select first_name, hire_date,Last_Day(hire_date)+1 from employees;
--24. 사원의 이름과 근속연수를 출력하시오.
select first_name,hire_date, floor((sysdate-hire_date)/365) from employees;
--25. 2001년에 입사한 사원의 이름을 출력하시오.
select first_name, hire_date from employees where to_char(hire_date,'yyyy')='2001';
--26. 첫글자는 대문자로 나머지 글자는 소문자로 변환하여 성과 이를을 출력하시오.
--initcap 사용
select initcap(first_name), initcap(last_name) from employees;
--27.업무명의 첫 단어를 출력하시오.
SELECT JOB_TITLE, SUBSTR( JOB_TITLE, 1, INSTR(JOB_TITLE || ' ', ' ')-1) FROM JOBS;
--28.성의 3번째 문자 이후에 'b'가 포함된 사원의 이름 길이를 출력하시오.
select first_name, last_name from employees where instr(LAST_NAME,'b')>3;
--29.  이름과 이메일주소가 대소문자 상관없이 같은 사원의 이름을 대문자로, 
--이메일주소는 소문자로 출력하시오. 
select upper(first_name),lower(email) from employees;
--30. 올해 입사한 사원을 출력하시오
select * from employees where to_char(hire_date,'yyyy')=to_char(sysdate,'yyyy');
--31. 현재 날짜와 2011년 1월 1일이 며칠 차이인지 출력하시오.
select Sysdate - to_date('2011-01-01') from dual;
--32. 올해 각 달마다 몇 명의 사원이 입사하였는지 출력하시오. 
SELECT TO_CHAR(HIRE_DATE,'MM'), COUNT (*) FROM EMPLOYEES 
WHERE TO_CHAR(HIRE_DATE,'YYYY')= TO_CHAR(SYSDATE,'YYYY') 
GROUP BY TO_CHAR(HIRE_DATE,'MM');







