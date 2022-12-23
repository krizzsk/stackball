package com.amazon.device.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

class CalendarEventParameters {
    public static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mmZZZZZ";
    public static final List<String> DATE_FORMATS = Collections.unmodifiableList(new ArrayList<String>() {
        {
            add(CalendarEventParameters.DATE_FORMAT);
            add("yyyy-MM-dd'T'HH:mmZ");
            add("yyyy-MM-dd'T'HH:mm");
            add("yyyy-MM-dd");
        }
    });
    private String description;
    private Date end;
    private String location;
    private Date start;
    private String summary;

    public CalendarEventParameters(String str, String str2, String str3, String str4, String str5) {
        if (!StringUtils.isNullOrEmpty(str)) {
            this.description = str;
            this.location = str2;
            this.summary = str3;
            if (!StringUtils.isNullOrEmpty(str4)) {
                this.start = convertToDate(str4);
                if (StringUtils.isNullOrEmpty(str5)) {
                    this.end = null;
                } else {
                    this.end = convertToDate(str5);
                }
            } else {
                throw new IllegalArgumentException("No start date for event");
            }
        } else {
            throw new IllegalArgumentException("No description for event");
        }
    }

    public String getDescription() {
        return this.description;
    }

    public String getLocation() {
        return this.location;
    }

    public String getSummary() {
        return this.summary;
    }

    public Date getStart() {
        return this.start;
    }

    public Date getEnd() {
        return this.end;
    }

    private Date convertToDate(String str) {
        Date date;
        Iterator<String> it = DATE_FORMATS.iterator();
        while (true) {
            if (!it.hasNext()) {
                date = null;
                break;
            }
            try {
                date = new SimpleDateFormat(it.next(), Locale.US).parse(str);
                break;
            } catch (ParseException unused) {
            }
        }
        if (date != null) {
            return date;
        }
        throw new IllegalArgumentException("Could not parse datetime string " + str);
    }
}
