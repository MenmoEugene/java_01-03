class Switch
{
	public static void main(String[] args) 
	{
		char ch=13;
	
		switch (ch)
		{
		case 3: 
		case 4: 
		case 5: 
			sop("����");break;
		case 6: 
		case 7: 
		case 8: 
			sop("�ļ�");break;
		case 9: 
		case 10: 
		case 11: 
			sop("�＾");break;
		case 1: 
		case 2: 
		case 12: 
			sop("����");break;
		default:
			sop("�����ڸ��·�");
		}
	}
	public static void sop(Object obj)
	{System.out.println(obj);}
}
