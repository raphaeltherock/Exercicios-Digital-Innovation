import java.util.Scanner;

public class multastransito {

    public multastransito() {
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int velocidade = scan.nextInt();
            int multas = scan.nextInt();

            if (velocidade > 80) {
                multas++;
            }

            System.out.print(multas + " multas.");

            if (multas >= 3) {
                System.out.println(" Levou pontos na carteira");
            } else {
                System.out.println(" Nao levou pontos na carteira");
            }
        }
    }
}
