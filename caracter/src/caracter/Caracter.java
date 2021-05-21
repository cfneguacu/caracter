package caracter;

import java.util.Scanner;

public class Caracter {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);	
		
		String teste=" ";
		
		char[] caracter = new char[10];
		
		int i = 0 ; int x = 0;
		
		while(x<10){
			
			System.out.println("Digite um caracter:");
	
			teste = entrada.nextLine();
		
			if(teste.length()==1) {
			
				caracter[i] = teste.charAt(0);
			
				System.out.println("O caracter digitado é '"+teste+"'");
			
				i++;
			
			}else {
			
				System.out.println("Digite apenas um caracter!!");
			
			}
		
			x++;	
		}

		System.out.print("\nOs caracteres digitados foram:");

	for(int j=0;j<caracter.length;j++) {
	
		System.out.print(caracter[j]+" ");
	
	}
	
	}

}
