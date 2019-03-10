package com.spring.in.action.part1;

import com.spring.in.action.part1.config.OrderProps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Part1ApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    OrderProps orderProps;

    @Test
    public void testProps(){

        System.out.println(orderProps.getPageSize());
    }
}

