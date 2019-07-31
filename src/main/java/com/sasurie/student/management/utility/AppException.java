package com.sasurie.student.management.utility;

import java.util.ArrayList;
import java.util.List;

public class AppException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private List <ErrorCode> ErrorCode = new ArrayList<ErrorCode>();

    public AppException(Exception e) {
        super(e);
    }

    public AppException(List<ErrorCode> Error) {

        super();
        this.ErrorCode = Error;
    }

    public AppException(ErrorCode Error, Throwable cause) {

        super(cause);
        this.ErrorCode.add(Error);
    }

    public AppException(ErrorCode Error) {

        super();
        this.ErrorCode.add(Error);
    }

    public List<ErrorCode> getErrorCode() {
        return ErrorCode;
    }

    public void setErrorCode(List<ErrorCode> ErrorCode) {
        this.ErrorCode = ErrorCode;
    }
}
