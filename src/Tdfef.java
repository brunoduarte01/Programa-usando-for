import java.util.Locale;
import java.util.Scanner;

public class Tdfef {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Locale.setDefault(Locale.US);
		    System.out.print("Informe o numero");
		    double digito = sc.nextInt();
		    
		    
		    while (digito<=400) {
		    	digito++;
		    	System.out.println(digito);		    		    	
		    	if (digito>=201) {
		    		digito=402;
		    	}
		    	else {
		    		digito=sc.nextInt();
		    		System.out.print("Informe o numero");	
		    	}
	  }
	}}

