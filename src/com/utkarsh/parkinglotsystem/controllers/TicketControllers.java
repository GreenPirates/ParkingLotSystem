package com.utkarsh.parkinglotsystem.controllers;

import com.utkarsh.parkinglotsystem.dto.GenerateTicketRequestDto;
import com.utkarsh.parkinglotsystem.dto.GenerateTicketResponseDto;
import com.utkarsh.parkinglotsystem.dto.TicketDto;
import com.utkarsh.parkinglotsystem.models.Ticket;
import com.utkarsh.parkinglotsystem.services.TicketService;

public class TicketControllers {
    private TicketService ticketService;

    public TicketControllers(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto requestDto) {
        Ticket ticket = ticketService.generateTicket(requestDto.getVehicle(), requestDto.getEntryGate());
        GenerateTicketResponseDto responseDto = new GenerateTicketResponseDto();
        responseDto.setTicket(ticket);
        return responseDto;
    }
}
