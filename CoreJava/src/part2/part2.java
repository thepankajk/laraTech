package part2;

import java.io.*;
import java.util.*;

class hash{
	int x;
	int id;
	String name;
	hash(int id,String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+" : "+name;
	}}
class clone1 implements Cloneable{
	int y;
	hash h;
	clone1(int y,hash h){
		this.y=y;
		this.h=h;
	}
	//cloning(Shallow cloning)->only current object will be cloned().
	/*
	public Object clone()throws CloneNotSupportedException {
		clone1 cl1=new clone1(this.y,this.h);
		return cl1;
	} */
	//deep cloning:-(current object & member object cloned)
	
	public Object clone()throws CloneNotSupportedException {
		hash hs1=new hash(this.h.x,"planks");
		clone1 cl2=new clone1(this.y,hs1);
		return cl2;
		}
	@Override
	public String toString() {
		return "clone1 [y=" + y + ", h=" + h + "]";
	}}
final class Immutable{   
// object of class can't be modified,class as final,variable-final & private,define 
//getter method to access the object.,don't define setter
private int id;
private String name;
private String city;
public Immutable(int id, String name,String city) {
	this.id=id;this.name=name;this.city=city;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getCity() {
	return city;
}
public String toString() {
	return "id:-"+id+" Name:- "+name+ " city: "+city;
}}

class singleton{  // only one object of a prticular class is created
	private singleton() {}
	private static singleton sg=null;
	public static singleton getSingleton() {
		if(sg==null)
			sg=new singleton();
		return sg;
	}
}
class MyException extends Exception{
	String str1;
	MyException(String str1){
		this.str1=str1;
	} 
	public String toString() {
		return "My Exception class got an error:-"+str1;
	}
}
class Service{
String getExp(String sid) throws MyException {
	if (sid==null) 
	throw new NullPointerException();	
	else if (sid.isEmpty()) 
		throw new IllegalStateException();
	else if (sid.equals("manager")) 
		return "Manager login";
	else
		throw new MyException(sid);
}}

class MyThread extends Thread{
	public synchronized void run() {
		Thread t1=Thread.currentThread();
		try {
			wait(5000);
			t1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ThreadGroup tg1=t1.getThreadGroup();
		System.out.println("Thread Name:-"+t1.getName()+":"+tg1.getName()+":"+t1.isDaemon());
	}}

class Collections{
	public void col() throws IOException {
	Iterable i1=new ArrayList();
	
	Vector v1=new Vector();
	v1.addElement("vector1");v1.addElement("vector2");v1.addElement("vector3");
	
	Stack s1=new Stack();
	s1.addElement("stack1");s1.addElement("stack2");s1.addElement("stack3");
	
	Dictionary<String,String> d1=new Hashtable<>();
	d1.put("d1", "dictonary1");d1.put("d2", "dictonary2");d1.put("d3", "dictonary3");
	
	Hashtable<Integer,String> h1=new Hashtable<>();
	h1.put(1, "Hashtable1");h1.put(2, "Hashtable2");h1.put(3, "Hashtable3");
	
	Properties p1=new Properties();
	p1.put(1, "Properties1");p1.put(2, "Properties2");p1.put(3, "Properties3");
	
	System.out.println(v1+":"+s1+":"+d1+":"+":"+h1+":"+p1);
	
	List l1=new ArrayList();
	l1.add("ArrayList1"); l1.add("ArrayList2"); l1.add("ArrayList2"); l1.add("ArrayList4");
    List l2=new LinkedList();
    l2.add("LinkedList1");l2.add("LinkedList2");l2.add("LinkedList2");l2.add("LinkedList4");
    System.out.println(l1+":"+l2);
    
	Set s2=new HashSet();
	s2.add("HashSet1");s2.add("HashSet2");s2.add("HashSet2");s2.add("HashSet4");
	Set s3=new LinkedHashSet();
	s3.add("LinkedHashSet1");s2.add("LinkedHashSet2");s2.add("LinkedHashSet2");s2.add("LinkedHashSet4");
	Set s4=new TreeSet();
	s4.add("TreeSet1");s4.add("TreeSet2");s4.add("TreeSet2");s4.add("TreeSet4");
	Queue q1=new PriorityQueue();
	q1.add("Queue1");q1.add("Queue2");q1.add("Queue3");q1.add("Queue4");
	System.out.println(s2+":"+s3+":"+s4+":"+":"+q1);
	
	Map m1=new HashMap();
	m1.put(5,"HashMap1");m1.put(4,"HashMap2");m1.put(8,"HashMap3");m1.put(1,"HashMap4");
	Map m2=new LinkedHashMap();
	m2.put("albert", "LinkedHashMap1");m2.put("newton", "LinkedHashMap2");m2.put("maxwell", "LinkedHashMap3");
	Map m3=new TreeMap();
	m3.put(8,"TreeMap1");m3.put(7,"TreeMap2");m3.put(9,"TreeMap3");m3.put(5,"TreeMap4");
	System.out.println(m1+":"+m2+":"+m3);
	Iterator it=l2.iterator();
	while(it.hasNext()) {
    System.out.println(it.next());
	}
	
	File f1=new File("E:\\ab.txt");
	f1.createNewFile();
	int count=0;
	File f2=new File("E:\\file");
	String[] s=f2.list();
	for(String sf1:s) {
		count++;
		System.out.println(sf1);
	}
	System.out.println("total file no:-"+count);
	FileWriter fw1=new FileWriter("E:\\file\\a.txt");
	char ch1[]= {'x','y','z'};
	fw1.write(100);fw1.write("write name");fw1.write("\n");fw1.write(100);fw1.write(ch1);
	fw1.flush();fw1.close();
	FileReader fr1=new FileReader("E:\\file\\a.txt");
	int i2=fr1.read();
	while(i2!=-1) {
		System.out.println((char)i2);
		i2=fr1.read();
	}
	BufferedWriter bf1=new BufferedWriter(new FileWriter(new File("E:\\file\\x.txt")));
	bf1.write("hello buffered writter");bf1.write(1);bf1.write('c');bf1.flush();bf1.close();
	BufferedReader br1=new BufferedReader(new FileReader("E:\\file\\b.txt"));
	BufferedReader br2=new BufferedReader(new FileReader("E:\\file\\a.txt"));
	String line1=br1.readLine();String line2=br2.readLine();
	PrintWriter pw1=new PrintWriter("E:\\file\\c.txt");
	while(line1!=null && line2!=null) {
		pw1.println(line1);pw1.println(line2);
		System.out.println("BufferedReader: "+line1+":"+line2);
		line1=br1.readLine();line2=br2.readLine();
	}
	pw1.flush();br1.close();br2.close();
	
	
}}




public class part2 {
public static void main(String[] args)throws CloneNotSupportedException, InterruptedException, IOException {
	hash h1=new hash(10,"albert");
	hash h2=new hash(20,"newton");
	hash h3=new hash(20,"newton");
	System.out.println(h1==h2); //use for comparing primitive & reference type variable
	System.out.println(h2==h3);
	System.out.println(h1.equals(h2)); //comparing for content of object
	System.out.println(h2.equals(h3));
	System.out.println(h1.hashCode());
	System.out.println(h1.getClass());
	System.out.println(h1);
	
	hash hc=new hash(101,"albert");
	clone1 c=new clone1(501,hc);
	clone1 c2=(clone1)c.clone();//deep cloning:-(current object & member object cloned)
	System.out.println(hc);
	System.out.println("clone2 class object: "+c2);
	
	StringBuffer bf1=new StringBuffer("java");
	StringBuilder bf2=new StringBuilder("java");
	System.out.println("StringBuffer & Builder Content compare: "+bf1.equals(bf2));
	int i1=10;  // UnBoxing (Wrapper to primitive)
	Integer i2=new Integer(10);  //Boxing (Primitive to wrapper)
    System.out.println("primitive value: "+i1 +" Wrapper value: "+i2);
    
    System.out.println("from singleton: "+singleton.getSingleton());

    Immutable it1=new Immutable(101, "albert", "berline");
    Immutable it2=new Immutable(102, "newton", "london");
    System.out.println("from immutable class "+it1 +":"+ it2);
    
    String ms="";
    Service sr=new Service();
    try {
		 //ms=sr.getExp(null);
		//ms=sr.getExp("");
		//ms=sr.getExp("manager");
		System.out.println("Exception name:-"+ms);
	} catch ( Exception e) {
		e.printStackTrace();
	}
    
    MyThread mt1=new MyThread();
    MyThread mt2=new MyThread();
    MyThread mt3=new MyThread();
    mt1.setName("first thread"); mt2.setName("second thread");mt3.setName("third thread");
    mt1.setPriority(4);mt2.setPriority(10);mt3.setPriority(6);mt1.setDaemon(true);
    mt1.start();mt1.join();mt2.start();mt3.start();
    
    new Collections().col();
    
}}
