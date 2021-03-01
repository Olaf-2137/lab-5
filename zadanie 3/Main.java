package sample;
import java.util.Scanner;

public class main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
    //Konto
        Konto users[] = new Konto[10];
        for(int i=0; i< users.length;i++) {
            users[i] = new Konto();
        }
    //ID 
         while (true) {
             System.out.println("Podaj ID konta (Wpisz -1 by wyjsc)");
             int x = scanner.nextInt();
             if (x == -1) {
                 break;
             }
    //Komunikaty
             int choice = 0;
             while (choice != 4) {
                 System.out.println("1.Sprawdz dostepne środki\n2.Wypłać środki\n3.Wpłać środki\n4.Wyjdź");
                 choice = scanner.nextInt();
    //wyjściowe 1 - 4
                 switch (choice) {
                     case 1:
                         users[x].info();
                         break;
                     case 2:
                         users[x].withdraw();
                         break;
                     case 3:
                         users[x].deposit();
                         break;
                     case 4:
                         System.out.println("Zegnaj");
                         break;
                 }

             }
         }
    }
}
