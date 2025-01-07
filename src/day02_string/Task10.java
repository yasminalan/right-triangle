package day02_string;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /*
            TASK :
         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name, surname and credit card number consisting of 16 digits");
        String userInfo = scanner.nextLine();

        String name = userInfo.split(" ")[0].toUpperCase();
        String surname = userInfo.split(" ")[1].toUpperCase();
        String creditCardNumber = userInfo.split(" ")[2];

        String encryptedName = name.charAt(0) + name.substring(1).replaceAll(".", "*");
        //Regex'teki . ifadesi, herhangi bir karakter anlamına gelir.

        String encryptedSurname = surname.charAt(0) + surname.substring(1).replaceAll(".", "*");

        String encryptedCardNumber;

        if (creditCardNumber.length() == 16) {
            encryptedCardNumber = creditCardNumber.substring(0, 12).replaceAll(".", "*") + creditCardNumber.substring(12, 16);
            System.out.println("Name: " + encryptedName + " Surname: " + encryptedSurname + " Credit card number: " + encryptedCardNumber);
        } else {
            System.out.println("Invalid credit card number. Please try again.");
        }
    }
}
