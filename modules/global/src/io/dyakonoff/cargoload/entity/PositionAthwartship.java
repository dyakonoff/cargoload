package io.dyakonoff.cargoload.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum PositionAthwartship implements EnumClass<Integer> {

    Larboard(-10),
    Midship(0),
    Starboard(10);

    private Integer id;

    PositionAthwartship(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static PositionAthwartship fromId(Integer id) {
        for (PositionAthwartship at : PositionAthwartship.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}