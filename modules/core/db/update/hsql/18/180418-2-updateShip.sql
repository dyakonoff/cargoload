alter table CARGOLOAD_SHIP alter column TONNAGE rename to TONNAGE__U47019 ;
alter table CARGOLOAD_SHIP alter column TONNAGE__U47019 set null ;
alter table CARGOLOAD_SHIP add column CARRYING_CAPACITY decimal(19, 2) ^
update CARGOLOAD_SHIP set CARRYING_CAPACITY = 0 where CARRYING_CAPACITY is null ;
alter table CARGOLOAD_SHIP alter column CARRYING_CAPACITY set not null ;
