package code.improvement.algorithms.utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleUtilsTest {

    SimpleUtils utils = null;

    @Before
    public void init() {
        utils = new SimpleUtils();
    }

    @Test
    public void stringToBooleanTrueTest() {
        Assert.assertTrue(utils.stringToBoolean("Y"));
    }

    @Test
    public void stringToBooleanFalseTest() {
        Assert.assertFalse(utils.stringToBoolean("n"));
        Assert.assertFalse(utils.stringToBoolean(null));

    }

    @Test
    public void getFileTypeByCode() {
        Assert.assertEquals(SimpleUtils.FileType.PDF, utils.getFileTypeByCode(3));
        Assert.assertEquals(SimpleUtils.FileType.JPEG, utils.getFileTypeByCode(1));
    }

    @Test
    public void getFileTypeByName() {
        Assert.assertEquals(SimpleUtils.FileType.TEXT, utils.getFileTypeByName("txt"));
        Assert.assertNull(utils.getFileTypeByName("text"));
    }
}
