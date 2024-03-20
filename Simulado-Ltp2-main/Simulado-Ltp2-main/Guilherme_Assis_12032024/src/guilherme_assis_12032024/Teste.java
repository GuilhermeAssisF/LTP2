
package guilherme_assis_12032024;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Scanner Paciente
        System.out.println("Digite o nome do paciente: ");
        String nomePac1 = scan.next();
        System.out.println("Digite o cpf do paciente: ");
        int cpfPac1 = scan.nextInt();
        Paciente paciente1 = new Paciente(nomePac1, cpfPac1);

        //Scanner Medico
        System.out.println("Digite o nome do médico: ");
        String nomeMed1 = scan.next();
        System.out.println("Digite o cpf do Médico: ");
        int cpfMed1 = scan.nextInt();
        System.out.println("DIgite a especializaçãodo Médico: ");
        String espMed1 = scan.next();
        Medico medico1 = new Medico(nomeMed1, cpfMed1, espMed1);

        //Scanner Enfermemiro
        System.out.println("DIgite o nome do enfermeiro: ");
        String nomeEnf1 = scan.next();
        System.out.println("Digite o cpf do enfermeiro: ");
        int cpfEnf1 = scan.nextInt();
        Enfermeiro enfermeiro1 = new Enfermeiro(nomeEnf1, cpfEnf1);

        //Scanner Internação
        System.out.println("Digite o motivo da internação: ");
        String motInt1 = scan.next();
        System.out.println("Digite a quantidade de dias internado: ");
        int diasInt1 = scan.nextInt();
        System.out.println("Digite o valor da diaria da internação: ");
        double valorInt1 = scan.nextDouble();
        Internação internacao1 = new Internação(motInt1, diasInt1, valorInt1, medico1, paciente1, enfermeiro1);

        internacao1.exibeInternacao();
    
    }
    

     

}
