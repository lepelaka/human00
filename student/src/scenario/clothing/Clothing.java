package scenario.clothing;

public class Clothing {
	// 의류 : 코드(정수), 색상(문자열?), 사이즈(문자열), 상하의(불린), 원단(문자열), 계절(문자열)
	private int code; // 의류코드
	private String color; // 색상
	private String size; // 사이즈
	private boolean upper; // 상하의구분
	private String fabric; // 원단
	private String season; // 계절

	public Clothing() {
	}

	public Clothing(int code, String color, String size, boolean upper, String fabric, String season) {
		this.code = code;
		this.color = color;
		this.size = size;
		this.upper = upper;
		this.fabric = fabric;
		this.season = season;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public boolean isUpper() {
		return upper;
	}

	public void setUpper(boolean upper) {
		this.upper = upper;
	}

	public String getFabric() {
		return fabric;
	}

	public void setFabric(String fabric) {
		this.fabric = fabric;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}
}
