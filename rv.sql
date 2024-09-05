
--=================================================================================================================
--=================================================================================================================
--��ü ���� sql developer�� ����
--=================================================================================================================
--=================================================================================================================
/*
������Ű+R
cmd ��Ŭ�� �����ڱ��� ����
sqlplus /nolog
conn sys as sysdba;
create user c##reser identified by vation;
grant connect, resource, dba to c##reser;
conn c##reser/vation;
show user;
exit
exit

sql developer ����
���� �ؿ� ��� ���ڰ� ������ Ŭ��
Name : reservation
����� �̸� : c##reser
��й�ȣ : vation
��й�ȣ �����ʿ� ���� üũ�ڽ� üũ
�׽�Ʈ ������ ���¿� ���� �ߴ°� Ȯ���ϰ� ����
reservation�� ���� �ϰ� ���� ����
*/

--=================================================================================================================
--=================================================================================================================
--=======�� ���� ���� �۾� �� ���� ����===============================================================================
--=================================================================================================================
--=================================================================================================================
drop table users;
create table users(
    email varchar2(255),		-- pk, email(id)
    password varchar2(255),		--
    name varchar2(255),			--
    phone varchar2(20),			--
    enable integer default 1 not null 	-- 
    );

drop table authorities;
create table authorities(
    email varchar2(255) not null,				--fk
    authority varchar2(20) default 'ROLE_MEMBER' not null
);

drop table vendor;
create table vendor (
    email varchar2(255) not null,   --fk, email(id)
    business_regi_num varchar2(20), --����ڵ�Ϲ�ȣ
    business_name varchar2(255),    --�����(����)
    zipcode varchar2(10),           --�����ȣ
    basic_address varchar2(255),    --�⺻�ּ�
    detail_address varchar2(255),   --���ּ�
    business_type varchar2(255)     --�����ڵ�
    );

drop table vendor_reservation;
create table vendor_reservation (
    email varchar2(255) not null,   --������̸��� ��
    business_regi_num varchar2(20), --����ڹ�ȣ�� �� ����Ű 
    open_date date,                 --������ ����� (������ �ްڴٴ�)
    times varchar2(50),             --������ �ð�48������
    status_flag varchar2(4),         --�ش����� ���� ��Ȱ��ȭ(������,����Ұ�)/Ȱ��ȭ(�����Ϸ�,���డ��)�� ����. �������̶�� �Ϲ������� ������ ����
    constraint vendor_reservation_unique
        unique (email, business_regi_num, open_date)
);

drop table user_reservation;
create table user_reservation (
    reservation_number varchar2(20) not null,   --����(�ֹ�)��ȣ pk (����Ͻú���ms)
    user_email varchar2(255) not null,          --�����̸��� fk (������)    (users)
    user_name varchar2(255) not null,           --�����̸� (������)         (users)
    user_phone  varchar2(20) not null,          --���� ��� ������ ��ȭ��ȣ (������)    (users)
    vendor_email varchar2(255) not null,        --������̸��� ��                (vendor)
    business_regi_num varchar2(20),             --����ڹ�ȣ�� �� ����Ű fk       (vendor)
    vendor_name  varchar2(255) not null,        --���� ��� ������� �̸� (�����)    (vendor)
    vendor_phone  varchar2(20) not null,        --���� ��� ������� ��ȭ��ȣ (�����)    (vendor)
    zipcode varchar2(10),                       --���� ��� �̿� ���� ��� �����ȣ(vendor)
    basic_address varchar2(255),                --���� ��� �̿� ���� ��� �⺻�ּ�(vendor)
    detail_address varchar2(255),               --���� ��� �̿� ���� ��� ���ּ�(vendor)
    reservation_date date,                      --���� �߻� �����
    reservation_use_date date,                  --�̿� ���� �����
    times varchar2(50),                         --�̿� ���� �ð� 48������
    total_service_name varchar2(4000),          --���� ��� �̿� ���� ���� �̸���(service_items)     --�����ؾ���
    total_service_price number,                 --���� ��� �̿� ���� ���� ���� �� �� (service_items)
    total_required_time number,                 --���� ��� �̿� ���� ����(�ʿ�)�ð� �� �� (service_items)
    user_request_memo varchar2(4000),           --���� ��û���� �޸�. �ֹ��ڿ� �湮�ڰ� �ٸ��� ����ó�� ���´ٰų� ��Ÿ ��û���� ��
    status varchar2(50)                         --�ֹ� ����. 1�Աݴ��/2�ԱݿϷ�/3�̿�Ϸ�/
                                                --       4�̿������(ȸ����û,����ڽ����ʿ�)/
                                                --       5��������(����ڿ�û,ȸ�����κ��ʿ�)/6ȯ�Ҵ��/7ȯ�ҿϷ� �� ����
    );


-- �ֹ��� �ֹ���ȣ�� �ֹ��� �������� id�� �ֹ���� �����۵��� �����͵��� ��������Ǿ� 
-- ���� �����۵��� �����Ǿ �ֹ��������� ������ ����
-- 3�� ���������� 3�� insert�� reservation_number 3�� �� ���� ���� ������ ���� �ٸ�
drop table reservation_items;
create table reservation_items (
    reservation_number varchar2(20) not null,   --�ֹ���ȣ user_reservation fk
    item_id number not null,                    --service_items              ��������
    email varchar2(255) not null,               --�ֹ���� ������� �̸���         ��������
    business_regi_num varchar2(20) not null,    --�ֹ���� ������� ����ڹ�ȣ       ��������
    service_name varchar2(255),                 --�ֹ���� ���� �̸�(service_items)      ��������
    service_description varchar2(255),          --�ֹ���� ���� (service_items)           ��������
    required_time number,                       --�ֹ���� ����(�ʿ�)�ð� (��ĭ¥������)  ��������
    service_price number                       --�ֹ���� ���� ����(service_items)               ��������
);


drop sequence item_id;
CREATE SEQUENCE item_id;
drop table service_items;
create table service_items (
    item_id number not null,         --pk 
    email varchar2(255) not null,   --������̸��� ��
    business_regi_num varchar2(20) not null, --����ڹ�ȣ�� �� ����Ű
    service_name varchar2(255),             --��ǰ��
    service_description varchar2(255),      --����
    required_time number,                   --����(�ʿ�)�ð� (��ĭ¥������)
    service_price number,                   --����
    item_status varchar2(10) default '1' not null                --item ����, (��밡�� ���� ��)  (1:���, 0:�̻�� ��)
    );

drop table business_place_info;
create table business_place_info (
    email varchar2(255) not null,   --������̸��� ��
    business_regi_num varchar2(20), --����ڹ�ȣ�� �� ����Ű
    place_info varchar2(4000),      --���� �Ұ�
    img_path0  varchar2(255),       --�̹��� ���� ���
    img_path1  varchar2(255),       --�̰� ���� �� �ƴѰŰ��� 10���� �ַ��ַ� �ް��ִ°�
    img_path2  varchar2(255),       --imgpath�� ���� �����ص�
    img_path3  varchar2(255),       --������ �ű⿡ �ܷ�Ű�� �̸���+����ڹ�ȣ �־���ϴ�
    img_path4  varchar2(255),       --�ϴ� �̷��Ԥ���
    img_path5  varchar2(255),
    img_path6  varchar2(255),
    img_path7  varchar2(255),
    img_path8  varchar2(255),
    img_path9  varchar2(255)
    );

--=================================================================================================================
--=================================================================================================================
--=======�� ���� ���� �۾� �� ���� ����===============================================================================
--=================================================================================================================
--=================================================================================================================
--������� �ϰ� sts�� ���� �� http://localhost:�ڱ���Ʈ/ex/user/insert ���� 
--�Ʒ� �⺻ 4���� ���� ���� (��й�ȣ 1111 ����)
-- (�̸���/��й�ȣ/�̸�/��ȭ��ȣ)
-- admin/1111/1/1
-- manager/1111/1/1
-- vendor/1111/1/1
-- member/1111/1/1
-- vendor1/1111/1/1
-- vendor2/1111/1/1
-- vendor3/1111/1/1
-- vendor4/1111/1/1
-- vendor5/1111/1/1
-- �� ���� ���� �� ���� sql developer ���� ����


update authorities set authority='ROLE_ADMIN' where email='admin';
update authorities set authority='ROLE_VENDOR' where email='vendor';
update authorities set authority='ROLE_VENDOR' where email='vendor1';
update authorities set authority='ROLE_VENDOR' where email='vendor2';
update authorities set authority='ROLE_VENDOR' where email='vendor3';
update authorities set authority='ROLE_VENDOR' where email='vendor4';
update authorities set authority='ROLE_VENDOR' where email='vendor5';
update authorities set authority='ROLE_MANAGER' where email='manager';
insert into vendor values('vendor', 'gsgs252511', 'GS25 ����븲��', '21404', '��õ ���� ������ 1360', '�븲���� 1��', '������');
insert into vendor values('vendor1', '11111',      'CU ����Ϻο���',   '21389', '��õ ���� ������ 1367', '1��', '������');
insert into vendor values('vendor2', '22222',      '�̸�Ʈ24 ����������',   '21404', '��õ ���� �����4���� 32', '', '������');
insert into vendor values('vendor3', '33333',      '��Ǫȣ�� ',        '21404', '��õ ���� �����4���� 23', '', 'ȣ��');
insert into vendor values('vendor4', '44444', '�������ȣ�� ��õ������', '21404', '��õ ���� ����� 10', '', 'ȣ��');
insert into vendor values('vendor5', '55555', '�����ǿ� ������',        '21389', '��õ ���� ������ 1355', '������� 4��', '����');
insert into business_place_info(email, business_regi_num, place_info) values ('vendor','gsgs252511', '~~~������ gs25 ����븲��~~~');
insert into business_place_info(email, business_regi_num, place_info) values ('vendor1','11111', '������ cu cu cu ~');
insert into business_place_info(email, business_regi_num, place_info) values ('vendor2','22222', '�̸�Ʈ ������ §Ŀ�� ������~~~');
insert into business_place_info(email, business_regi_num, place_info) values ('vendor3','33333', '������ ���ִ� �̻��� ȣ��~~~');
insert into business_place_info(email, business_regi_num, place_info) values ('vendor4','44444', '�Ͽ������� ��Ÿ�� ȣ��~~~');
insert into business_place_info(email, business_regi_num, place_info) values ('vendor5','55555', '���� �ٽ����� ���� �ǿ�~~~');
update users set name='������' , phone='01063188216' where email='admin';
update users set name='��ȸ��' , phone='01063188216' where email='member';
update users set name='�躥��' , phone='01063188216' where email='vendor';
update users set name='������1' , phone='01063188216' where email='vendor1';
update users set name='������2' , phone='01063188216' where email='vendor2';
update users set name='������3' , phone='01063188216' where email='vendor3';
update users set name='������4' , phone='01063188216' where email='vendor4';
update users set name='������5' , phone='01063188216' where email='vendor5';
update users set name='�۽���' , phone='01063188216' where email='manager';
insert into service_items values(item_id.nextval, 'vendor5', '55555', '�������� �ܼҸ�', '�ܰ� §�� ���̽ð� ��Ͻð�', 1, 20000, '1' );
insert into service_items values(item_id.nextval, 'vendor5', '55555', '5�����޴�����1', '5�����޴�����', 2, 50000, '1' );
insert into service_items values(item_id.nextval, 'vendor5', '55555', '5�������', 'status0 ���̸� �ȵǴ� �޴�', 2, 50000, '0' );
insert into service_items values(item_id.nextval, 'vendor5', '55555', '5�����޴�����2', '5�����޴�����2', 1, 20000, '1' );
insert into service_items values(item_id.nextval, 'vendor5', '55555', '5�����޴�����3', '5�����޴�����3', 2, 30000, '1' );
insert into service_items values(item_id.nextval, 'vendor5', '55555', '5�����޴�����4', '5�����޴�����4', 3, 40000, '1' );
select * from service_items;
commit;
--=================================================================================================================
--=================================================================================================================
--=================================================================================================================
--=================================================================================================================
--=================================================================================================================


select * from vendor_reservation;




--�Խ��� ���̺�
drop table board;

CREATE TABLE board (
bGroupKind VARCHAR2(255),
bId NUMBER PRIMARY KEY,
bName VARCHAR2(255) NOT NULL,
bTitle VARCHAR2(255) NOT NULL,
bContent VARCHAR2(4000) NOT NULL,
bEtc VARCHAR2(4000) NULL,
bWriteTime DATE DEFAULT sysdate,
bUpdateTime DATE DEFAULT null,
bHit NUMBER DEFAULT 0,
bGroup NUMBER ,
bStep NUMBER DEFAULT 0,
bIndent NUMBER DEFAULT 0,
bDelete VARCHAR2(1) DEFAULT 'Y',
bLike NUMBER DEFAULT 0,
bDislike NUMBER DEFAULT 0
);
create sequence bId;

select * from board;

select sum(total_service_price) from user_reservation;