package part1;
class langfunda{
byte b;short s;int i;long l;double d; float f;boolean bl;langfunda lf;String str;
char c1=' ',c2='5',c3=2,c4=16,c5=65533,c6='\u0845',c7=175,c8='\103';
int i1=0101,i2=1010,i3=0Xe9f,i4=0b1010010,i5=0X1_A_f;
void show() {
System.out.println("bye-"+b+" short-"+s+" int-"+i+" long-"+l+" double-"+d+" float-"+f
		+" boolean-"+bl+" langfunda-"+lf+" String-"+str);	
System.out.println( c1+" :"+c2+" :"+c3+" :"+c4+" :"+c5+" :"+c6+" :"+c7+" :"+c8);
System.out.println( i1+" :"+i2+" :"+i3+" :"+i4+" :"+i5);
}}

class operator{
	void m1() {
		int a=125;
		byte b=(byte) +(a++);
		a+=++a;
		int c=a;
		int d=true?10:20;
	System.out.println("String concatination "+9);
	System.out.println(90+9+" String concatination");
	System.out.println("increment "+ (a));
	System.out.println("increment "+ (++a));
	System.out.println("decrement "+ (--a));
	System.out.println("increment "+ (++a));
	System.out.println("increment "+ (++a));
	System.out.println("increment "+ b);
	System.out.println("increment "+ c);
	System.out.println("ternary operator "+ d);
}}
class controlstmt{
void m2() {
	char ch='A';
	if(ch>=65 && ch<=90) {
		switch(ch) {
		case 'A':
			System.out.println("charactor is vovel-A");
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("charactor is vovel-U");
			break;
			default:
				System.out.println("charactor is consonant");
		}}else {
			System.out.println("invalid alphabet");
		}
	int n2=5,i2=0;
	while(i2++<2) {
		System.out.println("while loop "+n2*i2);
	}
	do {
		System.out.println("do while "+n2);
		n2--;
	}while(n2>3);
	int arr[][]=new int[][] {{10,20,30},{2},{3,5,7,9},{40,50,60,70,80}};
	for(int arr1[]:arr) {  
		for(int ar:arr1) {
			System.out.print("\t"+ar);
			}
			System.out.println(" - inhanced for each loop ");
	}}}
class oops{
// In java, abstraction is achieved by interfaces and abstract classes.
	
/*encapsulation is a programming technique that binds the class members
(variables and methods) together and prevents them from being accessed by other classes
for example:-setter & getter method.*/

/* inheritance is a process of writing new class by inheriting commonly used state and
behavior of existing class. 
1.Simple inheritance(One super class has one sub class) 
2.Multilevel inheritance(One super class has only one direct sub class)
3.Hierarchical inheritance(One super class has many direct sub class)
4.Multiple inheritance(one sub class has multiple super class,supported by interface)
5.Hybrid inheritance(combination of two or more inheritance) */

/*polymorphism(one name many forms),polymorphism is ability of an object to behave 
 differently at different situation.
 1.Static polymorphism (achived by method overloading also called as compile time 
 ,achived by static/instance method).
 2.Dynamic polymorphism (achived by method overriding also called as run time 
 achived by only  only instance method )*/
	
/*Abstract class/method->abstract class can't be instansiated but can be sub classed,
 abstract class used for default vihaviour in sub class.
 Abstract method has no body it should always declared in abstract class.*/
	
/*interface is a keyword which is used to define user define data types,interface is a 
special class which is fully abstracted,used for achiving multiple inheritance.	
interface method has no any body.
 */
	int a;
	static int b;
	{
	System.out.println("non static block executed every object creation time");		
	}
	static{
	System.out.println("static block executed only one time");	
	}
	int id;
	String name;
	oops(int id,String name){
		System.out.println("2 argument constructor");
		this.id=id;
		this.name=name;
	}
	oops(){}
	public void m3() {
		System.out.println("constructor value-"+id+" albert");	
	
	
		
	}
}
public class part1 {
public static void main(String[] args) {
	langfunda lang=new langfunda();
	lang.show();
	operator o=new operator();
	o.m1();
	controlstmt c=new controlstmt();
	c.m2();
	oops op=new oops(101,"albert");
	op.m3();
	System.out.println("non static variable:-"+new oops().a);
	System.out.println(" static variable:-"+ oops.b);
	}

}
