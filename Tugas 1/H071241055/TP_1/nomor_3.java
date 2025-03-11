import java.util.Arrays;
import java.util.Scanner;

public class nomor_3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        String tanggal = input.nextLine();

        String[] arrTanggal = tanggal.split("-");
        System.out.println(Arrays.toString(arrTanggal));

        int[] arrInt = new int[arrTanggal.length];
        
        for(int i = 0; i < arrTanggal.length; i++){
            arrInt[i] = Integer.parseInt(arrTanggal[i]);
        }



        if(arrInt[2] > 25){
            arrInt[2] = 1900 + arrInt[2];
        }else{
            arrInt[2] = 2000 + arrInt[2];
        }

        switch (arrInt[1]) {
            case 1:
                System.out.printf("%d Januari %d", arrInt[0], arrInt[2]);
                break;
            case 2:
                System.out.printf("%d Februari %d", arrInt[0], arrInt[2]);
                break;
            case 3:
                System.out.printf("%d Maret %d", arrInt[0], arrInt[2]);
                break;
            case 4:
                System.out.printf("%d April %d", arrInt[0], arrInt[2]);
                break;
            case 5:
                System.out.printf("%d Mei %d", arrInt[0], arrInt[2]);
                break;
            case 6:
                System.out.printf("%d Juni %d", arrInt[0], arrInt[2]);
                break;
            case 07:
                System.out.printf("%d Juli %d", arrInt[0], arrInt[2]);
                break;
            case 8:
                System.out.printf("%d Agustus %d", arrInt[0], arrInt[2]);
                break;
            case 9:
                System.out.printf("%d September %d", arrInt[0], arrInt[2]);
                break;
            case 10:
                System.out.printf("%d Oktober %d", arrInt[0], arrInt[2]);
                break;
            case 11:
                System.out.printf("%d November %d", arrInt[0], arrInt[2]);
                break;
            case 12:
                System.out.printf("%d Desember %d", arrInt[0], arrInt[2]);
                break;
            default:
                System.out.println("Bulan itu dari 1 - 12");
                break;
        }

        input.close();

    }
}