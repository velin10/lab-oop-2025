import java.util.Scanner;

public class tugas4 {
    public static void main (String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("masukkan angka yangng ingin di faktorialkan: ");
        int angka = x.nextInt();

        System.out.println(faktorial(angka));

        
        x.close();
    }
    public static long faktorial(int angka) {
        if (angka == 0 || angka == 1) {
            return 1;
        } else {
            return angka * faktorial(angka - 1);
        }
    }
}