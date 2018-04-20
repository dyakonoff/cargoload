create table CARGOLOAD_CARGO_ITEM_POSITION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SKU_ID varchar(36) not null,
    BAY_ID varchar(36) not null,
    COUNT_TO_LOAD integer not null,
    SHIP_LOADING_SCHEME_ID varchar(36) not null,
    --
    primary key (ID)
);
