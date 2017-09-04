package com.taobao.api.internal.util;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LruHashMap<K, V>
        extends LinkedHashMap<K, V> {
    private static final long serialVersionUID = 1L;
    private int maxCapacity;
    private static final float DEFAULT_LOAD_FACTOR = 0.75F;
    private final Lock lock = new ReentrantLock();

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public LruHashMap(int maxCapacity) {
        super(maxCapacity, 0.75F, true);
        this.maxCapacity = maxCapacity;
    }

    public LruHashMap(int initialCapacity, int maxCapacity) {
        super(initialCapacity, 0.75F, true);
        this.maxCapacity = maxCapacity;
    }

    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > this.maxCapacity;
    }

    public V get(Object key) {
        try {
            this.lock.lock();
            return super.get(key);
        } finally {
            this.lock.unlock();
        }
    }

    public V put(K key, V value) {
        try {
            this.lock.lock();
            return super.put(key, value);
        } finally {
            this.lock.unlock();
        }
    }

    public V remove(Object key) {
        try {
            this.lock.lock();
            return super.remove(key);
        } finally {
            this.lock.unlock();
        }
    }
}


