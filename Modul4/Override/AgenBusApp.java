public class AgenBusApp {
    public static void main(String[] args) {
        Tiket t1 = new Tiket();
        t1.pesan();
        t1.tampil();

        TiketBus t2 = new TiketBus();
        t2.pesan();
        t2.tampil();

        TiketBus t3 = new TiketBus();
        t3.pesan("Kasino", "Bandung", 650, 450000);
        t3.tampil();

        TiketBus t4 = new TiketBus();
        t4.pesan("Dono");
        t4.tampil();

        t1.pesan("Indro", "Makassar");
        t1.tampil();
        t2.pesan("Dono", "Makassar");
        t2.tampil();

        TiketBus t5 = new TiketBus() {
            @Override
            public void tampil() {
                System.out.println("=== DETAIL TIKET BUS ===");
                System.out.println("Penumpang   : " + this.namaPenumpang);
                System.out.println("Tujuan     : " + this.tujuan);
                System.out.println("Harga   : Rp " + this.hargaTiket);
                System.out.println("========================");
            }
        };
        
        t5.pesan("Davina", "Malang", 300, 200000);
        t5.tampil();
    }
}