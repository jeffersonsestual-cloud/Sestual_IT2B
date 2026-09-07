import java.util.Scanner;

public class Activity2 {
    Scanner sc = new Scanner(System.in);

    public void cinemaTicketSystem(){
        System.out.println("======= CINEMA TICKET SYSTEM =======");
        System.out.println("1. REGULAR = 350");
        System.out.println("2. 3D = 400");
        System.out.println("3. IMAX = 450");
        System.out.println("====================================");
        System.out.print("Enter Selection: ");
        int select = sc.nextInt();

        String format = "";
        double basePrice = 0.00;

        if (select == 1){
            format = "REGULAR";
            basePrice = 350.00;
        } else if (select == 2){
            format = "3D";
            basePrice = 400.00;
        } else if (select == 3){
            format = "IMAX";
            basePrice = 450.00;
        } else {
            System.out.println("Invalid selection. Please try again.");
        }

        System.out.print("Enter Screen Hour (24-Hour Format): ");
        int hour = sc.nextInt();
        if (hour < 1 || hour > 23){
            System.out.println("Invalid hour. Please try again.");
        }

        double peakHourFee = 0.00;
        if (hour >= 17 && hour <= 20){
            peakHourFee = 50.00;
        }

        double total = basePrice + peakHourFee;

        System.out.println("--------- TICKET BREAKDOWN ---------");
        System.out.println("Screening Format:  "+format);
        System.out.println("Base Ticket Price: PHP "+String.format("%.2f", basePrice));
        System.out.println("Peak Hour Fee:     PHP "+String.format("%.2f", peakHourFee));
        System.out.println("------------------------------------");
        System.out.println("TOTAL TICKET COST: PHP "+String.format("%.2f", total));
        System.out.println("STATUS:            SEAT RESERVED");
        System.out.println("------------------------------------");
    }
}