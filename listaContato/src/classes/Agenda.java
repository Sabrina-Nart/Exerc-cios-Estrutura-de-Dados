
package classes;

public class Agenda {

    private Contato[] lista = null; //vetor - não é a sintaxe normal(coloca um new Contato[10] - precisa ter um valor, mas não sou eu quem vai decidir)
    private int indice; //Tem que saber que o próximo contato vai no outro índice
    
    
    public Agenda(int tamanho){
        this.lista = new Contato[tamanho]; //Coloca o tamanho no construtor
        this.indice = 0; //Em que índice vai ser armazenado
    }
    
    //Inserir novo contato na agenda no índice 
    public boolean Inserir(Contato contato){ //boolean = no exemplo do professor só cabe 6, mais não é possível inserir - Objetivo=Dar uma resposta
        if (indice == lista.length){ //No exemplo o Length é 6
            return false; //return = encerra
        }
        lista[indice] = contato; //Pega o contato que veio e vai largando em cada índice
        indice++;
        return true; //só return true vai salvar em cima do outro contato
    }
    
    //retornar um telefone a partir de um nome
    public String Pesquisar(String nome){ //Na lista eu seu que está em maísculo, na pesquisa é outra coisa 
        if(indice == 0){ //se ele ainda for 0, significa que a lista está vazia
           return ""; //Quando não tem nenhum contato
        }
        for(int i=0; i<lista.length; i++){ //se tiver contato
            if (lista[i].getNome().equals(nome.toUpperCase())){ //Aqui garantia de que veio em maíusculo
                return lista[i].getTelefone();  
            }
        }
        return "";//Se sai do for e nada aconteceu - quer dizer que não achou em nenhum lugar da lista uma igualdade
    }
    
    
}
