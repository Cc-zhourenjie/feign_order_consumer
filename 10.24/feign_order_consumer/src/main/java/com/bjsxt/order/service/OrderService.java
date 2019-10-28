package com.bjsxt.order.service;

import com.bjsxt.order.pojo.Order;

import java.util.List;

public interface OrderService {


    /**
     * 根据会员编号查询一条订单
     *
     * @param id
     * @return
     */
    Order searchOneOrder(Integer id);

    /**
     * 查询全部订单
     *
     * @return
     */
    List<Order> searchAll();


}
