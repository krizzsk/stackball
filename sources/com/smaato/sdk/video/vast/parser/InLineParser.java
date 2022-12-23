package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.p259fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.AdSystem;
import com.smaato.sdk.video.vast.model.Advertiser;
import com.smaato.sdk.video.vast.model.InLine;
import com.smaato.sdk.video.vast.model.ViewableImpression;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class InLineParser implements XmlClassParser<InLine> {
    private static final String[] VAST_INLINE_TAGS = {"AdSystem", InLine.AD_TITLE, InLine.AD_SERVING_ID, "Impression", "Category", InLine.DESCRIPTION, "Advertiser", "Error", "ViewableImpression", "AdVerifications", "Creatives", "Extensions"};

    public ParseResult<InLine> parse(RegistryXmlParser registryXmlParser) {
        InLine.Builder builder = new InLine.Builder();
        ArrayList arrayList = new ArrayList();
        String[] strArr = VAST_INLINE_TAGS;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        builder.setImpressions(arrayList2);
        builder.setCategories(arrayList3);
        builder.setAdVerifications(arrayList5);
        builder.setExtensions(arrayList6);
        builder.setErrors(arrayList4);
        registryXmlParser.parseTags(strArr, new Consumer(registryXmlParser, builder, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6) {
            public final /* synthetic */ RegistryXmlParser f$1;
            public final /* synthetic */ InLine.Builder f$2;
            public final /* synthetic */ List f$3;
            public final /* synthetic */ List f$4;
            public final /* synthetic */ List f$5;
            public final /* synthetic */ List f$6;
            public final /* synthetic */ List f$7;
            public final /* synthetic */ List f$8;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r8;
                this.f$8 = r9;
            }

            public final void accept(Object obj) {
                InLineParser.this.lambda$getParsingTagsConsumer$1$InLineParser(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("InLine", new Exception("Unable to parse tags in InLine")));
            }
        });
        return new ParseResult.Builder().setResult(builder.build()).setErrors(arrayList).build();
    }

    public /* synthetic */ void lambda$getParsingTagsConsumer$1$InLineParser(RegistryXmlParser registryXmlParser, InLine.Builder builder, List list, List list2, List list3, List list4, List list5, List list6, String str) {
        if ("AdSystem".equalsIgnoreCase(str)) {
            registryXmlParser.parseClass("AdSystem", new NonNullConsumer(list) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    InLineParser.lambda$parseAdSystem$13(InLine.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        } else if (InLine.AD_TITLE.equalsIgnoreCase(str)) {
            builder.getClass();
            registryXmlParser.parseString(new Consumer() {
                public final void accept(Object obj) {
                    InLine.Builder.this.setAdTitle((String) obj);
                }
            }, new Consumer(list) {
                public final /* synthetic */ List f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    this.f$0.add(ParseError.buildFrom(InLine.AD_TITLE, new Exception("Unable to parse AdTitle value", (Exception) obj)));
                }
            });
        } else if (InLine.AD_SERVING_ID.equalsIgnoreCase(str)) {
            builder.getClass();
            registryXmlParser.parseString(new Consumer() {
                public final void accept(Object obj) {
                    InLine.Builder.this.setAdServingId((String) obj);
                }
            }, new Consumer(list) {
                public final /* synthetic */ List f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    this.f$0.add(ParseError.buildFrom(InLine.AD_SERVING_ID, new Exception("Unable to parse AdServingId value", (Exception) obj)));
                }
            });
        } else if ("Impression".equalsIgnoreCase(str)) {
            registryXmlParser.parseClass("Impression", new NonNullConsumer(list2, list) {
                public final /* synthetic */ List f$0;
                public final /* synthetic */ List f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    InLineParser.lambda$parseImpression$10(this.f$0, this.f$1, (ParseResult) obj);
                }
            });
        } else if ("Category".equalsIgnoreCase(str)) {
            registryXmlParser.parseClass("Category", new NonNullConsumer(list3, list) {
                public final /* synthetic */ List f$0;
                public final /* synthetic */ List f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    InLineParser.lambda$parseCategory$9(this.f$0, this.f$1, (ParseResult) obj);
                }
            });
        } else if (InLine.DESCRIPTION.equalsIgnoreCase(str)) {
            builder.getClass();
            registryXmlParser.parseString(new Consumer() {
                public final void accept(Object obj) {
                    InLine.Builder.this.setDescription((String) obj);
                }
            }, new Consumer(list) {
                public final /* synthetic */ List f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    this.f$0.add(ParseError.buildFrom(InLine.DESCRIPTION, new Exception("Unable to parse Description value", (Exception) obj)));
                }
            });
        } else if ("Advertiser".equalsIgnoreCase(str)) {
            registryXmlParser.parseClass("Advertiser", new NonNullConsumer(list) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    InLineParser.lambda$parseAdvertiser$7(InLine.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        } else if ("Error".equalsIgnoreCase(str)) {
            list4.getClass();
            registryXmlParser.parseString(new Consumer(list4) {
                public final /* synthetic */ List f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    this.f$0.add((String) obj);
                }
            }, new Consumer(list) {
                public final /* synthetic */ List f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    this.f$0.add(ParseError.buildFrom("Error", new Exception("Unable to parse Error value", (Exception) obj)));
                }
            });
        } else if ("ViewableImpression".equalsIgnoreCase(str)) {
            registryXmlParser.parseClass("ViewableImpression", new NonNullConsumer(list) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    InLineParser.lambda$parseViewableImpression$5(InLine.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        } else if ("Creatives".equalsIgnoreCase(str)) {
            registryXmlParser.parseClass("Creatives", new NonNullConsumer(list) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    InLineParser.lambda$parseCreatives$4(InLine.Builder.this, this.f$1, (ParseResult) obj);
                }
            });
        } else if ("AdVerifications".equalsIgnoreCase(str)) {
            registryXmlParser.parseClass("AdVerifications", new NonNullConsumer(list5, list) {
                public final /* synthetic */ List f$0;
                public final /* synthetic */ List f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    InLineParser.lambda$parseAdVerification$3(this.f$0, this.f$1, (ParseResult) obj);
                }
            });
        } else if ("Extensions".equalsIgnoreCase(str)) {
            registryXmlParser.parseClass("Extensions", new NonNullConsumer(list6, list) {
                public final /* synthetic */ List f$0;
                public final /* synthetic */ List f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    InLineParser.lambda$parseExtention$2(this.f$0, this.f$1, (ParseResult) obj);
                }
            });
        }
    }

    static /* synthetic */ void lambda$parseExtention$2(List list, List list2, ParseResult parseResult) {
        if (parseResult.value != null) {
            list.addAll((Collection) parseResult.value);
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

    static /* synthetic */ void lambda$parseAdVerification$3(List list, List list2, ParseResult parseResult) {
        if (parseResult.value != null) {
            list.addAll((Collection) parseResult.value);
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

    static /* synthetic */ void lambda$parseCreatives$4(InLine.Builder builder, List list, ParseResult parseResult) {
        builder.setCreatives((List) parseResult.value);
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

    static /* synthetic */ void lambda$parseViewableImpression$5(InLine.Builder builder, List list, ParseResult parseResult) {
        builder.setViewableImpression((ViewableImpression) parseResult.value);
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

    static /* synthetic */ void lambda$parseAdvertiser$7(InLine.Builder builder, List list, ParseResult parseResult) {
        if (parseResult.value != null) {
            builder.setAdvertiser((Advertiser) parseResult.value);
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

    static /* synthetic */ void lambda$parseCategory$9(List list, List list2, ParseResult parseResult) {
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

    static /* synthetic */ void lambda$parseImpression$10(List list, List list2, ParseResult parseResult) {
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

    static /* synthetic */ void lambda$parseAdSystem$13(InLine.Builder builder, List list, ParseResult parseResult) {
        builder.setAdSystem((AdSystem) parseResult.value);
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
