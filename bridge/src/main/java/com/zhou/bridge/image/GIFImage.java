package com.zhou.bridge.image;

import com.zhou.bridge.matrix.Matrix;
import org.springframework.context.annotation.Bean;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/26 11:16
 * @Description: GIF格式图像：扩充抽象类
 */
public class GIFImage extends Image {
    public void parseFile(String fileName) {
        //模拟解析GIF文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为GIF。");
    }
}
