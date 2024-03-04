package banco;

public class Funcionario {
    private double salario;
    String nome, rg, departamento, data_entrada;
    boolean ativo = true;

    

    //getset salario
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    //getset nome
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    //getset rg
    public String getRg(){
        return rg;
    }
    public void setRg(String rg){
        this.rg = rg;
    }

    //getset departamento
    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    //getset dataentrada
    public String getDataEntrada(){
        return data_entrada;
    }
    public void setDataEntrada(String data_entrada){
        this.data_entrada = data_entrada;
    }

    //metodo bonifica salario
    public void bonifica(double aumento){
        this.salario = this.salario + aumento;
    }

    //metodo demite
    public void demite(boolean ativo){
        ativo = false;
    }

    //metodo mostra
    public void mostra(){
        System.out.println("Cliente: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Data de Entrada: " + this.data_entrada);
        System.out.println("RG: " + this.rg);
        System.out.println("Salario: " + this.salario);
        if(ativo == true){
            System.out.println("Funcionario Ativo");
        }else{
            System.out.println("Funcionario Demitido");
        }
    }

}
