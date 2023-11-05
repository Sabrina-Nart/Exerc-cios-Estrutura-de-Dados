
package classes;

public class Contato {

    private String nome;
    private String telefone;
    
    public Contato(){
        this.setNome("NONAME");
        this.setTelefone("(00) 00000-0000");
    }
    
    public Contato(String nome, String telefone){
        this.setNome(nome);
        this.setTelefone(telefone);        
    }

//////////////////////////
    
    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty() ? "NONAME" : nome.toUpperCase(); //Consulta a partir do nome
    }    
    
    public void setTelefone(String telefone) {
        this.telefone = telefone.trim().isEmpty() ? "(00) 00000-0000" : telefone; //Tem que ser digitado alguma coisa
    }

//////////////////////
    
    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }    

    @Override
    public String toString() {
        return nome + ", telefone=" + telefone; //Trazer os dois
    }
    
////////////////////////////////
  //Cada contato será um contato com nome e contato = vetor
  //Método para inserir e consultar - vetor = no mesmo lugar - garante que se for fazer algo, faz em um lugar só
}
