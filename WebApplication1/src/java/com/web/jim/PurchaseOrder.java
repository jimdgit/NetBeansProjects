package com.web.jim;
// Generated Nov 25, 2016 7:13:24 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * PurchaseOrder generated by hbm2java
 */
public class PurchaseOrder  implements java.io.Serializable {


     private int orderNum;
     private Customer customer;
     private Product product;
     private Short quantity;
     private BigDecimal shippingCost;
     private Date salesDate;
     private Date shippingDate;
     private String freightCompany;

    public PurchaseOrder() {
    }

	
    public PurchaseOrder(int orderNum, Customer customer, Product product) {
        this.orderNum = orderNum;
        this.customer = customer;
        this.product = product;
    }
    public PurchaseOrder(int orderNum, Customer customer, Product product, Short quantity, BigDecimal shippingCost, Date salesDate, Date shippingDate, String freightCompany) {
       this.orderNum = orderNum;
       this.customer = customer;
       this.product = product;
       this.quantity = quantity;
       this.shippingCost = shippingCost;
       this.salesDate = salesDate;
       this.shippingDate = shippingDate;
       this.freightCompany = freightCompany;
    }
   
    public int getOrderNum() {
        return this.orderNum;
    }
    
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    public Short getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Short quantity) {
        this.quantity = quantity;
    }
    public BigDecimal getShippingCost() {
        return this.shippingCost;
    }
    
    public void setShippingCost(BigDecimal shippingCost) {
        this.shippingCost = shippingCost;
    }
    public Date getSalesDate() {
        return this.salesDate;
    }
    
    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }
    public Date getShippingDate() {
        return this.shippingDate;
    }
    
    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
    }
    public String getFreightCompany() {
        return this.freightCompany;
    }
    
    public void setFreightCompany(String freightCompany) {
        this.freightCompany = freightCompany;
    }




}


