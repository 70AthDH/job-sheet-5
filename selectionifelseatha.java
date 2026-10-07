import java.util.Scanner;
public class selectionifelseatha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("- - - Print KRS SIAKAD - - -");
        System.out.print("Enter your current Semester: ");
        int semester = sc.nextInt();
        System.out.println("");
        if (semester == 1) {
            System.out.println("KRS for semester 1 is displayed");
        } else if (semester == 2){
            System.out.println("KRS for semester 2 is displayed");
        } else if (semester == 3){
            System.out.println("KRS for semester 3 is displayed");
        } else if (semester == 4){
            System.out.println("KRS for semester 4 is displayed");
        } else if (semester == 5){
            System.out.println("KRS for semester 5 is displayed");
        } else if (semester == 6){
            System.out.println("KRS for semester 6 is displayed");
        } else if (semester == 7){
            System.out.println("KRS for semester 7 is displayed");
        } else if (semester == 8){
            System.out.println("KRS for semester 8 is displayed");
        } else {
            System.out.println("invalid semester");
        }
    sc.close();
    }
}