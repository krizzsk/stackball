package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.p259fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.Icon;
import com.smaato.sdk.video.vast.model.IconClicks;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

public class IconParser implements XmlClassParser<Icon> {
    private static final String[] ICON_TAGS = {"StaticResource", "IFrameResource", "HTMLResource", "IconClicks", Icon.ICON_VIEW_TRACKING};

    public ParseResult<Icon> parse(RegistryXmlParser registryXmlParser) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Icon.Builder builder = new Icon.Builder();
        builder.setIconViewTrackings(arrayList);
        builder.setStaticResources(arrayList2);
        builder.setIFrameResources(arrayList3);
        builder.setHtmlResources(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        builder.getClass();
        $$Lambda$yv3b2fIi6yUZmhhFSIfVnMeNGaA r0 = new Consumer() {
            public final void accept(Object obj) {
                Icon.Builder.this.setProgram((String) obj);
            }
        };
        arrayList5.getClass();
        RegistryXmlParser parseStringAttribute = registryXmlParser.parseStringAttribute(Icon.PROGRAM, r0, new Consumer(arrayList5) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$rokjuhw1FKiT9r0Vd_F47JGvos r1 = new Consumer() {
            public final void accept(Object obj) {
                Icon.Builder.this.setWidth((Float) obj);
            }
        };
        arrayList5.getClass();
        RegistryXmlParser parseFloatAttribute = parseStringAttribute.parseFloatAttribute("width", r1, new Consumer(arrayList5) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$ZNbZQwrjvwMr99OGAprWOw27JkI r12 = new Consumer() {
            public final void accept(Object obj) {
                Icon.Builder.this.setHeight((Float) obj);
            }
        };
        arrayList5.getClass();
        RegistryXmlParser parseFloatAttribute2 = parseFloatAttribute.parseFloatAttribute("height", r12, new Consumer(arrayList5) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$ao0Z_xNc5rm2D3C9IeGz_III r13 = new Consumer() {
            public final void accept(Object obj) {
                Icon.Builder.this.setXPosition((String) obj);
            }
        };
        arrayList5.getClass();
        RegistryXmlParser parseStringAttribute2 = parseFloatAttribute2.parseStringAttribute(Icon.X_POSITION, r13, new Consumer(arrayList5) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$P6GMSECdlYfyF8QbpqHewwX_iRU r14 = new Consumer() {
            public final void accept(Object obj) {
                Icon.Builder.this.setYPosition((String) obj);
            }
        };
        arrayList5.getClass();
        RegistryXmlParser parseStringAttribute3 = parseStringAttribute2.parseStringAttribute(Icon.Y_POSITION, r14, new Consumer(arrayList5) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$GUZUaXUcCllr0gqSVpjX0uXl0 r15 = new Consumer() {
            public final void accept(Object obj) {
                Icon.Builder.this.setDuration((String) obj);
            }
        };
        arrayList5.getClass();
        RegistryXmlParser parseStringAttribute4 = parseStringAttribute3.parseStringAttribute("duration", r15, new Consumer(arrayList5) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$iEOW1T7S8nta5hVhVBEUNl1ZNU r16 = new Consumer() {
            public final void accept(Object obj) {
                Icon.Builder.this.setOffset((String) obj);
            }
        };
        arrayList5.getClass();
        RegistryXmlParser parseStringAttribute5 = parseStringAttribute4.parseStringAttribute("offset", r16, new Consumer(arrayList5) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$NAVde81aQeQWTu_KPVV5aqvo_I r17 = new Consumer() {
            public final void accept(Object obj) {
                Icon.Builder.this.setApiFramework((String) obj);
            }
        };
        arrayList5.getClass();
        RegistryXmlParser parseStringAttribute6 = parseStringAttribute5.parseStringAttribute("apiFramework", r17, new Consumer(arrayList5) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$Eh7SXOfwCRvewePHF812c78bsU r18 = new Consumer() {
            public final void accept(Object obj) {
                Icon.Builder.this.setPxRatio((Float) obj);
            }
        };
        arrayList5.getClass();
        parseStringAttribute6.parseFloatAttribute("pxratio", r18, new Consumer(arrayList5) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        registryXmlParser.parseTags(ICON_TAGS, new Consumer(arrayList2, arrayList5, arrayList3, arrayList4, arrayList, builder) {
            public final /* synthetic */ List f$1;
            public final /* synthetic */ List f$2;
            public final /* synthetic */ List f$3;
            public final /* synthetic */ List f$4;
            public final /* synthetic */ List f$5;
            public final /* synthetic */ Icon.Builder f$6;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
            }

            public final void accept(Object obj) {
                IconParser.lambda$parse$5(RegistryXmlParser.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (String) obj);
            }
        }, new Consumer(arrayList5) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom(Icon.NAME, new Exception("Unable to parse URL value", (Exception) obj)));
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList5).build();
    }

    static /* synthetic */ void lambda$parse$5(RegistryXmlParser registryXmlParser, List list, List list2, List list3, List list4, List list5, Icon.Builder builder, String str) {
        if (str.equalsIgnoreCase("StaticResource")) {
            registryXmlParser.parseClass("StaticResource", new NonNullConsumer(list, list2) {
                public final /* synthetic */ List f$0;
                public final /* synthetic */ List f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    IconParser.lambda$null$0(this.f$0, this.f$1, (ParseResult) obj);
                }
            });
        } else if (str.equalsIgnoreCase("IFrameResource")) {
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
                    this.f$0.add(ParseError.buildFrom("IFrameResource", new Exception("Unable to parse IFrameResource value", (Exception) obj)));
                }
            });
        } else if (str.equalsIgnoreCase("HTMLResource")) {
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
                    this.f$0.add(ParseError.buildFrom("HTMLResource", new Exception("Unable to parse HTMLResource value", (Exception) obj)));
                }
            });
        } else if (str.equalsIgnoreCase(Icon.ICON_VIEW_TRACKING)) {
            list5.getClass();
            registryXmlParser.parseString(new Consumer(list5) {
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
                    this.f$0.add(ParseError.buildFrom(Icon.ICON_VIEW_TRACKING, new Exception("Unable to parse IconViewTracking value", (Exception) obj)));
                }
            });
        } else if (str.equalsIgnoreCase("IconClicks")) {
            registryXmlParser.parseClass("IconClicks", new NonNullConsumer(list2) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    IconParser.lambda$null$4(Icon.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        }
    }

    static /* synthetic */ void lambda$null$0(List list, List list2, ParseResult parseResult) {
        if (parseResult.value != null) {
            list.add(parseResult.value);
        }
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

    static /* synthetic */ void lambda$null$4(Icon.Builder builder, List list, ParseResult parseResult) {
        builder.setIconClicks((IconClicks) parseResult.value);
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
