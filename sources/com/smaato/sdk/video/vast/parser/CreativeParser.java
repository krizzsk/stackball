package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.p259fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.CompanionAds;
import com.smaato.sdk.video.vast.model.Creative;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.UniversalAdId;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

public class CreativeParser implements XmlClassParser<Creative> {
    private static final String[] CREATIVE_TAGS = {"UniversalAdId", "CompanionAds", "Linear"};

    public ParseResult<Creative> parse(RegistryXmlParser registryXmlParser) {
        Creative.Builder builder = new Creative.Builder();
        ArrayList arrayList = new ArrayList();
        builder.getClass();
        $$Lambda$cwejmya3H3d7C710WzI45rGf0rA r2 = new Consumer() {
            public final void accept(Object obj) {
                Creative.Builder.this.setId((String) obj);
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
        $$Lambda$5oazT5nbNbk5tYB87t81DUOIfpk r3 = new Consumer() {
            public final void accept(Object obj) {
                Creative.Builder.this.setSequence((Integer) obj);
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
        $$Lambda$mzbA3RGmuTQLxBiOCdswY4xpZSI r32 = new Consumer() {
            public final void accept(Object obj) {
                Creative.Builder.this.setAdId((String) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseStringAttribute2 = parseIntegerAttribute.parseStringAttribute(Creative.AD_ID, r32, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$2R7Y1DNJOK6V5gZpiE3PNGAYmHo r33 = new Consumer() {
            public final void accept(Object obj) {
                Creative.Builder.this.setApiFramework((String) obj);
            }
        };
        arrayList.getClass();
        parseStringAttribute2.parseStringAttribute("apiFramework", r33, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseTags(CREATIVE_TAGS, new Consumer(builder, arrayList) {
            public final /* synthetic */ Creative.Builder f$1;
            public final /* synthetic */ List f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                CreativeParser.lambda$parse$3(RegistryXmlParser.this, this.f$1, this.f$2, (String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom(Creative.NAME, new Exception("Unable to parse tags in Creative", (Exception) obj)));
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList).build();
    }

    static /* synthetic */ void lambda$parse$3(RegistryXmlParser registryXmlParser, Creative.Builder builder, List list, String str) {
        if (str.equalsIgnoreCase("UniversalAdId")) {
            registryXmlParser.parseClass("UniversalAdId", new NonNullConsumer(list) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    CreativeParser.lambda$null$0(Creative.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        } else if (str.equalsIgnoreCase("CompanionAds")) {
            registryXmlParser.parseClass("CompanionAds", new NonNullConsumer(list) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    CreativeParser.lambda$null$1(Creative.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        } else if (str.equalsIgnoreCase("Linear")) {
            registryXmlParser.parseClass("Linear", new NonNullConsumer(list) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    CreativeParser.lambda$null$2(Creative.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        }
    }

    static /* synthetic */ void lambda$null$0(Creative.Builder builder, List list, ParseResult parseResult) {
        builder.setUniversalAdId((UniversalAdId) parseResult.value);
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

    static /* synthetic */ void lambda$null$1(Creative.Builder builder, List list, ParseResult parseResult) {
        builder.setCompanionAds((CompanionAds) parseResult.value);
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

    static /* synthetic */ void lambda$null$2(Creative.Builder builder, List list, ParseResult parseResult) {
        builder.setLinear((Linear) parseResult.value);
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
