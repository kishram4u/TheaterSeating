package com.org.service;

import java.util.List;

import com.org.command.TheaterLayout;
import com.org.command.TheaterRequest;

public interface TheaterSeatingService {
    
    TheaterLayout getTheaterLayout(String rawLayout);
    
    List<TheaterRequest> getTicketRequests(String ticketRequests);
    
    void processTicketRequests(TheaterLayout layout, List<TheaterRequest> requests);

}
