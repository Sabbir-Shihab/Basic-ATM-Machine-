import java.util.Scanner;

public class ATM {
    float balance;
    int pin = 1212;

    public void CheckPin() {
        System.out.println("Enter Your Pin: ");
        Scanner sc = new Scanner(System.in);
        int enterPin = sc.nextInt();
        if (pin == enterPin) {
            menu();
        } else {
            System.out.println("Incorrect Pin...\nTry Aganin..");
            menu();
        }


    }

    public void menu() {
        System.out.println("Chose the Number: ");
        System.out.println("1.Check Blance: ");
        System.out.println("2.Withdrow Blance: ");
        System.out.println("3.Deposit Blance: ");
        System.out.println("4.Exit");
        Scanner scc = new Scanner(System.in);
        int opt = scc.nextInt();
        if (opt == 1) {
            CheckBlance();
        } else if (opt == 2) {
            WithdeowMoney();
        } else if (opt == 3) {
            DepositMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter a valid choice..");
            menu();
        }

    }

    public void CheckBlance() {
        System.out.println("Blance :" + balance);
        menu();
    }

    public void WithdeowMoney() {
        System.out.println("Enter Ammount to Withdrow: ");
        Scanner sc = new Scanner(System.in);
        int ammonut = sc.nextInt();
        if (ammonut > balance) {
            System.out.println("Insufficent Blance..");
        }
        else  {
            balance=balance-ammonut;
            System.out.println("Blance withdrow succesfully");

        }
        menu();
    }
    public void DepositMoney(){
        System.out.println("Enter the Deposit Ammount: ");
        Scanner sc=new Scanner(System.in);
        int deposit= sc.nextInt();
        balance=balance+deposit;
        System.out.println("Money Deposit Succesfully");
menu();

    }

}
