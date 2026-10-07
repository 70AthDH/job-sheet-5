# BASIC PROGRAMMING PRACTICUM JOB SHEET REPORT 4 / JOB SHEET 5

---

Name: Athaaullah Dhiyaaul Haq

Nim: 264107020187

class: TI-1I

---

## SELECTION 1

### Experiment 1 :  Using IF and IF-ELSE to Print the KRS

1. you need to use true, as for why is the var you are using is boolean wich only take true/false.

2. no line is executed as there is no answer for the condition if we put false.

3. it run normaly as the computer understand the input was true no mater what case it use.

4. it run as it should. displaying the wanted result.

### Experiment 2: SWITCH-CASE to Print the KRS

1. the break function as a stop tp the case as if we didn't put break it will also print the next case until break.

2. nothing got print out as there is no defult answer outside from the case.

3. it makes instant error as the case is in int or only take int variable

4. i feel like switch case ismore easier to read.

## Assignments

1. assignment 1

```java
import java.util.Scanner;
public class assignment1selectionatha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("- - -  print krs siakad - - -");
        System.out.println("has the ukt been paid? (true/false): ");
        boolean uktpaid = sc.nextBoolean();
        String message = (uktpaid == true) ? "UKT payment verified\nPlease print your KRS and ask your DPA to sign it" : "“Registration rejected\nPlease pay your UKT first";
        System.out.println(message);
    sc.close();
    }
}
```

2. assignmnet 2

```java
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
```

3. assignment 3

```java
import java.util.Scanner;
public class assignmentParkingAtha {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
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
        sc.close();
    }
}
```

```java
import java.util.Scanner;

public class assingmentQueueAtha{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String printloket = "opening loket ";  
        System.out.println("input the loket you want to open");
        String menu = sc.nextLine();

        switch (menu){
            case "a" -> System.out.println( printloket + "a");
            case "b" -> System.out.println(printloket + "b");
            case "c" -> System.out.println(printloket + "c");
            case "d" -> System.out.println(printloket + "d");
            default -> System.out.println("Servicecode is not available");
        }
    }
}
```

---

## Bonus assignment

```java
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
```

```java

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

```

```java

```
