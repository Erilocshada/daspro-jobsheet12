
import java.util.Scanner;

public class Percobaan2 {
    static String deret = "";
    static int hitungPangkat (int x, int y) {
        if (y == 0) {
            deret += "1";
            return (1);
        }else{
            deret += x + "x";
            return (x*hitungPangkat(x, y-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bilangan dihitung :");
        int bilangan = sc.nextInt();
        System.out.println("Pangkat: ");
        int pangakt = sc.nextInt();
        System.out.println(hitungPangkat(bilangan, pangakt));

        deret = "";
        int hasil = hitungPangkat(bilangan, pangakt);
        System.out.println(deret +"="+hasil);
    }
}