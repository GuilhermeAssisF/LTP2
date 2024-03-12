package banco;

public class ContaCorrente extends Conta{
    public void atualiza(double taxa) {
        deposita(taxa);
    }
    
}
