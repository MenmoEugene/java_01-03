class FunctionDemo2 
{
	public static void main(String[] args) 
	{
//		int sum = getSum(6,8);
//		
//		System.out.println("sum="+sum);
		System.out.println(compareTo(-22,22));
	}
	/*
	��ζ���һ��������
	1����Ȼ������һ�������Ĺ��ܣ���ô�ù��ܵ���������ʲô����ȷ��
	2������ȷ����ù��ܵĹ������Ƿ���Ҫδ֪�����ݲ������㡣

	���󣺶���һ��3+4�����㣬����������ظ������ߡ�

	1����ȷ���ܵĽ������һ�������ĺ͡�
	2����ʵ�ָù��ܵĹ������Ƿ���δ֪���ݲ������㣺û�С�
	��ʵ���������ܾ�������ȷ�����Ķ��塣

	1��������ȷ�����ķ���ֵ���͡�
	2����ȷ�����Ĳ����б�(���������ͺͲ����ĸ���)��
	
	*/
	public static int getSum(int x,int y)
	{
		return x+y;
	}

/*
	���󣺶��幦�ܣ������������бȽϣ���ȡ�ϴ������

*/
	public static int compareTo(int a ,int b)
	{
		return (a>b)?a:b;
	}
}
