import java.util.Scanner;

public class tugas2 {

    public static void main(String[] args) {
    
        Scanner x = new Scanner(System.in);
        System.out.println("masukkan angka yang ingin dicari: ");
        int input = x.nextInt();
        int[][] matriks = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                if (matriks[i][j] == input) {
                    System.out.println("angka "+input+" ada di baris "+(i)+" dan kolom "+(j));
                }
            }
        }

        x.close();
    }
}