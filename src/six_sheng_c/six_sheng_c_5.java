package six_sheng_c;

public class six_sheng_c_5 {
	public static void stringFid(int width,int height,String s) {
		if(s.length()>width-2)
			s=s.substring(0, width-2);
		System.out.print("+");
		for(int i=0;i<width-2;i++) {
			System.out.print("-");
		}
		System.out.println("+");
		for(int k=1;k<(height-1)/2;k++) {
			System.out.print("|");
			for(int i=0;i<width-2;i++) {
				System.out.print(" ");
			}
			System.out.println("|");
		}
		System.out.print("|");
		String ff=(width-s.length()-2)==0?s:"%"+((width-s.length()-2)/2)+"s%s%"+((width-s.length()-1)/2)+"s";
		System.out.print(String.format(ff,"",s,""));
		System.out.println("|");
		for(int k=(height-1)/2+1;k<height-1;k++) {
			System.out.print("|");
			for(int i=0;i<width-2;i++) {
				System.out.print(" ");
			}
			System.out.println("|");
		}
		System.out.print("+");
		for(int i=0;i<width-2;i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringFid(40, 40, "abcd1234");
		
	}

}
