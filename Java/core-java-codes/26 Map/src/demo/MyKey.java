package demo;


public class MyKey implements Comparable<MyKey>{
	int key;
		
	public MyKey(int key) {
		this.key = key;
	}
	
	public int getKey() {
		return key;
	}
	
	@Override
	public String toString() {
		return "\nkey=" + key;
	}

	@Override
	public int compareTo(MyKey o) {
		System.out.println("Inside compare to");
		return this.key - o.key;
	}

	@Override
	public int hashCode() {
		System.out.println("Inside hashcode");
		return key;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("In Equals");
		MyKey m = (MyKey) obj;
		if(key == m.key) {
			return true;
		}
		else {
			return false;
		}
	}

	
	
	
}
