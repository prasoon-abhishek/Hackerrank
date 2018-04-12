package HackerrankAlgorithms;

public class InstanceEx {

	private  String s;
	
	private InstanceEx(){
		
	}

	public InstanceEx(String string) {
		this.s = string;
		if(s.endsWith("e")){
			s="error";
		}
	}
	void f(){
		
		System.out.println(s+" "+ "here");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 
		InstanceEx obj = new InstanceEx("who is");
		obj.f();
		//System.out.println(obj.s);
	}

}
