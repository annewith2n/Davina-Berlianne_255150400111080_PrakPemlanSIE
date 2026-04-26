import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Antrian {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Menu Antrian Pelanggan:");
            System.out.println("1. Tambah Pelanggan");
            System.out.println("2. Layani Pelanggan");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih (1-4): ");
            try {
                int choice = sc.nextInt();
                sc.nextLine(); // consume newline
                switch (choice) {
                    case 1:
                        System.out.print("Masukan Nama Pelanggan: ");
                        String name = sc.nextLine();

                        if (name.equalsIgnoreCase("Budi")) {
                            ((LinkedList<String>) queue).addFirst(name); 
                        } else {
                        queue.add(name);
                        }
                        System.out.println(name + " ditambahkan ke antrian.");
                        break;
                    case 2:
                        if (queue.isEmpty())
                            System.out.println("Tidak ada antrian.");
                        else {
                            String nama = queue.peek();
                            System.out.println("Pelanggan di depan : " + nama);
                        }
                        break;
                    case 3:
                            System.out.println("Antrian Saat Ini: " + queue);
                            break;
                    case 4:
                            System.out.println("Keluar.");
                            sc.close();
                            return;
                        default:
                            throw new Exception("Invalid input.");
                    }
                } catch(Exception e) {
                    System.out.println("Invalid input.");
                    sc.next(); // consume newline
                }
            }
        }
}