package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.p259fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.Extension;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

public class ExtensionParser implements XmlClassParser<Extension> {
    private static final String[] VAST_EXTENSIONS_TAGS = {"AdVerifications"};

    public ParseResult<Extension> parse(RegistryXmlParser registryXmlParser) {
        Extension.Builder builder = new Extension.Builder();
        ArrayList arrayList = new ArrayList();
        builder.getClass();
        $$Lambda$kaKIICju2BbMpOW0vtv7cWrloUk r2 = new Consumer() {
            public final void accept(Object obj) {
                Extension.Builder.this.setType((String) obj);
            }
        };
        arrayList.getClass();
        registryXmlParser.parseStringAttribute("type", r2, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseTags(VAST_EXTENSIONS_TAGS, new Consumer(builder, arrayList) {
            public final /* synthetic */ Extension.Builder f$1;
            public final /* synthetic */ List f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                ExtensionParser.lambda$parse$1(RegistryXmlParser.this, this.f$1, this.f$2, (String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom(Extension.NAME, new Exception("Unable to parse tags in Extension")));
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList).build();
    }

    static /* synthetic */ void lambda$parse$1(RegistryXmlParser registryXmlParser, Extension.Builder builder, List list, String str) {
        if ("AdVerifications".equalsIgnoreCase(str)) {
            registryXmlParser.parseClass("AdVerifications", new NonNullConsumer(list) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    ExtensionParser.lambda$null$0(Extension.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        }
    }

    static /* synthetic */ void lambda$null$0(Extension.Builder builder, List list, ParseResult parseResult) {
        if (parseResult.value != null) {
            builder.setAdVerifications((List) parseResult.value);
        }
        List<ParseError> list2 = parseResult.errors;
        list.getClass();
        Objects.onNotNull(list2, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.addAll((List) obj);
            }
        });
    }
}
