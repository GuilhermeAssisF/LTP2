import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        System.out.println("****MEDIAS NOTAS****");
        Scanner obj = new Scanner(System.in);

        System.out.print("Insira o numero de alunos da turma: ");
        int num_alunos = obj.nextInt();

        int[] notas_alunos = new int[num_alunos];
        float soma = 0;
        
        for(int i = 0 ; i < num_alunos ; i++){
            System.out.print("Nota numero " + (i+1) + ": ");
            notas_alunos[i] = obj.nextInt();
            soma = soma + notas_alunos[i];
        }

        System.out.println("Media nota da turma: " + (soma/num_alunos));

    }
}
