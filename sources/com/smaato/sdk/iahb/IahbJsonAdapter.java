package com.smaato.sdk.iahb;

import android.util.JsonReader;
import android.util.JsonWriter;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.smaato.sdk.iahb.AutoValue_IahbBid;
import com.smaato.sdk.iahb.AutoValue_IahbExt;
import com.smaato.sdk.iahb.AutoValue_IahbResponse;
import com.smaato.sdk.util.JsonAdapter;
import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
final class IahbJsonAdapter implements JsonAdapter<IahbResponse> {
    public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, Object obj) throws IOException {
        if (jsonWriter == null) {
            throw new NullPointerException("'writer' specified as non-null is null");
        }
        throw new UnsupportedOperationException();
    }

    @Inject
    IahbJsonAdapter() {
    }

    private static IahbResponse fromJson(JsonReader jsonReader) throws IOException {
        if (jsonReader != null) {
            try {
                return readResponse(jsonReader);
            } catch (IllegalStateException e) {
                throw new IOException(e);
            }
        } else {
            throw new NullPointerException("'reader' specified as non-null is null");
        }
    }

    private static IahbResponse readResponse(JsonReader jsonReader) throws IOException {
        if (jsonReader != null) {
            jsonReader.beginObject();
            AutoValue_IahbResponse.Builder builder = new AutoValue_IahbResponse.Builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                char c = 65535;
                int hashCode = nextName.hashCode();
                if (hashCode != 93732568) {
                    if (hashCode == 1968387288 && nextName.equals("seatbid")) {
                        c = 1;
                    }
                } else if (nextName.equals("bidid")) {
                    c = 0;
                }
                if (c == 0) {
                    builder.bidId(jsonReader.nextString());
                } else if (c != 1) {
                    jsonReader.skipValue();
                } else {
                    IahbBid readSeatBid = readSeatBid(jsonReader);
                    if (readSeatBid != null) {
                        builder.bid(readSeatBid);
                    }
                }
            }
            jsonReader.endObject();
            return builder.build();
        }
        throw new NullPointerException("'reader' specified as non-null is null");
    }

    private static IahbBid readSeatBid(JsonReader jsonReader) throws IOException {
        IahbBid iahbBid;
        if (jsonReader != null) {
            jsonReader.beginArray();
            do {
                try {
                    iahbBid = null;
                    if (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            if (BidResponsed.KEY_BID_ID.equals(jsonReader.nextName())) {
                                iahbBid = readBid(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.endArray();
                        return null;
                    }
                } finally {
                    jsonReader.endArray();
                }
            } while (iahbBid == null);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return iahbBid;
        }
        throw new NullPointerException("'reader' specified as non-null is null");
    }

    private static IahbBid readBid(JsonReader jsonReader) throws IOException {
        IahbBid build;
        if (jsonReader != null) {
            jsonReader.beginArray();
            do {
                try {
                    if (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        AutoValue_IahbBid.Builder builder = new AutoValue_IahbBid.Builder();
                        while (jsonReader.hasNext()) {
                            String nextName = jsonReader.nextName();
                            char c = 65535;
                            int hashCode = nextName.hashCode();
                            if (hashCode != 96426) {
                                if (hashCode == 100897) {
                                    if (nextName.equals("ext")) {
                                        c = 1;
                                    }
                                }
                            } else if (nextName.equals("adm")) {
                                c = 0;
                            }
                            if (c == 0) {
                                builder.adm(jsonReader.nextString());
                            } else if (c != 1) {
                                jsonReader.skipValue();
                            } else {
                                IahbExt readExt = readExt(jsonReader);
                                if (readExt != null) {
                                    builder.ext(readExt);
                                }
                            }
                        }
                        jsonReader.endObject();
                        build = builder.build();
                    } else {
                        jsonReader.endArray();
                        return null;
                    }
                } finally {
                    jsonReader.endArray();
                }
            } while (build == null);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return build;
        }
        throw new NullPointerException("'reader' specified as non-null is null");
    }

    /* JADX INFO: finally extract failed */
    private static IahbExt readExt(JsonReader jsonReader) throws IOException {
        if (jsonReader != null) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                try {
                    if ("smt".equals(jsonReader.nextName())) {
                        AutoValue_IahbExt.Builder builder = new AutoValue_IahbExt.Builder();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName = jsonReader.nextName();
                            char c = 65535;
                            int hashCode = nextName.hashCode();
                            if (hashCode != -1422011939) {
                                if (hashCode != -1309235404) {
                                    if (hashCode == 1240754974) {
                                        if (nextName.equals("adspaceid")) {
                                            c = 0;
                                        }
                                    }
                                } else if (nextName.equals("expires")) {
                                    c = 2;
                                }
                            } else if (nextName.equals("adtype")) {
                                c = 1;
                            }
                            if (c == 0) {
                                builder.adspaceid(jsonReader.nextString());
                            } else if (c == 1) {
                                builder.adtype(jsonReader.nextString());
                            } else if (c != 2) {
                                jsonReader.skipValue();
                            } else {
                                builder.expiresAt(jsonReader.nextLong());
                            }
                        }
                        jsonReader.endObject();
                        IahbExt build = builder.build();
                        jsonReader.endObject();
                        return build;
                    }
                    jsonReader.skipValue();
                } catch (Throwable th) {
                    jsonReader.endObject();
                    throw th;
                }
            }
            jsonReader.endObject();
            return null;
        }
        throw new NullPointerException("'reader' specified as non-null is null");
    }
}
