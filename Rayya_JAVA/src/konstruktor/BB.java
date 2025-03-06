package Konstruktor;


public class BB extends AA {
    BB() { 
        // Pemanggilan konstruktor superclass dengan keyword super tidak
        // dilakukan sehingga Java akan menambahkan secara otomatis kode untuk
        // memanggil konstruktor default milik superclassnya disini.

        System.out.println("Konstruktor class B dieksekusi ...");
    }
}
