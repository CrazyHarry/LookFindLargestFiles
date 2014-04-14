package com.jun.find;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.jun.common.FindException;

/**
 * In this class, provides two methods, one is to sort files and the other is to
 * get ten files from the sorted result from last.
 * 
 * @author Jun
 */
public class SortFile {

    /**
     * Lists all files existing in directory after sorting them.
     * 
     * @param files
     * @return file list
     * @throws IOException
     * @throws FindException
     */
    public File[] sortAll(List<File> list) throws FindException, IOException {
        File[] files = list.toArray(new File[0]);

        // Sort file array with bubble sort.
        for (int i = 0; i < files.length - 1; i++) {
            for (int j = i + 1; j < files.length; j++) {
                File temp = null;
                if (files[i].length() > files[j].length()) {
                    temp = files[i];
                    files[i] = files[j];
                    files[j] = temp;
                }
            }
        }

        return files;
    }

    /**
     * Gets ten files existing in the given directory and its sub directory.
     * 
     * @param files
     * @return file list
     * @throws FindException
     * @throws IOException
     */
    public List<File> getTenLargestFiles(List<File> filelist)
            throws FindException, IOException {
        List<File> list = new ArrayList<File>();
        // sort the given files.
        File[] files = sortAll(filelist);

        // When the count of files is than 10, we just get 10 largest files.
        // Otherwise, we will get all files.
        if (files.length > 10) {
            for (int i = files.length - 1; i > files.length - 11; i--) {
                File file = files[i];
                list.add(file);
            }
        } else {
            for (int i = files.length - 1; i > 0; i--) {
                File file = files[i];
                list.add(file);
            }
        }

        return list;
    }
}
