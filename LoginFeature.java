public class Usuario {

    // Método login que imprime uma mensagem
    public void login() {
        System.out.println("Usuário fez login com sucesso!");
    }

    // Método principal para executar o programa
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.login(); // Chama o método login
    }
}
