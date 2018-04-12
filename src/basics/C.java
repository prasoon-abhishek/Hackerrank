package basics;

public class C {

	static void setShow(A obj){
		System.out.println("set show method");
	}
	public static void main(String[] args) {
		setShow(new A() {
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("show method");
			}
		});
	}
	
}
