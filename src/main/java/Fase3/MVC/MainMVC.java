package Fase3.MVC;

public class MainMVC {
    public static void main(String[] args) {
        ClienteRepository repository = new ClienteRepository();
        ClienteService service = new ClienteService(repository);
        ClienteController controller = new ClienteController(service);

        System.out.println("Cliente válido: " + controller.cadastrar("Ana", 25));

        try {
            controller.cadastrar("Bruno", 16);
        } catch (IllegalArgumentException e) {
            System.out.println("Cliente inválido: " + e.getMessage());
        }

        System.out.println("Todos: " + controller.listarTodos());
        System.out.println("Por id: " + controller.buscarPorId(1L));

        CadastroProgramado segundoPontoDeEntrada = new CadastroProgramado(service);
        System.out.println("Cadastro sem Controller HTTP: " +
                segundoPontoDeEntrada.executar("Carla", 30));
    }
}
