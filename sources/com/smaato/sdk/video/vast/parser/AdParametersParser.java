package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.AdParameters;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

public class AdParametersParser implements XmlClassParser<AdParameters> {
    public ParseResult<AdParameters> parse(RegistryXmlParser registryXmlParser) {
        AdParameters adParameters;
        AdParameters.Builder builder = new AdParameters.Builder();
        ArrayList arrayList = new ArrayList();
        builder.getClass();
        $$Lambda$GMQXzbr4LDT9P5SvZ2mQWFWj0y0 r2 = new Consumer() {
            public final void accept(Object obj) {
                AdParameters.Builder.this.setXmlEncoded((Boolean) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseBooleanAttribute = registryXmlParser.parseBooleanAttribute(AdParameters.XML_ENCODED, r2, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        parseBooleanAttribute.parseString(new Consumer() {
            public final void accept(Object obj) {
                AdParameters.Builder.this.setParameters((String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("AdParameters", new Exception("Unable to parse AdParameters body", (Exception) obj)));
            }
        });
        try {
            adParameters = builder.build();
        } catch (VastElementMissingException e) {
            arrayList.add(ParseError.buildFrom("AdParameters", e));
            adParameters = null;
        }
        return new ParseResult.Builder().setResult(adParameters).setErrors(arrayList).build();
    }
}
