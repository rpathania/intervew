
public class ConstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A b = new A(10);
		
	System.out.println(b.getX());
		

	}

}


class A{

	private int x=2;
	A(){
		System.out.println("Default Constructor");
		x=9;
	}
	
	A(int y){
		System.out.println("Param Constructor");
		//this.x=x;
		y=this.x;
		System.out.println("y="+y);
		
	}
	public int getX() {
		return this.x;
	}
}