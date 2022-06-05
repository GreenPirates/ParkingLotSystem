package com.utkarsh.parkinglotsystem.repositories;

import com.utkarsh.parkinglotsystem.models.Gate;
import com.utkarsh.parkinglotsystem.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Long, ParkingLot> parkingLotMap = new HashMap<>();
    private Map<Gate, ParkingLot> gateParkingLotMap = new HashMap<>();
    public ParkingLot save(ParkingLot parkingLot) {
        return null;
    }

    public ParkingLot getParkingLotWhereGatesContain(Gate gate) {
        /*for(ParkingLot parkingLot : parkingLotMap.values()) {
            if (parkingLot.getGates().contains(gate)) {
                return parkingLot;
            }
        }*/
        if(gateParkingLotMap.containsKey(gate)) {
            return parkingLotMap.get(gate);
        }
        return null;
    }
}
