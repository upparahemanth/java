package var;

public class Mol {
	void login(String username,String password) {
		System.out.println("You have loged in in using your Username "+username+" and password");
		
	}
	void login(long MobNum, int otp) {
		System.out.println("You have loged in using your mobile number "+MobNum);
		
	}
	void login(String email,int password) {
		System.out.println("you have loged in using your emailid  "+email);
	}
	
	public static void main (String args[]) {
		Mol m=new Mol();
		m.login(9638527410l, 02120);
		m.login("Hemanth", "Nani123");
		m.login("hemanth@gmail.com","Nanai123");
	}
	

}
