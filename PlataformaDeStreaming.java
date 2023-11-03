import java.util.ArrayList;

/**
 * Classe para representar uma plataforma de streaming. Uma 
 * plataforma tem uma coleção de usuários e uma coleção de
 * filmes disponíveis.
 * 
 * @author Julio César Alves
 * @version 2023.11.01
 */
public class PlataformaDeStreaming
{
    // usuários da plataforma
    private ArrayList<Usuario> clientes;
    // filmes disponíveis no catálogo na plataforma
    private ArrayList<Filme> catalogo;

    /**
     * Construtor para objetos da classe PlataformaDeStreaming
     */
    public PlataformaDeStreaming()
    {
        clientes = new ArrayList<>();
        catalogo = new ArrayList<>();
    }

    /**
     * Acrescenta um filme no catálogo da plataforma
     */
    public void incluirFilme(String titulo, String genero, int duracao)
    {
        catalogo.add(new Filme(titulo, genero, duracao));
    }

    /**
     * Inscreve um usuário na plataforma
     */
    public void inscreverUsuario(String nome)
    {
        clientes.add(new Usuario(nome));
    }
    
    /**
     * Retorna uma String com as informações de um usuário
     */
    public String obterInfoUsuario(String nomeDoUsuario) {
        Usuario usuario = buscarUsuario(nomeDoUsuario);
        if (usuario != null) {
            return "Usuário " + usuario.obterNome() + 
                   " assistiu " + usuario.nroFilmesAssistidos() + " filme(s)";
        }
        else {
            return "Usuário não encontrado!";
        }
    }
    
    /**
     * Busca e retorna um usuário da coleção de usuários, a partir de seu nome.
     * Retorna null se o usuário não for encontrado.
     */
    private Usuario buscarUsuario(String nomeDoUsuario) {
        for (Usuario usuario : clientes) {
            if (usuario.obterNome().equals(nomeDoUsuario)) {
                return usuario;
            }
        }
        return null;
    }
    
    /**
     * Retorna uma String com os dados dos filmes disponíveis no
     * catálogo
     */
    public String listarCatalogo() {
        String dadosCatalogo = "CATÁLOGO DE FILMES\n";
        for (Filme filme : catalogo) {
            dadosCatalogo += filme.obterTitulo() + 
                        " (gênero: " + filme.obterGenero() + 
                        ", duração: " + filme.obterDuracao() + ")\n";
        }
        return dadosCatalogo;
    }
    
    /**
     * Busca e retorna um flme do catálogo, a partir de seu título.
     * Retorna null se o filme não for encontrado.
     */
    private Filme buscarFilme(String titulo) {
        for (Filme filme : catalogo) {
            if (filme.obterTitulo().equals(titulo)) {
                return filme;
            }
        }
        return null;
    }
    
    /**
     * Faz os tratamentos necessários quando um usuário assiste um filme.
     */
    public boolean assistir(String nomeDoUsuario, String tituloDoFilme) {
        Usuario usuario = buscarUsuario(nomeDoUsuario);
        Filme filme = buscarFilme(tituloDoFilme);
        
        if (usuario != null && filme != null) {
            usuario.assistirFilme(filme);
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Retorna a quantidade de filmes de um determinado gênero assistidos
     * por um usuário.
     * 
     * O método ainda não está implementado corretamente.
     */
    public int filmesAssistidos(String nomeDoUsuario, String genero) {
        Usuario usuario = buscarUsuario(nomeDoUsuario);
        if (usuario != null) {
            // altere o código aqui
            return 0;
        }
        else {
            return -1;
        }
    }
    
    
}
