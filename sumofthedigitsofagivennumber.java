import java.util.Scanner;

public class basamakrakamlarinitoplama {
    public static void main(String[] args) {
      Scanner scan= new Scanner(System.in); 

     System.out.println("Lutfen bir sayi giriniz:");

     int sayi = scan.nextInt();

   int basamak=0;
    int toplam=0;
   do{
    
    basamak = sayi % 10;
   System.out.println(basamak);
      sayi = sayi/10;
      toplam+=basamak;
   } while(sayi>0);

 System.out.println("Toplam = " +toplam);



    }
}
