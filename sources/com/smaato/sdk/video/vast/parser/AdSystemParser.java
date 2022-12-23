package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.vast.model.AdSystem;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

public class AdSystemParser implements XmlClassParser<AdSystem> {
    public ParseResult<AdSystem> parse(RegistryXmlParser registryXmlParser) {
        AdSystem.Builder builder = new AdSystem.Builder();
        ArrayList arrayList = new ArrayList();
        builder.getClass();
        $$Lambda$Uim9ZXMQxxeSjyglp4LX1ISOGhc r2 = new Consumer() {
            public final void accept(Object obj) {
                AdSystem.Builder.this.setVersion((String) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseStringAttribute = registryXmlParser.parseStringAttribute("version", r2, new Consumer(arrayList) {
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
                AdSystem.Builder.this.setServerName((String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("AdSystem", new Exception("Unable to parse AdServer name value", (Exception) obj)));
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList).build();
    }
}
