package com.inmobi.unification.sdk;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface InitializationStatus {
    public static final String INVALID_ACCOUNT_ID = "Account id cannot be empty. Please provide a valid account id.";
    public static final String INVALID_SITE_ID = "SiteId cannot be empty. Please provide a valid SiteId.";
    public static final String SUCCESS = "Success";
    public static final String UNKNOWN_ERROR = "SDK could not be initialized; an unexpected error was encountered.";
}
