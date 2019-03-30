package six_sheng_c;

public class six_sheng_c_2 {

	public static boolean fun(int i) {
		long l=i*i*i;
		String yString=String.valueOf(i);
		String lString=String.valueOf(l);
		if(lString.endsWith(yString))
		return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cunt=0;
		for(int i=0;i<10000;i++) {
			if(fun(i)) {
				cunt++;
				System.out.println(i);
			}
		}
		System.out.println(cunt);
	}

}
