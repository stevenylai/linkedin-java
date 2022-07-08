package io.swagger.api;

import io.swagger.model.Order;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderApiControllerIntegrationTest {

    @Autowired
    private OrderApi api;

    @Test
    public void orderPostTest() throws Exception {
        Order body = new Order();
        ResponseEntity<Order> responseEntity = api.orderPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
