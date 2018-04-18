create table CARGOLOAD_PRODUCT (
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
    MEASURE integer not null,
    WEIGHT_PER_UNIT decimal(19, 2) not null,
    PRICE_PER_UNIT decimal(19, 2),
    --
    primary key (ID)
);
