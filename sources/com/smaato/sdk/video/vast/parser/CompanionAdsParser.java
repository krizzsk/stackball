package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.p259fi.CheckedFunction;
import com.smaato.sdk.video.p259fi.NonNullConsumer;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.Companion;
import com.smaato.sdk.video.vast.model.CompanionAds;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

public class CompanionAdsParser implements XmlClassParser<CompanionAds> {
    private static final CheckedFunction<String, CompanionAds.Required> requiredParsingFunction = $$Lambda$CompanionAdsParser$gbQA8B_E6KCVmQLT7oieod4s7k.INSTANCE;

    static /* synthetic */ CompanionAds.Required lambda$static$0(String str) throws Exception {
        return (CompanionAds.Required) Objects.requireNonNull(CompanionAds.Required.parse(str));
    }

    public ParseResult<CompanionAds> parse(RegistryXmlParser registryXmlParser) {
        CompanionAds companionAds;
        CompanionAds.Builder builder = new CompanionAds.Builder();
        ArrayList arrayList = new ArrayList();
        builder.setCompanions(arrayList);
        ArrayList arrayList2 = new ArrayList();
        CheckedFunction<String, CompanionAds.Required> checkedFunction = requiredParsingFunction;
        builder.getClass();
        $$Lambda$dSLfw8c8Is_Ly24LeE6Njeyr4JM r4 = new Consumer() {
            public final void accept(Object obj) {
                CompanionAds.Builder.this.setRequired((CompanionAds.Required) obj);
            }
        };
        arrayList2.getClass();
        registryXmlParser.parseTypedAttribute(CompanionAds.REQUIRED, checkedFunction, r4, new Consumer(arrayList2) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        }).parseTags(new String[]{"Companion"}, new Consumer(arrayList, arrayList2) {
            public final /* synthetic */ List f$1;
            public final /* synthetic */ List f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                RegistryXmlParser.this.parseClass("Companion", new NonNullConsumer(this.f$1, this.f$2) {
                    public final /* synthetic */ List f$0;
                    public final /* synthetic */ List f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    public final void accept(Object obj) {
                        CompanionAdsParser.lambda$null$1(this.f$0, this.f$1, (ParseResult) obj);
                    }
                });
            }
        }, new Consumer(arrayList2) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("CompanionAds", new Exception("Unable to parse tags in CompanionAds", (Exception) obj)));
            }
        });
        try {
            companionAds = builder.build();
        } catch (VastElementMissingException e) {
            arrayList2.add(ParseError.buildFrom("CompanionAds", e));
            companionAds = null;
        }
        return new ParseResult.Builder().setResult(companionAds).setErrors(arrayList2).build();
    }

    static /* synthetic */ void lambda$null$1(List list, List list2, ParseResult parseResult) {
        Result result = parseResult.value;
        list.getClass();
        Objects.onNotNull(result, new Consumer(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((Companion) obj);
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
}
