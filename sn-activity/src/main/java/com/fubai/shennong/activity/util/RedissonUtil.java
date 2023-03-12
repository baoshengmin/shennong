package com.fubai.shennong.activity.util;

import org.redisson.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RedissonUtil {

   /* @Autowired
    private RedissonClient redisson;

    public String getString(String key) {
        RBucket<Object> result = redisson.getBucket(key);
        return result.get().toString();
    }

    public void setString(String key, Object value) {
        RBucket<Object> result = redisson.getBucket(key);
        if (!result.isExists()) {
            result.set(value, 5, TimeUnit.MINUTES);
        }
    }

    public boolean hasString(String key) {
        RBucket<Object> result = redisson.getBucket(key);
        if (result.isExists()) {
            return true;
        } else {
            return false;
        }
    }


    *//**
     * 获取字符串对象
     * @param objectName
     * @return
     *//*
    public <T> RBucket<T> getRBucket(String objectName){
        RBucket<T> bucket=redisson.getBucket(objectName);
        return bucket;
    }

    *//**
     * 获取Map对象
     * @param objectName
     * @return
     *//*
    public <K,V> RMap<K, V> getRMap(String objectName){
        RMap<K, V> map=redisson.getMap(objectName);
        return map;
    }

    *//**
     * 获取有序集合
     * @param objectName
     * @return
     *//*
    public <V> RSortedSet<V> getRSortedSet(String objectName){
        RSortedSet<V> sortedSet=redisson.getSortedSet(objectName);
        return sortedSet;
    }

    *//**
     * 获取集合
     * @param objectName
     * @return
     *//*
    public <V> RSet<V> getRSet(String objectName){
        RSet<V> rSet=redisson.getSet(objectName);
        return rSet;
    }

    *//**
     * 获取列表
     * @param objectName
     * @return
     *//*
    public <V> RList<V> getRList(String objectName){
        RList<V> rList=redisson.getList(objectName);
        return rList;
    }

    *//**
     * 获取队列
     * @param objectName
     * @return
     *//*
    public <V> RQueue<V> getRQueue(String objectName){
        RQueue<V> rQueue=redisson.getQueue(objectName);
        return rQueue;
    }

    *//**
     * 获取双端队列
     * @param objectName
     * @return
     *//*
    public <V> RDeque<V> getRDeque(String objectName){
        RDeque<V> rDeque=redisson.getDeque(objectName);
        return rDeque;
    }

    *//**
     * 此方法不可用在Redisson 1.2 中
     * 在1.2.2版本中 可用
     * @param redisson
     * @param objectName
     * @return
     *//*
    *//**
     public <V> RBlockingQueue<V> getRBlockingQueue(RedissonClient redisson,String objectName){
     RBlockingQueue rb=redisson.getBlockingQueue(objectName);
     return rb;
     }*//*

    *//**
     * 获取锁
     * @param objectName
     * @return
     *//*
    public RLock getRLock(String objectName){
        RLock rLock=redisson.getLock(objectName);
        return rLock;
    }

    *//**
     * 获取原子数
     * @param objectName
     * @return
     *//*
    public RAtomicLong getRAtomicLong(String objectName){
        RAtomicLong rAtomicLong=redisson.getAtomicLong(objectName);
        return rAtomicLong;
    }

    public long incr(String key) {
        return redisson.getAtomicLong(key).incrementAndGet();
    }

    public long decr(String key) {
        return redisson.getAtomicLong(key).decrementAndGet();
    }

    *//**
     * 获取记数锁
     * @param objectName
     * @return
     *//*
    public RCountDownLatch getRCountDownLatch(String objectName){
        RCountDownLatch rCountDownLatch=redisson.getCountDownLatch(objectName);
        return rCountDownLatch;
    }

    *//**
     * 获取消息的Topic
     * @param objectName
     * @return
     *//*
    public <M> RTopic<M> getRTopic(String objectName){
        RTopic<M> rTopic=redisson.getTopic(objectName);
        return rTopic;
    }

    *//**
     * 锁住不设置超时时间(拿不到lock就不罢休，不然线程就一直block)
     * @param lockKey
     * @return org.redisson.api.RLock
     *//*
    public RLock lock(String lockKey) {
        RLock lock = redisson.getLock(lockKey);
        lock.lock();
        return lock;
    }

    *//**
     * leaseTime为加锁时间，单位为秒
     * @param lockKey
     * @param leaseTime
     * @return org.redisson.api.RLock
     *//*
    public RLock lock(String lockKey, long leaseTime) {
        RLock lock = redisson.getLock(lockKey);
        lock.lock(leaseTime, TimeUnit.SECONDS);
        return lock;
    }

    *//**
     * timeout为加锁时间，时间单位由unit确定
     * @param lockKey
     * @param unit
     * @param timeout
     * @return org.redisson.api.RLock
     *//*
    public RLock lock(String lockKey, TimeUnit unit, long timeout) {
        RLock lock = redisson.getLock(lockKey);
        lock.lock(timeout, unit);
        return lock;
    }

    *//**
     * 尝试获取锁
     * @param lockKey
     * @param unit
     * @param waitTime
     * @param leaseTime
     * @return boolean
     *//*
    public boolean tryLock(String lockKey, TimeUnit unit, long waitTime, long leaseTime) {
        RLock lock = redisson.getLock(lockKey);
        try {
            return lock.tryLock(waitTime, leaseTime, unit);
        } catch (InterruptedException e) {
            return false;
        }
    }

    *//**
     * 通过lockKey解锁
     * @param lockKey
     * @return void
     *//*
    public void unlock(String lockKey) {
        RLock lock = redisson.getLock(lockKey);
        lock.unlock();
    }

    *//**
     * 直接通过锁解锁
     * @param lock
     * @return void
     *//*
    public void unlock(RLock lock) {
        lock.unlock();
    }*/

}
