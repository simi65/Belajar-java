import java.util.Scanner;

public class Temperatur5 {

    public  static  void main(String[] args) {

        int suhu;
        System.out.println("Masukan suhu");
        Scanner temperatur = new Scanner(System.in);

        suhu = temperatur.nextInt();


        if (suhu == 29) {

            System.out.println("suhu" + suhu + "Celcius,normal");
        } else if (suhu < 31) {
            System.out.println("suhu" + suhu + "Celcius,dingin");
        } else if (suhu < 20) {
            System.out.println("suhu" + suhu + "Celcius,hangat");
        } else if (suhu < 32 ){
            System.out.println("suhu" + suhu + "Celsius,panas");
        }
        else if (suhu <= 100 ){
            System.out.println("suhu" + suhu + "Celsius,panas");
        }
        else  {
            System.out.println("suhu" + suhu + "Celsius,tidak terdeteksi");
        }
    }
}
