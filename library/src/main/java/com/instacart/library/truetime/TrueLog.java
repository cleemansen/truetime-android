package com.instacart.library.truetime;

import android.util.Log;

class TrueLog {

    private static boolean LOGGING_ENABLED = false;

    private static ITrueLog LOG_SINK = null;

    static void v(String tag, String msg) {
        if (LOGGING_ENABLED) {
            if(LOG_SINK != null) LOG_SINK.v(tag, msg); else Log.v(tag, msg);
        }
    }

    static void d(String tag, String msg) {
        if (LOGGING_ENABLED) {
            if(LOG_SINK != null) LOG_SINK.d(tag, msg); else Log.d(tag, msg);
        }
    }

    static void i(String tag, String msg) {
        if (LOGGING_ENABLED) {
            if(LOG_SINK != null) LOG_SINK.i(tag, msg); else Log.i(tag, msg);
        }
    }

    static void w(String tag, String msg) {
        if (LOGGING_ENABLED) {
            if(LOG_SINK != null) LOG_SINK.w(tag, msg); else Log.w(tag, msg);
        }
    }

    static void w(String tag, String msg, Throwable t) {
        if (LOGGING_ENABLED) {
            if(LOG_SINK != null) LOG_SINK.w(tag, msg, t); else Log.w(tag, msg, t);
        }
    }

    static void e(String tag, String msg) {
        if (LOGGING_ENABLED) {
            if(LOG_SINK != null) LOG_SINK.e(tag, msg); else Log.e(tag, msg);
        }
    }

    static void e(String tag, String msg, Throwable t) {
        if (LOGGING_ENABLED) {
            if(LOG_SINK != null) LOG_SINK.e(tag, msg, t); else Log.e(tag, msg, t);
        }
    }

    static void wtf(String tag, String msg) {
        if (LOGGING_ENABLED) {
            if(LOG_SINK != null) LOG_SINK.wtf(tag, msg); else Log.wtf(tag, msg);
        }
    }

    static void wtf(String tag, String msg, Throwable tr) {
        if (LOGGING_ENABLED) {
            if(LOG_SINK != null) LOG_SINK.wtf(tag, msg, tr); else Log.wtf(tag, msg, tr);
        }
    }

    static void setLoggingEnabled(boolean isLoggingEnabled) {
        LOGGING_ENABLED = isLoggingEnabled;
        if (LOG_SINK != null) LOG_SINK.setLoggingEnabled(isLoggingEnabled);
    }

    public static void setLogSink(ITrueLog logSink) {
        TrueLog.LOG_SINK = logSink;
    }
}
