
package testes;

import classes.Agenda;
import classes.Contato;

public class testeAgenda {
 
    public static void main(String[] args) {
        Agenda agenda = new Agenda(2); //Cria a agenda
    }
    
    Contato contato1 = new Contato("João", "(99) 99999-8888");
    Contato contato2 = new Contato("Pedro", "(99) 99952-7777");    
    Contato contato3 = new Contato("Maria", "(99) 99888-1234");   
    
    //System.out.printlen(agenda.Inserir(contato1) ? "Inserido" : "Cheia");
    //System.out.printlen(agenda.Inserir(contato2) ? "Inserido" : "Cheia");
    //System.out.printlen(agenda.Inserir(contato3) ? "Inserido" : "Cheia");
   
    //String retorno = agenda.Pesquisar("João");
    //String retorno1 = agenda.Pesquisar("Maria");
   //System.out.printlen(agenda.Pesquisar("João")); 
    
    //System.out.printlen(retorno.equals("" ? "Não tem" : retorno));
    //System.out.printlen(retorno.equals("" ? "Não tem" : retorno1));    
}
