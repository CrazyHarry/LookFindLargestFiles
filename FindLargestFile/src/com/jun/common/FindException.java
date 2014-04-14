package com.jun.common;

/**
 * Defined one exception named FindException in this class, it will contain all
 * exception message while executing this project.
 * 
 * @author Jun
 * 
 */
public class FindException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -9025448161798452459L;

    public FindException(String msg) {
        super(msg);
    }
}
