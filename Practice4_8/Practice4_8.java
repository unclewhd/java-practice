public class Practice4_8 {
	public static void main(String[] args) {
	
		String str = "100a";
	
		int c = Integer.parseInt(str);
		System.out.println(c);
	}
	public static void main465(String[] args) {
		final int MAXNUM;
		MAXNUM = 12424;
		System.out.println(MAXNUM);
	}
	public static void main4556(String[] args) {
		byte b = 10;
		byte c = 20;
		byte d = (byte)(b+c);
		System.out.println(d);
	}
	
	public static void main667(String[] args) {
		int i = 2147483647+1;
		int i2 = Integer.MAX_VALUE + 1;
		System.out.println(i);
		System.out.println(i2);
	}
	public static void main1234(String[] args) {
		boolean flg = true;
		System.out.println(flg);
	}
	public static void main124(String[] args) {
		short sh = 12;
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
	}
	public static void main122(String[] args) {
		byte b = 12;
		byte c = 21;
		System.out.println(b + " " + c);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Byte.MAX_VALUE + 1);
		byte d = 127;
		int i = 2147483647;
		System.out.println(Integer.MAX_VALUE + 1);
	}
	
	public static void main12(String[] args) {
		float f = 12.3f;
		System.out.println(f);
	}
	
	
	public static void main5(String[] args) {
		char ch = 'a';
		System.out.println(ch);
		char ch2 = '高';
		System.out.println(ch2);
		char ch3 = 97;
		System.out.println(ch3);
	}
	
	public static void main4(String[] args) {
		
		double d = 12.5;
		System.out.println(d);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		int a = 1;
		int b = 2;
		System.out.println(a / b);
		
		double num = 1.1;
		System.out.println(num*num);
	}
	
	
	
	public static void main1(String[] args) {
		
		for(int i = 0;i < args.length;i++){
			System.out.println(args[i]);
		}
		System.out.println("kaixin");
	}
		
	public static void main2(String[] args) {
		long a = 10;
		System.out.println("a的值是：" + a);
		System.out.println("最大值：" + Long.MAX_VALUE);
		System.out.println("最小值：" + Long.MIN_VALUE);
		int b = 10;
		int c = 20;
		System.out.println(b + c);
		System.out.println("hhhh" + b + c);
	
	}
}