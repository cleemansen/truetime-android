package com.instacart.library.truetime;

public interface ITrueLog {

    void v(String tag, String msg);
    void d(String tag, String msg);
    void i(String tag, String msg);
    void w(String tag, String msg);
    void w(String tag, String msg, Throwable t);
    void e(String tag, String msg);
    void e(String tag, String msg, Throwable t);
    void wtf(String tag, String msg);
    void wtf(String tag, String msg, Throwable tr);
    void setLoggingEnabled(boolean isLoggingEnabled);
}
