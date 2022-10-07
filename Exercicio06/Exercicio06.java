import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o raio do círculo: ");
        double raio = sc.nextDouble();
        sc.close();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo de raio " + raio + " é igual a " + area);

        
    }

}