import java.util.Scanner;
public class SGE {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();
        String[] array = nome.split(" ");
        String letra = String.valueOf(array[0].charAt(0));
        String sobrenome = array[array.length - 1];
        String log = letra + "_" + sobrenome;
        System.out.println(log);        boolean nomeSenha = false;
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();        if (senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+") && senha.length() > 7) {
            System.out.println("Senha forte");
        } else {
            System.out.println("Senha fraca");
        }
        while (nomeSenha == false) {
            System.out.println("Digite seu login: ");
            String login = scanner.nextLine();
            System.out.println("Digite sua senha: ");
            String logsenha = scanner.nextLine();            if (login.equals(log) && logsenha.equals(senha)) {
                nomeSenha = true;
                break;
            }
        }
        if (nomeSenha == true) {
            System.out.println("Acesso permitido");
        }
    }
}