/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guilherme_assis_12032024;

/**
 *
 * @author 16227127655
 */
public class Medico extends Pessoa{

    private String especialidadeMedico;

    public Medico(String nomePessoa, int cpf, String especialidadeMedico) {
        super(nomePessoa, cpf);
        this.especialidadeMedico = especialidadeMedico;
    }

    public String getEspecialidadeMedico() {
        return especialidadeMedico;
    }

    public void setEspecialidadeMedico(String especialidadeMedico) {
        this.especialidadeMedico = especialidadeMedico;
    }

}
