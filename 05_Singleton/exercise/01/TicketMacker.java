public class TicketMacker {
    private int ticket = 1000;
    private static TicketMacker ticketMacker = new TicketMacker();

    private TicketMacker() {
    }
    
    public static TicketMacker getInstance() {
        return ticketMacker;
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}