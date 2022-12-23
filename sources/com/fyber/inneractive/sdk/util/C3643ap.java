package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* renamed from: com.fyber.inneractive.sdk.util.ap */
public final class C3643ap {
    /* renamed from: a */
    public static Node m9064a(Node node, String str) {
        if (node == null) {
            return null;
        }
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeName().equals(str)) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static List<Node> m9065b(Node node, String str) {
        ArrayList arrayList = new ArrayList();
        if (node != null) {
            NodeList childNodes = node.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node item = childNodes.item(i);
                if (item.getNodeName().equals(str)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static String m9066c(Node node, String str) {
        Node namedItem;
        if (node == null || str == null || (namedItem = node.getAttributes().getNamedItem(str)) == null) {
            return null;
        }
        return namedItem.getNodeValue();
    }

    /* renamed from: d */
    public static Integer m9067d(Node node, String str) {
        String c = m9066c(node, str);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        try {
            return Integer.valueOf(c);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Boolean m9068e(Node node, String str) {
        String c = m9066c(node, str);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        try {
            return Boolean.valueOf(c);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m9063a(Node node) {
        if (node == null || node.getFirstChild() == null || node.getFirstChild().getNodeValue() == null) {
            return null;
        }
        return node.getFirstChild().getNodeValue().trim();
    }
}
