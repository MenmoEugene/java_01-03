class OtherDemo
{
	//break��������ǰѭ��
	public static void main(String[] args) 
	{
		w:for (int x=0; x<4; x++)
		{
			q:for (int y=0; y<4; y++)
			{
				System.out.print(x);
				break q;
			}
			System.out.println();
		}
	
	//continue��ֻ��������ѭ���ṹ������ѭ�����ص㣺��������ѭ����������һ��ѭ����
		for (int x=1; x<10; x++)
		{
			if(x%2==1)
					continue;
				System.out.print(x);
		}
	}
	/*
	��ס��
		1��break��continue������õķ�Χ��
		2��break��continue��������ʱ�����治�������κ���䣬��Ϊ��ִ�в�����
	*/
}
