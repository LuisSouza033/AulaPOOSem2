import java.util.List;
public class RegistroDeVendas {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodrigo");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test Driven Development");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test Driven Development");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        List<Produto> produtos = carrinho.getProdutos();

        produtos.forEach(p -> {
            if (p instanceof LivroFisico) {
                ((LivroFisico) p).mostrarDetalhes();
            } else if (p instanceof Ebook) {
                ((Ebook) p).mostrarDetalhes();
            }
        });

        /*
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
        */
    }
}
