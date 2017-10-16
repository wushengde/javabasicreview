package chapter3;

//java应用程序中的全部内容都必须放在类中
public class FirstSample {
	public static void main(String\u005B\u005D args) {
		System.out.println("We will not use 'Hello World!'");
		System.out.println(Double.isNaN(10));
		System.out.println(2.0-1.1);
		int a=1;
		System.out.println(a);
		
		double x=4;
		//开方
		double y=Math.sqrt(x);
		System.out.println(y);//2.0
		
		//取幂
		double z=Math.pow(2,3);
		System.out.println(z);//8.0
		
		System.out.println(Math.PI);
		
		double xy=9.999;
		//强制类型转换
		int xyz=(int)xy;//9
		//四舍五入
		int xxx=(int)Math.round(xy);//10
		System.out.println(xyz+","+xxx);
		
		String e = "";
		String greeting = "Hello";
		System.out.println(e + greeting);
		//substring()方法从一个字符串中提取一个子字符串。以下提取0-2 不包含3：优点利于计算子字符串长度
		//s.substring(a,b)的长度为b-a
		System.out.println(greeting.substring(0, 3));
		
		//将"Hello" 快速改为："Help!"的方法
		System.out.println("Hello".substring(0, 3)+"p!");
		
		//判断两个字符串是否相等，可以使用equals()方法，如：s.equals(t),s与t可以是字符串变量，也可以是字符串常量
		System.out.println(e.equals(greeting));
		System.out.println("Hello".equals(greeting));
		
		//不区分大小写，比较两个字符串是否相等可以使用：equalsIgnoreCase()方法
		System.out.println("HELLO".equalsIgnoreCase(greeting));
		
		//空串与Null串：空串是长度为0的字符串,空串是一个java对象，有自己的长度(0)和内容(空)
		//检查一个字符串是否为空：
		if(e.length()==0){}
		if(e.equals("")){}
		//检查一个字符串是否为null：
		String abc= null;
		if(abc == null){
			abc = "123";
		}
		System.out.println();
		
		//检查一个字符串既不是null也不为空的方法：注意先检查是否为null，再检查是否为空
		if(abc != null && abc.length() != 0){}
		
		System.out.println("===========================================================================================================================================");
		
		//String中常用的方法汇总：greeting 的值为：Hello
		System.out.println(greeting.charAt(0));//H  charAt(x)返回索引为x处的字符
		System.out.println(greeting.codePointAt(3));//108  codePointAt(x)返回给定位置的代码点,即:此字符的：Unicode编码
		System.out.println(greeting.endsWith("ello"));//true  endsWith(str)如果字符串以str结尾则返回true，否则返回false
		System.out.println("Hello".equals(greeting));//true  equals(str)如果两个字符串值相等，则返回true
		System.out.println("hello".equalsIgnoreCase(greeting));//true  equalsIgnoreCase(str)如果两个字符串忽略大小写后值相等则返回true
		System.out.println(greeting.isEmpty());//false  isEmpty()判断一个字符串是否空字符串，当且仅当length()为0时返回true
		System.out.println(greeting.indexOf('l'));//2  indexOf()此处根据参数不同，返回指定字符 或者指定子字符串 第一次出现的位置处的索引
		System.out.println(greeting.indexOf("el"));//1
		System.out.println(greeting.lastIndexOf('l'));//3  lastIndexOf()根据参数不同，返回指定字符 或 指定 子字符串最后一次出现处的索引
		System.out.println(greeting.length());//5  length()方法返回字符串的长度
		System.out.println(greeting.replace('l', 's'));//Hesso  replace(oldchar,newchar)将此字符串中所有的oldchar字符替换为newchar字符后返回新的字符串
		System.out.println(greeting.replaceAll("el", "tt"));//Httlo  replaceAll(String regex, String replacement) 使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
		System.out.println(greeting.startsWith("Hel"));//true  startsWith(str)判断字符串是否以指定的前缀开始，如果是返回true，否则返回false
		System.out.println(greeting.substring(3));//lo  substring(x)返回包含指定位置索引处开始到结束的子字符串
		System.out.println(greeting.substring(1, 3));//el  substring(startindex,endindex)返回包含startindex索引不包含endindex索引组成的子字符串
		System.out.println(greeting.toLowerCase());//hello  toLowerCase()将此字符串中所有字符转换为小写
		System.out.println(greeting.toUpperCase());//HELLO  toUpperCase()将此字符串中所有字符转换为大写
		System.out.println(greeting.trim());//Hello  trim()去掉此字符串开头与结尾处的空白，即：空格
		char[] ch ={};
		ch = greeting.toCharArray();//将字符串转换为字符数组
		for(char c1:ch){
			System.out.print(c1+" ");
		}
		System.out.println();
		
		System.out.println("===========================================================================================================================================");
		
		//StringBuilder类的使用:当需要用许多小段的字符串构建字符串时，不宜采用String构建，这样会生成很多对象占用内存，此时使用StringBuilder很合理
		StringBuilder builder = new StringBuilder();//builder是一个字符串的构造器
		
		//当每次需要添加内容时，调用append()方法
		builder.append('H');
		builder.append("el");
		builder.append("lo");
		
		//当需要获取StringBuilder的字符串值时，调用其toString()方法即可。
		String str = builder.toString();
		System.out.println(str);
		
		//StringBuilder类中常用方法：
		System.out.println(builder.length());//5  length()返回构建器或缓冲器中代码单元的数量
		System.out.println(builder.append(" World!").toString());//Hello World!  appende()方法根据参数类型不同可以将，int、char、string等等类型追加到构造器中
		builder.setCharAt(0, 'S');//void  setCharAt(int index,char c)将index索引处的字符改为c
		System.out.println(builder.toString());
		builder.setCharAt(0, 'H');
		System.out.println(builder.insert(0, "Ye! ").toString());//Ye! Hello World!  insert(int offset,String str)在指定索引offset前插入str字符串或者字符后返回新的构造器
		System.out.println(builder.insert(0, 'H').toString());//HYe! Hello World!
		System.out.println(builder.delete(0, 3).toString());//! Hello World!  delete(int start,int end)删除从索引start(包含该位置)到索引end(不包含该位置)的字符串，返回新的构造器
		
		System.out.println("===========================================================================================================================================");
		
		
	}
}
