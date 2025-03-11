import java.util.Scanner;

public class nomor_1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kalimatnya : ");
        String kata = input.nextLine();

        String[] kataArr = kata.split(" ");
        for(int i = 0; i < kataArr.length; i++){
            String karakter = kataArr[i];
            char hurufPertama = Character.toUpperCase(karakter.charAt(0));
            kataArr[i] = hurufPertama + karakter.substring(1);
        }
        
        String hasil = String.join(" ", kataArr);

        System.out.println(hasil);

        input.close();
    }
}