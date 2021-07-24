
import java.util.ArrayList;
public class Stack {
	ArrayList<String> a;
	private int sz;
	public Stack() {
		
	}
	public Stack(int size) {
		sz=size;
		a=new ArrayList<>(sz);
	}
	
	public void push(String x) {
		a.add(x);
	}
	public String pop1() {
		int o;String v2;
		o=a.size()-1;
		v2=a.get(o);
		return v2;
		
		
	}
	public String pop() {
		if(a.size()==0) {
			return "";
		}
		else {
			
			int v;String v1="";
			v=a.size()-1;
			//System.out.println(a.size());
			v1=a.get(v);
			a.remove(v);
			return v1;	
		}
	}
	public void traversal() {
			System.out.println(a);
		
	}
	public boolean isEmpty() {
		if(a.isEmpty()==true) {
			return true;
		}
		else {
			return false;
		}
	}

}
