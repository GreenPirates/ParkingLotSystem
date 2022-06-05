package com.utkarsh.parkinglotsystem.services;

import com.utkarsh.parkinglotsystem.models.SpotType;
import com.utkarsh.parkinglotsystem.models.VehicleType;

public class ParkingSpotVehicleTypeMatchingService {
    public boolean matches(SpotType spotType, VehicleType vehicleType) {
        switch (spotType) {
            case LARGE: vehicleType.equals(VehicleType.LARGE);
                break;
            case SMALL: vehicleType.equals(VehicleType.SMALL);
                break;
            case MEDIUM: vehicleType.equals(VehicleType.MEDIUM);
                break;
            case ELECTRIC: vehicleType.equals(VehicleType.ELECTRIC);
                break;
        }
        return false;
    }
}