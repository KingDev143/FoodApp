package com.jsp.project.Response;

public class ResponseStructure<T> {
	private int PostNo;
	private String message;
	private Object data;

	public int getPostNo() {
		return PostNo;
	}

	public void setPostNo(int postNo) {
		PostNo = postNo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResponseStructure [PostNo=" + PostNo + ", message=" + message + ", data=" + data + "]";
	}
}
