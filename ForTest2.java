//���Ƕ����ʽ,��ʵ��������л������.
//ѭ��Ƕ��
//��ѭ����������,��ѭ������ÿһ�е�����,Ҳ����һ����Ԫ�صĸ�����
class ForTest2
{
	public static void main(String[] args) 
	{
		shun();
		dao();
	}

	public static void shun()
	{
		for (int x=1; x<=5; x++)
		{
			for (int y=1; y<=x; y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------");
	}

	public static void dao()
	{
		for (int x=5; x>=0; x--)
		{
			for (int y=1; y<=x; y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
