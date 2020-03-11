package Designpatterns.DesignPatterns;

public class Singleton {
private static Singleton singleinstance;
public Singleton() {}
public static Singleton getInstance() {
	if (singleinstance==null) {
		singleinstance=new Singleton();
	}
	return singleinstance;
}

}