package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

interface interface1{
public void m1(int a,int b);
}
interface interface2{
public int m2(int a);
}
interface interface3{
	public static void m2() {
		System.out.println("from interface3 static method m2");
	}
	default void m3() {
	System.out.println("inside interface3 defaault");
	}
}
class test3 implements interface3{
	public void m3() {
    System.out.println("inside test3 class implements");
    interface3.super.m3();
	}
}
class emp1{
	String name;
	int salary;
	emp1(String name,int salary){
		this.name=name;
		this.salary=salary;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "emp1 [name=" + name + ", salary=" + salary + "]";
	}
	}

class Student{
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
}

 class Movie {
	String MName;
	Movie(String MName){
	this.MName=MName;
	}
}
class bifun{
	int bno;
	String name;
	public bifun(int bno, String name) {
		super();
		this.bno = bno;
		this.name = name;
	}
}



public class java8 {
public static void main(String[] args) {
interface1 i1=(a,b)->System.out.println("Sum is-"+(a+b));
i1.m1(10, 20);
interface2 i2=a->a*a;
System.out.println("multiplication is-"+i2.m2(10));
Runnable r1=()->{
	for(int i=0;i<5;i++) {
	System.out.println(i+"-child thread");
	}};
	Thread t1=new Thread(r1);
	t1.start();
	Callable<String> c = () -> {   // Lambda Expression
        int n = 0;
        for(int i = 0; i < 100; i++) {
           n += i;
        }
        return "Callable:-"+ n;
     }; 
     ExecutorService executor=Executors.newSingleThreadExecutor();
     Future<String> future = executor.submit(c);
	 System.out.println(future);
	test3 t3=new test3();
	t3.m3();
	interface3.m2();
	
	Predicate<Integer>p1=i->i%2==0;
	System.out.println(p1.test(15));
	String[] st1= {"albert","maxwell","thomsan","alva","newton","lamda","pythagorus"};
	Predicate<String> p2=p3->p3.length()>7;
	for(String st2:st1) {
		if(p2.test(st2)) {
			System.out.println(st2);
		}}
	ArrayList<emp1> l=new ArrayList<emp1>();
	l.add(new emp1("albert",5000));l.add(new emp1("newton",25000));
	l.add(new emp1("thomson",15000));l.add(new emp1("alva",55000));
	l.add(new emp1("merry",35000));l.add(new emp1("stefan",45000));
	Predicate<emp1>p4=p5->p5.salary>20000;
	for(emp1 e1:l) {
		if(p4.test(e1)) {
		System.out.println(e1.name+":"+e1.salary);
		}}
	Function<Integer,Integer>f2=f1->f1*f1;
	System.out.println("function "+f2.apply(10));
	
	Function<String,Integer>f3=f4->f4.length();
	System.out.println("function length "+f3.apply("hello length"));
	
	Function<Student,String>f5=s->{
	int marks=s.marks;
	String grade=" ";
	if(marks>=80) grade="A";
	else if(marks>=60) grade="B";
	else if(marks>=50) grade="C";
	else if(marks>=35) grade="D";
	else grade="E";
	return grade;
	};
	Student[] s= { new Student("albert",100),new Student("johnson",70),
			new Student("alva",60),new Student("newton",50),
			new Student("merry",40),new Student("stefan",20),
			
	}; 
	for(Student st:s) {
	System.out.println("Student Name:-"+st.name);
	System.out.println("Student Marks:-"+st.marks);
	System.out.println("Student Grade:-"+f5.apply(st));
	}
	Consumer<String> cx=c1->System.out.println(c1);
	cx.accept("from consumer-1");cx.accept("from consumer-2");
	Predicate<Student> st3=st4->st4.marks>=60;
	Consumer<Student> c3=c4->{
		System.out.println("Student Name-"+c4.name);
		System.out.println("Student Marks-"+c4.marks);
		System.out.println("Student Grade-"+f5.apply(c4));
	};
	for(Student st6:s) {
		c3.accept(st6);
	}

Consumer<Movie> m1=m->System.out.println(m.MName+" Ready to release");
Consumer<Movie> m2=m->System.out.println(m.MName+" release but bigger flop");
Movie mv=new Movie("Avtar");
m1.accept(mv);m2.accept(mv);

Supplier<Date> sp=()->new Date();
System.out.println(sp.get());
Supplier<String> sp1=()->{
String otp=" ";
for(int i=0;i<6;i++) {
otp=otp+(int)(Math.random()*10);
}
return otp;
};
System.out.println(sp1.get());

BiPredicate<Integer,Integer>bp=(a,b)->(a+b)%2==0;
System.out.println("BiPredicate "+bp.test(10,15));

List<bifun> l2=new ArrayList<bifun>();

BiFunction<Integer,String,bifun>bf1=(bno,name)->new bifun(bno,name);
l2.add(bf1.apply(100, "albert"));
l2.add(bf1.apply(200, "albert"));
l2.add(bf1.apply(300, "albert"));
l2.add(bf1.apply(400, "albert"));
l2.add(bf1.apply(500, "albert"));
for(bifun bf2:l2) {
	System.out.println("Emp no: "+bf2.bno);
	System.out.println("Emp name: "+bf2.name);
	System.out.println();
}
List<Integer> list3=new ArrayList<Integer>();
list3.add(100);list3.add(70);list3.add(10);list3.add(180);
list3.add(90);list3.add(50);list3.add(120);list3.add(140);
Comparator<Integer>c5=(i8,i9)->(i8<i9)?-1:(i8>i9)?1:0;
Collections.sort(list3,c5);
System.out.println(list3);
Collections.sort(l,(e1,e2)->e1.name.compareTo(e2.name));
System.out.println(l);

List<Integer> marks=new ArrayList<Integer>();
marks.add(5);marks.add(5);marks.add(0);marks.add(10);marks.add(15);marks.add(20);marks.add(35);marks.add(45);
System.out.println(marks);
List<Integer>EvenMarks=marks.stream().filter(i->i%2==0).collect(Collectors.toList());
System.out.println(EvenMarks);
List<Integer>updatedMarks=marks.stream().map(i->i+5).collect(Collectors.toList());
System.out.println(updatedMarks);
long countNo=marks.stream().filter(i->i>20).count();
System.out.println(countNo);
List<Integer>sortedMarks=marks.stream().sorted(( y1, y2)->((y1<y2)?1:(y1>y2)?-1:0)).collect(Collectors.toList());
System.out.println(sortedMarks);
Integer min=marks.stream().min(( y1, y2)->y1.compareTo(y2)).get();
Integer max=marks.stream().max(( y1, y2)->y1.compareTo(y2)).get();
System.out.println("minimum : "+min+"  maximum : "+max);
marks.stream().forEach(System.out::println);
List<Integer> dup=new ArrayList<Integer>();
for(Integer dup1:marks) {
	if(!dup.contains(dup1)) {
		dup.add(dup1);
	}}
	System.out.println(dup);
}}
		
	

