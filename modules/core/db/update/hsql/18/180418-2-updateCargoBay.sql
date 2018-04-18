-- alter table CARGOLOAD_CARGO_BAY add column SHIP_ID varchar(36) ^
-- update CARGOLOAD_CARGO_BAY set SHIP_ID = <default_value> ;
-- alter table CARGOLOAD_CARGO_BAY alter column SHIP_ID set not null ;
alter table CARGOLOAD_CARGO_BAY add column SHIP_ID varchar(36) not null ;
