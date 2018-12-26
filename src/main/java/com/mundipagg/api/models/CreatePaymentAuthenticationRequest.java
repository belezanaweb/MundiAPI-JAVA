/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreatePaymentAuthenticationRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = -769276752497354234L;
    private String type;
    private CreateThreeDSecureRequest threedSecure;
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
    public CreateThreeDSecureRequest getThreedSecure ( ) { 
        return this.threedSecure;
    }
    
    /** SETTER
     * The 3D-S authentication object
     */
    @JsonSetter("threed_secure")
    public void setThreedSecure (CreateThreeDSecureRequest value) { 
        this.threedSecure = value;
    }
 
}
