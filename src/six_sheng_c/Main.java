package six_sheng_c;

public class Main {

	public static boolean isPrime(String s) {
		
		int a=Integer.valueOf(s);
		for(int i=2;i*i<=a;i++) {
			if(a%i==0)
				return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10000;
		int t=0;
		for(int i=a;i<100000;i++) {
			String temp=String.valueOf(i);
			String dao=new StringBuilder(temp).reverse().toString();
			
			if(temp.equals(dao)&&isPrime(temp)) {
				System.out.println(temp);
				System.out.println(dao);
				t++;
			}
		}
		System.out.println(t);
		
		
	}

}
