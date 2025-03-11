
// import java.util.Arrays;
// import java.util.Random;
import java.util.InputMismatchException;
import java.util.Scanner;

public class nomor_2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        try{
            System.out.print("Masukkan angka pilihan anda: ");
            int angka = input.nextInt();
            // int[][] arr = new int [3][2];
            int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
            // Random random = new Random();
    
            // for(int i = 0; i < arr.length; i++){
            //     for(int j = 0; j < arr[i].length; j++){
            //         arr[i][j] = random.nextInt(10)+1;
            //         System.out.println(Arrays.toString(arr[i]));
            //     }
            // }
    
            for(int i = 1; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                    if(angka == arr[i][j]){
                        System.out.printf(String.format("angka %d ada di [%d][%d]",angka, i, j));
                        break;
                }
            }
    
        }
        } catch (InputMismatchException e){
            System.out.println("Input haruslah angka");
        }finally{
            input.close();
        }

    input.close();
    }
}