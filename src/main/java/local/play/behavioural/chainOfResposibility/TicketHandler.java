package local.play.behavioural.chainOfResposibility;

public interface TicketHandler {
    void setNextHandler(TicketHandler ticketHandler);
    Ticket resolveTicket(Ticket ticket);
}
