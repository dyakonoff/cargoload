-- begin CARGOLOAD_SHIP
create table CARGOLOAD_SHIP (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    SHIP_TYPE varchar(255),
    TONNAGE decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end CARGOLOAD_SHIP
-- begin CARGOLOAD_CARGO_BAY
create table CARGOLOAD_CARGO_BAY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(100) not null,
    SHIP_ID varchar(36) not null,
    MAX_LOAD decimal(19, 2),
    BAY_AREA decimal(19, 2),
    FORE_AND_AFT_POSITION integer not null,
    ATHWARTSHIP_POSITION integer not null,
    --
    primary key (ID)
)^
-- end CARGOLOAD_CARGO_BAY
