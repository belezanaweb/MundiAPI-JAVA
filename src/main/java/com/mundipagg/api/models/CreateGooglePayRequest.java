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
public class CreateGooglePayRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 183460458106921865L;
    private String version;
    private String data;
    private CreateGooglePayHeaderRequest header;
    private String signature;
    private String merchantIdentifier;
    /** GETTER
     * The token version
     */
    @JsonGetter("version")
    public String getVersion ( ) { 
        return this.version;
    }
    
    /** SETTER
     * The token version
     */
    @JsonSetter("version")
    public void setVersion (String value) { 
        this.version = value;
    }
 
    /** GETTER
     * The cryptography data
     */
    @JsonGetter("data")
    public String getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * The cryptography data
     */
    @JsonSetter("data")
    public void setData (String value) { 
        this.data = value;
    }
 
    /** GETTER
     * The GooglePay header request
     */
    @JsonGetter("header")
    public CreateGooglePayHeaderRequest getHeader ( ) { 
        return this.header;
    }
    
    /** SETTER
     * The GooglePay header request
     */
    @JsonSetter("header")
    public void setHeader (CreateGooglePayHeaderRequest value) { 
        this.header = value;
    }
 
    /** GETTER
     * Detached PKCS #7 signature, Base64 encoded as string
     */
    @JsonGetter("signature")
    public String getSignature ( ) { 
        return this.signature;
    }
    
    /** SETTER
     * Detached PKCS #7 signature, Base64 encoded as string
     */
    @JsonSetter("signature")
    public void setSignature (String value) { 
        this.signature = value;
    }
 
    /** GETTER
     * GooglePay Merchant identifier
     */
    @JsonGetter("merchant_identifier")
    public String getMerchantIdentifier ( ) { 
        return this.merchantIdentifier;
    }
    
    /** SETTER
     * GooglePay Merchant identifier
     */
    @JsonSetter("merchant_identifier")
    public void setMerchantIdentifier (String value) { 
        this.merchantIdentifier = value;
    }
 
}
