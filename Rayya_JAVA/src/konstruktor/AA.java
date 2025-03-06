
package konstruktor;

public class AA {
    AA(String param1) { 
        // Konstruktor untuk class A sudah didefinisikan sehingga
        // Java tidak membuat konstruktor default untuk class ini.

        super(); // Konstruktor default dari class
        // Object dipanggil
        System.out.println("Konstruktor class A dieksekusi ...");
    }
}
