package ImageHoster.controller.repository;

import ImageHoster.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Created by vaibhavhajela on 17/01/21.
 */
@Repository
public class OrderRepository {

    Map<String,Order> orderCache = new HashMap<>();

    public Order cacheOrder(Order order){
        return orderCache.put(order.getId(),order);
    }

    public List<Order> getAll(){
        List<Order> orders = new ArrayList<>() ;
        orderCache.values().stream().forEach( e -> orders.add(e));
        return orders;
    }

}
