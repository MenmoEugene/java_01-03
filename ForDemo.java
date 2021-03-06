/*
for(初始化表达式; 循环条件表达式; 循环后的操作表达式)
{
	执行语句;
}

for和while的区别：如果变量的循环只为增量存在，控制循环的次数，那就用for，for循环已结束变量就在内存中消失。
	而while循环结束，变量仍然会存在于内存中。
*/
class ForDemo
{
	public static void main(String[] args) 
	{
		/*
		第一步读初始化表达式,在内存中开辟一块空间,并赋值;
		第二步,读循环表达式,满足表达式后,开始走循环体
		第三步,执行循环后的操作表达式
		第四步,条件若还满足,继续判断条件表达式是否还满足,满足则再走循环体,
		再走循环后的操作表达式,再读循环条件表达式...直到不满足循环条件结束跳出循环.
		*/

		for (int x=0; x<3; x++)
		{
			System.out.println("x="+x);
		}
	}
}
/*
1,变量有自己的作用域.对于for来讲: 如果将用于控制循环的增量定义在for语句中,那么该变量只在for语句内有效.
 for语句执行完毕,该变量在内存中被释放.

2,for和while可以进行互换。如果需要定义循环增量，用for更为合适。

总结：
	什么时候使用循环结构？
	当要对某些语句执行很多次时，就使用循环结构。
*/