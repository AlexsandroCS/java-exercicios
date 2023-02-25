package model.exceptions;

public class DomainException extends Exception{
    private static final long serialVersionUID = 1;
    public DomainException(String msg){
        super(msg);
    }
}