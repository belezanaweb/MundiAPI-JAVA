/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class GetPrivateLabelTransactionResponseBuilder 
        extends GetTransactionResponseBuilder {
    //the instance to build
    private GetPrivateLabelTransactionResponse getPrivateLabelTransactionResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetPrivateLabelTransactionResponseBuilder() {
        getPrivateLabelTransactionResponse = new GetPrivateLabelTransactionResponse();
    }

    /**
     * Text that will appear on the credit card's statement
     */
    public GetPrivateLabelTransactionResponseBuilder statementDescriptor(String statementDescriptor) {
        getPrivateLabelTransactionResponse.setStatementDescriptor(statementDescriptor);
        return this;
    }

    /**
     * Acquirer name
     */
    public GetPrivateLabelTransactionResponseBuilder acquirerName(String acquirerName) {
        getPrivateLabelTransactionResponse.setAcquirerName(acquirerName);
        return this;
    }

    /**
     * Aquirer affiliation code
     */
    public GetPrivateLabelTransactionResponseBuilder acquirerAffiliationCode(String acquirerAffiliationCode) {
        getPrivateLabelTransactionResponse.setAcquirerAffiliationCode(acquirerAffiliationCode);
        return this;
    }

    /**
     * Acquirer TID
     */
    public GetPrivateLabelTransactionResponseBuilder acquirerTid(String acquirerTid) {
        getPrivateLabelTransactionResponse.setAcquirerTid(acquirerTid);
        return this;
    }

    /**
     * Acquirer NSU
     */
    public GetPrivateLabelTransactionResponseBuilder acquirerNsu(String acquirerNsu) {
        getPrivateLabelTransactionResponse.setAcquirerNsu(acquirerNsu);
        return this;
    }

    /**
     * Acquirer authorization code
     */
    public GetPrivateLabelTransactionResponseBuilder acquirerAuthCode(String acquirerAuthCode) {
        getPrivateLabelTransactionResponse.setAcquirerAuthCode(acquirerAuthCode);
        return this;
    }

    /**
     * Operation type
     */
    public GetPrivateLabelTransactionResponseBuilder operationType(String operationType) {
        getPrivateLabelTransactionResponse.setOperationType(operationType);
        return this;
    }

    /**
     * Card data
     */
    public GetPrivateLabelTransactionResponseBuilder card(GetCardResponse card) {
        getPrivateLabelTransactionResponse.setCard(card);
        return this;
    }

    /**
     * Acquirer message
     */
    public GetPrivateLabelTransactionResponseBuilder acquirerMessage(String acquirerMessage) {
        getPrivateLabelTransactionResponse.setAcquirerMessage(acquirerMessage);
        return this;
    }

    /**
     * Acquirer Return Code
     */
    public GetPrivateLabelTransactionResponseBuilder acquirerReturnCode(String acquirerReturnCode) {
        getPrivateLabelTransactionResponse.setAcquirerReturnCode(acquirerReturnCode);
        return this;
    }

    /**
     * Number of installments
     */
    public GetPrivateLabelTransactionResponseBuilder installments(Integer installments) {
        getPrivateLabelTransactionResponse.setInstallments(installments);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetPrivateLabelTransactionResponse build() {
        return getPrivateLabelTransactionResponse;
    }
}