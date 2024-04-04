/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Gabriel
 */
public class Retangulo implements AreaCalculavel {
    private int largura;
private int altura;
public Retangulo(int largura, int altura) {
this.largura = largura;
this.altura = altura;
}
    @Override
    public double calculaArea() {
return this.largura * this.altura;
}
}
