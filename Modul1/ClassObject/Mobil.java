public class Mobil { 
    private String nopol; 
    private String warna; 
    private String merk; 
    private int kecepatan;
    private int jarakTempuh; 

 public void setNopol(String n) { 
        nopol = n; 
    }

public void setWarna(String s) { 
        warna = s; 
     } 

 public void setMerk(String m) { 
        merk = m; 
    } 

 public void setKecepatan(int k) { 
        kecepatan = k; 
    }
 
 public void setJarakTempuh(int j) {
        jarakTempuh = j;
    }

    public int hitungJarakTempuh(int waktu) {
    int jarak = kecepatan * waktu;
    return jarak;
}

    public void tampilKecepatanMS() {
    double kecepatanMS = kecepatan / 3.6;
    System.out.println("Kecepatan mobil dalam m/s: " + kecepatanMS);
}

    public void display() { 
        System.out.println("Mobil bermerk " + merk); 
        System.out.println("bernomor polisi " + nopol); 
        System.out.println("serta memililki warna " + warna); 
        System.out.println("bergerak dengan kecepatan " + kecepatan + " kpj");  
        System.out.println("Jarak tempuh mobil " + jarakTempuh + " km");
    } 
}

