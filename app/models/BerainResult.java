package models;

public class BerainResult<T> {

	public int code;
	public String message;
	public T data;

	public BerainResult(int code, String message, T data) {
		this(code, message);
		this.data = data;
	}

	public BerainResult(Status status, T data) {
		this(status);
		this.data = data;
	}

	public BerainResult(Status status) {
		super();
		this.code = status.getCode();
		this.message = status.getMsg();

	}

	public BerainResult(int code, String message) {
		super();
		this.code = code;
		this.message = message;

	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "BerainResult [code=" + code + ", message=" + message
				+ ", data=" + data + "]";
	}

}