import java.util.Scanner;

public class tugas5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan password anda: ");
        String password = scanner.nextLine();
        
        if (pass(password)) {
            System.out.println("password valid");
        } else {
            System.out.println("password tidak valid");
        }
        scanner.close();
    }
        
    public static boolean pass(String password) {
           
           if (password.length() < 8) {
               return false;
           }
    
           boolean p_hrf_besar = false;
           boolean p_hrf_kecil = false;
           boolean p_angka = false;
    
           for (char ch : password.toCharArray()) {
               if (Character.isUpperCase(ch)) {
                p_hrf_besar = true;
               } else if (Character.isLowerCase(ch)) {
                p_hrf_kecil = true;
               } else if (Character.isDigit(ch)) {
                p_angka = true;
               }
    
               if (p_hrf_besar && p_hrf_kecil && p_angka) {
                   break;
               }
           }
    
           return p_hrf_besar && p_hrf_kecil && p_angka;
    }
}
