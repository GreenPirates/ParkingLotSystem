package com.utkarsh.parkinglotsystem.services;

import com.utkarsh.parkinglotsystem.models.EntryGate;
import com.utkarsh.parkinglotsystem.models.ParkingSpot;
import com.utkarsh.parkinglotsystem.models.Ticket;
import com.utkarsh.parkinglotsystem.models.Vehicle;
import com.utkarsh.parkinglotsystem.repositories.ParkingLotRepository;
import com.utkarsh.parkinglotsystem.strategies.ParkingSpotFindingStrategy;

import java.util.Date;

public class TicketService {
    private ParkingSpotFindingStrategy parkingSpotFindingStrategy;
    private ParkingLotRepository parkingLotRepository;

    public TicketService(ParkingSpotFindingStrategy parkingSpotFindingStrategy, ParkingLotRepository parkingLotRepository) {
        this.parkingSpotFindingStrategy = parkingSpotFindingStrategy;
        this.parkingLotRepository = parkingLotRepository;
    }

    public Ticket generateTicket(Vehicle vehicle, EntryGate entryGate) {
        ParkingSpot availableSpot = parkingSpotFindingStrategy.getAvailableSpot(vehicle.getVehicleType(), parkingLotRepository.getParkingLotWhereGatesContain(entryGate));
        Ticket ticket = new Ticket();
        ticket.setGeneratedBy(entryGate.getOperator());
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(availableSpot);
        ticket.setGate(entryGate);
        ticket.setEntryTime(new Date().toString());
        return ticket;
    }
}
