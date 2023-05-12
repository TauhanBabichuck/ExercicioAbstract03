
package livrariaonline;


public class LivrariaOnline {

    
    public static void main(String[] args) {
       Produto livro1 = new Livro("Jeff Kinney", "Diário de um Banana: Rodrick é o Cara", 250.0);
       Produto cd1 = new CD("Queen", "We will rock you", 50.5);
       
        System.out.println(livro1.exibirDetalhes());
        System.out.println(cd1.exibirDetalhes());
    }
    
}
