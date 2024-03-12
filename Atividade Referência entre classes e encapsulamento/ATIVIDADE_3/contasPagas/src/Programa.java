public class Programa {
    public static void main(String[] args) throws Exception {
        //produto
        Produto pdt1 = new Produto();
        Produto pdt2 = new Produto();

        //notebook
        pdt1.setDescricaoProduto("Notebook core i7");
        pdt1.setValorProduto(1600.89);
        //tv
        pdt2.setDescricaoProduto("TV LED 42");
        pdt2.setValorProduto(2545.99);

        //cliente
        Cliente cli1 = new Cliente();
        Cliente cli2 = new Cliente();

        //cliente tulio
        cli1.setNomeCliente("Tulio");
        cli1.setCpf(03461306622);
        //cliente daniela
        cli2.setNomeCliente("Daniela");
        cli2.setCpf(2048823498);

        //conta
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        //conta tulio
        conta1.setDataPagamento("03072011");
        conta1.setDataVencimento("05072011");
        conta1.setIdConta(1);
        //conta daniela
        conta2.setDataPagamento("01072011");
        conta2.setDataVencimento("30072011");
        conta2.setIdConta(2)



        conta1.visualizarConta();
        conta2.visualizarConta();
    }
}
