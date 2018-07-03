/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreatePaymentAuthentiticationRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5266615202532282364L;
    private String type;
    private Create3DSAuthentiticationRequest threedSecure;
    /** GETTER
     * The Authentication type
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * The Authentication type
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * The 3D-S authentication object
     */
    @JsonGetter("threed_secure")
    public Create3DSAuthentiticationRequest getThreedSecure ( ) { 
        return this.threedSecure;
    }
    
    /** SETTER
     * The 3D-S authentication object
     */
    @JsonSetter("threed_secure")
    public void setThreedSecure (Create3DSAuthentiticationRequest value) { 
        this.threedSecure = value;
    }
 
}
 