import java.util.Scanner;

public class Main {
    public static int cikarma(int a, int b) {
        return (a - b);
    }

    public static int cikarma(int a, int b, int c) {
        return (a - b - c);
    }

    public static int toplama(int a, int b) {
        return (a + b);
    }

    public static int toplama(int a, int b, int c) {
        return (a + b + c);
    }

    public static int carpma(int a, int b) {
        return (a * b);
    }

    public static int carpma(int a, int b, int c) {
        return (a * b * c);
    }

    public static int bolme(int a, int b) {
        return (a / b);
    }

    public static void main(String[] arg) {
        System.out.println("Hesap Makinesine Hoş Geldiniz");
        System.out.println("*****************************");
        String islemler = "1.Toplama\n" +
                "2.Çıkarma\n" +
                "3.Çarpma\n" +
                "4.Bölme\n"+
                "Çıkmak için q'ya basınız\n";
        System.out.print(islemler);
        System.out.println("*****************************");
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.print("İşlem Seçiniz:");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("İşlemden çıkılıyor...\nÇıktı");
                break;
            }
            else if (islem.equals("1")) {
                System.out.print("Kaç değerli işlem yapmak istiyorsun(2 veya 3):");
                int kacsayi= scanner.nextInt();
                if(kacsayi==2){
                    System.out.print("a:");
                    int a= scanner.nextInt();
                    System.out.print("b:");
                    int b=scanner.nextInt();
                    System.out.println("İslemin sonucu: "+toplama(a,b));
                }
                else if(kacsayi==3){
                    System.out.print("a:");
                    int a= scanner.nextInt();
                    System.out.print("b:");
                    int b=scanner.nextInt();
                    System.out.print("c:");
                    int c=scanner.nextInt();
                    System.out.println("İslemin sonucu: "+toplama(a,b,c));
                }
                else
                    System.out.println("Böyle bir değer bulunmuyor");

            }
            else if (islem.equals("2")) {
                System.out.print("Kaç değerli işlem yapmak istiyorsun(2 veya 3):");
                int kacsayi= scanner.nextInt();
                if(kacsayi==2){
                    System.out.print("a:");
                    int a= scanner.nextInt();
                    System.out.print("b:");
                    int b=scanner.nextInt();
                    System.out.println("İslemin sonucu: "+cikarma(a,b));
                }
                else if(kacsayi==3){
                    System.out.print("a:");
                    int a= scanner.nextInt();
                    System.out.print("b:");
                    int b=scanner.nextInt();
                    System.out.print("c:");
                    int c=scanner.nextInt();
                    System.out.println("İslemin sonucu: "+cikarma(a,b,c));
                }
                else
                    System.out.println("Böyle bir değer bulunmuyor");


            }
            else if (islem.equals("3")) {
                System.out.print("Kaç değerli işlem yapmak istiyorsun(2 veya 3):");
                int kacsayi= scanner.nextInt();
                if(kacsayi==2){
                    System.out.print("a:");
                    int a= scanner.nextInt();
                    System.out.print("b:");
                    int b=scanner.nextInt();
                    System.out.println("İslemin sonucu: "+carpma(a,b));
                }
                else if(kacsayi==3){
                    System.out.print("a:");
                    int a= scanner.nextInt();
                    System.out.print("b:");
                    int b=scanner.nextInt();
                    System.out.print("c:");
                    int c=scanner.nextInt();
                    System.out.println("İslemin sonucu: "+carpma(a,b,c));                }
                else
                    System.out.println("Böyle bir değer bulunmuyor");
            } else if (islem.equals("4")) {
                System.out.print("Sadece 2 değerli işlem yapabilirsiniz.\n" +
                        "2 rakamını yazınız ardından değerlerinizi giriniz->");
                int kacsayi= scanner.nextInt();
                if(kacsayi==2){
                    System.out.print("a:");
                    int a= scanner.nextInt();
                    System.out.print("b:");
                    int b=scanner.nextInt();
                    if (b==0){
                        System.out.print("Bir sayının 0 ile bölümü mantıklı bir sonuç vermez.\n" +
                                "Lütfen farklı bir değer giriniz\n" +
                                "b değişkeninin yeni değeri ->");
                        b= scanner.nextInt();}
                    System.out.println("İşlemin sonucu: "+ bolme(a,b));
                }
                else
                    System.out.println("Böyle bir değer bulunmuyor");


            }
            else
                System.out.println("1,2,3,4 veya q değerlerini giriniz.");

        }
    }

}
