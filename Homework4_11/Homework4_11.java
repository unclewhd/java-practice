import java.util.*;

public class Homework4_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 3;
		while (count != 10) {
			System.out.println("dwdawd");
			String password = scan.nextLine();
			if(password.equals("123456")) {
				System.out.println("zhengque");
				break;
			}else{
				count--;
				System.out.println("haiyou " +count + "ci jihui");
			}
		}
	}
	
		
	public static void main10(String[] args) {
		for (int n = 1;n <= 9999999;n++) {
			
			int count = 0;
			tmp = n;
			while(tmp != 0) {
				tmp = tmp/10;
				count++;
			}
			tmp = n;
			int sum = 0;
			while (tmp != 0) {
				sum += Math.pow(tmp%10,count);
				tmp = tmp/10;
			)
			}
			if(sum == n) {
				System.out.println(sum + "is my result!");
			
			}
		}			
	}
	public static void main9(String[] args) {
		int count = 0;
		for (int i = 1; i <= 100;i++) {
			if(i / 10 == 9) {
				count++;
			}elseif(i%10 == 9) {
				count++;
			}
		}
		System.out.println(count);
	}
				
			
	public static void main8(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		double sum = 0;
		int flg = 1;
		
		for(int i = 1;i <= n;i++){
			sum = sum + 1.0/i *flg;
			flg = -flg;
		}
		System.out.println(sum);
	}
		
	public static void main7(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		int b = scan.nextInt();
		int c = b;
		while(a%b != 0) {
			c = a%b;
			a = b;
			b = c;
		}
		System.out.println(c);
	}
	public static void main6(String[] args) {
		for (int i = 1;i <= 9;i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i+"*"+j+"="+"i*j");
			}
			System.out.println();
		}
	}
	public static void main5(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int year = 1000;year <= n ;year++ ) {
			if(year%100!=0 && year%4==0 || year %400==0) {
				System.out.println(year + "shi runnian ");
			}
		}
	}
	public static void main4(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i = 1;i <= n;i++) {
			
			int j = 2;
			for (;j <= (int)Math.sqrt(i);j++) {
				if(i % j == 0) {
					break;
				}
			}
		}
	}
	public static void main3(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for (int i = 2;i <= (int)Math.sqrt(n);i++) {
			if(n % i == 0) {
				System.out.println(n +"不是素数");
				break;
			}
		}
	}
		
		
	public static void main2(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n < 18) {
		}
		else if (n >= 19 && n < 60) {
		}
		else{
		}
	}
		
	public static void main1(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Random random = new Random();
		int randNum = random.nextInt(100);
		
		System.out.println(randNum);
		
		while(true) {
			int num = scan.nextInt();
			if(num ==randNum) {
				System.out.println("dui le ");
				break;
			}
		}
		
	}
}