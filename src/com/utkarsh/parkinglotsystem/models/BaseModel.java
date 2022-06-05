package com.utkarsh.parkinglotsystem.models;

public abstract class BaseModel {
    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //abstract Object toDto();
}
