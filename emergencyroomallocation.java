import java.util.Scanner;

public class emergencyroomallocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int spo2;
        int bedleft;
        int Stoicblood;
        String cond = "fully";
        boolean hascomorbidit;
        int age;
        int breathrate;
        double temp;

        String icu =  "Room icu";
        String UGD_VENTILATOR_MOBIL = "UGD_VENTILATOR_MOBIL";
        String RESUSITASI_UGD = "RESUSITASI_UGD";
        String HCU_ISOLASI = "HCU_ISOLASI";
        String RAWAT_INAP_UMUM="RAWAT_INAP_UMUM";
        String RAWAT_JALAN="RAWAT_JALAN"; 

        System.out.println("input SpO2 ");
        spo2 = sc.nextInt();
        System.out.println("bed left ");
        bedleft = sc.nextInt();
        System.out.println("Stoic Blood Preasure level ");
        Stoicblood = sc.nextInt();
        System.out.println("conditionn of the patient (fully/not)");
        cond = sc.nextLine().trim();
        System.out.println("does the patient have comorbidities ");
        hascomorbidit = sc.nextBoolean();
        System.out.println("age? ");
        age = sc.nextInt();
        System.out.println("espiratory rate ");
        breathrate=sc.nextInt();
        System.out.println("temperature");
        temp=sc.nextDouble();

        if (spo2<85) {
            if (bedleft>0) {
                System.out.println(icu);
            } else{
                System.out.println(UGD_VENTILATOR_MOBIL);
            }
        }else if ((spo2>=85&&spo2<=89)||(Stoicblood<90||Stoicblood>180||(cond != "fully"))){
            System.out.println(RESUSITASI_UGD);
        }else if ((spo2>=90&&spo2<=94)||(temp==39.0&&hascomorbidit&&age==65)) {
            System.out.println(HCU_ISOLASI);
        }else if ((spo2>=90&&spo2<=94)||(breathrate>24)) {
            System.out.println(RAWAT_INAP_UMUM);
        }else{
            System.out.println(RAWAT_JALAN);
        }

    }
}