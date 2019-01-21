/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CreateThreeDSecureRequestBuilder {
    //the instance to build
    private CreateThreeDSecureRequest createThreeDSecureRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateThreeDSecureRequestBuilder() {
        createThreeDSecureRequest = new CreateThreeDSecureRequest();
    }

    /**
     * The MPI Vendor (MerchantPlugin)
     */
    public CreateThreeDSecureRequestBuilder mpi(String mpi) {
        createThreeDSecureRequest.setMpi(mpi);
        return this;
    }

    /**
     * The Cardholder Authentication Verification value
     */
    public CreateThreeDSecureRequestBuilder cavv(String cavv) {
        createThreeDSecureRequest.setCavv(cavv);
        return this;
    }

    /**
     * The Electronic Commerce Indicator value
     */
    public CreateThreeDSecureRequestBuilder eci(String eci) {
        createThreeDSecureRequest.setEci(eci);
        return this;
    }

    /**
     * The TransactionId value (XID)
     */
    public CreateThreeDSecureRequestBuilder transactionId(String transactionId) {
        createThreeDSecureRequest.setTransactionId(transactionId);
        return this;
    }

    /**
     * The success URL after the authentication
     */
    public CreateThreeDSecureRequestBuilder successUrl(String successUrl) {
        createThreeDSecureRequest.setSuccessUrl(successUrl);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateThreeDSecureRequest build() {
        return createThreeDSecureRequest;
    }
}