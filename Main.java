import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
			int x=scan.nextInt();
		
		if(x%3==0) {
			System.out.print("YES");
		}else {
			System.out.print("NO");
		}

	}

}
