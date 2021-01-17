package ImageHoster.controller;

import ImageHoster.model.Order;
import ImageHoster.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

import java.util.ArrayList;

/**
 * Created by vaibhavhajela on 17/01/21.
 */
@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/api/orders")
    @ResponseBody
    public List<Order> getOrders(){
        return orderService.getOrders();
    }


    @RequestMapping(value="/api/createorder",method = RequestMethod.POST)
    @ResponseBody
    public Order createOrder(@RequestBody Order orderToCreate){
        return orderService.createOrder(orderToCreate);
    }

}
