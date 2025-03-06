
package pewarisan;

public class B extends A { // Mendeklarasikan Class B yang diturunkan dari Class A
    int z;

    void TampilkanJumlah() {
        // subclass dapat mengakses member dari superclass
        System.out.println("Jumlah : " + (x * y * z));
    }
}
