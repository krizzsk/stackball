package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.JavaScriptResource;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

public class JavaScriptResourceParser implements XmlClassParser<JavaScriptResource> {
    public ParseResult<JavaScriptResource> parse(RegistryXmlParser registryXmlParser) {
        JavaScriptResource javaScriptResource;
        JavaScriptResource.Builder builder = new JavaScriptResource.Builder();
        ArrayList arrayList = new ArrayList();
        builder.getClass();
        $$Lambda$7g0UtwebqDsq7GOgY9ybr057k3I r2 = new Consumer() {
            public final void accept(Object obj) {
                JavaScriptResource.Builder.this.setApiFramework((String) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseStringAttribute = registryXmlParser.parseStringAttribute("apiFramework", r2, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$qta7DQhCgxePpFyFxb6aqJaJ4Q4 r22 = new Consumer() {
            public final void accept(Object obj) {
                JavaScriptResource.Builder.this.setBrowserOptional((String) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseStringAttribute2 = parseStringAttribute.parseStringAttribute(JavaScriptResource.BROWSER_OPTIONAL, r22, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        parseStringAttribute2.parseString(new Consumer() {
            public final void accept(Object obj) {
                JavaScriptResource.Builder.this.setUri((String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("uri", new Exception("Unable to parse URI value", (Exception) obj)));
            }
        });
        try {
            javaScriptResource = builder.build();
        } catch (VastElementMissingException e) {
            arrayList.add(ParseError.buildFrom("JavaScriptResource", e));
            javaScriptResource = null;
        }
        return new ParseResult.Builder().setResult(javaScriptResource).setErrors(arrayList).build();
    }
}
