package com.jun.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.jun.common.Constant;
import com.jun.common.FindException;
import com.jun.read.IReadDirectory;
import com.jun.read.impl.ReadDirectory;

/**
 * @author Jun
 * 
 */
public class ReadDirectoryTest {

    private IReadDirectory readDirectory;

    /**
     * 
     */
    public ReadDirectoryTest() {
        this.readDirectory = new ReadDirectory();
    }

    /**
     * Test method for
     * {@link com.jun.read.impl.ReadDirectory#list(java.lang.String)}.
     */
    @Test
    public void testList() {
        try {
            assertNotNull(readDirectory.list(Constant.DIRECTORY));
        } catch (FindException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
