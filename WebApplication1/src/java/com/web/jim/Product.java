package com.web.jim;
// Generated Nov 25, 2016 7:13:24 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Product generated by hbm2java
 */
public class Product  implements java.io.Serializable {


     private int productId;
     private Manufacturer manufacturer;
     private ProductCode productCode;
     private BigDecimal purchaseCost;
     private Integer quantityOnHand;
     private BigDecimal markup;
     private String available;
     private String description;
     private Set<PurchaseOrder> purchaseOrders = new HashSet<PurchaseOrder>(0);

    public Product() {
    }

	
    public Product(int productId, Manufacturer manufacturer, ProductCode productCode) {
        this.productId = productId;
        this.manufacturer = manufacturer;
        this.productCode = productCode;
    }
    public Product(int productId, Manufacturer manufacturer, ProductCode productCode, BigDecimal purchaseCost, Integer quantityOnHand, BigDecimal markup, String available, String description, Set<PurchaseOrder> purchaseOrders) {
       this.productId = productId;
       this.manufacturer = manufacturer;
       this.productCode = productCode;
       this.purchaseCost = purchaseCost;
       this.quantityOnHand = quantityOnHand;
       this.markup = markup;
       this.available = available;
       this.description = description;
       this.purchaseOrders = purchaseOrders;
    }
   
    public int getProductId() {
        return this.productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public Manufacturer getManufacturer() {
        return this.manufacturer;
    }
    
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
    public ProductCode getProductCode() {
        return this.productCode;
    }
    
    public void setProductCode(ProductCode productCode) {
        this.productCode = productCode;
    }
    public BigDecimal getPurchaseCost() {
        return this.purchaseCost;
    }
    
    public void setPurchaseCost(BigDecimal purchaseCost) {
        this.purchaseCost = purchaseCost;
    }
    public Integer getQuantityOnHand() {
        return this.quantityOnHand;
    }
    
    public void setQuantityOnHand(Integer quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }
    public BigDecimal getMarkup() {
        return this.markup;
    }
    
    public void setMarkup(BigDecimal markup) {
        this.markup = markup;
    }
    public String getAvailable() {
        return this.available;
    }
    
    public void setAvailable(String available) {
        this.available = available;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Set<PurchaseOrder> getPurchaseOrders() {
        return this.purchaseOrders;
    }
    
    public void setPurchaseOrders(Set<PurchaseOrder> purchaseOrders) {
        this.purchaseOrders = purchaseOrders;
    }




}

