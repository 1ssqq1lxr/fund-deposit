prompt PL/SQL Developer import file
prompt Created on 2016年9月9日 by Somnus
set feedback off
set define off
prompt Creating TCIM_MER_ACCOUNT...
create table TCIM_MER_ACCOUNT
(
  acct_id        NUMBER not null,
  acct_code      VARCHAR2(40) not null,
  mer_code       VARCHAR2(40) not null,
  acct_name      VARCHAR2(256) not null,
  currency       VARCHAR2(8) not null,
  bank_code      VARCHAR2(40) not null,
  bank_name      VARCHAR2(256) not null,
  bank_key       VARCHAR2(40) not null,
  branch_code    VARCHAR2(40) not null,
  branch_name    VARCHAR2(256) not null,
  bank_acct_no   VARCHAR2(40) not null,
  bank_acct_name VARCHAR2(256) not null,
  status         VARCHAR2(8),
  modify_by      VARCHAR2(40),
  modify_time    TIMESTAMP(6)
)
tablespace TPP2
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table TCIM_MER_ACCOUNT
  add constraint PK_AC_ID primary key (ACCT_ID)
  using index 
  tablespace TPP2
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Disabling triggers for TCIM_MER_ACCOUNT...
alter table TCIM_MER_ACCOUNT disable all triggers;
prompt Deleting TCIM_MER_ACCOUNT...
delete from TCIM_MER_ACCOUNT;
commit;
prompt Loading TCIM_MER_ACCOUNT...
insert into TCIM_MER_ACCOUNT (acct_id, acct_code, mer_code, acct_name, currency, bank_code, bank_name, bank_key, branch_code, branch_name, bank_acct_no, bank_acct_name, status, modify_by, modify_time)
values (2000002494, '1000720019', '100072', '开发环境Q0-0423', '156', '1100', '中国农业银行', '11', '1111', '龙华分行', '11111', '1111', '2', 'admin', null);
insert into TCIM_MER_ACCOUNT (acct_id, acct_code, mer_code, acct_name, currency, bank_code, bank_name, bank_key, branch_code, branch_name, bank_acct_no, bank_acct_name, status, modify_by, modify_time)
values (2000002495, '1000730018', '100073', '开发环境R0-0423', '156', '1100', '中国建设银行', '11', '1111', '龙华分行', '11111', '1111', '2', 'admin', null);
insert into TCIM_MER_ACCOUNT (acct_id, acct_code, mer_code, acct_name, currency, bank_code, bank_name, bank_key, branch_code, branch_name, bank_acct_no, bank_acct_name, status, modify_by, modify_time)
values (2000002496, '1020550016', '100074', '开发环境S0-0423', '156', '1107', '交通银行', '11', '1111', '龙华分行', '11111', '1111', '2', 'admin', null);
insert into TCIM_MER_ACCOUNT (acct_id, acct_code, mer_code, acct_name, currency, bank_code, bank_name, bank_key, branch_code, branch_name, bank_acct_no, bank_acct_name, status, modify_by, modify_time)
values (2000002497, '1000750016', '100075', '开发环境T0-0423', '156', '1100', '中国工商银行', '11', '1111', '龙华分行', '11111', '1111', '2', 'admin', null);
insert into TCIM_MER_ACCOUNT (acct_id, acct_code, mer_code, acct_name, currency, bank_code, bank_name, bank_key, branch_code, branch_name, bank_acct_no, bank_acct_name, status, modify_by, modify_time)
values (2000002499, '1000770014', '100077', '开发环境R1-0423', '156', '1100', '中国工商银行', '11', '1111', '龙华分行', '11111', '1111', '2', 'admin', null);
insert into TCIM_MER_ACCOUNT (acct_id, acct_code, mer_code, acct_name, currency, bank_code, bank_name, bank_key, branch_code, branch_name, bank_acct_no, bank_acct_name, status, modify_by, modify_time)
values (2000002500, '1000780013', '100078', '开发环境S1-0423', '156', '1100', '中国工商银行', '11', '1111', '龙华分行', '11111', '1111', '2', 'admin', null);
insert into TCIM_MER_ACCOUNT (acct_id, acct_code, mer_code, acct_name, currency, bank_code, bank_name, bank_key, branch_code, branch_name, bank_acct_no, bank_acct_name, status, modify_by, modify_time)
values (2000002501, '1020550016', '100079', '开发环境T1-0423', '156', '1100', '中国工商银行', '11', '1111', '龙华分行', '11111', '1111', '2', 'admin', null);
insert into TCIM_MER_ACCOUNT (acct_id, acct_code, mer_code, acct_name, currency, bank_code, bank_name, bank_key, branch_code, branch_name, bank_acct_no, bank_acct_name, status, modify_by, modify_time)
values (2000002502, '1000800019', '100080', '开发环境Q05-0423', '156', '1100', '中国银行', '11', '1111', '龙华分行', '11111', '1111', '2', 'admin', null);
insert into TCIM_MER_ACCOUNT (acct_id, acct_code, mer_code, acct_name, currency, bank_code, bank_name, bank_key, branch_code, branch_name, bank_acct_no, bank_acct_name, status, modify_by, modify_time)
values (2000002503, '1020550016', '100081', '开发环境R05-0423', '156', '1106', '中国银行', '11', '1111', '龙华分行', '11111', '1111', '2', 'admin', null);
insert into TCIM_MER_ACCOUNT (acct_id, acct_code, mer_code, acct_name, currency, bank_code, bank_name, bank_key, branch_code, branch_name, bank_acct_no, bank_acct_name, status, modify_by, modify_time)
values (2000002504, '1000820017', '100082', '开发环境S05-0423', '156', '1100', '中国银行', '11', '1111', '龙华分行', '11111', '1111', '2', 'admin', null);
insert into TCIM_MER_ACCOUNT (acct_id, acct_code, mer_code, acct_name, currency, bank_code, bank_name, bank_key, branch_code, branch_name, bank_acct_no, bank_acct_name, status, modify_by, modify_time)
values (2000002505, '1000830016', '100083', '开发环境T05-0423', '156', '1100', '中国银行', '11', '1111', '龙华分行', '11111', '1111', '2', 'admin', null);
commit;
prompt 11 records loaded
prompt Enabling triggers for TCIM_MER_ACCOUNT...
alter table TCIM_MER_ACCOUNT enable all triggers;
set feedback on
set define on
prompt Done.
