import java.util.Scanner;

public class Switch_case {

    public static void main (String[] args) {
        System.out.println("masukan suhu");
        int suhu;
        Scanner scan = new Scanner(System.in);
        suhu= scan.nextInt();


        switch (suhu){
            case 20:
                System.out.println("dingin");
                break;

            case 31:
                System.out.println("normal");
                break;

            case 32:
                System.out.println("panas");
                break;

            case 30:
                System.out.println("hangat");
                break;
            default:
                System.out.println("suhu tidak terdeteksi");
        }

    }
}
