
package rayya_java;

public class Acara_9_dan_10_Control_Statement {
    
        
    public static void main(String[] args) {
        System.out.println("           Do_While");
        int i = 1;
        System.out.println("Bilangan berkelipatan 2 (0-100) = ");
        do {
            System.out.println(i);
            i*=2;
        } while (i <= 100);
    }
}
/*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("batas angka awal : ");
        int angka_awal = scanner.nextInt();
        
        System.out.print("batas angka akhir : ");
        int angka_akhir = scanner.nextInt();
        
        System.out.println("bilangan genap dari " + angka_awal + " hingga " + angka_akhir + ":");
        if (angka_awal % 2 != 0) {
            angka_awal += 1;
        }
        for (int i = angka_awal; i <= angka_akhir; i += 2) {
            System.out.print(i + " ");
        }
    }

}

