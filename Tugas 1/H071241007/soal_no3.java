import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        System.out.println("masukkan tanggal dalam format dd-mm-yyyy: ");
        String input = x.nextLine();
        String[] tanggal = input.split("-");

        int hari = Integer.parseInt(tanggal[0]);
        int bulan = Integer.parseInt(tanggal[1]);
        int tahun = Integer.parseInt(tanggal[2]);

        String namaBulan;
        switch (bulan) {
            case 1:
                namaBulan = "Januari";
                break;
            case 2:
                namaBulan = "Februari";
                break;
            case 3:
                namaBulan = "Maret";
                break;
            case 4:
                namaBulan = "April";
                break;
            case 5:
                namaBulan = "Mei";
                break;
            case 6:
                namaBulan = "Juni";
                break;
            case 7:
                namaBulan = "Juli";
                break;
            case 8:
                namaBulan = "Agustus";
                break;
            case 9:
                namaBulan = "September";
                break;
            case 10:
                namaBulan = "Oktober";
                break;
            case 11:
                namaBulan = "November";
                break;
            case 12:
                namaBulan = "Desember";
                break;
            default:
                System.out.println("Bulan tidak valid bos!");
                return;
        }

        if (tahun >= 0  && tahun <= 25){
            tahun += 2000;
        }
        else {
            tahun += 1900;
        }
        x.close();
        System.out.println(hari + "-" + namaBulan + "-" + tahun);

    }

}