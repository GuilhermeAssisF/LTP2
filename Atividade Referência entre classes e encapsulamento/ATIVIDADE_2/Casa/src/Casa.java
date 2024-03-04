
public class Casa {
    private String corCasa;
    private Porta porta1, porta2, porta3;

    public void setPorta1(Porta porta1) {
        this.porta1 = porta1;
    }

    public void setPorta2(Porta porta2) {
        this.porta2 = porta2;
    }

    public void setPorta3(Porta porta3) {
        this.porta3 = porta3;
    }

    // getset corCasa
    public String getCorCasa() {
        return corCasa;
    }

    public void setCorCasa(String corCasa) {
        this.corCasa = corCasa;
    }

    // set porta

    // metodo pintar casa
    public void pinta(String corCasa) {
        setCorCasa(corCasa);
    }

    public int quantasPortasEstaoAbertas() {
        int count = 0;
        if (porta1 != null && porta1.aberta_fechada())
            count++;
        if (porta2 != null && porta2.aberta_fechada())
            count++;
        if (porta3 != null && porta3.aberta_fechada())
            count++;
        return count;
    }

}
