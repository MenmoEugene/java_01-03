/*
1,��ȡ1~100�ĺͣ�����ӡ��
2,1~100֮��7�ı����ĸ���������ӡ��
*/

class ForTest 
{
	public static void main(String[] args) 
	{
		Sum();
		SevenB();
	}
	public static void SevenB()
	{
		for (int x=1; x<=100; x++)
		{
			if(x%7==0)
				System.out.print(x+" ");
		}
	}

	public static void Sum()
	{
		int sum =0;
		for (int x=1; x<=10; x++)
		{
			sum+=x;
		}
		System.out.println("sum="+sum+";");
	}
	
}
