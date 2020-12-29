package company.v2.repository;

import java.io.IOException;

public class NumberRepositoryException extends Exception{

    public NumberRepositoryException(String s, Exception e) {
        // calling super class constructor
        super(s,e);
    }
}
