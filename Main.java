public class Main {

      public static void main(String[] args) {
          java.util.Scanner scanner = new java.util.Scanner(System.in);

          int opcao;
          do {
              exibirMenu();
              System.out.print("Opção: ");
              opcao = scanner.nextInt();

              switch (opcao) {
                  case 1:
                      System.out.print("Informe o raio da esfera: ");
                      double raioEsfera = scanner.nextDouble();
                      System.out.println("Área da esfera: " + MinhaLib.calcularAreaEsfera(raioEsfera));
                      break;
                  case 2:
                      System.out.print("Informe o raio da base do cilindro: ");
                      double raioCilindro = scanner.nextDouble();
                      System.out.print("Informe a altura do cilindro: ");
                      double alturaCilindro = scanner.nextDouble();
                      System.out.println("Área do cilindro: " + MinhaLib.calcularAreaCilindro(raioCilindro, alturaCilindro));
                      break;
                  case 3:
                      System.out.print("Informe a aresta do cubo: ");
                      double arestaCubo = scanner.nextDouble();
                      System.out.println("Área do cubo: " + MinhaLib.calcularAreaCubo(arestaCubo));
                      break;
                  case 0:
                      System.out.println("Saindo do programa.");
                      break;
                  default:
                      System.out.println("Opção inválida. Tente novamente.");
              }

          } while (opcao != 0);

          scanner.close();
      }

      public static void exibirMenu() {
          System.out.println("Escolha uma opção:");
          System.out.println("1. Calcular área da esfera");
          System.out.println("2. Calcular área do cilindro");
          System.out.println("3. Calcular área do cubo");
          System.out.println("0. Sair");
      }
  }
