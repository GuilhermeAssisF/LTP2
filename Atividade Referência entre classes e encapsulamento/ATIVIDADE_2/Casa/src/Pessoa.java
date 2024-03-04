public class Pessoa {
    private int idade;
    private String nome;

    // getset nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // getset idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void fazAniversario() {
        this.idade += 1;
        System.out.println("A pessoa " + this.nome + " fez aniversario.\nAgora tem " + this.idade + " anos de idade.");
    }
}
