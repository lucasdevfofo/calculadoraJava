import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int escolha;

            do {
                System.out.println("Escolha a operação que deseja realizar:");
                System.out.println("1 - Somar");
                System.out.println("2 - Subtrair");
                System.out.println("3 - Multiplicar");
                System.out.println("4 - Dividir");
                System.out.println("5 - Sair");
                System.out.print("Digite sua escolha: ");
                escolha = scanner.nextInt();

                if (escolha == 5) {
                    System.out.println("Saindo...");
                    break;
                }

                System.out.print("Digite o primeiro número: ");
                double a = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                double b = scanner.nextDouble();

                switch (escolha) {
                    case 1:
                        System.out.println("Resultado: " + somar(a, b));
                        break;
                    case 2:
                        System.out.println("Resultado: " + subtrair(a, b));
                        break;
                    case 3:
                        System.out.println("Resultado: " + multiplicar(a, b));
                        break;
                    case 4:
                        if (b != 0) {
                            System.out.println("Resultado: " + dividir(a, b));
                        } else {
                            System.out.println("Erro: Não é possível dividir por zero.");
                        }
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }

            } while (escolha != 5);

            scanner.close();
        }

        public static double somar(double a, double b) {
            return a + b;
        }

        public static double subtrair(double a, double b) {
            return a - b;
        }

        public static double multiplicar(double a, double b) {
            return a * b;
        }

        public static double dividir(double a, double b) {
            return a / b;
        }
    }


