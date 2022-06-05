package com.utkarsh.parkinglotsystem.models;

public class Ticket extends BaseModel {
    private String entryTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Operator generatedBy;
    private EntryGate gate;
}