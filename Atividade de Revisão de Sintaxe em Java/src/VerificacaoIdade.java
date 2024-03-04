import java.util.Scanner;

public class VerificacaoIdade {
    public static void main(String[] args) {
        System.out.println("******VERIFICACAO IDADE*****");
        System.out.println("Insira sua idade: ");
        Scanner obj = new Scanner(System.in);

        int idade = obj.nextInt();
        System.out.println("Idade: " + idade);

        if (idade >= 18) {
            System.out.println("\nMaior de idade");
        }

        else {
            System.out.println("Menor de Idade");
        }
    }
}
