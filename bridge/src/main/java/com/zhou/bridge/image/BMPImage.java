package com.zhou.bridge.image;

import com.zhou.bridge.matrix.Matrix;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/26 11:15
 * @Description: BMP格式图像：扩充抽象类
 */
public  class BMPImage extends Image {
    public void parseFile(String fileName) {
        //模拟解析BMP文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为BMP。");
    }
}