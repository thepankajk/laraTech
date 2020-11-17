package springCore;

public class pojoRefA {
private int x;
private pojoRefB ob;
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public pojoRefB getOb() {
	return ob;
}
public void setOb(pojoRefB ob) {
	this.ob = ob;
}
public pojoRefA(int x, pojoRefB ob) {
	super();
	this.x = x;
	this.ob = ob;
}
public pojoRefA() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "pojoRefA [x=" + x + ", ob=" + ob + "]";
}

}
