package banco;

class ContaCorrente{
    private int numero;  // atributos ou variáveis de instância
    protected double saldo;
    private double limite;
    private static  int totalDeContas;
    Cliente objCliente = new Cliente();
    private Object identificador;

    ContaCorrente() {
        Conta.totalDeContas = Conta.totalDeContas + 1;
        identificador = Conta.totalDeContas;
        System.out.println("Construindo uma conta!");
    }

    
    void Conta(double saldo) {
        this(); // chama o contrutor padrão
        this.saldo = saldo;
    }

    void Conta(double saldo, double limite, int numero) {
        this(saldo); // executa o construtor acima
        this.limite = limite;
        this.numero = numero;
    }
    
     public int getIdentificador() {
        return (int) identificador;
    }

    public static int getTotalDeContas() {
        return (int) Conta.totalDeContas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public double getSaldo() {
        return saldo + limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean saca(double quantidade) { //método
        if (this.getSaldo() >= quantidade) {
            this.saldo = this.saldo - quantidade;
            System.out.println("Saque realizado com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente: " + this.getSaldo());
            return false;
        }
    }


    public void transfere(Conta destino, double quantidade) {
        if (this.saca(quantidade)) {
            destino.deposita(quantidade);
        } else {
            System.out.println("Transferência não realizada!");
        }

    }

    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }

    void atualiza(double selic) {
        deposita(this.getSaldo() * (selic * 2));
    }
    
    void deposita(double quantidade) {
        this.saldo = (this.saldo + quantidade);
    }
}
