package banco;

public class TestaAtualizadorDeContas {
    public static void main(String[] args) {
        Conta c = new ContaCorrente();
        Conta cc = new ContaCorrente();
        c.deposita(1000);
        cc.deposita(1000);
        AtualizadorDeContas adc = new AtualizadorDeContas(0.20);
        adc.roda(c);
        adc.roda(cc);

    }
}
