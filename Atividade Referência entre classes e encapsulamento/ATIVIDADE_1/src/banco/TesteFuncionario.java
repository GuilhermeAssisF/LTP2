package banco;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.setNome("Guilherme");
        f1.setSalario(2000);
        f1.bonifica(500);
        f1.demite(false);

        System.out.println("Cliente: " + f1.getNome());
        System.out.println("Salario: " + f1.getSalario());

        f1.mostra();
    }
}
