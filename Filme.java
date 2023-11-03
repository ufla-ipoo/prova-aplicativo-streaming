
/**
 * Classe que os filmes de uma plataforma de streaming.
 * 
 * Um filme possui um titulo, um genero e uma duração.
 * 
 * @author Julio César Alves
 * @version 2023.11.02
 */
public class Filme
{
    // título do filme
    private String titulo;
    // gênero do filme (ex.: Comédia, Ação, Ficção Científica, etc.)
    private String genero;
    // duração do filme em minutos
    private int duracao;
    
    /**
     * Construtor para objetos da classe Filme
     */
    public Filme(String titulo, String genero, int duracao)
    {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

    /**
     * @return o título do filme
     */
    public String obterTitulo()
    {
        return titulo;
    }

    /**
     * @return o gênero do filme
     */
    public String obterGenero()
    {
        return genero;
    }
    
    /**
     * @return a duração do filme
     */
    public int obterDuracao()
    {
        return duracao;
    }
}
