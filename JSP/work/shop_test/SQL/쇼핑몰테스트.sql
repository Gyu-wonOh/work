drop table shopuser;

create table shopuser(
    id nvarchar2(20),
    pw nvarchar2(20),
    name nvarchar2(50),
    gender nvarchar2(20),
    birthday date,
    email nvarchar2(50),
    phoneNumber nvarchar2(50),
    address nvarchar2(50)
    );
    
insert into shopuser values('kkk',1234,'������','��',TO_DATE('1994-07-19 20:09:13','YYYY-MM-DD HH24:MI:SS'),
'kkk@naver.com','010-7904-4871','��õ������ ���� ������ 74');
commit;
select * from shopuser;

drop table shopProduct;

create table shopProduct(
    productCode nvarchar2(100),
    productName nvarchar2(255),
    productPrice nvarchar2(100),
    productDetail nvarchar2(255),
    manufacture nvarchar2(255),
    category nvarchar2(100),
    stockAmount nvarchar2(100),
    status nvarchar2(50)
    );
insert into shopproduct values('P00001','��','10000','�߻����� ����� ���̴�.',
'���ö������','�� ���','100','�ű���ǰ');

commit;
select * from shopProduct;