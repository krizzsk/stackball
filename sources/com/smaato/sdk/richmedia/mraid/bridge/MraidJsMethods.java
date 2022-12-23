package com.smaato.sdk.richmedia.mraid.bridge;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Whatever;
import com.smaato.sdk.core.util.p251fi.BiConsumer;
import com.smaato.sdk.core.util.p251fi.Consumer;
import java.util.Map;

public final class MraidJsMethods {
    public static final String ADD_EVENT_LISTENER = "addEventListener";
    public static final String CLOSE = "close";
    public static final String EXPAND = "expand";
    public static final String OPEN = "open";
    public static final String PLAY_VIDEO = "playVideo";
    public static final String RESIZE = "resize";
    public static final String UNLOAD = "unload";
    private BiConsumer<String, String> adViolationCallback;
    private Consumer<String> addEventListenerCallback;
    private final MraidCommandHandler addEventListenerHandler = new MraidCommandHandler() {
        public final void handle(Map map, boolean z) {
            MraidJsMethods.this.lambda$new$0$MraidJsMethods(map, z);
        }
    };
    private Consumer<Whatever> closeCallback;
    private final MraidCommandHandler closeEventListenerHandler = new MraidCommandHandler() {
        public final void handle(Map map, boolean z) {
            MraidJsMethods.this.lambda$new$11$MraidJsMethods(map, z);
        }
    };
    private Consumer<String> expandCallback;
    private final MraidCommandHandler expandEventListenerHandler = new MraidCommandHandler() {
        public final void handle(Map map, boolean z) {
            MraidJsMethods.this.lambda$new$4$MraidJsMethods(map, z);
        }
    };
    private Consumer<String> openCallback;
    private final MraidCommandHandler openEventListenerHandler = new MraidCommandHandler() {
        public final void handle(Map map, boolean z) {
            MraidJsMethods.this.lambda$new$2$MraidJsMethods(map, z);
        }
    };
    private Consumer<String> playVideoCallback;
    private final MraidCommandHandler playVideoEventListenerHandler = new MraidCommandHandler() {
        public final void handle(Map map, boolean z) {
            MraidJsMethods.this.lambda$new$6$MraidJsMethods(map, z);
        }
    };
    private Consumer<Whatever> resizeCallback;
    private final MraidCommandHandler resizeEventListenerHandler = new MraidCommandHandler() {
        public final void handle(Map map, boolean z) {
            MraidJsMethods.this.lambda$new$10$MraidJsMethods(map, z);
        }
    };
    private Consumer<Whatever> unloadCallback;
    private final MraidCommandHandler unloadEventListenerHandler = new MraidCommandHandler() {
        public final void handle(Map map, boolean z) {
            MraidJsMethods.this.lambda$new$8$MraidJsMethods(map, z);
        }
    };

    public /* synthetic */ void lambda$new$0$MraidJsMethods(Map map, boolean z) {
        Consumer<String> consumer = this.addEventListenerCallback;
        if (consumer != null) {
            consumer.accept(map.get("event"));
        }
    }

    public /* synthetic */ void lambda$new$2$MraidJsMethods(Map map, boolean z) {
        String str = (String) map.get("url");
        if (!z) {
            Objects.onNotNull(this.adViolationCallback, new Consumer(str) {
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    ((BiConsumer) obj).accept("AUTO_OPEN", this.f$0);
                }
            });
            return;
        }
        Consumer<String> consumer = this.openCallback;
        if (consumer != null) {
            consumer.accept(str);
        }
    }

    public /* synthetic */ void lambda$new$4$MraidJsMethods(Map map, boolean z) {
        String str = (String) map.get("url");
        if (!z) {
            Objects.onNotNull(this.adViolationCallback, new Consumer(str) {
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    ((BiConsumer) obj).accept("AUTO_EXPAND", this.f$0);
                }
            });
            return;
        }
        Consumer<String> consumer = this.expandCallback;
        if (consumer != null) {
            consumer.accept(str);
        }
    }

    public /* synthetic */ void lambda$new$6$MraidJsMethods(Map map, boolean z) {
        String str = (String) map.get("uri");
        if (!z) {
            Objects.onNotNull(this.adViolationCallback, new Consumer(str) {
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    ((BiConsumer) obj).accept("AUTO_PLAY", this.f$0);
                }
            });
            return;
        }
        Consumer<String> consumer = this.playVideoCallback;
        if (consumer != null) {
            consumer.accept(map.get("uri"));
        }
    }

    public /* synthetic */ void lambda$new$8$MraidJsMethods(Map map, boolean z) {
        Consumer<Whatever> consumer = this.unloadCallback;
        if (consumer != null) {
            consumer.accept(Whatever.INSTANCE);
        }
        Objects.onNotNull(this.adViolationCallback, $$Lambda$MraidJsMethods$HB690mLisNc3kqb0qu69Nc8FRg.INSTANCE);
    }

    public /* synthetic */ void lambda$new$10$MraidJsMethods(Map map, boolean z) {
        if (!z) {
            Objects.onNotNull(this.adViolationCallback, $$Lambda$MraidJsMethods$m_PdOXHywY6g7YkZJo5mLjg2l5s.INSTANCE);
            return;
        }
        Consumer<Whatever> consumer = this.resizeCallback;
        if (consumer != null) {
            consumer.accept(Whatever.INSTANCE);
        }
    }

    public /* synthetic */ void lambda$new$11$MraidJsMethods(Map map, boolean z) {
        Consumer<Whatever> consumer = this.closeCallback;
        if (consumer != null) {
            consumer.accept(Whatever.INSTANCE);
        }
    }

    public MraidJsMethods(MraidJsBridge mraidJsBridge) {
        MraidJsBridge mraidJsBridge2 = (MraidJsBridge) Objects.requireNonNull(mraidJsBridge);
        mraidJsBridge2.addCommandHandler(ADD_EVENT_LISTENER, this.addEventListenerHandler);
        mraidJsBridge2.addCommandHandler("open", this.openEventListenerHandler);
        mraidJsBridge2.addCommandHandler(PLAY_VIDEO, this.playVideoEventListenerHandler);
        mraidJsBridge2.addCommandHandler(EXPAND, this.expandEventListenerHandler);
        mraidJsBridge2.addCommandHandler(UNLOAD, this.unloadEventListenerHandler);
        mraidJsBridge2.addCommandHandler(RESIZE, this.resizeEventListenerHandler);
        mraidJsBridge2.addCommandHandler("close", this.closeEventListenerHandler);
    }

    public final void setAddEventListenerCallback(Consumer<String> consumer) {
        this.addEventListenerCallback = consumer;
    }

    public final void setOpenCallback(Consumer<String> consumer) {
        this.openCallback = consumer;
    }

    public final void setPlayVideoCallback(Consumer<String> consumer) {
        this.playVideoCallback = consumer;
    }

    public final void setResizeCallback(Consumer<Whatever> consumer) {
        this.resizeCallback = consumer;
    }

    public final void setExpandCallback(Consumer<String> consumer) {
        this.expandCallback = consumer;
    }

    public final void setUnloadCallback(Consumer<Whatever> consumer) {
        this.unloadCallback = consumer;
    }

    public final void setCloseCallback(Consumer<Whatever> consumer) {
        this.closeCallback = consumer;
    }

    public final void setAdViolationCallback(BiConsumer<String, String> biConsumer) {
        this.adViolationCallback = biConsumer;
    }
}
