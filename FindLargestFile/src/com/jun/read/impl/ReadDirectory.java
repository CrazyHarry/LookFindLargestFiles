package com.jun.read.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.jun.common.Constant;
import com.jun.common.FindException;
import com.jun.read.IReadDirectory;

/**
 * @author Jun
 * 
 */
public class ReadDirectory implements IReadDirectory {

    /*
     * (non-Javadoc)
     * 
     * @see com.jun.read.IReadDirectory#list(java.lang.String)
     */
    @Override
    public List<File> list(String directory) throws FindException {
        if (directory.equals("")) {
            throw new FindException(Constant.DIRECTORY_NULL);
        }

        File file = new File(directory);

        // Check if the given directory path is valid.
        if (!file.isDirectory()) {
            throw new FindException(Constant.DIRECTORY_INVALID);
        }

        List<File> list = new ArrayList<File>();

        // Traversals the directory and add each file into list.
        String[] files = file.list();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                File readfile = new File(directory + "\\" + files[i]);
                if (readfile.isDirectory()) {
                    List<File> sub_directory_files = list(directory + "\\"
                            + files[i]);
                    list.addAll(sub_directory_files);
                } else {
                    list.add(readfile);
                }
            }
        }

        return list;
    }

}
