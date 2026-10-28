
/**
 * Classe usada para testar os métodos da classe Plataforma.
 * 
 * @author Julio César Alves
 * @version 2023.11.02
 */
public class TestePlataforma
{    
    /**
     * Construtor para objetos da classe TestePlataforma
     */
    public TestePlataforma()
    {
        // Cria uma locadora e chama seus métodos para testar
        // seu funcionamento
        
        PlataformaDeStreaming netflix = new PlataformaDeStreaming();
        
        netflix.incluirFilme("Homem-Aranha: Um Novo Dia", "acao", 145);
        netflix.incluirFilme("A Odisseia", "aventura", 158);
        netflix.incluirFilme("Toy Story 5", "animacao", 102);
        netflix.incluirFilme("O Diabo Veste Prada 2", "comedia", 110);
        netflix.incluirFilme("Super Mario Galaxy: O Filme", "animacao", 98);
        
        System.out.println(netflix.listarCatalogo());
        
        netflix.inscreverUsuario("Tião");

        // altere aqui
        
        System.out.println(netflix.obterInfoUsuario("Tião"));
        
    }
}
