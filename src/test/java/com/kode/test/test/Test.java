package com.kode.test.test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 判断文件类型是不是图片
 * Created by zhongcy on 2016/5/13.
 */
public class Test {
    public static boolean isImage(File file) {
        boolean flag = false;
        try {
            BufferedImage is = ImageIO.read(file);
            if (is != null) {
                flag = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\zhongcy\\Desktop\\view.png1");
        System.out.println(isImage(file));
    }
}
