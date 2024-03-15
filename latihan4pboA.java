/*

nama : zaki zafran
no nim : 2301093010
soal 4 for loop
*/
import java.util.Scanner;

public class latihan4pboA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();
        System.out.print("Masukkan pangkat: ");
        int pangkat = scanner.nextInt();
        
        int hasil = 1;
        
        for (int i = 1; i <= pangkat; i++) {
            hasil *= nilai;
        }
        
        System.out.println("Hasil " + nilai + " pangkat " + pangkat + " adalah: " + hasil);
    }
}
