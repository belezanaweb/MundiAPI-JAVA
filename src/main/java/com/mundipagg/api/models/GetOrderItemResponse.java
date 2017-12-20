/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetOrderItemResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5589134622596560098L;
    private String id;
    private int amount;
    private String description;
    private int quantity;
    private String category;
    private GetSellerResponse getSellerResponse;
    /** GETTER
     * Id
     */
    @JsonGetter("Id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * Id
     */
    @JsonSetter("Id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("amount")
    public int getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("amount")
    public void setAmount (int value) { 
        this.amount = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("quantity")
    public int getQuantity ( ) { 
        return this.quantity;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("quantity")
    public void setQuantity (int value) { 
        this.quantity = value;
    }
 
    /** GETTER
     * Category
     */
    @JsonGetter("category")
    public String getCategory ( ) { 
        return this.category;
    }
    
    /** SETTER
     * Category
     */
    @JsonSetter("category")
    public void setCategory (String value) { 
        this.category = value;
    }
 
    /** GETTER
     * Seller data
     */
    @JsonGetter("GetSellerResponse")
    public GetSellerResponse getGetSellerResponse ( ) { 
        return this.getSellerResponse;
    }
    
    /** SETTER
     * Seller data
     */
    @JsonSetter("GetSellerResponse")
    public void setGetSellerResponse (GetSellerResponse value) { 
        this.getSellerResponse = value;
    }
 
}
 