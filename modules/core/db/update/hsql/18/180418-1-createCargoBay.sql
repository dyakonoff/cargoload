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
    MAX_LOAD decimal(19, 2),
    FORE_AND_AFT_POSITION integer not null,
    ATHWARTSHIP_POSITION integer not null,
    --
    primary key (ID)
);
