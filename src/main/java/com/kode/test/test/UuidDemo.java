package com.kode.test.test;

import java.util.UUID;

/**Uuid生成
 * Created by zhongcy on 2016/4/27.
 */
public class UuidDemo {
    public static String getUuid(UUID uuid){
        return Long.toHexString(uuid.getMostSignificantBits()) + Long.toHexString(uuid.getLeastSignificantBits());
    }

    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
        System.out.println(Long.toHexString(uuid.getMostSignificantBits()));
        System.out.println(Long.toHexString(uuid.getLeastSignificantBits()));
        System.out.println(getUuid(uuid));
    }
}
