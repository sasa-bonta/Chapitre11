package com.company.CatchingExceptions;

public class ExceptionC extends ExceptionB{

    @Override
    public String throwException() throws ArithmeticException {
        return super.throwException().replace("B","C");
    }
}
