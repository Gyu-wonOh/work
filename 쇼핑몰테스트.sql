--사용자
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
    
insert into shopuser values('kkk',1234,'지름신','남',TO_DATE('1994-07-19 20:09:13','YYYY-MM-DD HH24:MI:SS'),
'kkk@naver.com','010-7904-4871','인천광역시 부평구 경원대로 74');
commit;
select * from shopuser;
update shopuser set productCode='P00001';
drop table shopProduct;
--상품테이블
create table shopProduct(
    productImagePath nvarchar2(255),
    productCode nvarchar2(100),
    productName nvarchar2(255),
    productPrice nvarchar2(100),
    productDetail nvarchar2(255),
    manufacture nvarchar2(255),
    category nvarchar2(100),
    stockAmount number,
    status nvarchar2(50)
    );
insert into shopproduct values('/ex/resources/flower.jpg','P00001','꽃','10000','야생에서 재배한 꽃이다.',
'썬플라워원예','꽃 장식','100','신규제품');

delete from shopProduct where productName= '꽃';
commit;
select * from shopProduct;
select * from shopuser;

select * from shopUser,shopProduct where shopuser.productCode=shopproduct.productcode;
--장바구니
drop table Cart;
create table Cart(
    cartId number ,
    userId nvarchar2(100),
    productCode nvarchar2(100),
    orderAmount number
);    
select * from Cart;
select * from Cart order by cartId;
commit;
drop sequence cartId_seq;
create sequence cartId_seq;

insert into cart values(cartId_seq.nextval,'kkk','P00001','1');
insert into cart values(cartId_seq.nextval,'kk1','P00001','2');
select * from cart;
select *from cart where userId='kk1';
commit;
select id, pw from shopuser;
select id, pw from shopuser where id='kkk' and pw='1234';
delete shopuser where id= 'admin';
select * from cart order by cartId;
commit;
select * from cart where userId='kk1' order by cartId;