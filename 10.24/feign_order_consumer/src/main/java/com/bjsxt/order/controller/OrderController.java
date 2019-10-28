package com.bjsxt.order.controller;

import com.bjsxt.order.pojo.Order;
import com.bjsxt.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {


    @Autowired
    private OrderService orderService;


    @GetMapping("/searchOneOrder/{id}")
    public Order searchOneOrder(@PathVariable Integer id){

        Order order = orderService.searchOneOrder(id);
        return order;

    }



    @GetMapping("/searchAll")
    public List<Order> searchAll(){

        List<Order> list = orderService.searchAll();
        return list;

    }



}
