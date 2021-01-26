package chap09;

// 전화번호부
// 비지니스 로직 : 전화번호는 유일해야한다.
public class Addr implements Cloneable { 
	private String name; 	// 이름
	private String phone;	// 전화번호
	
	public Addr() {	}
	
	public Addr(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Addr) {
			return phone == ((Addr) obj).phone;
		} 
		else {
			return false;
		}
//		return obj != null && obj instanceof Addr && phone == ((Addr)obj).phone;
	}
	@Override
	public Addr clone() { // 공변반환타입
		// TODO Auto-generated method stub
		Addr addr = null;
		try {
			addr = (Addr) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return addr;
	}
	
	
	
	
	
}
