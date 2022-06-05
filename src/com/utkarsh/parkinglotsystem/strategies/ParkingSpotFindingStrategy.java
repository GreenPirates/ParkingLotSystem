package com.utkarsh.parkinglotsystem.strategies;

import com.utkarsh.parkinglotsystem.models.ParkingLot;
import com.utkarsh.parkinglotsystem.models.ParkingSpot;
import com.utkarsh.parkinglotsystem.models.VehicleType;

public interface ParkingSpotFindingStrategy {

    ParkingSpot getAvailableSpot(VehicleType vehicleType, ParkingLot parkingLot);
}
