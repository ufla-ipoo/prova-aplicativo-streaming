
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
        
        netflix.incluirFilme("Oppenheimer", "drama", 180);
        netflix.incluirFilme("Barbie", "aventura", 114);
        netflix.incluirFilme("Super Mario Bros. - O Filme", "animação", 92);
        
        System.out.println(netflix.listarCatalogo());
        
        netflix.inscreverUsuario("Tião");

        // altere aqui
        
        System.out.println(netflix.obterInfoUsuario("Tião"));
        
    }
}
