import java.util.Iterator;

public class Porta {
    private boolean aberta = false;
    private String cor;
    private int dimensaoX, dimensaoY, dimensaoZ;

    // getset cor
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // getset dimesao
    public int getDimensaoX() {
        return dimensaoX;
    }

    public int getDimensaoY() {
        return dimensaoY;
    }

    public int getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensoes(int dimensaoX, int dimensaoY, int dimensaoZ) {
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }

    // metodo abre
    public void abre() {
        aberta = true;
    }

    // metodo fecha
    public void fecha() {
       aberta = false;
    }

    // metodo pinta
    public void pinta(String cor) {
        getCor();
    }

    // metodo verifica se esta aberta
    public void estaAberta() {
        if (aberta == true) {
            System.out.println("A porta esta aberta.");
        } else {
            System.out.println("A porta esta fechada.");
        }
        
    }

    // metodo para exibir Porta
    public void exibePorta() {
        estaAberta();
        System.out.println("Cor: " + this.cor);
        System.out.println("DimensaoX: " + this.dimensaoX);
        System.out.println("DimensaoY: " + this.dimensaoY);
        System.out.println("DimensaoZ: " + this.dimensaoZ);
    }

    public boolean aberta_fechada(){
        return aberta;
    }

}
