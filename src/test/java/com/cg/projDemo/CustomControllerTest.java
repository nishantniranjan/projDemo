package com.cg.projDemo;

import com.cg.projDemo.controllers.CustomController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CustomControllerTest {

    @Autowired
    private CustomController customController;

    @LocalServerPort
    private int port;

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    void contextLoads() {
        assertNotNull(customController, ()->"customController is loaded");
    }

    @Test
    public void returnShouldBeLoginPage(){
        assertEquals("login page", restTemplate.getForObject("http://localhost:"+port,String.class).toLowerCase());
    }

}
