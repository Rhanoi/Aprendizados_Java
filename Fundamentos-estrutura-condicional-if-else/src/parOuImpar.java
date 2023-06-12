import java.util.Scanner;
public class parOuImpar {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, mundo! Este programa para ler 2 número inteiro diz se são multiplos ou não.");
        System.out.print("Digite um número: ");

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = 0;

        if(x>y){
            z = x%y;
        }else{
            z = y%x;
        }
        if (z!=0){
            System.out.println("Não são multiplos.");
        }else{
            System.out.println("São multiplos");
        }
        sc.close();
    }
}
