package com.smaato.sdk.richmedia.mraid.dataprovider;

import com.smaato.sdk.core.LatLng;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.p248ad.GeoInfo;
import com.smaato.sdk.core.p248ad.RequestInfoMapper;
import com.smaato.sdk.core.p248ad.RequestInfoProvider;
import com.smaato.sdk.core.util.Objects;

public final class MraidLocationProperties {
    public final LatLng latLng;
    public final Integer locationServiceType;

    private MraidLocationProperties(LatLng latLng2, Integer num) {
        this.latLng = latLng2;
        this.locationServiceType = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MraidLocationProperties mraidLocationProperties = (MraidLocationProperties) obj;
            return Objects.equals(this.latLng, mraidLocationProperties.latLng) && Objects.equals(this.locationServiceType, mraidLocationProperties.locationServiceType);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.latLng, this.locationServiceType);
    }

    public static MraidLocationProperties create(RequestInfoProvider requestInfoProvider, SdkConfiguration sdkConfiguration, RequestInfoMapper requestInfoMapper) {
        GeoInfo geoInfo = requestInfoProvider.getGeoInfo(sdkConfiguration.getUserInfo());
        if (geoInfo == null) {
            return new MraidLocationProperties((LatLng) null, (Integer) null);
        }
        return new MraidLocationProperties(geoInfo.getLatLng(), requestInfoMapper.mapToApiValue(geoInfo.getGeoType()));
    }
}
