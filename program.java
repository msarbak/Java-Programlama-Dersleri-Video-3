package yt.video3;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ulke  adi giriniz:");
        String ulke = in.next();
        
        switch(ulke){
            case "Turkiye" : System.out.println("tur");
            break;
            case "Azerbeycan" : System.out.println("azr");
            break;

            default:
            System.out.println("yanlis veri");
            break;
        }
    Scanner in2 = new Scanner(System.in);
    System.out.println("sayi");
    int sayi = in2.nextInt();
    
    //String sonuc = sayi % 2 == 0 ? "cift" : "tek";
    String sonuc;
    if(sayi % 2 == 0) {
        sonuc = "cift";
    }
    else {
        sonuc = "tek";
    }
    
    System.out.println("sayi");
    System.out.println(sonuc);
    }

}
