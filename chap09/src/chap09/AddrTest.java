package chap09;

public class AddrTest {
	public static void main(String[] args) {
		AddrService service = new AddrService();
		service.add(new Addr("김기영", "010-0000-0000"));
		service.add(new Addr("구본희", "010-1111-1111"));
		service.add(new Addr("신세영", "010-2222-2222"));
		service.add(new Addr("김소연", "010-3333-3333"));
		service.add(new Addr("김보경", "010-1111-1111"));
		
		System.out.println(new Addr("김보경", "010-1111-1111"));
		
		service.list();
	}
}

