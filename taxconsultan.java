import java.util.Scanner;
public class taxconsultan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pkp;
        System.out.println("enter the pkp: ");
        pkp = sc.nextInt();
        if (pkp <= 0) {
            System.out.println("Tax free ");
        } else {}
        if (pkp <= 60000000){
            System.out.println(pkp * 0.05);
        } else if (pkp <= 250000000){
            double taxfirst = 60000000 * 0.05;
            double remainpkp = pkp - 60000000;
            double taxsecond = remainpkp * 0.15;
            System.out.println(taxfirst + taxsecond);
        } else if (pkp >250000000 || pkp <= 500000000){
            double taxfirst = 60000000 * 0.05;
            double remainpkp = pkp - 250000000;
            double taxsecond= (250000000 - 60000000)*0.15;
        }
    }
}
