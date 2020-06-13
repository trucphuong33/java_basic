import java.util.Scanner;
public class Reidai0304{
	public static void main(String[] args){
		int seisu1, seisu2, wa;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("seisu1 = ");
		seisu1 = sc.nextInt();
		
		System.out.print("seisu2 = ");
		seisu2 = sc.nextInt();
		
		wa = seisu1 + seisu2;
		System.out.println("seisu1+seisu2 = "+wa);
	}
}