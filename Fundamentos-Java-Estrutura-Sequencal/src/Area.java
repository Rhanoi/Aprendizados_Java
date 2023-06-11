import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

import java.util.Locale;

public class Area {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá mundo! Digite 3 números:");
        Double a,b,c,triangulo,circulo,trapezio,quadrado,retangulo;
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        triangulo=(a*c)/2;
        circulo=Math.PI*Math.pow(c, 2);
        trapezio=((a+b)/2)*c;
        quadrado=Math.pow(b,2);
        retangulo=a*b;
        
        System.out.printf("Triangulo: %.3f\nCirculo: %.3f\nTrapézio: %.3f\nQuadrado: %.3f\nRetângulo: %.3f",triangulo,circulo,trapezio,quadrado,retangulo);
    }
}
