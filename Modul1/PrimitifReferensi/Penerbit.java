public class Penerbit {

    String nama;
    String kota = "Malang";

        Penerbit() {
            this.nama = "Springer";
    }

        Penerbit(String nama) {
            this.nama = nama;
    }

        Penerbit(String nama, String kota) {
            this.nama = nama;
            this.kota = kota;
    }

    public void display() {
        System.out.println("Penerbit " + nama);
        System.out.println("di Kota " + kota);
    }
}