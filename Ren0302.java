import java.util.Scanner;
public class Ren0302{
	public static void main(String[] args){
		int naga, haba, menseki;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("長方形の長さ>>");
		naga = sc.nextInt();
		System.out.print("長方形の幅>>");
		haba = sc.nextInt();
		menseki = naga*haba;
		System.out.println("長方形の面積は" + menseki + "です");
	}
}