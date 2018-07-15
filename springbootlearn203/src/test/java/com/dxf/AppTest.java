package com.dxf;

import com.dxf.properties.AcmeProperties;
import com.dxf.service.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {

    @Autowired
    MyService myService;

    @Test
    public void test() {
        AcmeProperties acmeProperties = myService.getProperties();
        System.out.println(acmeProperties.getRemoteAddress());
        System.out.println(acmeProperties.getSecurity().getRoles().get(0));
    }
}
