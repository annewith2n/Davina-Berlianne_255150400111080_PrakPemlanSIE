package Konstruktor;

public class PenerbitApp {
    public static void main(String[] args) {
        Penerbit penerbit = new Penerbit();
            penerbit.display();

        Penerbit or = new Penerbit("O'Reilly");
            or.display();

        Penerbit gm = new Penerbit("Gramedia", "Jakarta");
            gm.display();
    }
}
