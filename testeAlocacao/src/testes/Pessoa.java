
package testes;

//O Java permite que todo objeto dinamico de memória seja implementado pelos objetos=já está implementado

public class Pessoa {
    
    private String nome;
    private double salario;
    
    public Pessoa(){
        
    }

    public Pessoa(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
////////////////
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
////////////////
    
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
        
}
