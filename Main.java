package latihan8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        latihan l = new latihan ();
        System.out.println("MENGECEK INTEGER / DOUBLE");
        System.out.print("Masukkan Bilangan : ");
        l.setAngka(in.nextDouble());
        if (l.getAngka() % 1 == 0){
            l.methodI1();
        }
        else{
            l.methodD1();
        }
    } 
}
