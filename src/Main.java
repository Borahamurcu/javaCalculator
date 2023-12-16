import java.util.Scanner;

public class Main {
    public static double cikarma(double a, double b) {
        return (a - b);
    }

    public static double cikarma(double a, double b, double c) {
        return (a - b - c);
    }

    public static double toplama(double a, double b) {
        return (a + b);
    }

    public static double toplama(double a, double b, double c) {
        return (a + b + c);
    }

    public static double carpma(double a, double b) {
        return (a * b);
    }

    public static double carpma(double a, double b, double c) {
        return (a * b * c);
    }

    public static double bolme(double a, double b) {
        return (a / b);
    }

    public static void main(String[] arg) {
        System.out.println("Hesap Makinesine Hoş Geldiniz");
        System.out.println("*****************************");
        String islemler = "1.Toplama\n" +
                "2.Çıkarma\n" +
                "3.Çarpma\n" +
                "4.Bölme\n" +
                "Çıkmak için q'ya basınız\n";
        System.out.print(islemler);
        System.out.println("*****************************");
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.print("İşlem Seçiniz:");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("İşlemden çıkılıyor...\nÇıktı");
                break;
            } else if (islem.equals("1")) {
                System.out.print("Kaç değerli işlem yapmak istiyorsun(2 veya 3):");
                int kacsayi = scanner.nextInt();
                if (kacsayi == 2) {
                    System.out.println("Değerleriniz -1000000000 ile 1000000000 arasında olmalıdır!");
                    System.out.print("a:");
                    double a = scanner.nextDouble();
                    if (a <= -1000000000 && a >= 1000000000) {
                        System.out.println("APTAL MISIN KARDEŞİM");
                        System.out.print("Hadi adam akıllı değer gir\na->");
                        a = scanner.nextInt();
                    }
                    System.out.print("b:");
                    double b = scanner.nextDouble();
                    if (b <= -1000000000 && b >= 1000000000) {
                        System.out.println("APTAL MISIN KARDEŞİM");
                        System.out.print("Hadi adam akıllı değer gir\nb->");
                        b = scanner.nextDouble();
                    }
                    System.out.println("İslemin sonucu: " + toplama(a, b));
                } else if (kacsayi == 3) {
                    System.out.println("Değerleriniz -1000000000 ile 1000000000 arasında olmalıdır!");
                    System.out.print("a:");
                    double a = scanner.nextDouble();
                    if (a <= -1000000000 && a >= 1000000000) {
                        System.out.println("APTAL MISIN KARDEŞİM");
                        System.out.print("Hadi adam akıllı değer gir\na->");
                        a = scanner.nextDouble();
                    }
                    System.out.print("b:");
                    double b = scanner.nextDouble();
                    if (b <= -1000000000 && b >= 1000000000) {
                        System.out.println("APTAL MISIN KARDEŞİM");
                        System.out.print("Hadi adam akıllı değer gir\nb->");
                        b = scanner.nextDouble();
                    }
                    System.out.print("c:");
                    double c = scanner.nextDouble();
                    if (c <= -1000000000 && c >= 1000000000) {
                        System.out.println("APTAL MISIN KARDEŞİM");
                        System.out.print("Hadi adam akıllı değer gir\nc->");
                        c = scanner.nextDouble();
                    }
                    System.out.println("İslemin sonucu: " + toplama(a, b, c));
                } else
                    System.out.println("Böyle bir değer bulunmuyor");

            } else if (islem.equals("2")) {
                System.out.print("Kaç değerli işlem yapmak istiyorsun(2 veya 3):");
                int kacsayi = scanner.nextInt();
                if (kacsayi == 2) {
                    System.out.println("Değerleriniz -1000000000 ile 1000000000 arasında olmalıdır!");
                    System.out.print("a:");
                    double a = scanner.nextDouble();
                    if (a <= -1000000000 && a >= 1000000000) {
                        System.out.println("APTAL MISIN KARDEŞİM");
                        System.out.print("Hadi adam akıllı değer gir\na->");
                        a = scanner.nextDouble();
                    }
                    System.out.print("b:");
                    double b = scanner.nextDouble();
                    if (b <= -1000000000 && b >= 1000000000) {
                        System.out.println("APTAL MISIN KARDEŞİM");
                        System.out.print("Hadi adam akıllı değer gir\nb->");
                        b = scanner.nextDouble();
                    }
                    System.out.println("İslemin sonucu: " + cikarma(a, b));
                } else if (kacsayi == 3) {
                    System.out.println("Değerleriniz -1000000000 ile 1000000000 arasında olmalıdır!");
                    System.out.print("a:");
                    double a = scanner.nextDouble();
                    if (a <= -1000000000 && a >= 1000000000) {
                        System.out.println("APTAL MISIN KARDEŞİM");
                        System.out.print("Hadi adam akıllı değer gir\na->");
                        a = scanner.nextDouble();
                    }
                    System.out.print("b:");
                    double b = scanner.nextDouble();
                    if (b <= -1000000000 && b >= 1000000000) {
                        System.out.println("APTAL MISIN KARDEŞİM");
                        System.out.print("Hadi adam akıllı değer gir\nb->");
                        b = scanner.nextInt();
                    }
                    System.out.print("c:");
                    double c = scanner.nextDouble();
                    if (c <= -1000000000 && c >= 1000000000) {
                        System.out.println("APTAL MISIN KARDEŞİM");
                        System.out.print("Hadi adam akıllı değer gir\nc->");
                        c = scanner.nextInt();
                    }
                    System.out.println("İslemin sonucu: " + cikarma(a, b, c));
                } else
                    System.out.println("Böyle bir değer bulunmuyor");


            } else if (islem.equals("3")) {
                System.out.print("Kaç değerli işlem yapmak istiyorsun(2 veya 3):");
                int kacsayi = scanner.nextInt();
                if (kacsayi == 2) {
                    System.out.println("Değerleriniz -1000000000 ile 1000000000 arasında olmalıdır!");
                    System.out.print("a:");
                    double a = scanner.nextDouble();
                    if (a <= -1000000000 && a >= 1000000000) {
                        System.out.println("APTAL MISIN KARDEŞİM");
                        System.out.print("Hadi adam akıllı değer gir\na->");
                        a = scanner.nextInt();
                    }
                    System.out.print("b:");
                    double b = scanner.nextDouble();
                    if (b <= -1000000000 && b >= 1000000000) {
                        System.out.println("APTAL MISIN KARDEŞİM");
                        System.out.print("Hadi adam akıllı değer gir\nb->");
                        b = scanner.nextInt();
                    }
                    System.out.println("İslemin sonucu: " + carpma(a, b));
                } else if (kacsayi == 3) {
                    System.out.println("Değerleriniz -1000000000 ile 1000000000 arasında olmalıdır!");
                    System.out.print("a:");
                    double a = scanner.nextDouble();
                    if (a <= -1000000000 && a >= 1000000000) {
                        System.out.println("APTAL MISIN KARDEŞİM");
                        System.out.print("Hadi adam akıllı değer gir\na->");
                        a = scanner.nextDouble();
                    }
                    System.out.print("b:");
                    double b = scanner.nextDouble();
                    if (b <= -1000000000 || b >= 1000000000) {
                        System.out.println("APTAL MISIN KARDEŞİM");
                        System.out.print("Hadi adam akıllı değer gir\nb->");
                        b = scanner.nextDouble();
                    }
                    System.out.print("c:");
                    double c = scanner.nextDouble();
                    if (c <= -1000000000 || c >= 1000000000) {
                        System.out.println("APTAL MISIN KARDEŞİM");
                        System.out.print("Hadi adam akıllı değer gir\nc->");
                        c = scanner.nextDouble();
                    }
                    System.out.println("İslemin sonucu: " + carpma(a, b, c));
                } else
                    System.out.println("Böyle bir değer bulunmuyor");
            } else if (islem.equals("4")) {
                System.out.print("Sadece 2 değerli işlem yapabilirsiniz.\n" +
                        "2 rakamını yazınız ardından değerlerinizi giriniz->");
                int kacsayi = scanner.nextInt();
                if (kacsayi == 2) {
                    System.out.println("Değerleriniz -1000000000 ile 1000000000 arasında olmalıdır!");
                    System.out.print("a:");
                    double a = scanner.nextDouble();
                    if (a <= -1000000000 || a >= 1000000000) {
                        System.out.println("APTAL MISIN KARDEŞİM");
                        System.out.print("Hadi adam akıllı değer gir\n" +
                                "a->");
                        a = scanner.nextDouble();
                    }

                System.out.print("b:");
                    double b = scanner.nextDouble();
                if (b == 0 || b <= -1000000000 || b >= 1000000000) {
                    System.out.print("Bir sayının 0 ile bölümü mantıklı bir sonuç vermez.\n" +
                            "Lütfen farklı bir değer giriniz\n" +
                            "b değişkeninin yeni değeri ->");
                    b = scanner.nextDouble();
                }
                else
                    System.out.println("İşlemin sonucu: " + bolme(a, b));
            }
            else System.out.println("Böyle bir değer bulunmuyor");}





        }

    }

}


