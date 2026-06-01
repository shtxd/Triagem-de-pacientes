import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Vetor para 5 pacientes
        Paciente[] pacientes = new Paciente[5];

        // Leitura dos dados
        for (int i = 0; i < pacientes.length; i++) {
            System.out.println("Cadastro do paciente " + (i + 1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = Integer.parseInt(sc.nextLine());

            System.out.print("Temperatura (ex: 36.5): ");
            double temperatura = Double.parseDouble(sc.nextLine());

            System.out.print("Pressão arterial (ex: 12.5): ");
            double pressao = Double.parseDouble(sc.nextLine());

            // Cria e armazena o paciente
            pacientes[i] = new Paciente(nome, idade, temperatura, pressao);
            System.out.println();
        }
        // Exibe resultados
        System.out.println("--- Resultados da triagem ---");
        for (int i = 0; i < pacientes.length; i++) {
            // Chama exibirDados()
            pacientes[i].exibirDados();
        }

        sc.close();
    }
}
