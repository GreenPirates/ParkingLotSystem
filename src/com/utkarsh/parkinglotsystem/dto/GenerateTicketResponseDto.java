package com.utkarsh.parkinglotsystem.dto;


import com.utkarsh.parkinglotsystem.models.Ticket;

public class GenerateTicketResponseDto {
    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
