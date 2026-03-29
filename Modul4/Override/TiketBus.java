public class TiketBus extends Tiket {
    @Override
    public void pesan() {
        this.tujuan = "Bandung";
    }
    @Override
    public void pesan(String n, String t) {
        if (t.equals("Makassar")) {
            this.tujuan = "Makassar";
            System.out.println("Maaf " + n + ", tiket tidak dapat dipesan.");
        }
    }
    @Override
    public void tampil() {
        if (!this.tujuan.equals("Makassar")) {
            super.tampil();
        } else {
            System.out.println("Tiket tujuan Makassar tidak tersedia.");
            System.out.println("--------------------");
        }
    }  
    public void pesan(String n) {
        this.namaPenumpang = n;
    } 
}