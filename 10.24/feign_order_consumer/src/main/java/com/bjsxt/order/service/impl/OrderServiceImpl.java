package com.bjsxt.order.service.impl;

import com.bjsxt.order.feign.OrderProviderFeign;
import com.bjsxt.order.pojo.Order;
import com.bjsxt.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    /*
    注入Feign的对象
     */
    @Autowired
    private OrderProviderFeign orderProviderFeign;


    @Override
    public Order searchOneOrder(Integer id) {
        Order order = orderProviderFeign.searchOneOder(id);
        return order;
    }

    @Override
    public List<Order> searchAll() {
        List<Order> list = orderProviderFeign.searchAll();
        return list;
    }
}
