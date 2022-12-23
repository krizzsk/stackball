package com.amazon.device.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

class BridgeSelector {
    private static BridgeSelector instance = new BridgeSelector();
    private final AmazonViewableAdSDKBridgeFactory amazonAdSDKViewableBridgeFactory;
    private HashMap<AAXCreative, HashSet<AdSDKBridgeFactory>> bridgesForCT;
    private HashMap<String, HashSet<AdSDKBridgeFactory>> bridgesForPattern;
    private HashMap<String, HashSet<AdSDKBridgeFactory>> bridgesForResourcePattern;
    private HashMap<String, Pattern> patterns;

    public static BridgeSelector getInstance() {
        return instance;
    }

    BridgeSelector() {
        this(new AmazonViewableAdSDKBridgeFactory());
        initialize();
    }

    BridgeSelector(AmazonViewableAdSDKBridgeFactory amazonViewableAdSDKBridgeFactory) {
        this.amazonAdSDKViewableBridgeFactory = amazonViewableAdSDKBridgeFactory;
    }

    /* access modifiers changed from: package-private */
    public void initialize() {
        this.bridgesForCT = new HashMap<>();
        this.bridgesForPattern = new HashMap<>();
        this.patterns = new HashMap<>();
        this.bridgesForResourcePattern = new HashMap<>();
        addBridgeFactoryForScript("amazon.js", new AmazonAdSDKBridgeFactory());
        MraidAdSDKBridgeFactory mraidAdSDKBridgeFactory = new MraidAdSDKBridgeFactory();
        addBridgeFactory(AAXCreative.MRAID1, mraidAdSDKBridgeFactory);
        addBridgeFactory(AAXCreative.MRAID2, mraidAdSDKBridgeFactory);
        addBridgeFactory(AAXCreative.INTERSTITIAL, mraidAdSDKBridgeFactory);
        addBridgeFactoryForScript("mraid.js", mraidAdSDKBridgeFactory);
    }

    public void addBridgeFactory(AAXCreative aAXCreative, AdSDKBridgeFactory adSDKBridgeFactory) {
        HashSet hashSet = this.bridgesForCT.get(aAXCreative);
        if (hashSet == null) {
            hashSet = new HashSet();
            this.bridgesForCT.put(aAXCreative, hashSet);
        }
        hashSet.add(adSDKBridgeFactory);
    }

    public void addBridgeFactoryForScript(String str, AdSDKBridgeFactory adSDKBridgeFactory) {
        addBridgeFactoryForHtmlScriptTag(str, adSDKBridgeFactory);
        addBridgeFactoryForResourceLoad(str, adSDKBridgeFactory);
    }

    public void addBridgeFactoryForHtmlScriptTag(String str, AdSDKBridgeFactory adSDKBridgeFactory) {
        String format = String.format("<[Ss][Cc][Rr][Ii][Pp][Tt](\\s[^>]*\\s|\\s)[Ss][Rr][Cc]\\s*=\\s*[\"']%s[\"']", new Object[]{str});
        HashSet hashSet = this.bridgesForPattern.get(format);
        if (hashSet == null) {
            hashSet = new HashSet();
            this.bridgesForPattern.put(format, hashSet);
        }
        hashSet.add(adSDKBridgeFactory);
    }

    public void addBridgeFactoryForResourceLoad(String str, AdSDKBridgeFactory adSDKBridgeFactory) {
        HashSet hashSet = this.bridgesForResourcePattern.get(str);
        if (hashSet == null) {
            hashSet = new HashSet();
            this.bridgesForResourcePattern.put(str, hashSet);
        }
        hashSet.add(adSDKBridgeFactory);
        hashSet.add(this.amazonAdSDKViewableBridgeFactory);
    }

    public Set<AdSDKBridgeFactory> getBridgeFactories(AAXCreative aAXCreative) {
        Set<AdSDKBridgeFactory> set = this.bridgesForCT.get(aAXCreative);
        if (set == null) {
            set = new HashSet<>();
        }
        set.add(this.amazonAdSDKViewableBridgeFactory);
        return set;
    }

    public Set<AdSDKBridgeFactory> getBridgeFactories(String str) {
        HashSet hashSet = new HashSet();
        for (String next : this.bridgesForPattern.keySet()) {
            if (getPattern(next).matcher(str).find()) {
                hashSet.addAll(this.bridgesForPattern.get(next));
            }
        }
        hashSet.add(this.amazonAdSDKViewableBridgeFactory);
        return hashSet;
    }

    public Set<AdSDKBridgeFactory> getBridgeFactoriesForResourceLoad(String str) {
        int length;
        char charAt;
        HashSet hashSet = new HashSet();
        for (String next : this.bridgesForResourcePattern.keySet()) {
            boolean z = false;
            if (str.endsWith(next) && ((length = (str.length() - next.length()) - 1) < 0 || (((charAt = str.charAt(length)) < 'A' || charAt > 'z') && (charAt < '0' || charAt > '9')))) {
                z = true;
            }
            if (z) {
                hashSet.addAll(this.bridgesForResourcePattern.get(next));
            }
        }
        hashSet.add(this.amazonAdSDKViewableBridgeFactory);
        return hashSet;
    }

    private Pattern getPattern(String str) {
        Pattern pattern = this.patterns.get(str);
        if (pattern != null) {
            return pattern;
        }
        Pattern compile = Pattern.compile(str);
        this.patterns.put(str, compile);
        return compile;
    }
}
