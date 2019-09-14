import java.util.Scanner;

public class Exer4 {
  public static void main (String []args) {
	  Scanner sc = new Scanner (System.in);
	  
	  System.out.println("Informe o codigo da peça 1");
	  long cod1 = sc.nextLong();
	  System.out.println("numero de peças");
	  int numPeças = sc.nextInt();
	  System.out.println("Valor das peças");
	  double valorPeças = sc.nextDouble();
	  
	  System.out.println("Informe o codigo da peça 2");
	  long cod2 = sc.nextLong();
	  System.out.println("numero de peças");
	  int numPeças2 = sc.nextInt();
	  System.out.println("Valor das peças");
	  double valorPeças2 = sc.nextDouble();
	  
	  double totalPeças1 = numPeças * valorPeças;
	  double totalPeças2 = numPeças2 * valorPeças2;
	  
	  double total = totalPeças1+ totalPeças2;
	  
	  System.out.printf("%.2f",total);
	  sc.close();
	  
	  
  }
}
