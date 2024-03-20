package banco;

public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;

    AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c){
        System.out.println("Cliente: " );
        System.out.println("Saldo anterior: " + c.getSaldo());
        saldoTotal = ((c.getSaldo())*selic)+c.getSaldo();
        System.out.println("Saldo final: " + saldoTotal);

    }

    /**
     * @return double return the saldoTotal
     */
    public double getSaldoTotal() {
        return saldoTotal;
    }

    /**
     * @param saldoTotal the saldoTotal to set
     */
    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    /**
     * @return double return the selic
     */
    public double getSelic() {
        return selic;
    }

    /**
     * @param selic the selic to set
     */
    public void setSelic(double selic) {
        this.selic = selic;
    }

}
