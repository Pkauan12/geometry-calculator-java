import java.util.Scanner;

public class Calculogebra {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int opcao = 0;


        while(opcao !=4){
            System.out.println("--- Descubra área de 3 figuras geométricas");
            System.out.println("--- Escolhas a opções:  " +
                    " 1- Área do Quadrado" +
                    " 2- Área de um círculo " +
                    " 3- Área de um triâgulo" +
                    " 4- Encerrar");
            opcao = leitura.nextInt();

            System.out.println("A opção escolhida " + opcao);


            if (opcao == 1){
                System.out.println("Digite o lado do quadrado:");
            double lado = leitura.nextDouble();
            double area = lado * lado;
                System.out.println("A área do quadrado é: " + area);

            }
            else if (opcao == 2){
                System.out.println("Digite o Raio: ");
            double raio = leitura.nextDouble();
            double area = Math.PI * raio * raio;
                System.out.println("A área do Círculo é: " + area);

            }
            else if (opcao == 3){
                System.out.println("Digite o valor da base: ");
            double base = leitura.nextDouble();
                System.out.println("Digite a altura: ");
            double altura = leitura.nextDouble();
            double area = (base * altura)/2;
                System.out.println("A área do Triângulo é: " + area);

            } else if (opcao == 4) {
                System.out.println("Encerrando...");
            } else {
                System.out.println("Opção inválida, digite novamente");

            }
        }
    }
}
