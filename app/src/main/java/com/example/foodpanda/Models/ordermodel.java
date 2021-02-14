package com.example.foodpanda.Models;

public class ordermodel {
    public int orderimage;
    public String ordername, orderprice, orderid;

    public ordermodel(int orderimage, String ordername, String orderprice, String orderid) {
        this.orderimage = orderimage;
        this.ordername = ordername;
        this.orderprice = orderprice;
        this.orderid = orderid;
    }

    public int getOrderimage() {
        return orderimage;
    }

    public void setOrderimage(int orderimage) {
        this.orderimage = orderimage;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }

    public String getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(String orderprice) {
        this.orderprice = orderprice;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }
}
