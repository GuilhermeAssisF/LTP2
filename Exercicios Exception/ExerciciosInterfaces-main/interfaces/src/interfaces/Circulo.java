/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Gabriel
 */
public class Circulo implements AreaCalculavel {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    @Override
    public double calculaArea() {
        return Math.PI * raio * raio;
    }
}
