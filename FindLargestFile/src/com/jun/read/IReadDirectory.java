package com.jun.read;

import java.io.File;
import java.util.List;

import com.jun.common.FindException;

/**
 * Declared several method in this interface for reading directory.
 * 
 * @author Jun
 * 
 */
public interface IReadDirectory {

    /**
     * List all files existing in the given directory.
     * 
     * @param directory
     * @return file list
     * @throws FindException
     */
    List<File> list(String directory) throws FindException;

}
