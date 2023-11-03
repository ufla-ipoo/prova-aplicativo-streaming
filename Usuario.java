import java.util.ArrayList;

/**
 * Classe que representa uma usuário da plataforma de Streaming.
 * 
 * Um usuário tem um nome e um histórico de filmes assistidos.
 * 
 * @author Julio César Alves
 * @version 2023.11.02
 */
public class Usuario
{
    // nome do usuário
    private String nome;
    // histórico de filmes assistidos
    private ArrayList<Filme> historicoAssistido;
    // tempo total assistido pelo usuário em minutos
    private int tempoAssistido;

    /**
     * Construtor para objetos da classe Usuario
     */
    public Usuario(String nome)
    {
        this.nome = nome;
        historicoAssistido = new ArrayList<>();
        tempoAssistido = 0;
    }
    
    /**
     * @return o nome do usuário
     */
    public String obterNome() {
        return nome;
    }
    
    /**
     * @return o tempo total assistido pelo usuário (em minutos)
     */
    public int obterTempoAssistido() {
        return tempoAssistido;
    }
    
    /**
     * Adiciona um filme ao histórico assistido pelo usuário
     */
    public void assistirFilme(Filme filme) {
        historicoAssistido.add(filme);
    }
    
    /**
     * @return a quantidade de filmes assistidos pelo usuário
     */
    public int nroFilmesAssistidos() {
        return historicoAssistido.size();
    }
    
    /**
     * Retorna uma String com os títulos de todos os filmes 
     * assistidos pelo usuário
     */
    public String listarHistorico() {
        String titulos = "";
        for (Filme filme : historicoAssistido) {
            titulos += filme.obterTitulo() + "\n";
        }
        return titulos;
    }
}
