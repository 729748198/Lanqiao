package six_sheng_c;

public class six_sheng_c_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<49;i++) {
			for(int j=i+2;j<49;j++) {
				int n=1225-i*2-j*2-2+i*(i+1)+j*(j+1);
				if(n==2015&&i!=10) {
					System.out.println(i);
					break;
				}
			}
		}
	}

}
