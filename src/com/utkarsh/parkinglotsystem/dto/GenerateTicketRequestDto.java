package com.utkarsh.parkinglotsystem.dto;

import com.utkarsh.parkinglotsystem.models.EntryGate;
import com.utkarsh.parkinglotsystem.models.Vehicle;

public class GenerateTicketRequestDto {
    private Vehicle vehicle;
    private EntryGate entryGate;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public EntryGate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(EntryGate entryGate) {
        this.entryGate = entryGate;
    }
}
