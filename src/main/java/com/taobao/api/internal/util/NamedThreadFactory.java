package com.taobao.api.internal.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class NamedThreadFactory
        implements ThreadFactory {
    private static final AtomicInteger poolNumber = new AtomicInteger(1);

    private final AtomicInteger threadNumber = new AtomicInteger(1);
    private final ThreadGroup group;
    private final String namePrefix;
    private final boolean isDaemon;

    public NamedThreadFactory() {
        this("pool-msg-consume");
    }

    public NamedThreadFactory(String name) {
        this(name, false);
    }

    public NamedThreadFactory(String preffix, boolean daemon) {
        SecurityManager s = System.getSecurityManager();
        this.group = (s != null ? s.getThreadGroup() : Thread.currentThread().getThreadGroup());
        this.namePrefix = (preffix + "-" + poolNumber.getAndIncrement() + "-thread-");
        this.isDaemon = daemon;
    }

    public Thread newThread(Runnable r) {
        Thread t = new Thread(this.group, r, this.namePrefix + this.threadNumber.getAndIncrement(), 0L);
        t.setDaemon(this.isDaemon);
        if (t.getPriority() != 5) {
            t.setPriority(5);
        }
        return t;
    }
}


