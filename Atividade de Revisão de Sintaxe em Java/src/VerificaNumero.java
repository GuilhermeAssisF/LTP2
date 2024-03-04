import java.util.Scanner;

public class VerificaNumero {
    public static void main(String[] args) {
        System.out.println("****VERIFICA NUMEROS****");
        System.out.println("Insira 3 numeros inteiros como entrada: ");

        Scanner obj = new Scanner(System.in);
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int num3 = obj.nextInt();

        System.out.println("Numeros inseridos: " + num1 + ", " + num2 + ", " + num3);

        int maior = num1;
        if (num2 > maior && num2 > num3) {
            maior = num2;
        } else if (num3 > maior && num2 < num3) {
            maior = num3;
        }

        System.out.println("Maior numero: " + maior + "\n");

        // Verificação primeiro numero
        if (num1 > 0) {
            System.out.println(num1 + " é positivo");
        }

        else if (num1 == 0) {
            System.out.println(num1 + " é igual a zero");
        }

        else {
            System.out.println(num1 + " é negativo");
        }

        // Verificacao segundo numero
        if (num2 > 0) {
            System.out.println(num2 + " é positivo");
        }

        else if (num2 == 0) {
            System.out.println(num2 + " é igual a zero");
        }

        else {
            System.out.println(num2 + " é negativo");
        }

        // Verificacao terceiro numero
        if (num3 > 0) {
            System.out.println(num3 + " é positivo");
        }

        else if (num3 == 0) {
            System.out.println(num3 + " é igual a zero");
        }

        else {
            System.out.println(num3 + " é negativo");
        }
    }
}
