import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

         /*
        Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        Formül
        Kilo (kg) / Boy(m) * Boy(m)
        Çıktısı
        Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
        Lütfen kilonuzu giriniz : 105
        Vücut Kitle İndeksiniz : 35.49215792320173
         */

        // Declare double variables
        double bmi, weight, height;

        // Create a new object
        Scanner input = new Scanner (System.in);

        // Prompt the user to input height
        System.out.print( " Enter your height : " );
        height = input.nextDouble();

        // Prompt the user to input weight
        System.out.print( " Enter your weight : " );
        weight = input.nextDouble();

        // Calculate body mass index
        bmi = weight / ( height * height);

        // Display the result
        System.out.print( " Your body mass index is " + bmi );

    }
}