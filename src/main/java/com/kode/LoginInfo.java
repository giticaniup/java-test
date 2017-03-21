package com.kode;

import com.google.common.base.MoreObjects;

import java.io.Serializable;

/**
 * Created by zhongcy on 2016/12/27.
 */
public class LoginInfo implements Serializable {
    private static final long serialVersionUID = 2924761517712850234L;

    private String name;

    private transient String password;

    public LoginInfo(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("password", password)
                .toString();
    }
}
