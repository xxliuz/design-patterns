package com.zhou.bridge.image;

import com.zhou.bridge.osImp.ImageImp;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/26 11:04
 * @Description:  抽象图像类：抽象类
 */
public abstract class Image {
    protected ImageImp imp;

    public void setImageImp(ImageImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}
