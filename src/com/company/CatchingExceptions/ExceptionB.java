package com.company.CatchingExceptions;


public class ExceptionB extends ExceptionA{

    @Override
    public String throwException() throws ArithmeticException {
        return super.throwException().replace("A", "B");
    }
}
