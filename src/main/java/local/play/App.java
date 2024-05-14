package local.play;

import local.play.behavioural.chainOfResposibility.PSTicketHandler;
import local.play.behavioural.chainOfResposibility.SDETicketHandler;
import local.play.behavioural.chainOfResposibility.Ticket;
import local.play.behavioural.chainOfResposibility.TicketHandler;
import local.play.creational.factory.AnimalFactory;
import local.play.creational.factory.Cat;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        TicketHandler ticketHandler = new PSTicketHandler();
        TicketHandler sHandler = new SDETicketHandler();

        ticketHandler.setNextHandler(sHandler);

        Ticket ticket1 = new Ticket();
        ticket1.setSeverity("Easy");

        Ticket ticket2 = new Ticket();
        ticket2.setSeverity("Complex");

        //System.out.println(psTicketHandler.resolveTicket(ticket1).isResolved());
        System.out.println(ticketHandler.resolveTicket(ticket2).isResolved());
    }   
}
