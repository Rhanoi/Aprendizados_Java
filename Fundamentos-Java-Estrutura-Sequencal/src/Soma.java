import java.util.Scanner;
public class Soma {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, mundo!\nDigite dois números inteiros e te mostrarei a soma entre eles:");

        int x = sc.nextInt();
        int y = sc.nextInt();
        int soma = x + y;

        System.out.printf("A soma dos números %d e %d é %d",x,y,soma);
        sc.close();
    }
}
