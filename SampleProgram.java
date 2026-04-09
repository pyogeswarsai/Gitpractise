import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("The number u entered are: " + a + ", " + b);
		if(a > b) {
			System.out.println(a + " is big");
		} else {
			System.out.println(b + " is big");
		}
		sc.close();
	}
}