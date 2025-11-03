package Day3;

public class Machine {
	energy produces(fule f){
		energy e =new energy();
		System.out.println("MAchine consumes fule to produce energy");
		return e;
	}
	public static void main (String[] args) {
		Machine m=new Machine() ;
		fule f1=new fule();
		energy em=m.produces(f1);
		System.out.println(em);
		
		
	}
	
}

class energy{
	
}

class fule{
	
}