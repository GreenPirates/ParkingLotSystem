package com.utkarsh.parkinglotsystem.strategies;

import com.utkarsh.parkinglotsystem.models.*;
import com.utkarsh.parkinglotsystem.services.ParkingSpotVehicleTypeMatchingService;

public class RandomParkingSpotFindingStrategy implements ParkingSpotFindingStrategy {

    private ParkingSpotVehicleTypeMatchingService parkingSpotVehicleTypeMatchingService;

    public RandomParkingSpotFindingStrategy(ParkingSpotVehicleTypeMatchingService parkingSpotVehicleTypeMatchingService) {
        this.parkingSpotVehicleTypeMatchingService = parkingSpotVehicleTypeMatchingService;
    }

    @Override
    public ParkingSpot getAvailableSpot(VehicleType vehicleType, ParkingLot parkingLot) {
        for (ParkingFloor parkingFloor : parkingLot.getParkingFloors()) {
            for (ParkingSpot parkingSpot : parkingFloor.getParkingSpots()) {
                if(parkingSpotVehicleTypeMatchingService.matches(parkingSpot.getSpotType(), vehicleType) && parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE)) {
                    return parkingSpot;
                }
            }
        }
        return null;
    }
}
