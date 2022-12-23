package com.smaato.sdk.core.log;

import com.appsflyer.ServerParameters;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.core.gdpr.tcfv2.model.Segments;
import com.smaato.sdk.core.util.Objects;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class LoggerImpl implements Logger {
    private static final Pattern ANONYMOUS_CLASS_PATTERN = Pattern.compile("(\\$\\d+)+$");
    private static final String FALLBACK_TAG = LoggerImpl.class.getName();
    private static final Map<LogDomain, String> LOG_DOMAIN_TO_PACKAGE_NAME_MAP = new HashMap();
    private final Environment environment;
    private final ThreadLocal<String> explicitlySetTag = new ThreadLocal<>();
    final List<LogWriter> logWriters = new ArrayList();

    enum Environment {
        DEBUG,
        RELEASE
    }

    static {
        LOG_DOMAIN_TO_PACKAGE_NAME_MAP.put(LogDomain.CORE, Segments.CORE);
        LOG_DOMAIN_TO_PACKAGE_NAME_MAP.put(LogDomain.AD, "ad");
        LOG_DOMAIN_TO_PACKAGE_NAME_MAP.put(LogDomain.API, "api");
        LOG_DOMAIN_TO_PACKAGE_NAME_MAP.put(LogDomain.NETWORK, ServerParameters.NETWORK);
        LOG_DOMAIN_TO_PACKAGE_NAME_MAP.put(LogDomain.LOGGER, "log");
        LOG_DOMAIN_TO_PACKAGE_NAME_MAP.put(LogDomain.FRAMEWORK, "framework");
        LOG_DOMAIN_TO_PACKAGE_NAME_MAP.put(LogDomain.WIDGET, "widget");
        LOG_DOMAIN_TO_PACKAGE_NAME_MAP.put(LogDomain.UTIL, "util");
        LOG_DOMAIN_TO_PACKAGE_NAME_MAP.put(LogDomain.BROWSER, "browser");
        LOG_DOMAIN_TO_PACKAGE_NAME_MAP.put(LogDomain.CONFIG_CHECK, "configcheck");
        LOG_DOMAIN_TO_PACKAGE_NAME_MAP.put(LogDomain.DATA_COLLECTOR, "datacollector");
        LOG_DOMAIN_TO_PACKAGE_NAME_MAP.put(LogDomain.VAST, "vast");
        LOG_DOMAIN_TO_PACKAGE_NAME_MAP.put(LogDomain.INTERSTITIAL, "interstitial");
        LOG_DOMAIN_TO_PACKAGE_NAME_MAP.put(LogDomain.RICH_MEDIA, "richmedia");
        LOG_DOMAIN_TO_PACKAGE_NAME_MAP.put(LogDomain.RESOURCE_LOADER, "resourceloader");
        LOG_DOMAIN_TO_PACKAGE_NAME_MAP.put(LogDomain.MRAID, CampaignEx.JSON_KEY_MRAID);
        LOG_DOMAIN_TO_PACKAGE_NAME_MAP.put(LogDomain.UNIFIED_BIDDING, "ub");
    }

    LoggerImpl(Environment environment2) {
        this.environment = (Environment) Objects.requireNonNull(environment2, "Parameter environment cannot be null for LoggerImpl::new");
    }

    public final void log(LogLevel logLevel, LogDomain logDomain, String str, Object... objArr) {
        handleLog(logLevel, logDomain, (Throwable) null, str, objArr);
    }

    public final void log(LogLevel logLevel, LogDomain logDomain, Throwable th, String str, Object... objArr) {
        handleLog(logLevel, logDomain, th, str, objArr);
    }

    public final void debug(LogDomain logDomain, String str, Object... objArr) {
        handleLog(LogLevel.DEBUG, logDomain, (Throwable) null, str, objArr);
    }

    public final void debug(LogDomain logDomain, Throwable th, String str, Object... objArr) {
        handleLog(LogLevel.DEBUG, logDomain, th, str, objArr);
    }

    public final void info(LogDomain logDomain, String str, Object... objArr) {
        handleLog(LogLevel.INFO, logDomain, (Throwable) null, str, objArr);
    }

    public final void info(LogDomain logDomain, Throwable th, String str, Object... objArr) {
        handleLog(LogLevel.INFO, logDomain, th, str, objArr);
    }

    public final void warning(LogDomain logDomain, String str, Object... objArr) {
        handleLog(LogLevel.WARNING, logDomain, (Throwable) null, str, objArr);
    }

    public final void warning(LogDomain logDomain, Throwable th, String str, Object... objArr) {
        handleLog(LogLevel.WARNING, logDomain, th, str, objArr);
    }

    public final void error(LogDomain logDomain, String str, Object... objArr) {
        handleLog(LogLevel.ERROR, logDomain, (Throwable) null, str, objArr);
    }

    public final void error(LogDomain logDomain, Throwable th, String str, Object... objArr) {
        handleLog(LogLevel.ERROR, logDomain, th, str, objArr);
    }

    public final void setExplicitOneShotTag(String str) {
        Objects.requireNonNull(str);
        this.explicitlySetTag.set(str);
    }

    private void handleLog(LogLevel logLevel, LogDomain logDomain, Throwable th, String str, Object... objArr) {
        String str2;
        Objects.requireNonNull(logLevel);
        Objects.requireNonNull(logDomain);
        Objects.requireNonNull(str);
        String sdkDomainPrefix = getSdkDomainPrefix(logDomain);
        if (this.environment == Environment.DEBUG) {
            sdkDomainPrefix = sdkDomainPrefix + getTag() + ": ";
            runDebugChecks(logDomain);
        }
        boolean z = false;
        Iterator<LogWriter> it = this.logWriters.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().isLoggable(logLevel)) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            if (str.length() != 0) {
                if (objArr != null && objArr.length > 0) {
                    str = formatMessage(str, objArr);
                }
                if (th != null) {
                    str2 = str + "\n" + getStackTraceString(th);
                } else {
                    str2 = str;
                }
            } else if (th != null) {
                str2 = getStackTraceString(th);
            } else {
                return;
            }
            writeLog(logLevel, sdkDomainPrefix + str2, "SmaatoSDK: ");
        }
    }

    private static String getSdkDomainPrefix(LogDomain logDomain) {
        return logDomain.name() + ": ";
    }

    private void writeLog(LogLevel logLevel, String str, String str2) {
        for (LogWriter next : this.logWriters) {
            if (next.isLoggable(logLevel)) {
                next.log(logLevel, str2, str);
            }
        }
    }

    private String getTag() {
        String str = this.explicitlySetTag.get();
        if (str != null) {
            this.explicitlySetTag.remove();
            return str;
        }
        StackTraceElement createStackTraceElement = createStackTraceElement();
        if (createStackTraceElement != null) {
            return getTagFromStackTraceElement(createStackTraceElement);
        }
        return FALLBACK_TAG;
    }

    private StackTraceElement createStackTraceElement() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace.length > 4) {
            return stackTrace[4];
        }
        error(LogDomain.LOGGER, new IllegalStateException("Not enough stacktrace elements: might be a proguard issue"), "Synthetic stack trace", new Object[0]);
        return null;
    }

    private static String getTagFromStackTraceElement(StackTraceElement stackTraceElement) {
        Objects.requireNonNull(stackTraceElement);
        String classNameFromStackTraceElement = getClassNameFromStackTraceElement(stackTraceElement);
        return classNameFromStackTraceElement.substring(classNameFromStackTraceElement.lastIndexOf(46) + 1);
    }

    private static String getClassNameFromStackTraceElement(StackTraceElement stackTraceElement) {
        Objects.requireNonNull(stackTraceElement);
        String className = stackTraceElement.getClassName();
        Matcher matcher = ANONYMOUS_CLASS_PATTERN.matcher(className);
        return matcher.find() ? matcher.replaceAll("") : className;
    }

    private static String formatMessage(String str, Object[] objArr) {
        Objects.requireNonNull(str);
        return String.format(str, objArr);
    }

    private static String getStackTraceString(Throwable th) {
        Objects.requireNonNull(th);
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter(stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    private void runDebugChecks(LogDomain logDomain) {
        StackTraceElement createStackTraceElement = createStackTraceElement();
        if (createStackTraceElement != null) {
            String classNameFromStackTraceElement = getClassNameFromStackTraceElement(createStackTraceElement);
            checkLogDomainEqualsPackage(logDomain, classNameFromStackTraceElement.substring(0, classNameFromStackTraceElement.lastIndexOf(46)));
        }
    }

    private void checkLogDomainEqualsPackage(LogDomain logDomain, String str) {
        String[] split = str.split("\\.");
        int length = split.length;
        int i = 0;
        while (i < length) {
            String str2 = split[i];
            String str3 = LOG_DOMAIN_TO_PACKAGE_NAME_MAP.get(logDomain);
            if (str3 == null) {
                LogLevel logLevel = LogLevel.ERROR;
                writeLog(logLevel, getSdkDomainPrefix(LogDomain.LOGGER) + ("Unknown LogDomain (" + logDomain + ") is not found in LOG_DOMAIN_TO_PACKAGE_NAME_MAP"), "SmaatoSDK: ");
                return;
            } else if (!str3.equals(str2)) {
                i++;
            } else {
                return;
            }
        }
        String str4 = "LogDomain = " + logDomain.name() + " was not found in a caller classpath: " + str + ". Looks like an inappropriate LogDomain is used.";
        writeLog(LogLevel.ERROR, getSdkDomainPrefix(LogDomain.LOGGER) + str4, "SmaatoSDK: ");
    }
}
