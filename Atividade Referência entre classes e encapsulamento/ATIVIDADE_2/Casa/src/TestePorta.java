public class TestePorta {
    public static void main(String[] args) {
        //porta 1
        Porta porta1 = new Porta();

        porta1.setCor("Branco");
        porta1.setDimensoes(10, 40, 3);
        porta1.abre();
        
        //porta 2
        Porta porta2 = new Porta();

        porta2.setCor("Marrom");
        porta2.setDimensoes(30, 50, 5);


        //porta 3
        Porta porta3 = new Porta();

        porta3.setCor("cinza");
        porta3.setDimensoes(50, 100, 10);
        porta3.abre();
    }
}
