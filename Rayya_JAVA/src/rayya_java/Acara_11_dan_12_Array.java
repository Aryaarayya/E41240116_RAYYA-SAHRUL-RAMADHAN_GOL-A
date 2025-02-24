
package rayya_java;
import java.util.Scanner;
public class Acara_11_dan_12_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jumlah_deret;
        System.out.print("Masukkan jumlah deret Array : ");
        jumlah_deret = input.nextInt();
        int[] array = new int[jumlah_deret];
            for (int i = 0; i < jumlah_deret; i++) {
            array[i] = (int) (Math.random() * 100); 
 }
        System.out.print("Hasil nilai Array secara acak : ");
            for (int angka : array) {
        System.out.print(angka + " ");
 }
        System.out.println("");
    }
}
    /*public static void main(String[] args) {
        String[] nama = {"Rayya","Sahrul","Ramadhan"};
    
    for (int i = 0; i < nama.length ;i++){
            System.out.print(nama[i]+ " ");
    }
    }*/

