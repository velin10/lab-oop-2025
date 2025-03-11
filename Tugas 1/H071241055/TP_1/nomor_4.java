import java.util.Scanner;

public class nomor_4 {
    public static int faktorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }else{
            return n * faktorial( n-1);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("n : ");
        int n = input.nextInt();
        long hasil = faktorial(n);
        System.out.printf(String.format("Hasil dari faktorial %d adalah %d", n, hasil));

        input.close();
    }

}
