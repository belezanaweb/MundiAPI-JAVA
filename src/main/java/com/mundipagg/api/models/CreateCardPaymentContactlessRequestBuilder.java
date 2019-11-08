/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CreateCardPaymentContactlessRequestBuilder {
    //the instance to build
    private CreateCardPaymentContactlessRequest createCardPaymentContactlessRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCardPaymentContactlessRequestBuilder() {
        createCardPaymentContactlessRequest = new CreateCardPaymentContactlessRequest();
    }

    /**
     * The authentication type
     */
    public CreateCardPaymentContactlessRequestBuilder type(String type) {
        createCardPaymentContactlessRequest.setType(type);
        return this;
    }

    /**
     * The ApplePay encrypted request
     */
    public CreateCardPaymentContactlessRequestBuilder applePay(CreateApplePayRequest applePay) {
        createCardPaymentContactlessRequest.setApplePay(applePay);
        return this;
    }

    /**
     * The GooglePay encrypted request
     */
    public CreateCardPaymentContactlessRequestBuilder googlePay(CreateGooglePayRequest googlePay) {
        createCardPaymentContactlessRequest.setGooglePay(googlePay);
        return this;
    }

    /**
     * The Emv encrypted request
     */
    public CreateCardPaymentContactlessRequestBuilder emv(CreateEmvDecryptRequest emv) {
        createCardPaymentContactlessRequest.setEmv(emv);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCardPaymentContactlessRequest build() {
        return createCardPaymentContactlessRequest;
    }
}