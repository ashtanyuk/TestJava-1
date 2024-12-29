package org.example;

import junit.framework.Assert;

import static org.junit.Assert.*;

public class PrimeTest {

    @org.junit.Test
    public void isPrime2() {
        Assert.assertEquals(Prime.isPrime(2), true);
    }
    @org.junit.Test
    public void isPrime3() {
        Assert.assertEquals(Prime.isPrime(3), false); // error!
    }
}
