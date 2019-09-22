
public class Main {

	public static void main(String[] args) {
		int p = 23;
		for (int x = 0; x < p; x++) {
			int temp = ((int) Math.pow(x, 3) + x) % p;
			System.out.println(temp);;
		}
	}

}
