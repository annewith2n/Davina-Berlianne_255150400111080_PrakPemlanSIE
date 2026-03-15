public class Lingkaran {
    public static float PI = 3.14f;
    public float r;
    
    public Lingkaran(float r) {
        this.r = r;
    }

    public float keliling() {
        return 2 * Lingkaran.PI * r;
    }

    public float luas() {
        return Lingkaran.PI * r * r;
    }
}