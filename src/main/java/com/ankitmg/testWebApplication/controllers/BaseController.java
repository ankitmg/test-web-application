package com.ankitmg.testWebApplication.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Created by iankitgupta on 7/24/2017.
 */
public class BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

    private static final int EXCEPTION_CACHE_SIZE = 256;

    protected static final int HTTP_OK = 200;
    protected static final int HTTP_CREATED = 201;
    protected static final int HTTP_NO_CONTENT = 204;
    protected static final int HTTP_INTERNAL_SERVER_ERROR = 500;
    protected static final int HTTP_BAD_REQUEST = 400;
    protected static final int HTTP_CONFLICT = 409;

    public static final String TENANT_KEY = "X-Tenant-Context";


    protected static final <T> ResponseEntity<T> ok(T value) {

        return new ResponseEntity<>(value, HttpStatus.OK);
    }

    protected static final <T> ResponseEntity<T> created(T value) {

        return new ResponseEntity<>(value, HttpStatus.CREATED);
    }

    protected static final ResponseEntity<Void> created() {

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    protected static final ResponseEntity<Void> noContent() {

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
