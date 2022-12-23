package com.yandex.metrica.impl.p265ob;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.tapjoy.TapjoyConstants;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.impl.p265ob.C10214E8;
import com.yandex.metrica.impl.p265ob.C10474M;
import com.yandex.metrica.impl.p265ob.C10842Vf;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yandex.metrica.impl.ob.O8 */
public final class C10591O8 {

    /* renamed from: a */
    public static final int f25316a = YandexMetrica.getLibraryApiLevel();

    /* renamed from: b */
    private static final C11843v8 f25317b;

    /* renamed from: c */
    private static final C11938x8 f25318c;

    /* renamed from: d */
    private static final C11810u8 f25319d;

    /* renamed from: com.yandex.metrica.impl.ob.O8$a */
    public interface C10592a {

        /* renamed from: a */
        public static final List<String> f25320a = C10796U2.m27883a("incremental_id", "timestamp", "data");

        /* renamed from: com.yandex.metrica.impl.ob.O8$a$a */
        public interface C10593a {

            /* renamed from: a */
            public static final String f25321a;

            /* renamed from: b */
            public static final String f25322b;

            static {
                Locale locale = Locale.US;
                f25321a = String.format(locale, "CREATE TABLE IF NOT EXISTS %s (incremental_id INTEGER NOT NULL,timestamp INTEGER, data TEXT)", new Object[]{"lbs_dat"});
                f25322b = String.format(locale, "DROP TABLE IF EXISTS %s", new Object[]{"lbs_dat"});
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.O8$a$b */
        public interface C10594b {

            /* renamed from: a */
            public static final String f25323a;

            /* renamed from: b */
            public static final String f25324b;

            static {
                Locale locale = Locale.US;
                f25323a = String.format(locale, "CREATE TABLE IF NOT EXISTS %s (incremental_id INTEGER NOT NULL,timestamp INTEGER, data TEXT)", new Object[]{"l_dat"});
                f25324b = String.format(locale, "DROP TABLE IF EXISTS %s", new Object[]{"l_dat"});
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.O8$b */
    public static final class C10595b {

        /* renamed from: a */
        public static final List<String> f25325a = C10796U2.m27883a("data_key", "value");
    }

    /* renamed from: com.yandex.metrica.impl.ob.O8$c */
    public interface C10596c {

        /* renamed from: a */
        public static final List<String> f25326a = C10796U2.m27883a(SDKConstants.PARAM_KEY, "value", "type");
    }

    /* renamed from: com.yandex.metrica.impl.ob.O8$d */
    public static final class C10597d {

        /* renamed from: a */
        public static final List<String> f25327a = C10796U2.m27883a("id", "number", "global_number", "number_of_type", "name", "value", "type", "time", "session_id", "wifi_network_info", "cell_info", "location_info", "error_environment", "user_info", "session_type", "app_environment", "app_environment_revision", "truncated", TapjoyConstants.TJC_CONNECTION_TYPE, "cellular_connection_type", "custom_type", "wifi_access_point", "encrypting_mode", "profile_id", "first_occurrence_status", "battery_charge_type", "collection_mode", "has_omitted_data", "call_state", "source", "attribution_id_changed", "open_id");

        /* renamed from: b */
        public static final String f25328b = ("CREATE TABLE IF NOT EXISTS reports (id INTEGER PRIMARY KEY,name TEXT,value TEXT,number INTEGER,global_number INTEGER,number_of_type INTEGER,type INTEGER,time INTEGER,session_id TEXT,wifi_network_info TEXT DEFAULT '',cell_info TEXT DEFAULT '',location_info TEXT DEFAULT '',error_environment TEXT,user_info TEXT,session_type INTEGER DEFAULT " + C12017z6.FOREGROUND.mo64185a() + "," + "app_environment" + " TEXT DEFAULT '" + "{}" + "'," + "app_environment_revision" + " INTEGER DEFAULT " + 0 + "," + "truncated" + " INTEGER DEFAULT 0," + TapjoyConstants.TJC_CONNECTION_TYPE + " INTEGER DEFAULT " + 2 + "," + "cellular_connection_type" + " TEXT," + "custom_type" + " INTEGER DEFAULT 0, " + "wifi_access_point" + " TEXT, " + "encrypting_mode" + " INTEGER DEFAULT " + C11538mn.NONE.mo63328a() + ", " + "profile_id" + " TEXT, " + "first_occurrence_status" + " INTEGER DEFAULT " + 0 + ", " + "battery_charge_type" + " INTEGER DEFAULT " + C10474M.C10476b.C10477a.UNKNOWN.mo61753a() + ", " + "collection_mode" + " TEXT, " + "has_omitted_data" + " INTEGER DEFAULT " + -1 + ", " + "call_state" + " INTEGER DEFAULT " + 0 + ", " + "source" + " INTEGER DEFAULT " + 0 + ", " + "attribution_id_changed" + " INTEGER DEFAULT 0, " + "open_id" + " INTEGER DEFAULT " + new C10842Vf.C10847d.C10848a().f26068x + " )");
    }

    /* renamed from: com.yandex.metrica.impl.ob.O8$e */
    public static final class C10598e {

        /* renamed from: a */
        public static final List<String> f25329a = C10796U2.m27883a("id", "start_time", "network_info", "report_request_parameters", "server_time_offset", "type", "obtained_before_first_sync");

        /* renamed from: b */
        public static final String f25330b = ("CREATE TABLE IF NOT EXISTS sessions (id INTEGER,start_time INTEGER,network_info TEXT,report_request_parameters TEXT,server_time_offset INTEGER,type INTEGER DEFAULT " + C12017z6.FOREGROUND.mo64185a() + "," + "obtained_before_first_sync" + " INTEGER DEFAULT 0 )");

        /* renamed from: c */
        public static final String f25331c;

        /* renamed from: d */
        public static final String f25332d;

        static {
            Locale locale = Locale.US;
            f25331c = String.format(locale, "SELECT DISTINCT %s  FROM %s WHERE %s >=0 AND (SELECT count() FROM %5$s WHERE %5$s.%6$s = %2$s.%3$s AND %5$s.%7$s = %2$s.%4$s) > 0 ORDER BY %3$s LIMIT 1", new Object[]{"report_request_parameters", "sessions", "id", "type", "reports", "session_id", "session_type"});
            f25332d = String.format(locale, "(select count(%s.%s) from %s where %s.%s = %s.%s) = 0 and cast(%s as integer) < ?", new Object[]{"reports", "id", "reports", "reports", "session_id", "sessions", "id", "id"});
        }
    }

    static {
        C11843v8 v8Var = new C11843v8();
        f25317b = v8Var;
        C11938x8 x8Var = new C11938x8();
        f25318c = x8Var;
        f25319d = new C11810u8(v8Var, x8Var, new C10214E8.C10216b());
    }

    /* renamed from: a */
    public static C11810u8 m27117a() {
        return f25319d;
    }
}
