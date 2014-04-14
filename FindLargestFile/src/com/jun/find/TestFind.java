package com.jun.find;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jun.common.Constant;
import com.jun.common.FindException;
import com.jun.read.IReadDirectory;
import com.jun.read.impl.ReadDirectory;

/**
 * This class is just to show the getLargestFile(), and output their name with main method.
 * 
 * @author Jun
 * 
 */
public class TestFind {

    private static IReadDirectory readDirectory;

    public static void main(String[] args) {
        readDirectory = new ReadDirectory();

        SortFile sortFile = new SortFile();
        try {
            List<File> list = sortFile.getTenLargestFiles(readDirectory
                    .list(Constant.DIRECTORY));

            // Output ten largest files existing in the given directory.
            for (File file : list) {
                System.out.println(file.getName());
            }
        } catch (FindException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
