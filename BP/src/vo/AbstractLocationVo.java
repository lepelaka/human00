package vo;

public abstract class AbstractLocationVo {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public AbstractLocationVo() {}
	public AbstractLocationVo(String name) {
		this.name = name;
	}
	public static AbstractLocationVo getInstance(String type, String name) {
		switch (type) {
		case "city":
			return new CityVo(name);
		case "tour":
			
			break;
		case "event":
			return new EventVo(name);

		default:
			break;
		}
		return null;
	}

	@Override
	public String toString() {
		return getName();
	}
}
