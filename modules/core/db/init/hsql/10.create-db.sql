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
    CARRYING_CAPACITY decimal(19, 2) not null,
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
    BAY_NUMBER integer,
    MAX_LOAD decimal(19, 2),
    BAY_AREA decimal(19, 2),
    FORE_AND_AFT_POSITION integer not null,
    ATHWARTSHIP_POSITION integer not null,
    --
    primary key (ID)
)^
-- end CARGOLOAD_CARGO_BAY
-- begin CARGOLOAD_PRODUCT
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
)^
-- end CARGOLOAD_PRODUCT
-- begin CARGOLOAD_CARGO_SKU
create table CARGOLOAD_CARGO_SKU (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT_ID varchar(36) not null,
    PRODUCT_QUANTITY decimal(19, 2) not null,
    QTY_AVALIABLE_TO_BUY integer,
    PRICE decimal(19, 2) not null,
    CONTAINER_WIDTH decimal(19, 2),
    CONTAINER_DEPTH decimal(19, 2),
    CONTAINER_HEIGHT decimal(19, 2),
    --
    primary key (ID)
)^
-- end CARGOLOAD_CARGO_SKU

-- begin CARGOLOAD_CARGO_ITEM_POSITION
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
)^
-- end CARGOLOAD_CARGO_ITEM_POSITION
-- begin CARGOLOAD_SHIP_LOADING_SCHEME
create table CARGOLOAD_SHIP_LOADING_SCHEME (
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
    --
    primary key (ID)
)^
-- end CARGOLOAD_SHIP_LOADING_SCHEME
