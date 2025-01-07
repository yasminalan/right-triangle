package day01;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*  TASK :
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.

        Bu bir dik üçgendir
 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the length of the first side of the triangle: ");
        int side1 = scanner.nextInt();

        System.out.print("Please enter the length of the second side of the triangle: ");
        int side2 = scanner.nextInt();

        System.out.print("Please enter the length of the third side of the triangle: ");
        int side3 = scanner.nextInt();

        boolean isRightTriangle = Math.pow(side3, 2) == Math.pow(side1, 2) + Math.pow(side2, 2);
        //her kenar icin ayri yapilabilir.

        if (isRightTriangle) {
            System.out.println("This is a right triangle..");
        } else {
            System.out.println("This is not a right triangle.");
        }
    }
}
