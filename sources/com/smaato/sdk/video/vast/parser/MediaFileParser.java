package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.p259fi.CheckedFunction;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.Delivery;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

public class MediaFileParser implements XmlClassParser<MediaFile> {
    private static final CheckedFunction<String, Delivery> deliveryParsingFunction = $$Lambda$MediaFileParser$wcor_tnvWD343fJpUAvMfatYI.INSTANCE;

    static /* synthetic */ void lambda$parse$1(ParseError parseError) {
    }

    static /* synthetic */ void lambda$parse$2(ParseError parseError) {
    }

    static /* synthetic */ Delivery lambda$static$0(String str) throws Exception {
        return (Delivery) Objects.requireNonNull(Delivery.parse(str));
    }

    public ParseResult<MediaFile> parse(RegistryXmlParser registryXmlParser) {
        MediaFile mediaFile;
        MediaFile.Builder builder = new MediaFile.Builder();
        ArrayList arrayList = new ArrayList();
        builder.getClass();
        $$Lambda$unsKlz8Z4fkgFwrVNHo3qsoiSHA r2 = new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setId((String) obj);
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
        $$Lambda$ZAsY1k7c4x3La6_cZjNUXSGHUCU r22 = new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setType((String) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseStringAttribute2 = parseStringAttribute.parseStringAttribute("type", r22, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$3frXeIoewdLY61q0ohGd5uRaOM0 r23 = new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setWidth((Float) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseFloatAttribute = parseStringAttribute2.parseFloatAttribute("width", r23, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$1vDea_KCz1y3uM3dWO1S9t_63Lw r24 = new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setHeight((Float) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseFloatAttribute2 = parseFloatAttribute.parseFloatAttribute("height", r24, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$SHpG9dpemQ8avvDrmud__v8dzHA r25 = new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setCodec((String) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseStringAttribute3 = parseFloatAttribute2.parseStringAttribute(MediaFile.CODEC, r25, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$z8od1j9ilRznrRPKmVJ61IYNpg0 r26 = new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setBitrate((Integer) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseIntegerAttribute = parseStringAttribute3.parseIntegerAttribute(MediaFile.BITRATE, r26, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$ce_K628IBZMmfb2GQsxQMaw458s r27 = new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setMinBitrate((Integer) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseIntegerAttribute2 = parseIntegerAttribute.parseIntegerAttribute(MediaFile.MIN_BITRATE, r27, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$l2x__AX6OStWdZtAG_J0fRiwGZo r28 = new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setMaxBitrate((Integer) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseIntegerAttribute3 = parseIntegerAttribute2.parseIntegerAttribute(MediaFile.MAX_BITRATE, r28, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$rsEIbzJoFmPqbMgdGNpVxbHNPOk r29 = new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setScalable((Boolean) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseBooleanAttribute = parseIntegerAttribute3.parseBooleanAttribute(MediaFile.SCALABLE, r29, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$Eg1FQLQ0rcIHqXxkb2E1JU0KVdg r210 = new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setMaintainAspectRatio((Boolean) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseBooleanAttribute2 = parseBooleanAttribute.parseBooleanAttribute(MediaFile.MAINTAIN_ASPECT_RATIO, r210, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        $$Lambda$TVRicI9np0ytVMmXnPBaT_WU r211 = new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setApiFramework((String) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseStringAttribute4 = parseBooleanAttribute2.parseStringAttribute("apiFramework", r211, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        RegistryXmlParser parseIntegerAttribute4 = parseStringAttribute4.parseIntegerAttribute(MediaFile.FILE_SIZE, new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setFileSize((Integer) obj);
            }
        }, $$Lambda$MediaFileParser$0wHhvUFZ2TG4Q6EWfBe6qEKpiU.INSTANCE);
        builder.getClass();
        RegistryXmlParser parseStringAttribute5 = parseIntegerAttribute4.parseStringAttribute(MediaFile.MEDIA_TYPE, new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setMediaType((String) obj);
            }
        }, $$Lambda$MediaFileParser$Eq4VVilki8ZQn7r7brqvRZVAlIE.INSTANCE);
        CheckedFunction<String, Delivery> checkedFunction = deliveryParsingFunction;
        builder.getClass();
        $$Lambda$scbo28Nq1BgfZgInm7ZdkLqYeqE r3 = new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setDelivery((Delivery) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseTypedAttribute = parseStringAttribute5.parseTypedAttribute(MediaFile.DELIVERY, checkedFunction, r3, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        parseTypedAttribute.parseString(new Consumer() {
            public final void accept(Object obj) {
                MediaFile.Builder.this.setUrl((String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("url", new Exception("Unable to parse URL value", (Exception) obj)));
            }
        });
        try {
            mediaFile = builder.build();
        } catch (VastElementMissingException e) {
            arrayList.add(ParseError.buildFrom(MediaFile.NAME, e));
            mediaFile = null;
        }
        return new ParseResult.Builder().setResult(mediaFile).setErrors(arrayList).build();
    }
}
