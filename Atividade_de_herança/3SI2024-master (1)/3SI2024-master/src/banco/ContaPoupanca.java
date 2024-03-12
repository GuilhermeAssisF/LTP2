package banco;

public class ContaPoupanca extends Conta{
    public void atualiza(double taxa) {
        deposita(taxa);
    }
}
