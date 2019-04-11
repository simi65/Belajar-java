import java.util.Scanner;

public class Temperatur {

    public static  void main(String[] args) {

        int suhu;
        System.out.println("Masukan suhu");
        Scanner temperatur = new Scanner(System.in);

        suhu = temperatur.nextInt();


        if (suhu == 30) {

            System.out.println("suhu" + suhu + "Celcius,normal");
        } else if (suhu < 30) {
            System.out.println("suhu" + suhu + "Celcius,dingin");
        } else if (suhu < 40) {
            System.out.println("suhu" + suhu + "Celcius,panas");
        } else {
            System.out.println("suhu" + suhu + "Celsius,terlalu dingin");
        }
    }
}
