package code.improvement.algorithms;

import code.improvement.algorithms.SecAndMins;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SecAndMinsTest {

    /**
     * Do not need @before b/c SecAndMins is static
     */
//
//    SecAndMins sm = null;
//
//
//    @Before
//    public void init() {
//        sm = new SecAndMins();
//    }

    @Test
    public void getDurationStringTest() {
        Assert.assertEquals("00h 01m 00s", SecAndMins.getDurationString(60));
        Assert.assertEquals("00h 01m 10s", SecAndMins.getDurationString(70));
        Assert.assertEquals("01h 10m 00s", SecAndMins.getDurationString(70, 0));
        Assert.assertEquals("01h 10m 15s", SecAndMins.getDurationString(70, 15));

//        public static void main(String[] args) {
//
//            System.out.println(getDurationString(65, 45));
//            System.out.println(getDurationString(3945L));
//            System.out.println(getDurationString(-41));
//            System.out.println(getDurationString(65, 9));
//        }
    }
}
