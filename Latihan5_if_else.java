import java.util.Scanner;

public class Latihan5_if_else {

    public static void main(String[] args) {

        int listrik= 1;

        int nyala = 1;

        int air =3;

        int habis= 2;

        int mati = 0;

        if (listrik == nyala){
            System.out.println("air nyala");

        }
        else {
            System.out.println("air mati");
        }
        if (air != habis) {
            System.out.println("air mati");
        }
        else {
            System.out.println("gak bisa mandi");
        }

        if (air > habis) {
            System.out.println("air nyala");
        }
        else {
            System.out.println(" bisa mandi");
        }

        if (air >= habis) {
            System.out.println("air habis");
        }
        else {
            System.out.println("gak bisa mandi");
        }

        if (air <= habis) {
            System.out.println("air mati");
        }
        else {
            System.out.println("gak bisa mandi");
        }


        Scanner nilai = new Scanner(System.in);

        String point = nilai.nextLine();
    }
}
