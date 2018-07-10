/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateConfirmPaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5014673230874393055L;
    private String description;
    private String code;
    private Integer amount;
    /** GETTER
     * Description
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Description
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * Code reference
     */
    @JsonGetter("Code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * Code reference
     */
    @JsonSetter("Code")
    public void setCode (String value) { 
        this.code = value;
    }
 
    /** GETTER
     * Amount
     */
    @JsonGetter("Amount")
    public Integer getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * Amount
     */
    @JsonSetter("Amount")
    public void setAmount (Integer value) { 
        this.amount = value;
    }
 
}
 