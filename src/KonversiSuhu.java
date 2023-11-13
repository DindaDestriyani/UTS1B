import java.util.Scanner;

public class KonversiSuhu {

        public static void main(String args[]){

            Scanner input = new Scanner(System.in);

            System.out.println("## Program Java Konversi Suhu ##");
            System.out.println("================================");

            double celc, fahr, kelv, ream;

            System.out.println("Masukan nilai suhu Celcius: ");
            celc = input.nextDouble();
            System.out.println("================================");

            fahr = (9.0/5.0 * celc) + 32;
            kelv = celc + 273.15;
            ream = celc * (4.0/5.0);

            System.out.println(celc+" derajat Celcius = " +fahr+" derajat Fahrenheit");
            if(fahr%5==0);
            {
                System.out.println("Fahrenheit kelipatan 5");
            }

        }
    }

