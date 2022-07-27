import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String args[]) throws InterruptedException, IOException {
        
        
        Scanner scanner = new Scanner(System.in);
        String pass = "";

        int[] password = new int[4];

        //Choix de la methode de crackage
        System.out.println("Choisissez la methode de crackage :");
        System.out.println("0. Dictionary");
        System.out.println("1. Brute Force");

        System.out.print("\nVotre choix : ");

        int choix = scanner.nextInt();

        Factory factory = new Factory();
        PasswCracker passwCracker = factory.getInstance(choix);

        passwCracker.cracker(4,password,0);
    }
   

}
