
public class main {

	public static void main(String[] args) {
		int p=23;
		for (int x=0;x<p;x++) {
		int temp =((int)Math.pow(x,3)+x)%p;
		int y1= calcY1(temp, p);
		if (y1!=-1) {
		int y2 = calcY2(y1, p);
		System.out.println("X= "+x+" temp= "+temp+" Y= "+y1+", "+y2);
		}
		}
		}
		private static int calcY1(int temp, int p) {
		for (int i=1;i<p;i++) {
		if ((i*i % p)==temp)
		return i;
		}
		return -1;
		}
		private static int calcY2(int y1, int p) {
		return (p-y1)%p;
		}


}
