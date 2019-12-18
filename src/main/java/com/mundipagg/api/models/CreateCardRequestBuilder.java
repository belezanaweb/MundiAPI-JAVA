/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CreateCardRequestBuilder {
    //the instance to build
    private CreateCardRequest createCardRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCardRequestBuilder() {
        createCardRequest = new CreateCardRequest();
    }

    /**
     * Credit card number
     */
    public CreateCardRequestBuilder number(String number) {
        createCardRequest.setNumber(number);
        return this;
    }

    /**
     * Holder name, as written on the card
     */
    public CreateCardRequestBuilder holderName(String holderName) {
        createCardRequest.setHolderName(holderName);
        return this;
    }

    /**
     * The expiration month
     */
    public CreateCardRequestBuilder expMonth(int expMonth) {
        createCardRequest.setExpMonth(expMonth);
        return this;
    }

    /**
     * The expiration year, that can be informed with 2 or 4 digits
     */
    public CreateCardRequestBuilder expYear(int expYear) {
        createCardRequest.setExpYear(expYear);
        return this;
    }

    /**
     * The card's security code
     */
    public CreateCardRequestBuilder cvv(String cvv) {
        createCardRequest.setCvv(cvv);
        return this;
    }

    /**
     * Card's billing address
     */
    public CreateCardRequestBuilder billingAddress(CreateAddressRequest billingAddress) {
        createCardRequest.setBillingAddress(billingAddress);
        return this;
    }

    /**
     * Card brand
     */
    public CreateCardRequestBuilder brand(String brand) {
        createCardRequest.setBrand(brand);
        return this;
    }

    /**
     * The address id for the billing address
     */
    public CreateCardRequestBuilder billingAddressId(String billingAddressId) {
        createCardRequest.setBillingAddressId(billingAddressId);
        return this;
    }

    /**
     * Metadata
     */
    public CreateCardRequestBuilder metadata(LinkedHashMap<String, String> metadata) {
        createCardRequest.setMetadata(metadata);
        return this;
    }

    /**
     * Card type
     */
    public CreateCardRequestBuilder type(String type) {
        createCardRequest.setType(type);
        return this;
    }

    /**
     * Options for creating the card
     */
    public CreateCardRequestBuilder options(CreateCardOptionsRequest options) {
        createCardRequest.setOptions(options);
        return this;
    }

    /**
     * Document number for the card's holder
     */
    public CreateCardRequestBuilder holderDocument(String holderDocument) {
        createCardRequest.setHolderDocument(holderDocument);
        return this;
    }

    /**
     * Indicates whether it is a private label card
     */
    public CreateCardRequestBuilder privateLabel(boolean privateLabel) {
        createCardRequest.setPrivateLabel(privateLabel);
        return this;
    }

    public CreateCardRequestBuilder label(String label) {
        createCardRequest.setLabel(label);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCardRequest build() {
        return createCardRequest;
    }
}