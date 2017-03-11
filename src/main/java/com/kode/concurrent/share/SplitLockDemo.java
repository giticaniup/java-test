package com.kode.concurrent.share;

import java.util.HashSet;
import java.util.Set;

/**
 * 拆分锁示例
 * Created by zhongcy on 2017-03-08.
 */
public class SplitLockDemo {
    /**
     * 用户set
     */
    private final Set<String> users = new HashSet<>();

    /**
     * 访客set
     */
    private final Set<String> visitors  = new HashSet<>();

    public synchronized void addUser(String user){
        this.users.add(user);
    }
    public synchronized void addVisitor(String visitor){
        this.visitors.add(visitor);
    }

    //锁拆分
    public void betterAddUser(String user){
        synchronized (users){
            users.add(user);
        }
    }
    public void betterAddVisitor(String visitor){
        synchronized (visitors){
            visitors.add(visitor);
        }
    }
}

