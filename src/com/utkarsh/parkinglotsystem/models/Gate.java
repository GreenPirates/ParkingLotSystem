package com.utkarsh.parkinglotsystem.models;

public abstract class Gate extends BaseModel {
    private int number;
    private GateType gateType;
    private Operator operator;
}