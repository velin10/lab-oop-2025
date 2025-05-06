public class Main {
    public static void main(String[] args){

        Mobil mobil = new Mobil("BMW", "4-Wheels Drive");
        mobil.setColor("Black");
        mobil.setDoorTotal(4);
        mobil.setFuel("Electric Vehicle");
        mobil.setKecepatan(100.2);
        mobil.setSeatTotal(4);
        mobil.setYearProduction(2002);
        mobil.setMachineCapacity(200.1);
        mobil.setId("U123");
        mobil.setCondition(true);
        mobil.calculateServicePrice(4000.2);

        System.out.println("KENDARAAN MOBIL");
        System.out.println("==============================================");
        System.out.println("Nama Kendaraan : " + mobil.merk);
        System.out.println("Nama Model : " + mobil.model);
        System.out.println("Warna Kendaraan : " + mobil.getColor());
        System.out.println("Jumlah Pintu : " + mobil.getDoorTotal());
        System.out.println("Jenis Bahan Bakar : " + mobil.getFuel());
        System.out.println("ID Kendaraan : " + mobil.id);
        System.out.println("Kecepatan Mobil : " + mobil.getKecepatan());
        System.out.println("Condition : " + (mobil.getCondition() ? "Mobil Baik-Baik Saja" : "Mobil Kurang Baik"));
        mobil.doService();
        System.out.println("Service Price : " + mobil.servicePrice);
        System.out.println("Next Service : " + mobil.getNextService());


    }
}
