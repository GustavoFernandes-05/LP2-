public class Biblioteca
{
    //Atributos do livro
    private String tituloLivro;
    private String autor;
    private String editora;
    private int anoPublicacao;
    private String genero;
    private int paginas;

    public Biblioteca(String tituloLivro, String autor, String editora, int anoPublicacao, String genero, int paginas)
    {
        //Dados do livro a definir
        this.tituloLivro = tituloLivro;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.paginas = paginas;
    }

    public String classificacaoLivro() 
    { 
        int atualmente = 2026;
        int ano = atualmente - this.anoPublicacao;

        if (ano > 500) {
            return "Antigo";
        } 
        else if (ano < 100) { 
            return "Moderno";
        } 
        else { 
            return "Tradicional";
        }
    }

    public void emprestimoParapaginas()
    {
        //Calculo para emprestimo
        if (this.paginas <= 50) {
            System.out.println("4 dias para leitura de " + this.tituloLivro);
        }
        else if (this.paginas <= 300) {
            System.out.println("1 semana para leitura de " + this.tituloLivro);
        }
        else {
            System.out.println("2 semanas para leitura de " + this.tituloLivro);
        }
    }
}
