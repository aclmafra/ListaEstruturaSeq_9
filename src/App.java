import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double tF, tC;

        System.out.println("Digite a temperatura em graus Fahrenheit: ");
        tF = sc.nextDouble();
        tC = 5 * ((tF - 32) / 9);

        System.out.printf("O valor informado em Fahrenheit representa %.2f(C) graus Celsius.", tC);

        sc.close();
    }
}
