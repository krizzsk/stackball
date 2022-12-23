package com.amazon.device.ads;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

class ConnectionInfo {
    private static final String LOGTAG = ConnectionInfo.class.getSimpleName();
    private static final String WIFI_NAME = "Wifi";
    private String connectionType;
    private ConnectivityManager connectivityManager;
    private final MobileAdsLogger logger = new MobileAdsLoggerFactory().createMobileAdsLogger(LOGTAG);

    public ConnectionInfo(MobileAdsInfoStore mobileAdsInfoStore) {
        initialize((ConnectivityManager) mobileAdsInfoStore.getApplicationContext().getSystemService("connectivity"));
    }

    ConnectionInfo(ConnectivityManager connectivityManager2) {
        initialize(connectivityManager2);
    }

    private void initialize(ConnectivityManager connectivityManager2) {
        this.connectivityManager = connectivityManager2;
        refresh();
    }

    public void refresh() {
        generateConnectionType();
    }

    private void generateConnectionType() {
        NetworkInfo networkInfo = null;
        try {
            if (this.connectivityManager != null) {
                networkInfo = this.connectivityManager.getActiveNetworkInfo();
            }
        } catch (SecurityException e) {
            this.logger.mo11019d("Unable to get active network information: %s", e);
        }
        if (networkInfo == null) {
            this.connectionType = Integer.toString(0);
        } else if (networkInfo.getType() == 1) {
            this.connectionType = WIFI_NAME;
        } else {
            this.connectionType = Integer.toString(networkInfo.getSubtype());
        }
    }

    public String getConnectionType() {
        return this.connectionType;
    }

    public boolean isWiFi() {
        return WIFI_NAME.equals(getConnectionType());
    }
}
