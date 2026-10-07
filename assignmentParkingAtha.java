import java.util.Scanner;
public class assignmentParkingAtha {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int hours = 2;
            int hoursPay = 2000;
            int payExtra = 1000;
            int hoursExtra;
            System.out.println("input how many hours have you park?");
            hoursExtra = sc.nextInt();
            if (hours > hoursExtra){
                System.out.println("you still need to pay " + hoursPay);
            } else {
                int addition = hoursExtra * payExtra;
                int output = addition + hoursPay;
                System.out.println("you have to pay " + output);
            }
        }
    }
}