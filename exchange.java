class  exchange
{
	public static void main(String[] args) 
	{
		method_exchange(23,34);
		method_exchange2(45,67);
		method_exchange3(11,22);
	}
	public static void method_exchange(int a,int b)
	{
		System.out.print("�û�ǰ:a="+a+"; b="+b+";");
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("�û���:a="+a+"; b="+b+";");
	}
	public static void method_exchange2(int a,int b)
	{
		System.out.print("�û�ǰ:a="+a+"; b="+b+";");
		int temp = 0;
		temp =a;
		a = b;
		b = temp;

		System.out.println("�û���:a="+a+"; b="+b+";");
	}
	public static void method_exchange3(int a ,int b)
	{
		System.out.print("�û�ǰ:a="+a+"; b="+b+";");
		a = a+b;
		b = a-b;
		a = a-b;

		System.out.println("�û���:a="+a+"; b="+b+";");
	}
}
