package springCore;

public class pojoConstructor {
int name;
int persionId;
public pojoConstructor(int name, int persionId) {
	super();
	this.name = name;
	this.persionId = persionId;
}
@Override
public String toString() {
	return "pojoConstructor [name=" + name + ", persionId=" + persionId + "]";
}

}
