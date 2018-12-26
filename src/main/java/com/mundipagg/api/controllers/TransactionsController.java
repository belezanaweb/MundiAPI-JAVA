/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.type.TypeReference;

import com.mundipagg.api.*;
import com.mundipagg.api.models.*;
import com.mundipagg.api.exceptions.*;
import com.mundipagg.api.http.client.HttpClient;
import com.mundipagg.api.http.client.HttpContext;
import com.mundipagg.api.http.request.HttpRequest;
import com.mundipagg.api.http.response.HttpResponse;
import com.mundipagg.api.http.response.HttpStringResponse;
import com.mundipagg.api.http.client.APICallBack;
import com.mundipagg.api.controllers.syncwrapper.APICallBackCatcher;

public class TransactionsController extends BaseController {    
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static TransactionsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the TransactionsController class 
     */
    public static TransactionsController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new TransactionsController();
                }
            }
        }
        return instance;
    }

    /**
     * TODO: type endpoint description here
     * @param    transactionId    Required parameter: Example: 
     * @return    Returns the GetTransactionResponse response from the API call 
     */
    public GetTransactionResponse getTransaction(
                final String transactionId
    ) throws Throwable {
        APICallBackCatcher<GetTransactionResponse> callback = new APICallBackCatcher<GetTransactionResponse>();
        getTransactionAsync(transactionId, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * TODO: type endpoint description here
     * @param    transactionId    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void getTransactionAsync(
                final String transactionId,
                final APICallBack<GetTransactionResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/transactions/{transaction_id}");

                //process template parameters
                APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
                    private static final long serialVersionUID = -880444519L;
                    {
                        put( "transaction_id", transactionId );
                    }});
                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>() {
                    private static final long serialVersionUID = -2042397430L;
                    {
                        put( "user-agent", "MundiSDK - Java 0.13.42" );
                        put( "accept", "application/json" );
                    }
                };

                //prepare and invoke the API call request to fetch the response
                final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null,
                                                Configuration.basicAuthUserName, Configuration.basicAuthPassword);

                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            GetTransactionResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetTransactionResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}