package ImageHoster.service;

import ImageHoster.controller.repository.OrderRepository;
import ImageHoster.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
 * Created by vaibhavhajela on 17/01/21.
 */
@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;


    public Order createOrder(Order orderToCreate){

        return orderRepository.cacheOrder(orderToCreate);
    }

    public List<Order> getOrders(){

        return orderRepository.getAll();
    }
}
