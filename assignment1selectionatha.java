import java.util.Scanner;
public class assignment1selectionatha {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.err.println("- - -  print krs siakad - - -");
            System.out.println("has the ukt been paid? (true/false): ");
            boolean uktpaid = sc.nextBoolean();
            String message = (uktpaid == true) ? "UKT payment verified\nPlease print your KRS and ask your DPA to sign it" : "“Registration rejected\nPlease pay your UKT first";
            System.out.println(message);
        }
    }
}