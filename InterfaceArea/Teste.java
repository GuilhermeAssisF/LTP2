public class Teste {
    public static void main(String[] args) {
        AreaCalculavel a = new Retangulo(3, 2);
        AreaCalculavel q = new Quadrado(3);
        AreaCalculavel c = new Circulo(3);
        System.out.println(c.calculaArea());
        
    }
}
