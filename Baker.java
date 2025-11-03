package Day3;

// Baker uses 1kg of Flour to Bake 1Kg of cake

public class Baker {
	cake bake(flour f) {
		cake c=new cake();
		c.kg=1;
		System.out.println("Baker Bakes a "+c.kg+"kg Cake by using "+f.Kilo+"Kg");
		return c;
		
	}
	public static void main (String [] args) {
		Baker b=new Baker();
		flour f1=new flour();
		f1.Kilo=1;
		cake c1=b.bake(f1);
		System.out.println(c1);
				
	}
	
}

class flour{
	int Kilo;
	
}

class cake{
	int kg;
	
}