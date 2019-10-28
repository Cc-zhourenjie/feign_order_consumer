package com.bjsxt.order.feign;

import com.bjsxt.order.pojo.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "order-provider")
public interface OrderProviderFeign {


    @GetMapping("/searchOneOrder/{id}")
    Order searchOneOder(@PathVariable Integer id);


    @GetMapping("/searchAll")
    List<Order> searchAll();


}
