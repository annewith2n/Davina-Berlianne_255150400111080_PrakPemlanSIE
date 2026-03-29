public class AgenApp {
    public static void main(String[] args) {
        Tiket t1 = new Tiket();
        t1.pesan();
        t1.tampil();

        Tiket t2 = new Tiket();
        t2.pesan("Ani", "Bandung");
        t2.tampil();

        Tiket t3 = new Tiket();
        t3.pesan("Cici", "Surabaya", 200, 100000);
        t3.tampil();

        Tiket t4 = new Tiket();
        t4.pesan("Dono", 60);
        t4.tampil();
    }
}