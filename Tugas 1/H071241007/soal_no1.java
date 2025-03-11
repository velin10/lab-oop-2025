import java.util.Scanner;

public class tugas1 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
    
        Scanner x = new Scanner(System.in);
        System.out.println("masukkan kata: ");
        String input = x.nextLine();
        String hasil = input.toLowerCase();
        String[] kata = hasil.split(" ");
        String akhir = ""; 

        for (String teks : kata) {
            if (teks.length() > 0) {
                String kapital = teks.substring(0, 1).toUpperCase() + teks.substring(1);
                akhir += kapital +" ";
            }

        }
        System.out.println(akhir);
        x.close();
    }
}
