package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.Category;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

public class CategoryParser implements XmlClassParser<Category> {
    public ParseResult<Category> parse(RegistryXmlParser registryXmlParser) {
        Category category;
        Category.Builder builder = new Category.Builder();
        ArrayList arrayList = new ArrayList();
        builder.getClass();
        $$Lambda$aju9r0m1Fd8WC7bsvmEjLKLOvtE r2 = new Consumer() {
            public final void accept(Object obj) {
                Category.Builder.this.setAuthority((String) obj);
            }
        };
        arrayList.getClass();
        RegistryXmlParser parseStringAttribute = registryXmlParser.parseStringAttribute(Category.AUTHORITY, r2, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add((ParseError) obj);
            }
        });
        builder.getClass();
        parseStringAttribute.parseString(new Consumer() {
            public final void accept(Object obj) {
                Category.Builder.this.setCategoryCode((String) obj);
            }
        }, new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.add(ParseError.buildFrom("Category", new Exception("Unable to parse Category code value", (Exception) obj)));
            }
        });
        try {
            category = builder.build();
        } catch (VastElementMissingException e) {
            arrayList.add(ParseError.buildFrom("Category", e));
            category = null;
        }
        return new ParseResult.Builder().setResult(category).setErrors(arrayList).build();
    }
}
