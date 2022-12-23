package com.smaato.sdk.rewarded;

import com.smaato.sdk.core.util.Objects;

public enum RewardedError {
    NO_AD_AVAILABLE("No ad is currently available matching the requested parameters."),
    INVALID_REQUEST("Invalid ad request (e.g. PublisherId or AdSpaceId is incorrect)."),
    NETWORK_ERROR("The ad request has not been completed due to a network connectivity issue."),
    CACHE_LIMIT_REACHED("Cache is full. Please use the one of previously loaded ADs."),
    INTERNAL_ERROR("An internal error happened (e.g. the ad server responded with an invalid response)."),
    CREATIVE_RESOURCE_EXPIRED("A creative resource's TTL expired.");
    
    private String description;

    private RewardedError(String str) {
        this.description = (String) Objects.requireNonNull(str);
    }

    public final String toString() {
        return String.format("[%s]: %s", new Object[]{name(), this.description});
    }
}
