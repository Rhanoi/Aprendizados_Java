import java.util.Locale;
import java.util.Scanner;
public class SalarioFuncionario {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Olá, mundo!\nQue tal calcular seu salário? Vamos lá! Digite seu código de funcionário:");
        int cod = sc.nextInt();
        System.out.println("Agora seu número de horas trabalhadas:");
        int ht = sc.nextInt();
        System.out.println("Certo, qual o valor que recebe por hora trabalhada?");
        double vh = sc.nextDouble();

        double salario = ht*vh;

        System.out.printf("Number: %d\nSalary: $ %.2f",cod,salario);
        sc.close();
    }
}
