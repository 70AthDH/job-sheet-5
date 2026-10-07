import java.util.Scanner;
public class selectionswitchatha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("- - - Print KRS SIAKAD - - -");
        System.out.print("Enter your current Semester: ");
        int semester = sc.nextInt();
        System.out.println("");
        switch (semester) {
            case 1:
                System.out.println("KRS for semester 1 is displayed");
                break;
            case 2:
                System.out.println("KRS for semestre 2 is displayed");
                break;
            case 3:
                System.out.println("KRS for semestre 3 is displayed");
                break;
            case 4:
                System.out.println("KRS for semestre 4 is displayed");
                break;
            case 5:
                System.out.println("KRS for semestre 5 is displayed");
                break;
            case 6:
                System.out.println("KRS for semestre 6 is displayed");
                break;
            case 7:
                System.out.println("KRS for semestre 7 is displayed");
                break;
            case 8:
                System.out.println("KRS for semestre 8 is displayed");
                break;
            default:
                System.out.println("invaid semester");
        }
    sc.close();
    }
}