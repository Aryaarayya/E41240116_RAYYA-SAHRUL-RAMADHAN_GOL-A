
package konstruktor;

public class Cr extends Br {
    Cr() { 
        // super(); Tambahan kode secara otomatis oleh Java untuk memanggil
        // Konstruktor dari SuperClassnya

        super(); // Konstruktor default dari class B
        // Object dipanggil
        System.out.println("Konstruktor class C dieksekusi ...");
    }
}
