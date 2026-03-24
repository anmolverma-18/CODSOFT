import java.util.Scanner;

class Account {
    double bal = 1000;

    void dep(double a) {
        bal = bal + a;
        System.out.println("Deposited");
    }

    void wd(double a) {
        if (a <= bal) {
            bal = bal - a;
            System.out.println("Withdrawn");
        } else {
            System.out.println("No balance");
        }
    }

    void show() {
        System.out.println("Balance: " + bal);
    }
}

public class ATMInterface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account ac = new Account();

        int ch = 0;

        while (ch != 4) {
            System.out.println("\n1.Deposit 2.Withdraw 3.Check 4.Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Amount: ");
                double a = sc.nextDouble();
                ac.dep(a);
            } else if (ch == 2) {
                System.out.print("Amount: ");
                double a = sc.nextDouble();
                ac.wd(a);
            } else if (ch == 3) {
                ac.show();
            } else if (ch != 4) {
                System.out.println("Wrong choice");
            }
        }
    }
}