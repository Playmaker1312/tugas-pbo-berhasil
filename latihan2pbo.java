/*

nama : zaki zafran
no nim : 2301093010
soal no 2
*/

import java.util.Scanner;
public class latihan2pbo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan nilai");
        int nilai = scanner.nextInt();
        scanner.close();

        if (nilai > 10){
            System.out.println("invalid number");
        }
        else if (nilai == 10 ){
            System.out.println("sepuluh");
        }
        else if (nilai == 9 ){
            System.out.println("sembilan");
        }
        else if (nilai == 8 ){
            System.out.println("delapan");
        }
        else if (nilai == 7 ){
            System.out.println("tujuh");
        }
        else if (nilai == 6 ){
            System.out.println("enam");
        }
        else if (nilai == 5 ){
            System.out.println("lima");
        }
        else if (nilai == 4 ){
            System.out.println("empat");
        }
        else if (nilai == 3 ){
            System.out.println("tiga");
        }
        else if (nilai == 2 ){
            System.out.println("dua");
        }
        else if (nilai == 1 ){
            System.out.println("tiga");
        }

        switch (nilai) {
            case 1:
                System.out.println("Satu");
                break;
            case 2:
                System.out.println("Dua");
                break;
            case 3:
                System.out.println("Tiga");
                break;
            case 4:
                System.out.println("Empat");
                break;
            case 5:
                System.out.println("Lima");
                break;
            case 6:
                System.out.println("Enam");
                break;
            case 7:
                System.out.println("Tujuh");
                break;
            case 8:
                System.out.println("Delapan");
                break;
            case 9:
                System.out.println("Sembilan");
                break;
            case 10:
                System.out.println("Sepuluh");
                break;
            default:
                System.out.println("Invalid number");
        }



    }
}
