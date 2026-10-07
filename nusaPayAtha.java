import java.util.Scanner;

public class nusaPayAtha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String blacklist;
        int suspicious = 0;
        int saldo;
        int transfer;
        int limitDaily = 10000;
        String isnotdomestic;
        int curentTime;
        int fraud = 4;
        String log;

    
       

        System.out.println("do you want to log in to your account? (yes/no) \n");
        log = sc.nextLine().toLowerCase();
        switch (log){
            case "yes" -> {
                System.out.println("\nlog in progress \n");
                System.out.println("are you blacklisted? (yes/no) \n");
                blacklist = sc.nextLine();

                    switch (blacklist){
                        case "yes" ->{System.out.println("\nyou are not allowed to transfer\n");}
                        case "no" -> {System.out.println("\nyou are allowed to transfer \n");
                            System.out.println("how much saldo do you have? \n");
                        saldo = Integer.parseInt(sc.nextLine().trim());

                        System.out.println("\ninput transfer: \n");
                        transfer = Integer.parseInt(sc.nextLine().trim());

                        if (transfer > saldo) {
                            System.out.println("\nExceed saldo balance\n");
                        }else if (transfer > limitDaily) {
                            System.out.println("\nExceed daily limit\n");
                        } else {
                            System.out.println("\nyour transfer has been requested \n");
                            System.out.println("your balance is now " + (saldo - transfer) + "\n");
                            System.out.println("is it a domestic transfer? (yes/no)\n");
                            isnotdomestic = sc.nextLine().trim().toLowerCase();
                            switch (isnotdomestic) {
                                case "yes" -> System.out.println("\nprogress\n");
                                case "no" -> {
                                    if (transfer > 2000){System.out.println("\naccount is flagged as potential fraud\n");}
                                    suspicious++;
                                }
                                default -> System.out.println("error input");
                            }
                            System.out.println("\nwhat time is it currently? \n");
                        curentTime = Integer.parseInt(sc.nextLine().trim());
                        if ((curentTime < fraud)&&(transfer>=2000)){
                            System.out.println("\nyou need to do an OTP\n");
                        } else {
                            System.out.println("\nthank you for answering\n");
                            if (suspicious == 1){
                                System.out.println("\nyour account has a a suspicious flagged required to do an OTP\n");
                            } else{
                                System.out.println("\ntransfer Succesful\n");
                            }
                        }
                        }

                    }
                    default -> {System.out.println("error input 1");}}

            }
            case "no" -> {System.out.println("you have been log out");}
        default-> {System.out.println("error input 0");}}
        
    }
}