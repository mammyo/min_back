
public class test {

//	public static void main(String[] args) {
//
//		int input = 32;
//
//		
//
//			System.out.println(fibo(input));}
//	
//
//	public static int fibo(int n) {
//		if (n == 1)
//			return 1;
//		else if (n==2)
//			return 1;
//		
//		else if ((n%2)==0)
//			return fibo(n-2) - fibo(n-1);
//		
//		else 
//            return fibo(n-2) + fibo(n-1);
//
//	}
	
	public static void main(String[] args) {

		int input = 32; // 8개 출력

		

		for (int i = 1; i <= input; i++) {

			System.out.println(fibo(i));

		}

	}



	public static int fibo(int n) {

		if (n <= 1)

			return n;

		else 

                        return fibo(n-2) + fibo(n-1);

	}

}




