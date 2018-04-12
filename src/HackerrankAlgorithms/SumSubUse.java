package HackerrankAlgorithms;

public class SumSubUse implements Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("enter 2 num ");
     Interface1 obj1=new SumImpl();
     obj1.sum(a, b);
     Interface1 obj2= new SubImpl();
     obj2.sub(a, b);
	}

	@Override
	public void sum(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		
	}

}
