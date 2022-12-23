package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.vast.model.UniversalAdId;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

public class UniversalAdIdParser implements XmlClassParser<UniversalAdId> {
    public ParseResult<UniversalAdId> parse(RegistryXmlParser registryXmlParser) {
        UniversalAdId.Builder builder = new UniversalAdId.Builder();
        ArrayList arrayList = new ArrayList();
        builder.getClass();
        $$Lambda$XlkkLawgbjwRWP98PtdnxKTzI r2 = new Consumer() {
            public final void accept(Object obj) {
                UniversalAdId.Builder.this.setIdRegistry((String) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseStringAttribute = registryXmlParser.parseStringAttribute(UniversalAdId.ID_REGISTRY, r2, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$G7t6zx2zNENJ_LtT5hNaZlRsTDI r22 = new Consumer() {
            public final void accept(Object obj) {
                UniversalAdId.Builder.this.setIdValue((String) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseStringAttribute2 = parseStringAttribute.parseStringAttribute(UniversalAdId.ID_VALUE, r22, new Consumer(arrayList) {
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
                UniversalAdId.Builder.this.setValue((String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("UniversalAdId", new Exception("Unable to parse UniversalAdId value", (Exception) obj)));
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList).build();
    }
}
