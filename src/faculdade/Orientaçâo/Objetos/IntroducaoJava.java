package faculdade.Orientaçâo.Objetos;

import java.util.Scanner;

public class IntroducaoJava {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double a = scanner.nextDouble();

        System.out.println("Informe o segundo número: ");
        double b = scanner.nextDouble();

        System.out.println("Informe o terceiro número: ");
        double c = scanner.nextDouble();

        double conta1 = a + b - c;
        System.out.println("Resultado Conta1: " + conta1);

        double conta2 = (a / b) + c;
        System.out.println("Resultado Conta2: " + conta2);
        double conta3 = a*b*c;
        System.out.println("Resultado Conta3: " + conta3);

        double conta4 = (a-c)/(b-a);//
        System.out.println("Resultado Conta4: " + conta4);

        double conta5 = (a*c)-(b*a);
        System.out.println("Resultado Conta5: " + conta5);

        double conta6 = c - b - a;
        System.out.println("Resultado Conta6: " + conta6);





    }
}

