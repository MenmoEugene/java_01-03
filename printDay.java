class printDay 
{
	public static void main(String[] args) 
	{
		printDay(4);
	}
	public static void printDay(int a)
	{
		if (a==1)
		sop("����һ");
		else if(a==2)
		sop("���ڶ�");
		else if(a==3)
		sop("������");
		else if(a==4)
		sop("������");
		else if(a==5)
		sop("������");
		else if(a==6)
		sop("������");
		else if(a==7)
		sop("������");
		else
		sop("������");
	}
	public static void sop(Object obj)
	{System.out.println(obj);}
}
