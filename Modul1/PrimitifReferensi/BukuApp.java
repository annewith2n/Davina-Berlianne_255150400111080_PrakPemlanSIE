public class BukuApp {
    public static void main(String[] args) {
        Penerbit gm = new Penerbit("Gramedia", "Jakarta");
        Penerbit sp = new Penerbit("Springer", "New York");

    Buku artikel = new Buku();
        artikel.judul = "Rahasia OOP";
        artikel.halaman = 10;
        artikel.author = "John D. Walker";
        artikel.penerbit = gm;

    Buku paper = new Buku();
        paper.judul = "Tips dan Trik Pemrograman Diet";
        paper.halaman = 240;
        paper.author = "Cydia Lapr";
        paper.penerbit = sp;
// ===
    artikel.display();
    paper.display();
// copy!
    artikel.author = paper.author;
    artikel.author = "Halu de Luna";
    artikel.display();
    paper.display();
// copy!
    artikel.penerbit = paper.penerbit;
    artikel.penerbit.nama = "UB Press";
    artikel.display();
    paper.display();
    }
}