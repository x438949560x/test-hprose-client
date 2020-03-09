package com.ccsu.testhproseclient;

import com.ccsu.testhproseclient.service.HelloService;
import hprose.client.HproseHttpClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestHproseClientApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testHprose() {
        HproseHttpClient client = new HproseHttpClient();
        client.useService("http://localhost:8080/api/test/hprose");
        HelloService helloService = client.useService(HelloService.class);
        String content = helloService.sayBye("Jack");
        System.err.println(content);
    }
}
