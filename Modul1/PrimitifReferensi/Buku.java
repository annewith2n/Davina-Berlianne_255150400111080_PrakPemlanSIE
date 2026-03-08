public class Buku {

    public String judul;
    public int halaman;
    public String author;
    public Penerbit penerbit;

        public void display() {
            System.out.println("Buku " + judul);
            System.out.println("Halaman: " + halaman);
            System.out.println("Author : " + author);
            penerbit.display();
            System.out.println("------------------");
    }
}
