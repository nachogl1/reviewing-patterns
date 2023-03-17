package com.nachogl1.reviewingpatterns.structural.proxy.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcceptanceTests {

    public static final String RESOURCE = "ola k ase!";


    @Test
    void proxyServerRetrievesCorrectData() {
        Resource proxy = new ProxyServer(new StubbedSlowServer());

        String result = proxy.getResource();

        assertEquals(RESOURCE, result);

    }

    @Test
    void proxyServerImprovesRetrievalTimes() {
        Resource proxy = new ProxyServer(new StubbedSlowServer());
        long firstPingStart = System.currentTimeMillis();

        String result = proxy.getResource();
        long firstPingEnd = System.currentTimeMillis();
        assertThat((firstPingEnd - firstPingStart)).isGreaterThanOrEqualTo(10000);
        assertEquals(RESOURCE, result);


        long secondPingStart = System.currentTimeMillis();
        String secondResult = proxy.getResource();
        long secondPingEnd = System.currentTimeMillis();
        assertThat((secondPingEnd - secondPingStart)).isLessThan(500);
        assertEquals(RESOURCE, secondResult);

    }

}
