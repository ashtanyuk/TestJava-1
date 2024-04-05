package org.example;

import junit.framework.Assert;

import static org.junit.Assert.*;

public class PrimeTest {

    @org.junit.Test
    public void isPrime() {
        Assert.assertEquals(Prime.isPrime(2), true);
    }
}