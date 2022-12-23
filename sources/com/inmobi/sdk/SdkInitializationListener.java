package com.inmobi.sdk;

public interface SdkInitializationListener {
    public static final String INVALID_ACCOUNT_ID = "Account id cannot be empty. Please provide a valid account id.";
    public static final String INVALID_SITE_ID = "SiteId cannot be empty. Please provide a valid SiteId.";
    public static final String UNKNOWN_ERROR = "SDK could not be initialized; an unexpected error was encountered.";

    void onInitializationComplete(Error error);
}
