package sampleQuestions;

import java.util.Scanner;

public class Q06 {
    /*
ATM
Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.

Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina
geri donsun.
Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
*/
    final static String kartNo="1234567890123456";
    static String sifre="1234";
    static Scanner scan=new Scanner(System.in);
    static double bakiye=20000;


    public static void main(String[] args){
        giris();
    }

    private static void giris() {
        System.out.println("KART NUMARANIZI GIRINIZ");
        String inputKartNo=scan.nextLine();
        scan.nextLine();
        System.out.println("LUTFEN SIFRENIZI GIRINIZ");
        String inputSifre=scan.next();
        scan.nextLine();
        inputKartNo=inputKartNo.replaceAll("\\s","");

        if (inputSifre.equals(sifre)&&inputKartNo.equals(kartNo)){
            menu();
        }else {
            System.out.println("YANLIS GIRIS YAPTINIZ");
            giris();
        }

    }
    //Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis
    private static void menu() {
        System.out.println("********** JAVABANKA HOSGELDINIZ ********** \n" +
                "Lutfen yapmak istediginiz islemi seciniz\n" +
                "\n" +
                "1. BAKIYE SORGULAMA\n" +
                "2. PARA YATIRMA\n" +
                "3. PARA CEKME\n" +
                "4. PARA GONDERME\n" +
                "5. SIFRE DEGISTIRME\n" +
                "6. CIKIS");
        int secim=scan.nextInt();
        switch (secim){
            case 1:{
                bakiyeSorgulama();
            }
            case 2:{
                paraYatirma();
            }
            case 3:{
                paraCekme();
            }
            case 4:{
                paraGonderme();
            }
            case 5:{
                sifreDegistirme();
            }
            case 6:{
                System.out.println("******HOSCAKALIN******");
                System.exit(0);
            }
        }

    }

    private static void sifreDegistirme() {
        System.out.println("Eski sifrenizi giriniz");
        String newSifre= scan.next();
        if (newSifre==sifre){
            System.out.println("Yeni sifre giriniz");
            sifre=scan.next();
            scan.nextLine();
            giris();
        }else {
            System.out.println("Dogru sifre giriniz");
            sifreDegistirme();
        }

    }

    private static void paraGonderme() {
        System.out.println("IBAN giriniz");
        String iban= scan.nextLine();
        scan.nextLine();
        System.out.println("Gondermek istediginiz miktari giriniz:");
        double miktar= scan.nextDouble();

        if (miktar<=bakiye){
            bakiye-=miktar;
            System.out.println(iban+" NOLU IBAN a "+miktar+" Gonderildi");
            bakiyeSorgulama();
        }else {
            System.out.println("Gecerli miktar giriniz");
            ibanKontrrol(iban);
        }

    }

    private static String ibanKontrrol(String iban) {
        iban=iban.replaceAll("\\s","");
        if (iban.startsWith("TR")&& iban.length()==26){

        }else {
            System.out.println("Gecerli iban giriniz");
            scan.nextLine();
            ibanKontrrol(scan.nextLine());
        }
        return iban;

    }

    private static void paraCekme() {
        System.out.println("Cekmek istediginiz miktari yaziniz :");
        double miktar= scan.nextDouble();
        if (miktar<=bakiye){
            bakiye-=miktar;
            System.out.println("Hesabinizdan "+miktar+" cektiniz.");
            bakiyeSorgulama();
        }else {
            System.out.println("Gecerli giris yapiniz");
            paraCekme();
        }

    }

    private static void paraYatirma() {
        System.out.println("Yatirmak istediginiz miktari giriniz :");
        double miktar= scan.nextDouble();
        bakiye+=miktar;
        System.out.println("Hesabiniza "+miktar+" para yatirdiniz.");
        bakiyeSorgulama();
    }

    private static void bakiyeSorgulama() {
        System.out.println("Mevcut Bakiyeniz : "+bakiye);
        menu();
    }

}
