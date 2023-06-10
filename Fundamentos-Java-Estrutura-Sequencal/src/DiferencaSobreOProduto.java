import java.util.Scanner;
public class DiferencaSobreOProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá mundo! Ouvi dizer que precisa calcular a diferença entre o produto de a e b com relação a c e d, digite os números");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int diferenca = a*b-c*d;
        System.out.printf("A diferença é: %d",diferenca);

        sc.close();
        
    }
    
}
