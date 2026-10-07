import java.util.Scanner;
public class selctionIfAtha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("- - -  print krs siakad - - -");
        System.out.println("has the ukt been paid? (true/false): ");
        boolean uktpaid = sc.nextBoolean();
        if (uktpaid){
            System.out.println("ukt payment verified");
            System.out.println("please print your krs and ask your dpa to sign it");
        } else {
            System.out.println("Register rejected");
            System.out.println("please pay your ukt first");
        }
    }
}
