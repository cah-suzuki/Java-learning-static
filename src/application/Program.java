package application;

import java.util.Scanner;

import util.Calculator;

public class Program {
	//constante sempre em maiusculo
	//não posso chamar um metodo não estatico dentro de um main estatico


	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// instanciei o obj, todos estao sem static
			
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		//Usando a classe static, inves de chamar a partir do obj
		double c = 	Calculator.circumference (radius);
		double v = Calculator.volume (radius);
		
		System.out.printf("Circumference: %.2f%n",c);
		System.out.printf("Volume: %.2f%n",v);
		System.out.printf("PI Value: %.2f%n",Calculator.PI);
		
   sc.close();
	}
    

}
