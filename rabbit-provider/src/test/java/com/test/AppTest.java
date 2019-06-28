package com.test;

import com.test.component.HelloComponent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = RabbitProviderApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AppTest {

    @Autowired
    private HelloComponent helloComponent;

    @Test
    public void shouldAnswerWithTrue() {
        helloComponent.send("Hello!");
    }

}
