package six_sheng_c;

public class six_sheng_c_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=f(0);
		System.out.println(a);
	}
	public static double f(double x) {
		while(x<10) {
			x=x+1.0/(f(x+1)+x+1);	
		}
		return 1.0/x;
	}
}
