import java.text.SimpleDateFormat;
import java.util.Date;

public class Conta {
    private int idConta;
    private String dataVencimento, dataPagamento;
    //referenciando Produto
    Produto pro;
    //referenciando Cliente
    Cliente cli;

    Date data = new Date();
    // Define o formato da data
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

    //getset idConta
    public int getIdConta(){
        return idConta;
    }
    public void setIdConta(int idConta){
        this.idConta = idConta;
    }

    //getset dataVencimento
    public String getDataVencimento(){
        return dataVencimento;
    }
    public void setDataVencimento(String dataVencimento){
        this.dataVencimento = (dataVencimento = formatador.format(data));
    }

    //getset dataPagamento
    public String getDataPagamento(){
        return dataPagamento;
    }
    public void setDataPagamento(String dataPagamento){
        this.dataPagamento = (dataPagamento = formatador.format(data));
    }

    //metodo para vizualizar contas
    public void visualizarConta(){
        System.out.println("CONTAS PAGAS");
        System.out.println("IDENTIFICADOR: " + this.idConta);
        System.out.println("PRODUTO: " + pro.getDescricaoProduto());
        System.out.println("CLIENTE: " + cli.getNomeCliente() + "    CPF: " + cli.getCpf());
        System.out.println("VALOR: " + pro.getValorProduto());
        System.out.println("DATA VENCIMENTO: " + this.dataVencimento);
        System.out.println("DATA PAGAMENTO: " + this.dataPagamento);
    }
}
