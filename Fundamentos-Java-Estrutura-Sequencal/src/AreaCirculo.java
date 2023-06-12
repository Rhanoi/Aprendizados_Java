import java.util.Locale;
import java.util.Scanner;
public class AreaCirculo{
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Iremos calcular a área de um circulo, digite o raio: ");
        double r = sc.nextDouble();
        double area= Math.PI*Math.pow(r,2);
        System.out.printf("Levando em conta que o raio é %f e pí é aproximadamnte 3.1415\n", r);
        System.out.println("A area é: "+area);


        sc.close();
    }
}






















/*import java.util.Scanner;

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
*/
