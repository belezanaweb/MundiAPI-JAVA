/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class GetInvoiceItemResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 2099467477990528438L;
    private int amount;
    private String description;
    private GetPricingSchemeResponse pricingScheme;
    private GetPriceBracketResponse priceBracket;
    private Integer quantity;
    private String name;
    private String subscriptionItemId;
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
    @JsonGetter("pricing_scheme")
    public GetPricingSchemeResponse getPricingScheme ( ) { 
        return this.pricingScheme;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme (GetPricingSchemeResponse value) { 
        this.pricingScheme = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("price_bracket")
    public GetPriceBracketResponse getPriceBracket ( ) { 
        return this.priceBracket;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("price_bracket")
    public void setPriceBracket (GetPriceBracketResponse value) { 
        this.priceBracket = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("quantity")
    public Integer getQuantity ( ) { 
        return this.quantity;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("quantity")
    public void setQuantity (Integer value) { 
        this.quantity = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * Subscription Item Id
     */
    @JsonGetter("subscription_item_id")
    public String getSubscriptionItemId ( ) { 
        return this.subscriptionItemId;
    }
    
    /** SETTER
     * Subscription Item Id
     */
    @JsonSetter("subscription_item_id")
    public void setSubscriptionItemId (String value) { 
        this.subscriptionItemId = value;
    }
 
}
