import java.util.Scanner;
public class Ren0302{
	public static void main(String[] args){
		int naga, haba, menseki;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����`�̒���>>");
		naga = sc.nextInt();
		System.out.print("�����`�̕�>>");
		haba = sc.nextInt();
		menseki = naga*haba;
		System.out.println("�����`�̖ʐς�" + menseki + "�ł�");
	}
}