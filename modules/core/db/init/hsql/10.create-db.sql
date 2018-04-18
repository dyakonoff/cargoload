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
