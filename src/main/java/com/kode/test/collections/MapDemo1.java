package com.kode.test.collections;

import org.aspectj.apache.bcel.generic.IINC;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

/**
 * Map
 * computeIfAbsent，判断是否存在，如果不存在则将计算结果的key/value put进去
 * Map可以理解为 the set of key/value pairs.
 *
 * WeakHashMap:The garbage collector traces live objects.
 As long as the map object is live, all buckets in it are live and won’t be reclaimed.
 Thus, your program should take care to remove unused values from long-lived
 maps. Or, you can use a WeakHashMap instead. This data structure cooperates with
 the garbage collector to remove key/value pairs when the only reference to the
 key is the one from the hash table entry
    原理：The WeakHashMap uses weak references
 to hold keys. A WeakReference object holds a reference to another object—in our case,
 a hash table key. Objects of this type are treated in a special way by the garbage
 collector. Normally, if the garbage collector finds that a particular object has no
 references to it, it simply reclaims the object. However, if the object is reachable
 only by a WeakReference, the garbage collector still reclaims the object, but places the
 weak reference that led to it into a queue. The operations of the WeakHashMap periodically check that queue for newly arrived weak references. The arrival of a weak
 reference in the queue signifies that the key was no longer used by anyone and
 has been collected. The WeakHashMap then removes the associated entry

 IdentityHashMap:使用==作为key的比较而不是equals，是因为使用的hashCode方法使用的是Object的hashCode方法
 * Created by zhongcy on 2017/1/4.
 */
public class MapDemo1 {

    Map<Integer, String> map = new HashMap<>();

    IdentityHashMap<String,String > identityHashMap = new IdentityHashMap<>();

    @Before
    public void setMap() {
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");
        map.put(5, "5");

        identityHashMap.put("s","1");
        identityHashMap.put(new StringBuffer("s").toString(),"1");
    }

    @Test
    public void testMap() {
        System.out.println(map.getOrDefault(10, "10"));
        map.computeIfAbsent(11, String::valueOf);
        //第二个参数s是oldValue
        map.computeIfPresent(11, (integer, s) -> String.valueOf(integer+1)+s);
        System.out.println(map);
        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        entrySet.forEach(System.out::println);
        System.out.println(identityHashMap);
    }
}
