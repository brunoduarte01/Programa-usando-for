import java.util.Scanner;

public class Exer3 {
	public static void main (String[]agrs) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Código do produto: ");
	  int codigoProduto= sc.nextInt();
	  int alcool= 0;
	  int gasolina=0;
	  int diesel=0;
	  
	while (codigoProduto>=0) {
		if (codigoProduto==1) {
			System.out.println("Alcool");
			 alcool++;
			 System.out.println();
			 System.out.println("Código do produto: ");			
			 codigoProduto=sc.nextInt();
		}
		else if (codigoProduto==2) {
			System.out.println("Gasolina");
			 gasolina++;
			 System.out.println();
			 System.out.println("Código do produto: ");
			 codigoProduto=sc.nextInt();
		}
		else if (codigoProduto==3) {
			System.out.println("Diesel");
			 diesel++;
			 System.out.println("Código do produto: ");		
			 codigoProduto=sc.nextInt();}
		
				else if (codigoProduto==4) {
					System.out.println("Muito Obrigado");
					mostraTela(alcool, gasolina, diesel);
					codigoProduto=-3;}
		
		       
				else  {	 
				System.out.println("Codigo invalido");
				//System.out.println();
				System.out.println("Codigos: (1)Alcool, (2)Gasolina, (3)Diesel");
				System.out.println("Informe novamente: ");
				codigoProduto=sc.nextInt();}
		
			}
	}
	public static void mostraTela(int valor, int valor2, int valor3) {
		System.out.println("Total: "+ 
	             "Alcool: "+ valor +
				", "+
	             "Gasolina: "+ valor2 +
				", "+
	             "Diesel: "+valor3);
	}
	}
	

	

