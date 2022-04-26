package com.zhou.bridge;


import com.zhou.bridge.image.Image;
import com.zhou.bridge.osImp.ImageImp;
import com.zhou.bridge.util.XMLUtil;

public class BridgeApplication {
    public static void main(String args[]) {
        XMLUtil xmlUtil = new XMLUtil();
        Image image = (Image) XMLUtil.getBean("image");
        ImageImp imp = (ImageImp)XMLUtil.getBean("os");

        image.setImageImp(imp);
        image.parseFile("小龙女");
    }
}
