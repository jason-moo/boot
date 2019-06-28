package com.test;

import com.test.component.HelloConsumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@SpringBootTest(classes = RabbitConsumerApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AppTest {

    @Autowired
    private HelloConsumer helloConsumer;

    @Test
    public void shouldAnswerWithTrue() {
    }


}
