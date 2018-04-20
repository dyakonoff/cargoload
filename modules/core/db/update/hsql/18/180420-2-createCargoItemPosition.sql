alter table CARGOLOAD_CARGO_ITEM_POSITION add constraint FK_CARGOLOAD_CARGO_ITEM_POSITION_SKU foreign key (SKU_ID) references CARGOLOAD_CARGO_SKU(ID);
alter table CARGOLOAD_CARGO_ITEM_POSITION add constraint FK_CARGOLOAD_CARGO_ITEM_POSITION_BAY foreign key (BAY_ID) references CARGOLOAD_CARGO_BAY(ID);
alter table CARGOLOAD_CARGO_ITEM_POSITION add constraint FK_CARGOLOAD_CARGO_ITEM_POSITION_SHIP_LOADING_SCHEME foreign key (SHIP_LOADING_SCHEME_ID) references CARGOLOAD_SHIP_LOADING_SCHEME(ID);
create index IDX_CARGOLOAD_CARGO_ITEM_POSITION_SKU on CARGOLOAD_CARGO_ITEM_POSITION (SKU_ID);
create index IDX_CARGOLOAD_CARGO_ITEM_POSITION_BAY on CARGOLOAD_CARGO_ITEM_POSITION (BAY_ID);
create index IDX_CARGOLOAD_CARGO_ITEM_POSITION_SHIP_LOADING_SCHEME on CARGOLOAD_CARGO_ITEM_POSITION (SHIP_LOADING_SCHEME_ID);
