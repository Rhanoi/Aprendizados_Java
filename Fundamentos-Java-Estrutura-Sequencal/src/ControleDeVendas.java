import java.util.Scanner;
public class ControleDeVendas {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int cod1,cod2,qt1,qt2;
        double valorUnit1,valorUnit2,total;

        System.out.println("Olá mundo, Farei o somatório dos seu produtos e direi quanto deve pagar.");
        System.out.print("Digite o código do primeiro item: ");
        cod1=sc.nextInt();
        System.out.print("Quantidade deste item no carrinho: ");
        qt1=sc.nextInt();
        System.out.print("Valor do produto: ");
        valorUnit1=sc.nextDouble();

        System.out.print("Digite o código do segundo item: ");
        cod2=sc.nextInt();
        System.out.print("Quantidade deste item no carrinho: ");
        qt2=sc.nextInt();
        System.out.print("Valor do produto: ");
        valorUnit2=sc.nextDouble();

        total = qt1*valorUnit1+qt2*valorUnit2;
        System.out.printf("Valor a pagar: R$ %.2f",total);
        sc.close();
    }
}
