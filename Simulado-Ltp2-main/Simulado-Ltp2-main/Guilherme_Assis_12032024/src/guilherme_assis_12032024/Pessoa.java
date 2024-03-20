package guilherme_assis_12032024;

public class Pessoa {
    private static int id = 1;
    private int idPessoa;
    private String nomePessoa;
    private int cpf;


    public Pessoa(String nomePessoa, int cpf) {
        this.idPessoa = id;
        this.nomePessoa = nomePessoa;
        this.cpf = cpf;
        id++;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

}
