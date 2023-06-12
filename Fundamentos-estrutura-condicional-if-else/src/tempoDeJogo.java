import java.util.Scanner;
public class tempoDeJogo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, mundo! Este programa calcula a duração de um jogo com base na gora inicial e final.");
        System.out.print("Digite o horário de inicio e de final: ");

        int i = sc.nextInt();
        int f = sc.nextInt();
        int t;

        if ((i<0||i>23)||(f<0||f>23)){
            System.out.println("Dados invalidos");
        } else if (i<f){
            t = f-i;
            System.out.println("O jogo durou "+t+" hora(s)");
        }else if(i>f){
            t= 24-(i-f);
            System.out.println("O jogo durou "+t+" hora(s)");
        }else{
            System.out.println("O jogo durou 24 hora(s)");
        }
        sc.close();
    }
}
