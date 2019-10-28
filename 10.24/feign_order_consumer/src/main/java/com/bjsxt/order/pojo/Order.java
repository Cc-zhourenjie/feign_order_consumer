package com.bjsxt.order.pojo;

public class Order {

    private Integer id;
    private String name;
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(2*8);
        long stop = System.currentTimeMillis();
        long result = stop - start;
        System.out.println(result);


        long start1 = System.currentTimeMillis();
        System.out.println(2<<3);
        long stop1 = System.currentTimeMillis();
        long result1 = stop1 - start1;
        System.out.println(result1);

    }


}
