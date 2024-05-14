package local.play.behavioural.chainOfResposibility;

public class SDETicketHandler implements TicketHandler{
    private TicketHandler ticketHandler;

    @Override
    public void setNextHandler(TicketHandler ticketHandler) {
       this.ticketHandler = ticketHandler;
    }

    @Override
    public Ticket resolveTicket(Ticket ticket) {
        if ((ticket.getSeverity().equals("Complex"))) {
            System.out.println("Enginering team is taking care of everything... thanks for your patience");
            ticket.setResolved(true);
            ticket.setComments("Ticker has been resolved by Engineering Team");
            return ticket;
        }else if(ticketHandler != null){
            return this.ticketHandler.resolveTicket(ticket);
        }else{
            ticket.setResolved(false);
            ticket.setComments("Not able to process the ticket, sorry for inconvience");
            return ticket;
        }
    }
    
}
