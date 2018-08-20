package code.improvement.algorithms.euclid;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EuclidTest {

    Euclid e = new Euclid();

    @Before
    public void init() {
        e = new Euclid();
    }

    @Test
    public void gcdTest() {
        Assert.assertEquals(2, e.gcd(10,2));
        Assert.assertEquals(2, e.gcd(22,6));
        Assert.assertEquals(30, e.gcd(30,30));

    }

    @Test
    public void gcd2Test() {
        Assert.assertEquals(2, e.gcd2(10,2));
        Assert.assertEquals(2, e.gcd2(22,6));
        Assert.assertEquals(30, e.gcd2(30,30));

    }

    @Test
    public void gcdVsGcd2Test() {
        Assert.assertEquals(e.gcd2(10,2), e.gcd2(10,2));
        Assert.assertEquals(e.gcd2(22,6), e.gcd2(22,6));
        Assert.assertEquals(e.gcd2(30,30), e.gcd2(30,30));

    }
}
