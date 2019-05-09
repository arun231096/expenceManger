package com.sasurie.student.management.exceptionhandler;

public enum ErrorCode {

	SERVER_ERROR(500, "Internal Server Error");
	
    private final String errorMessage;
    private final int code;

    private ErrorCode(int code, String errorMessage) {
        this.errorMessage = errorMessage;
        this.code = code;
    }

    public String getErrorMeggage() {
        return errorMessage;
    }
    public int getCode() {
    	return this.code;
    }

}
