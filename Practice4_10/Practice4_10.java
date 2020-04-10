import java.util.Scanner;

public class Practice4_10{
	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		while(num <=5) {
			int i = 1;
			int ret = 1;
			while(i <= num) {
				ret *= i;
				i++;
			}
			sum += ret;
			num++;
		}
		System.out.println(sum);
	}
	public static void main9(String[] args) {
		int i= 1;
		int ret =1;
		while(i <= 5) {
			ret *= i;
			i++;
		}
		System.out.println(ret);
	}
	public static void main8(String[] args) {
		
			//String a = true;
		//	switch (a) {
			//	case true:
			//	System.out.println("1");
			//	break;
			//	case false:
			//	System.out.println("2");
			//	break;
			//	default:
//System.out.println("3");
	//			break;
			
		
	}
	public static void main7(String[] args) {
		int x = 20;
		int y = 10;
		if (x == 10) {
			if(y == 10){
				System.out.println("aaa");
			}else{
				System.out.println("bbb");
			}
		}
	}
	
	public static void main6(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextInt()) {
			int year = scan.nextInt();
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("闰年");
			}else{
				System.out.println("no");
			}
		}
	}
	public static void main5(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int year = scan.nextInt();
		
		//if(year%4 == 0 && year % 100 != 0 || year % 400 == 0) {
		//}
		
		String str = scan.nextLine();
		System.out.println(str);
	}
	
	public static void main4(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(a);
		
		String str = scan.next();
		System.out.println(str);
	}
	public static void main3(String[] args) {
		int i = 10;
		i = i++;
		System.out.println(i);
		
		int a = 10;
		int b = 20;
		System.out.println(10 > 20 && 10 / 0 == 0);
		
		System.out.println(10 < 20 || 10 / 0 == 0);
	}
	public static void main2(String[] args) {
		/*System.out.println(10%3);
		System.out.println(-10%3);
		System.out.println(10%-3);
		System.out.println(-10%-3);*/
		
		int a = 10;
		int b = ++a;
		System.out.println(b);
		int c = a++;
		System.out.println(c);
	}


	public static void main1(String[] args) {
		System.out.println(5/2);
		System.out.println(5.0/2);
		System.out.println((float)5/2);
		System.out.println((float)(5/2));
	}
}
		