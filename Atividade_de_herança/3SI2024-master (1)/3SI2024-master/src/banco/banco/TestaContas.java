package banco;

public class TestaContas {
    public static void main(String[] args) {
        Conta c = new ContaCorrente();
        ContaCorrente cc = new ContaCorrente();
        c.deposita(1000);
        cc.deposita(1000);
        //c.atualiza(0.10);
        cc.atualiza(0.10);
        //cp.atualiza(0.10);
        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        
    }
}
