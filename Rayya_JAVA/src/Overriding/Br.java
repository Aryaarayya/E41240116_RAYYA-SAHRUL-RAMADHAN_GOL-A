
package Overriding;

public class Br extends Ar {
    public void tampilkanKeLayar() {
        super.tampilkanKeLayar(); // Memanggil method milik dari superclassnya.
        System.out.println("Method milik class B dipanggil");
    }
}
