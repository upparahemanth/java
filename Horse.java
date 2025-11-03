package variables;

public class Horse {
	String name;
	double height;
	
	void run() {
		System.out.println( name+"is Running wlidly");
	}
	
	void jump() {
		double height=10.0;
		System.out.println(name+"is of height"+this.height+"is trying to jump of height"+height);
		
	}
}
