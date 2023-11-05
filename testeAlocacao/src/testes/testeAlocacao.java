
package testes;

public class testeAlocacao {
    
    public static void main(String[] args) {
        
        //Pessoa p1; declaração e não alocação
        //Pessoa p1=null; Alsencia de ponteiro
        Pessoa p1 = new Pessoa("Joaquim", 1000);
        //Outro espaço no heap, alocou em uma espaço de memória correspondente para String e inteiro
        Pessoa p2 = new Pessoa("Meria", 2000); //duas refencias de memória diferente
        
        Pessoa p3 = p2;
        
        p2.setNome("Júlia");//Criou o 2 como Maria, disse que o p2 é igual é o p3
        //Não duplica, compartilha
        //Maria não tem mais, foi substituído
        //Fácil de entender, porque o endereço é o mesmo
        //Variáveis dinâmicas podem ter dois ponteiros apontando para o mesmo endereço
        //O que aconetec com um, acontece com o outro
        
        //Alocação estática
        int x1 = 10;
        int x2 = x1;
        //Tem o x1 com valor 10 
        //Cada alocação estática
        //x2 = 10
        //Não é uma casa compartilhada, são casas diferentes - compartilham o mesmo valor agora
        
        x2 += 20; //Jáq muda o valor
        
        System.out.println(p1.getNome());
        System.out.println(p2.getNome());
        System.out.println("P1 " + p1);//testes.Pessoa@5fd0d5ae = como o Java refência uma memória = ponteiro = único
        System.out.println("P2 " + p2);
        System.out.println("P3 " + p3);
        //Criei uma variável p1, p2 - não criou mais um quadrinho para o p3 - tem 2- se não fosse assim, não teriamos 
            //uma estrutura de dados dinâmica
        //Ao infes de criar uma p3, p3 está junto com p2
        //Igualdade de objetos não está igualando valorews, está igualando ponteiros
        
        //p2 = null; //Aunsencia de Ponteiro
       //É inutil um System.gc(), porque tem ainda alguém usando esse endereço
       
       p2 = p3 = null;
       
       //Alocação dinâmica da diferença
       if (p1.equals(x2)){//Apesar de funcional, não é para usar o ==, use o equals
           //Não está comparando valores, mas sim endereços
           System.out.println("Iguais");
       }else{
           System.out.println("Diferentes");
       }
       
       System.gc(); //Nesse caso valeria a pena
       
        //É um ambiente comprtilhado, não quer dizer que se uma sair, a outra também vai sair
        System.out.println("P1 " + p1);
        System.out.println("P2 " + p2);
        System.out.println("P3 " + p3);
    }
    
}
