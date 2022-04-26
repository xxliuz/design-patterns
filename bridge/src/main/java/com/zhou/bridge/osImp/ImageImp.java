package com.zhou.bridge.osImp;

import com.zhou.bridge.matrix.Matrix;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/26 11:07
 * @Description: 抽象操作系统实现类：实现类接口
 */
public interface ImageImp {
    public void doPaint(Matrix m);  //显示像素矩阵m
}