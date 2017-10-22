import com.kode.test.InnerClass;

import java.util.Objects;

/**
 * Created by zhongcy on 2016/9/28.
 */
public class Test {
    public static void main(String[] args) {
        com.kode.test.InnerClass innerClass = new InnerClass();
        Integer i1 = 3000;
        Integer i2 = 1000+2000;
        int i3=3000;
        System.out.println(Objects.equals(i1, i2));
        System.out.println(i1.equals(i3));
        System.out.println(System.currentTimeMillis() / 1000);
        System.out.println(30*24*3600);
        String s = "123456";
        System.out.println(s.substring(6-2));
    }
}
