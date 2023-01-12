import java.util.Scanner;
public class KDVHesaplayanProgram {
    public static void main(String[] args) {

        /** @TayTayTay54 */

        Scanner input = new Scanner(System.in);
        float a, kdv1 = 0.18f, kdv2 = 0.08f;

        System.out.println("UYARI:KDV Oranı 0-1000 arası 18%,1000 üstü 8%'dir");
        System.out.print("Tutarınızı Giriniz:");
        a = input.nextFloat();

        System.out.println("Tutarınız: "+a);
        System.out.println(a <=1000 ? "KDV Oranı: 18%":"KDV Oranı: 8%");
        System.out.println(a <= 1000 ? "KDV Tutarı: "+(a*kdv1):"KDV Tutarı: "+(a*kdv2));
        System.out.print(a <= 1000 ? "KDV'si Eklenmiş Tutarınız: "+((a*kdv1)+a):"KDV'si Eklenmiş Tutarınız: "+((a*kdv2)+a));
    }
}
