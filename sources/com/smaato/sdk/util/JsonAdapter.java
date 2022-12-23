package com.smaato.sdk.util;

import android.util.JsonReader;
import android.util.JsonWriter;
import java.io.IOException;

public interface JsonAdapter<T> {
    T fromJson(JsonReader jsonReader) throws IOException;

    void toJson(JsonWriter jsonWriter, T t) throws IOException;
}
