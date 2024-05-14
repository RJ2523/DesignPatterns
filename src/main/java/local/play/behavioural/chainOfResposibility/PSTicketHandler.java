package local.play.behavioural.chainOfResposibility;

public class PSTicketHandler implements TicketHandler{

    private TicketHandler ticketHandler;

    @Override
    public void setNextHandler(TicketHandler ticketHandler) {
       this.ticketHandler = ticketHandler;
    }

    @Override
    public Ticket resolveTicket(Ticket ticket) {
        if(ticket.getSeverity().equals("Easy")){
            System.out.println("PS Handler resolving the ticket... please wait!!!");
            ticket.setResolved(true);
            return ticket;
        }else if(ticketHandler != null){
            return ticketHandler.resolveTicket(ticket);
        }else{
            System.out.println("Not able to process the ticket, sorry for inconvineince");
            ticket.setResolved(false);
            ticket.setComments("Not able to process the ticket, sorry for inconvineince");
            return ticket;
        }
    }
    
}
