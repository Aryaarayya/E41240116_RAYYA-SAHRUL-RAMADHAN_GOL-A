
package konstruktor;

public class Br extends Ar {
    Br() { 
        // super(); Tambahan kode secara otomatis oleh Java untuk memanggil
        // Konstruktor dari SuperClassnya

        super(); // Konstruktor default dari class A
        // Object dipanggil
        System.out.println("Konstruktor class B dieksekusi ...");
    }
}
