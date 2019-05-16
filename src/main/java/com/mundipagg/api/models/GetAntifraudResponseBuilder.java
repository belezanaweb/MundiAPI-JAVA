/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class GetAntifraudResponseBuilder {
    //the instance to build
    private GetAntifraudResponse getAntifraudResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetAntifraudResponseBuilder() {
        getAntifraudResponse = new GetAntifraudResponse();
    }

    public GetAntifraudResponseBuilder status(String status) {
        getAntifraudResponse.setStatus(status);
        return this;
    }

    public GetAntifraudResponseBuilder returnCode(String returnCode) {
        getAntifraudResponse.setReturnCode(returnCode);
        return this;
    }

    public GetAntifraudResponseBuilder returnMessage(String returnMessage) {
        getAntifraudResponse.setReturnMessage(returnMessage);
        return this;
    }

    public GetAntifraudResponseBuilder providerName(String providerName) {
        getAntifraudResponse.setProviderName(providerName);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetAntifraudResponse build() {
        return getAntifraudResponse;
    }
}