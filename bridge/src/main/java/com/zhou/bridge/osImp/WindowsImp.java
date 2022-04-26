package com.zhou.bridge.osImp;

import com.zhou.bridge.matrix.Matrix;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/26 11:09
 * @Description: Windows操作系统实现类：具体实现类
 */
public  class WindowsImp implements ImageImp {
    public void doPaint(Matrix m) {
        //调用Windows系统的绘制函数绘制像素矩阵
        System.out.print("在Windows操作系统中显示图像：");
    }

}
