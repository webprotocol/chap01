class Calc {

	public static void main(String[] args) {
		int sum=0;

		for (int i=1; i<=10; i++)
			sum = sum + sum + i + i + i;

		System.out.println("sum="+sum);


	}

}
