package chap08;

public class MyException extends Exception{
	private final int ERR_CODE;

	public MyException(String msg, int err_code) {
		super(msg);
		ERR_CODE = err_code;
	}
	
	public MyException(String msg) {
		this(msg, 100);
	}
	
	public int getErrCode() {
		return ERR_CODE;
	}
	
}
