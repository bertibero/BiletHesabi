import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yas,biletTuru;
        double km, Tutar;

        boolean level = false;


        System.out.print("Lütfen mesafeyi giriniz. :");
        km = input.nextDouble();
        System.out.print("Lütfen yaşınızı giriniz. :");
        yas = input.nextInt();
        System.out.print("Lütfen bilet türünü seçiniz. TekYön => 1 -- GidisDönüs için => 2 :");
        biletTuru = input.nextInt();

        Tutar = km * (0.1);

        if(0<yas && yas<12) {
            Tutar = Tutar * (0.5);
        }
        else if (12<= yas && yas<=24){
            Tutar = Tutar * (0.9);
        }
        else if (yas > 65){
            Tutar = Tutar * (0.7);
        }
        else {
            level = true;
        }

        if (biletTuru == 1) {
            Tutar = Tutar;
        }else if (biletTuru == 2) {
            Tutar = Tutar * (0.8);
        }else {
            level = true;
        }
        if (!level) {
            System.out.println("Toplam tutar : " + Tutar + "TL");
        }else {
            System.out.println("Yanlış değer girdiniz.");
        }

    }
}