import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá mundo! Te ajudarei a calcular a área de um circulo, para isto, precisarei do comprimento do raio, digite por favor:");
        double r = sc.nextDouble();

        double area = Math.PI*Math.pow(r,2);
        System.out.printf("Como o valor do raio é %.2f então sua área só pode ser %.4f",r,area);

        sc.close();
    }
}
