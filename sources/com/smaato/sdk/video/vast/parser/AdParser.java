package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.p259fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.C8937Ad;
import com.smaato.sdk.video.vast.model.InLine;
import com.smaato.sdk.video.vast.model.Wrapper;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

public class AdParser implements XmlClassParser<C8937Ad> {
    private static final String[] VAST_AD_TAGS = {"InLine", "Wrapper"};

    static /* synthetic */ void lambda$parse$0(ParseError parseError) {
    }

    public ParseResult<C8937Ad> parse(RegistryXmlParser registryXmlParser) {
        C8937Ad.Builder builder = new C8937Ad.Builder();
        ArrayList arrayList = new ArrayList();
        builder.getClass();
        $$Lambda$9qZmBe39t4N5fXyKLg58FAaBnEE r2 = new Consumer() {
            public final void accept(Object obj) {
                C8937Ad.Builder.this.setId((String) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseStringAttribute = registryXmlParser.parseStringAttribute("id", r2, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$0MhdXTYCtk3yW2Kfvap06hQjYHM r3 = new Consumer() {
            public final void accept(Object obj) {
                C8937Ad.Builder.this.setSequence((Integer) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseIntegerAttribute = parseStringAttribute.parseIntegerAttribute("sequence", r3, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$mJVVUdb6M4DFAOLcbEmRSPwJ10g r32 = new Consumer() {
            public final void accept(Object obj) {
                C8937Ad.Builder.this.setConditionalAd((Boolean) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseBooleanAttribute = parseIntegerAttribute.parseBooleanAttribute(C8937Ad.CONDITIONAL_AD, r32, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        parseBooleanAttribute.parseStringAttribute(C8937Ad.AD_TYPE, new Consumer() {
            public final void accept(Object obj) {
                C8937Ad.Builder.this.setAdType((String) obj);
            }
        }, $$Lambda$AdParser$D6r03UCxgDOzWq7Qv08B3ILlGcc.INSTANCE).parseTags(VAST_AD_TAGS, new Consumer(builder, arrayList) {
            public final /* synthetic */ C8937Ad.Builder f$1;
            public final /* synthetic */ List f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                AdParser.lambda$parse$3(RegistryXmlParser.this, this.f$1, this.f$2, (String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("Ad", new Exception("Unable to parse tags in Ad", (Exception) obj)));
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList).build();
    }

    static /* synthetic */ void lambda$parse$3(RegistryXmlParser registryXmlParser, C8937Ad.Builder builder, List list, String str) {
        if (str.equalsIgnoreCase("InLine")) {
            registryXmlParser.parseClass("InLine", new NonNullConsumer(list) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    AdParser.lambda$null$1(C8937Ad.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        } else if (str.equalsIgnoreCase("Wrapper")) {
            registryXmlParser.parseClass("Wrapper", new NonNullConsumer(list) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    AdParser.lambda$null$2(C8937Ad.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        }
    }

    static /* synthetic */ void lambda$null$1(C8937Ad.Builder builder, List list, ParseResult parseResult) {
        builder.setInLine((InLine) parseResult.value);
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

    static /* synthetic */ void lambda$null$2(C8937Ad.Builder builder, List list, ParseResult parseResult) {
        builder.setWrapper((Wrapper) parseResult.value);
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
