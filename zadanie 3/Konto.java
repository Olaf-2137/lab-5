package sample;
import java.util.Scanner;

public class Konto{
    double balance = 100.0;
    Scanner scanner = new Scanner(System.in);

    //WPŁATA -----------------------------------
    public void deposit(){
        System.out.print("Ile chcesz wpłacic środków na konto?");
        double amount = scanner.nextDouble();
        if (amount < 0 ){
            System.out.println("ERROR NIEMOŻLIWA WPŁATA UJEMNEJ KWOTY SPRÓBÓJ PONOWNIE");
        }
        else{
            this.balance += amount;
        }
    }
    //WYPŁATA -----------------------------------
    public void withdraw(){
        System.out.print("Ile środków chcesz wypłacic?");
        double amount = scanner.nextDouble();
        if (amount < 0 ) {
            System.out.println("ERROR NIEMOŻLIWA WPŁATA UJEMNEJ KWOTY SPRÓBÓJ PONOWNIE");
        }
        else {
            if (amount > this.balance) {
                System.out.println("Nie masz tylu środków na koncie");
            } else {
                this.balance -= amount;
            }
        }
    }
    //STANKONTA
    public void info(){
        System.out.println("Twoje środki na koncie wynoszą: "+ this.balance);
    }
}
