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
);
