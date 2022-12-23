package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.p259fi.CheckedFunction;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.C8938Tracking;
import com.smaato.sdk.video.vast.model.VastEvent;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

public class TrackingParser implements XmlClassParser<C8938Tracking> {
    private static final CheckedFunction<String, VastEvent> eventParsingFunction = $$Lambda$TrackingParser$XPwJqWoyk8Z_shTQPxzCqgdyC60.INSTANCE;

    static /* synthetic */ VastEvent lambda$static$0(String str) throws Exception {
        return (VastEvent) Objects.requireNonNull(VastEvent.parse(str));
    }

    public ParseResult<C8938Tracking> parse(RegistryXmlParser registryXmlParser) {
        C8938Tracking tracking;
        C8938Tracking.Builder builder = new C8938Tracking.Builder();
        ArrayList arrayList = new ArrayList();
        CheckedFunction<String, VastEvent> checkedFunction = eventParsingFunction;
        builder.getClass();
        $$Lambda$poGZR8o9RM16tmY_HdfjTgPxACE r3 = new Consumer() {
            public final void accept(Object obj) {
                C8938Tracking.Builder.this.setVastEvent((VastEvent) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseTypedAttribute = registryXmlParser.parseTypedAttribute("event", checkedFunction, r3, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$ZAtcYw9JDBMSDAMTzqFcLbPL3U r2 = new Consumer() {
            public final void accept(Object obj) {
                C8938Tracking.Builder.this.setOffset((String) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseStringAttribute = parseTypedAttribute.parseStringAttribute("offset", r2, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        parseStringAttribute.parseString(new Consumer() {
            public final void accept(Object obj) {
                C8938Tracking.Builder.this.setUrl((String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("url", new Exception("Unable to parse URL value", (Exception) obj)));
            }
        });
        try {
            tracking = builder.build();
        } catch (VastElementMissingException e) {
            arrayList.add(ParseError.buildFrom(C8938Tracking.NAME, e));
            tracking = null;
        }
        return new ParseResult.Builder().setResult(tracking).setErrors(arrayList).build();
    }
}
