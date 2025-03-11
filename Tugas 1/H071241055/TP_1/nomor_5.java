import java.util.Arrays;
import java.util.Scanner;

public class nomor_5 {
    public static void main(String[] args){
        String[] aljabarKecil = new String[26];
        String[] aljabarBesar = new String[26];
        String[] angka = {"1","2","3","4","5","6","7","8","9","0"};
        
        for (int i = 0; i < 26; i++) {
            aljabarKecil[i] = Character.toString((char) ('a' + i));
            aljabarBesar[i] = Character.toString((char) ('A' + i));
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan password anda: ");
        String[] pass = input.nextLine().split("");

        Boolean adaHurufKecil = false;
        Boolean adaHurufBesar = false;
        Boolean adaAngka = false;   
        for(int i = 0; i < pass.length;i++){
             if(Arrays.asList(aljabarBesar).contains(pass[i])){
                adaHurufBesar = true;
             }else if(Arrays.asList(aljabarKecil).contains(pass[i])){
                adaHurufKecil = true;
             }else if(Arrays.asList(angka).contains(pass[i])){
                adaAngka = true;
             }
        }


        if(pass.length >= 8 && adaHurufBesar && adaHurufKecil && adaAngka ){
            System.out.println("Password anda valid");
        }else{
            System.out.println("Password anda tidak valid");
        }

        input.close();




        // Menampilkan isi array
    }
}