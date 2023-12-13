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
        System.out.println("*****************************");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(islemler);
            System.out.print("İşlem Seçiniz:");
            System.out.println("*****************************");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("İşlemden çıkılıyor...\nÇıktı");
                break;
            } else if (islem.equals("1")) {
                System.out.print("Kaç haneli işlem yapmak istiyorsun(2 veya 3):");
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
                System.out.print("Kaç haneli işlem yapmak istiyorsun(2 veya 3):");
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
                System.out.print("Kaç haneli işlem yapmak istiyorsun(2 veya 3):");
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
                System.out.print("Kaç haneli işlem yapmak istiyorsun(Yalnızca 2):");
                int kacsayi= scanner.nextInt();
                if(kacsayi==2){
                    System.out.print("a:");
                    int a= scanner.nextInt();
                    System.out.print("b:");
                    int b=scanner.nextInt();
                    System.out.println("İşlemin sonucu: "+ bolme(a,b));
                }
                else
                    System.out.println("Böyle bir değer bulunmuyor");


            }

        }
    }

}
