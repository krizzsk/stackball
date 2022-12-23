package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.p259fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.AdParameters;
import com.smaato.sdk.video.vast.model.Companion;
import com.smaato.sdk.video.vast.model.StaticResource;
import com.smaato.sdk.video.vast.model.VastBeacon;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

public class CompanionParser implements XmlClassParser<Companion> {
    private static final String[] COMPANION_TAGS = {"StaticResource", "IFrameResource", "HTMLResource", Companion.ALT_TEXT, Companion.COMPANION_CLICK_THROUGH, Companion.COMPANION_CLICK_TRACKING, "TrackingEvents", "AdParameters"};

    static /* synthetic */ void lambda$parseAttributes$10(ParseError parseError) {
    }

    static /* synthetic */ void lambda$getParsingTagsConsumer$0(RegistryXmlParser registryXmlParser, List list, List list2, List list3, List list4, Companion.Builder builder, List list5, String str) {
        if ("StaticResource".equalsIgnoreCase(str)) {
            registryXmlParser.parseClass("StaticResource", new NonNullConsumer(list, list2) {
                public final /* synthetic */ List f$0;
                public final /* synthetic */ List f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    CompanionParser.lambda$parseStaticResource$1(this.f$0, this.f$1, (ParseResult) obj);
                }
            });
        } else if ("IFrameResource".equalsIgnoreCase(str)) {
            list3.getClass();
            registryXmlParser.parseString(new Consumer(list3) {
                public final /* synthetic */ List f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    this.f$0.add((String) obj);
                }
            }, new Consumer(list2) {
                public final /* synthetic */ List f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    this.f$0.add(ParseError.buildFrom("IFrameResource", new Exception("Unable to parse IFrameResource", (Exception) obj)));
                }
            });
        } else if ("HTMLResource".equalsIgnoreCase(str)) {
            list4.getClass();
            registryXmlParser.parseString(new Consumer(list4) {
                public final /* synthetic */ List f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    this.f$0.add((String) obj);
                }
            }, new Consumer(list2) {
                public final /* synthetic */ List f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    this.f$0.add(ParseError.buildFrom("HTMLResource", new Exception("Unable to parse HtmlResource", (Exception) obj)));
                }
            });
        } else if (Companion.ALT_TEXT.equalsIgnoreCase(str)) {
            builder.getClass();
            registryXmlParser.parseString(new Consumer() {
                public final void accept(Object obj) {
                    Companion.Builder.this.setAltText((String) obj);
                }
            }, new Consumer(list2) {
                public final /* synthetic */ List f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    this.f$0.add(ParseError.buildFrom(Companion.ALT_TEXT, new Exception("Unable to parse AltText", (Exception) obj)));
                }
            });
        } else if ("AdParameters".equalsIgnoreCase(str)) {
            registryXmlParser.parseClass("AdParameters", new NonNullConsumer(list2) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    CompanionParser.lambda$parseAdParameters$5(Companion.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        } else if (Companion.COMPANION_CLICK_THROUGH.equalsIgnoreCase(str)) {
            builder.getClass();
            registryXmlParser.parseString(new Consumer() {
                public final void accept(Object obj) {
                    Companion.Builder.this.setCompanionClickThrough((String) obj);
                }
            }, new Consumer(list2) {
                public final /* synthetic */ List f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    this.f$0.add(ParseError.buildFrom(Companion.COMPANION_CLICK_THROUGH, new Exception("Unable to parse CompanionClickThrough", (Exception) obj)));
                }
            });
        } else if (Companion.COMPANION_CLICK_TRACKING.equalsIgnoreCase(str)) {
            registryXmlParser.parseClass(Companion.COMPANION_CLICK_TRACKING, new NonNullConsumer(list5, list2) {
                public final /* synthetic */ List f$0;
                public final /* synthetic */ List f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    CompanionParser.lambda$parseCompanionClickTracking$3(this.f$0, this.f$1, (ParseResult) obj);
                }
            });
        } else if ("TrackingEvents".equalsIgnoreCase(str)) {
            registryXmlParser.parseClass("TrackingEvents", new NonNullConsumer(list2) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    CompanionParser.lambda$parseTrackingEvents$2(Companion.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        }
    }

    static /* synthetic */ void lambda$parseStaticResource$1(List list, List list2, ParseResult parseResult) {
        Result result = parseResult.value;
        list.getClass();
        Objects.onNotNull(result, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((StaticResource) obj);
            }
        });
        List<ParseError> list3 = parseResult.errors;
        list2.getClass();
        Objects.onNotNull(list3, new Consumer(list2) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.addAll((List) obj);
            }
        });
    }

    static /* synthetic */ void lambda$parseTrackingEvents$2(Companion.Builder builder, List list, ParseResult parseResult) {
        Result result = parseResult.value;
        builder.getClass();
        Objects.onNotNull(result, new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setTrackingEvents((List) obj);
            }
        });
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

    static /* synthetic */ void lambda$parseCompanionClickTracking$3(List list, List list2, ParseResult parseResult) {
        Result result = parseResult.value;
        list.getClass();
        Objects.onNotNull(result, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((VastBeacon) obj);
            }
        });
        List<ParseError> list3 = parseResult.errors;
        list2.getClass();
        Objects.onNotNull(list3, new Consumer(list2) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.addAll((List) obj);
            }
        });
    }

    static /* synthetic */ void lambda$parseAdParameters$5(Companion.Builder builder, List list, ParseResult parseResult) {
        builder.setAdParameters((AdParameters) parseResult.value);
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

    public ParseResult<Companion> parse(RegistryXmlParser registryXmlParser) {
        Companion.Builder builder = new Companion.Builder();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        builder.setTrackingEvents(arrayList2);
        builder.setCompanionClickTrackings(arrayList3);
        builder.getClass();
        $$Lambda$0bqD4vE97fmlyD9aGLPSVjMZkc r0 = new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setId((String) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseStringAttribute = registryXmlParser.parseStringAttribute("id", r0, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$cM8VjUhnn2f8NBGBx8leKUtNM r1 = new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setWidth((Float) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseFloatAttribute = parseStringAttribute.parseFloatAttribute("width", r1, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$ZtLXwswPwv38PmvRBU04Ati_S_s r12 = new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setHeight((Float) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseFloatAttribute2 = parseFloatAttribute.parseFloatAttribute("height", r12, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$uueFx5UvWAe3aTPAGMCXwYd188 r13 = new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setAssetWidth((Float) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseFloatAttribute3 = parseFloatAttribute2.parseFloatAttribute(Companion.ASSET_WIDTH, r13, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$0vpqm4Sm7U3qpcRNBwys1rir1GM r14 = new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setAssetHeight((Float) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseFloatAttribute4 = parseFloatAttribute3.parseFloatAttribute(Companion.ASSET_HEIGHT, r14, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$3stO5lIoH2q55yvu29O_Y09O83Y r15 = new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setExpandedWidth((Float) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseFloatAttribute5 = parseFloatAttribute4.parseFloatAttribute(Companion.EXPANDED_WIDTH, r15, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$gUHPt2xIDPeQ56Dc0RfEUJXkMw r16 = new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setExpandedHeight((Float) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseFloatAttribute6 = parseFloatAttribute5.parseFloatAttribute(Companion.EXPANDED_HEIGHT, r16, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$uRUrS2NLRcvquzD_plaWBybqNbc r17 = new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setApiFramework((String) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseStringAttribute2 = parseFloatAttribute6.parseStringAttribute("apiFramework", r17, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$jYqVO29_cdzAHocviVNCkKlXQU r18 = new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setAdSlotID((String) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseStringAttribute3 = parseStringAttribute2.parseStringAttribute(Companion.AD_SLOT_ID, r18, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$odwJlie7KRIW0811CexQqUrGlco r19 = new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setPxRatio((Float) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseFloatAttribute7 = parseStringAttribute3.parseFloatAttribute("pxratio", r19, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        parseFloatAttribute7.parseStringAttribute(Companion.RENDERING_MODE, new Consumer() {
            public final void accept(Object obj) {
                Companion.Builder.this.setRenderingMode((String) obj);
            }
        }, $$Lambda$CompanionParser$PJXb_HEHOFkoORxFDcEJM1Gf28.INSTANCE);
        String[] strArr = COMPANION_TAGS;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        builder.setCompanionClickTrackings(arrayList4);
        builder.setStaticResources(arrayList5);
        builder.setIFrameResources(arrayList6);
        builder.setHtmlResources(arrayList7);
        registryXmlParser.parseTags(strArr, new Consumer(arrayList5, arrayList, arrayList6, arrayList7, builder, arrayList4) {
            public final /* synthetic */ List f$1;
            public final /* synthetic */ List f$2;
            public final /* synthetic */ List f$3;
            public final /* synthetic */ List f$4;
            public final /* synthetic */ Companion.Builder f$5;
            public final /* synthetic */ List f$6;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
            }

            public final void accept(Object obj) {
                CompanionParser.lambda$getParsingTagsConsumer$0(RegistryXmlParser.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("Companion", new Exception("Unable to parse tags in Companion", (Exception) obj)));
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList).build();
    }
}
