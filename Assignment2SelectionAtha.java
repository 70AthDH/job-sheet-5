import java.util.Scanner;
public class Assignment2SelectionAtha {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCredits;
        System.out.println("input total credits: ");
        totalCredits = sc.nextInt();
        if (totalCredits > 24) {
            System.out.println("exceed limit");
        } else {
            System.out.println("KRS is valid");
        }
    sc.close();
    }
}
