import java.util.Scanner;

class Hero {
    String name;
    int health;
    int attackPower;

    Hero(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    void attack() {
        System.out.println(name + " menyerang dengan kekuatan " + attackPower + "!");
    }
}

class Archer extends Hero {
    Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    void attack() {
        System.out.println(name + " menembakkan panah! Serangan: " + attackPower);
    }
}

class Wizard extends Hero {
    Wizard(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    void attack() {
        System.out.println(name + " mengeluarkan sihir! Serangan: " + attackPower);
    }
}

class Fighter extends Hero {
    Fighter() {
        this("Fighter Default", 120, 20);
    }

    Fighter(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    void attack() {
        System.out.println(name + " menghantam musuh dengan keras! Serangan: " + attackPower);
    }
}

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== PILIH KARAKTER ===");
            System.out.println("1. Archer");
            System.out.println("2. Wizard");
            System.out.println("3. Fighter");
            System.out.println("4. Keluar");

            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            Hero hero = null;

            switch (pilihan) {
                case 1:
                    hero = new Archer("Legolas", 100, 15);
                    break;
                case 2:
                    hero = new Wizard("Gandalf", 80, 25);
                    break;
                case 3:
                    hero = new Fighter();
                    break;
                case 4:
                    running = false;
                    System.out.println("Terima kasih telah bermain!");
                    continue;
                default:
                    System.out.println("Pilihan tidak valid!");
                    continue;
            }

            boolean aksiLoop = true;
            while (aksiLoop) {
                System.out.println("\n--- AKSI ---");
                System.out.println("1. Serang");
                System.out.println("2. Ganti karakter");
                System.out.println("3. Keluar");

                System.out.print("Pilihan: ");
                int aksi = scanner.nextInt();

                switch (aksi) {
                    case 1:
                        hero.attack();
                        break;
                    case 2:
                        aksiLoop = false;
                        break;
                    case 3:
                        running = false;
                        aksiLoop = false;
                        System.out.println("Keluar dari permainan.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            }
        }
        scanner.close();
    }
}
