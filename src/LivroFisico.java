public class LivroFisico extends Livro implements Promocional{

    public LivroFisico(Autor autor) {
        super(autor);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do livro físico");
        System.out.println("Id: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Valor: " + getValor());
        getAutor().mostrarDetalhes();
        System.out.println();
    }
    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }
}
 public class Ebook extends Livro implements Promocional {
    private String waterMark;
    public Ebook(Autor autor) {
        super(autor);
    }
    @Override
    public boolean aplicaDescontoDe(double porcentagem) {

        if (porcentagem > 0.15) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }
    public String getWaterMark() {
        return waterMark;
    }
    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
    @Override
    public void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do ebook");
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Valor: " + getValor());
        System.out.println("WaterMark: " + getWaterMark());
        getAutor().mostrarDetalhes();
        System.out.println();
    }
}
