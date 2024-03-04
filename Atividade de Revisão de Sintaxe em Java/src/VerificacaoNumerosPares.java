public class VerificacaoNumerosPares {
    public static void main(String[] args) {
        System.out.println("****VERIFICA NUMEROS PARES****");
        
        for(int i = 1 ; i <= 100 ; i++  ){
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}
