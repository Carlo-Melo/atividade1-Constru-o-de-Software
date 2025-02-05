public class Livro {

    private String autor;
    private String anoPublicacao;
    private String titulo;

    public Livro(String autor, String anoPublicacao, String titulo) {
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirLivro() {
        System.out.println("Autor: "+autor+" Titulo: "+titulo+" Ano de Publicação: "+anoPublicacao);
    }


}
