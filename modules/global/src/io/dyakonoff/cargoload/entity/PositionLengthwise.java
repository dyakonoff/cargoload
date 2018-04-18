package io.dyakonoff.cargoload.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum PositionLengthwise implements EnumClass<Integer> {

    Fore(10),
    Midship(0),
    Aft(-10);

    private Integer id;

    PositionLengthwise(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static PositionLengthwise fromId(Integer id) {
        for (PositionLengthwise at : PositionLengthwise.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}