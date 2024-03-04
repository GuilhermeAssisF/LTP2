import java.util.Scanner;

public class TabuadaInterativa {
    public static void main(String[] args) {
        System.out.println("****TABUADA INTERATIVA****");
        System.out.print("Insira um numero: ");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();

        int i = 0;
        int resultado = 0;
        while (i < 10) {
            i += 1;
            resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado + "\n");
        }

    }
}
