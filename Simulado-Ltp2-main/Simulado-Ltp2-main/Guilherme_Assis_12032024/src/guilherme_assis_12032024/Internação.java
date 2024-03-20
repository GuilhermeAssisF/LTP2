package guilherme_assis_12032024;

public class Internação {
    private static int id = 1;
    private int idInternacao;
    private String motivoInternacao;
    private int diasInternacao;
    private double valorDia;

    Medico objMedico;
    Paciente objPaciente;
    Enfermeiro objEnfermeiro;

    public Internação(String motivoInternacao, int diasInternacao, double valorDia, Medico objMedico,
            Paciente objPaciente, Enfermeiro objEnfermeiro) {
        this.idInternacao = id;
        this.motivoInternacao = motivoInternacao;
        this.diasInternacao = diasInternacao;
        this.valorDia = valorDia;
        this.objMedico = objMedico;
        this.objPaciente = objPaciente;
        this.objEnfermeiro = objEnfermeiro;
        id++;
        objPaciente.setValorTotaisInternacao(valorTotalInternacao());
    }

    public String getMotivoInternacao() {
        return motivoInternacao;
    }

    public void setMotivoInternacao(String motivoInternacao) {
        this.motivoInternacao = motivoInternacao;
    }

    public int getDiasInternacao() {
        return diasInternacao;
    }

    public void setDiasInternacao(int diasInternacao) {
        this.diasInternacao = diasInternacao;
    }

    public double getValorInternacao() {
        return valorDia;
    }

    public void setValorInternacao(int valorInternacao) {
        this.valorDia = valorInternacao;
    }

    public int getIdInternacao() {
        return idInternacao;
    }

    public void setIdInternacao(int idInternacao) {
        this.idInternacao = idInternacao;
    }

    public double valorTotalInternacao() {
        return valorDia * diasInternacao;
    }

    
    public void exibeInternacao(){
        System.out.println("-----DADOS INTERNAÇÃO-----\n"
                + "\nDias de Interção: " + getDiasInternacao()
                + "\nValor total de internação: " + + valorTotalInternacao()
                + "\nMotivo " + getMotivoInternacao()
                + "\n\nPACIENTE"
                + "\nNome: " + objPaciente.getNomePessoa()
                + "\nCPF: " + objPaciente.getCpf()
                + "\nID: " + objPaciente.getId()
                + "\n\nMÉDICO"
                + "\nNome: " + objMedico.getNomePessoa()
                + "\nEspecialidade: " + objMedico.getEspecialidadeMedico()
                + "\n\nENFERMEIRO"
                + "\nNome: " + objEnfermeiro.getNomePessoa());
                
    }

}
