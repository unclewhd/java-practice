import java.util.Scanner;

public class Practice4_11{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNextInt()) {
			int num = scan.nextInt();
			System.out.println(num);
		}
	}
		
	public static void main5(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		scan.close();
	}
	
	public static void main4(String[] args) {
		int num = 0;
		do{
			System.out.println("hhh");
		}while(num != 0);
	}
	
	public static void main3(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int sum = 0;
		for (int j = 1;j <= num;j++) {
			int ret = 1;
			
			for(int i =1;i<=5;i++){
				ret *=i;
			}
			sum += ret;
		}
		System.out.println(sum);
	}
		
	public static void main2(String[] args) {

		while(true){
			System.out.println("hhh");
		}
		

	}
	
		
		
	
	//int i = 1;
	//for(;i <= 10;){
		//System.out.println(i);
		//i++;
	//}
	//int a = 10;
	//if(a == 10){
		//break;
	//}
	public static void main1(String[] args) {

		//找打第一个既能被3整除的数字  也能被5整除的数字
		Scanner scan = new Scanner(System.in);

		int  num = scan.nextInt();//1

		while (num <= 20) {
			if(num % 15 == 0) {
				System.out.println(num);
				//break;
				continue;
			}
			System.out.println("hhhhh");
			num++;
		}
	}
}