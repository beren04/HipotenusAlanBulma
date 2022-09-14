package first;

import java.util.Scanner;

public class pisagor {
    public static void main(String[] args) {
        int i=0;
        while(i<2){
            Scanner input = new Scanner(System.in);
            System.out.print("1.kenarı giriniz:");
            int kenar1 = input.nextInt();
            System.out.print("2.kenarı giriniz:");
            int kenar2 = input.nextInt();

            System.out.println("hipotenüsü:" + Math.sqrt(kenar1 * kenar1 + kenar2 * kenar2));
            System.out.println("alan:" + ((kenar1 * kenar2) / 2));
            i++;

        }
        }
    }
