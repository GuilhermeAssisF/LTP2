package guilherme_assis_12032024;

public class Paciente extends Pessoa
{
    private double valorTotaisInternacao;
    
    public Paciente(String nomePessoa, int cpf) {
        super(nomePessoa, cpf);
        this.valorTotaisInternacao = 0;
    }

    public double getValorTotaisInternacao() {
        return valorTotaisInternacao;
    }

    public void setValorTotaisInternacao(double valorTotaisInternacao) {
        this.valorTotaisInternacao += valorTotaisInternacao;
    }

}
