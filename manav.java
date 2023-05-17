import java.util.Scanner;
public class manav {
    
public static void main(String[] args) {
    double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.0;
    double toplamTutar=0;
    Scanner input=new Scanner(System.in);
    int kgArmut = 0, kgElma = 0, kgDomates = 0, kgMuz = 0, kgPatlican = 0;

    int select=0;
    do {
        System.out.print("Hoş Geldiniz. Şu anda 1-Armut=2.14, 2- Elma=3.67, 3-Domates=1.11, 4-Muz=0.95, 5-Patlıcan=5.0 TL ");
        System.out.println("Satın almak istediklerinizi girmek için sıra sayılarını çıkmak için 6 basınız");
        select=input.nextInt();
        switch (select) {
            case 1:
                System.out.print("Kaç kg Armut alacaksınız? :");
                kgArmut=input.nextInt();
                toplamTutar+=armut*kgArmut;                
                break;
            case 2:
                System.out.print("Kaç kg Elma alacaksınız? :");
                kgElma=input.nextInt();
                toplamTutar+=elma*kgElma;
                break;
            case 3:
                System.out.print("Kaç kg Domates alacaksınız? :");
                kgDomates=input.nextInt();
                toplamTutar+=domates*kgDomates;
                break;
            case 4:
                System.out.print("Kaç kg Muz alacaksınız? :");
                kgMuz=input.nextInt();
                toplamTutar+=muz*kgMuz;
                break;
            case 5:
                System.out.print("Kaç kg Patlıcan alacaksınız? :");
                kgPatlican=input.nextInt();
                toplamTutar+=patlican*kgPatlican;
                break;      
            default:
                break;
        }        
    } while (select!=6);
    System.out.printf("%.2f kg Armut, %.2f kg Elma, %.2f kg Domates, %.2f kg Muz, %.2f kg Patlıcan toplam olarak %.2f TL tutuyor.%n", 
    ((double)kgArmut), ((double)kgElma), ((double)kgDomates), ((double)kgMuz), ((double)kgPatlican), toplamTutar);
System.out.println("Toplam : " + toplamTutar + " TL");
input.close();
}
}