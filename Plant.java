package Day3;

// Plant takes 1 liter of water and produces 1 unit of Oxygen

public class Plant {
	oxygen produces(water w) {
		oxygen o= new oxygen();
		o.unit=1;
		System.out.println("Plant produces "+o.unit+" Unit of Oxygen by taking "+w.liter+" Liter of water");
		return o;
		
	}
	public static void main(String args[]) {
		Plant p=new Plant();
		water w=new water();
		w.liter=1;
		oxygen ox=p.produces(w);
		System.out.println(ox); 	

	}

}
 
class water{
	public int water;
	int liter;
	
}

class oxygen{
	int unit;
	

}