import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Judul Film :\n> ");
        String kata2 = scan.nextLine();

        String judulkecil = kata2.toLowerCase();
        String[] judulsplit = judulkecil.split(" ");

        String hasil = fixjudul(judulsplit);
        System.out.println(hasil);
        scan.close();
        
    }
    public static String fixjudul(String[] judul) {
        String hasil = new String();

        for (String kata : judul) {
            if (kata.length() > 0) {
            String judulbesar = kata.substring(0,1).toUpperCase() + kata.substring(1);
            hasil += " " + judulbesar;
            }
        }
        return hasil;
    }
}
