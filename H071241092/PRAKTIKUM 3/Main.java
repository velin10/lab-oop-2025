
class Lukisan {
    private String judul;
    private String pelukis;

    public Lukisan() {
        this.judul = "Tidak Diketahui";
        this.pelukis = "Tidak Diketahui";
    }

    public Lukisan(String judul, String pelukis) {
        this.judul = judul;
        this.pelukis = pelukis;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPelukis() {
        return pelukis;
    }

    public void setPelukis(String pelukis) {
        this.pelukis = pelukis;
    }
}

class Pameran {
    private String namaPameran;
    private Lukisan lukisan;

    public Pameran() {
        this.namaPameran = "Pameran Tidak Diketahui";
        this.lukisan = new Lukisan();
    }

    public Pameran(String namaPameran, Lukisan lukisan) {
        this.namaPameran = namaPameran;
        this.lukisan = lukisan;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pameran: " + namaPameran);
        System.out.println("Judul Lukisan: " + lukisan.getJudul());
        System.out.println("Pelukis: " + lukisan.getPelukis());
    }

    public void gantiLukisan(Lukisan lukisanBaru) {
        this.lukisan = lukisanBaru;
        System.out.println("Lukisan telah diganti menjadi: " + lukisan.getJudul());
    }
}

public class Main {
    public static void main(String[] args) {
        Lukisan lukisan1 = new Lukisan("Matahari Terbenam", "Velin");
        Pameran pameran1 = new Pameran("Pameran Seni Modern", lukisan1);

        pameran1.tampilkanInfo();

        System.out.println();

        Lukisan lukisan2 = new Lukisan("Air Terjun", "Vania");
        pameran1.gantiLukisan(lukisan2);

        System.out.println();

        pameran1.tampilkanInfo();
    }
}
