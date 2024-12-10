import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);

    try {
      // Validação para o primeiro número
      int parametroUm = 0;
      while (true) {
        System.out.println("Digite o primeiro número:");
        if (terminal.hasNextInt()) {
          parametroUm = terminal.nextInt();
          break;
        } else {
          System.out.println("Por favor, insira um número válido.");
          terminal.next(); // Limpar a entrada inválida
        }
      }

      // Validação para o segundo número
      int parametroDois = 0;
      while (true) {
        System.out.println("Digite o segundo número:");
        if (terminal.hasNextInt()) {
          parametroDois = terminal.nextInt();
          break;
        } else {
          System.out.println("Por favor, insira um número válido.");
          terminal.next(); // Limpar a entrada inválida
        }
      }

      // Chamando o método contendo a lógica de contagem
      contar(parametroUm, parametroDois);
    } catch (ParametrosInvalidosException exception) {
      // Imprimir a mensagem de erro
      System.out.println(exception.getMessage());
    }
  }

  static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    // Validação para garantir que os parâmetros são válidos para contagem
    if (parametroUm <= 0 || parametroDois <= 0) {
      throw new ParametrosInvalidosException("Os parâmetros devem ser números inteiros positivos.");
  }
    // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
    if (parametroUm > parametroDois) {
      throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
    }

    // Calcular a quantidade de ocorrências
    int contagem = parametroDois - parametroUm;

    // Realizar o for para imprimir os números
    for (int i = 1; i <= contagem; i++) {
      System.out.println("Imprimindo o número " + i);
    }
  }
}