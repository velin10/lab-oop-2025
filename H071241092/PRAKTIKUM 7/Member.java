import java.util.*;

public class Member {
    // private static final Scanner scanner = new Scanner(System.in);
    // private static final Library library = new Library();

    // private static void tambahItem() {
    // System.out.print("Masukkan jenis item (1. Buku, 2. DVD): ");
    // int jenis = Integer.parseInt(scanner.nextLine());
    // System.out.print("Masukkan judul: ");
    // String title = scanner.nextLine();
    // System.out.print("Masukkan ID item: ");
    // int id = Integer.parseInt(scanner.nextLine());

    // if (jenis == 1) {
    // System.out.print("Masukkan nama penulis: ");
    // String author = scanner.nextLine();
    // Book book = new Book(title, id, author);
    // System.out.println(library.addItem(book));
    // library.getLogger().logActivity("Buku: " + title + " oleh " + author + ", ID:
    // " + id + " ditambahkan");
    // } else if (jenis == 2) {
    // System.out.print("Masukkan durasi (menit): ");
    // int duration = Integer.parseInt(scanner.nextLine());
    // DVD dvd = new DVD(title, id, duration);
    // System.out.println(library.addItem(dvd));
    // library.getLogger()
    // .logActivity("DVD: " + title + ", durasi " + duration + " menit, ID: " + id +
    // " ditambahkan");
    // } else {
    // System.out.println("Jenis item tidak valid.");
    // }
    // }

    // private static void tambahAnggota() {
    // System.out.print("Masukkan nama anggota: ");
    // String name = scanner.nextLine();
    // System.out.print("Masukkan ID anggota: ");
    // int id = Integer.parseInt(scanner.nextLine());
    // Member member = new Member(name, id);
    // library.addMember(member);
    // System.out.println("Anggota " + name + " ditambahkan");
    // library.getLogger().logActivity("Anggota " + name + " (ID: " + id + ")
    // ditambahkan");
    // }

    // private static void pinjamItem() {
    // System.out.print("ID Anggota: ");
    // int memberId = Integer.parseInt(scanner.nextLine());
    // System.out.print("ID Item: ");
    // int itemId = Integer.parseInt(scanner.nextLine());
    // System.out.print("Jumlah hari peminjaman: ");
    // int days = Integer.parseInt(scanner.nextLine());

    // try {
    // Member member = findMemberById(memberId);
    // LibraryItem item = library.findItemById(itemId);
    // String result = member.borrow(item, days);
    // System.out.println(result);
    // library.getLogger().logActivity(item.getDescription() + " dipinjam oleh " +
    // member.getName());
    // } catch (Exception e) {
    // System.out.println("Gagal meminjam item: " + e.getMessage());
    // }
    // }

    // private static void kembalikanItem() {
    // System.out.print("ID Anggota: ");
    // int memberId = Integer.parseInt(scanner.nextLine());
    // System.out.print("ID Item: ");
    // int itemId = Integer.parseInt(scanner.nextLine());
    // System.out.print("Jumlah hari keterlambatan: ");
    // int daysLate = Integer.parseInt(scanner.nextLine());

    // try {
    // Member member = findMemberById(memberId);
    // LibraryItem item = library.findItemById(itemId);
    // String result = member.returnItem(item, daysLate);
    // System.out.println(result);
    // library.getLogger().logActivity(item.getDescription() + " dikembalikan oleh "
    // + member.getName());
    // } catch (Exception e) {
    // System.out.println("Gagal mengembalikan item: " + e.getMessage());
    // }
    // }

    // private static void lihatPinjaman() {
    // System.out.print("ID Anggota: ");
    // int memberId = Integer.parseInt(scanner.nextLine());

    // try {
    // Member member = findMemberById(memberId);
    // List<LibraryItem> borrowedItems = member.getBorrowedItems();

    // if (borrowedItems.isEmpty()) {
    // System.out.println("Tidak ada item yang dipinjam.");
    // return;
    // }

    // System.out.println("+---------+--------------------+");
    // System.out.println("| ID Item | Judul |");
    // System.out.println("+---------+--------------------+");

    // for (LibraryItem item : borrowedItems) {
    // System.out.printf("| %-7d | %-18s |\n", item.getItemId(), item.getTitle());
    // }

    // System.out.println("+---------+--------------------+");
    // } catch (Exception e) {
    // System.out.println("Anggota tidak ditemukan.");
    // }
    // }

    // private static Member findMemberById(int memberId) {
    // return library.members.stream()
    // .filter(m -> m.getMemberId() == memberId)
    // .findFirst()
    // .orElseThrow(() -> new NoSuchElementException("Anggota tidak ditemukan."));
    // }
}
