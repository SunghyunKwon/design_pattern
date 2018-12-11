public class Main {
    public static void main(String[] args) {
        System.out.println("Test Start");

        for (int i = 0; i < 10; i++) {
            TicketMacker singleton = TicketMacker.getInstance();
            System.out.println("TicketMacker Index: " + singleton.getNextTicketNumber());
        }

        System.out.println("Test End");
    }
}