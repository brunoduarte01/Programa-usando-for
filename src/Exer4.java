import java.util.Scanner;

public class Exer4 {
  public static void main (String []args) {
	  Scanner sc = new Scanner (System.in);
	  
	  System.out.println("Informe o codigo da pe�a 1");
	  long cod1 = sc.nextLong();
	  System.out.println("numero de pe�as");
	  int numPe�as = sc.nextInt();
	  System.out.println("Valor das pe�as");
	  double valorPe�as = sc.nextDouble();
	  
	  System.out.println("Informe o codigo da pe�a 2");
	  long cod2 = sc.nextLong();
	  System.out.println("numero de pe�as");
	  int numPe�as2 = sc.nextInt();
	  System.out.println("Valor das pe�as");
	  double valorPe�as2 = sc.nextDouble();
	  
	  double totalPe�as1 = numPe�as * valorPe�as;
	  double totalPe�as2 = numPe�as2 * valorPe�as2;
	  
	  double total = totalPe�as1+ totalPe�as2;
	  
	  System.out.printf("%.2f",total);
	  sc.close();
	  
	  
  }
}
