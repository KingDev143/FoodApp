package com.jsp.project.Exception;

import net.bytebuddy.implementation.bind.annotation.Super;

public class UserIdNotPresentException extends RuntimeException 
{
    public UserIdNotPresentException(String message)
    {
    	super(message);
    }
}
