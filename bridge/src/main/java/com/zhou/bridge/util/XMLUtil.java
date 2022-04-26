package com.zhou.bridge.util;

import javax.xml.parsers.*;
import org.w3c.dom.*;

import java.io.*;


/**
 * @Author: zhou.liu
 * @Date: 2022/4/26 10:58
 * @Description: 如果需要更换图像文件格式或者更换操作系统，只需修改配置文件即可，在实际使用时，
 *               可以通过分析图像文件格式后缀名来确定具体的文件格式，在程序运行时获取操作系统信息来确定操作系统类型，无须使用配置文件。
 *               当增加新的图像文件格式或者操作系统时，原有系统无须做任何修改，只需增加一个对应的扩充抽象类或具体实现类即可，
 *               系统具有较好的可扩展性，完全符合“开闭原则”。
 */
public class XMLUtil {
    //该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
    public static Object getBean(String args) {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            String path = "D:\\Users\\design-patterns\\design-patterns\\bridge\\src\\main\\resources\\";
            Document doc = builder.parse(new File(path+"config.xml"));
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode=null;

            if(args.equals("image")) {
                //获取第一个包含类名的节点，即扩充抽象类
                classNode=nl.item(0).getFirstChild();

            }
            else if(args.equals("os")) {
                //获取第二个包含类名的节点，即具体实现类
                classNode=nl.item(4).getFirstChild();
            }

            String cName=classNode.getNodeValue();
            //通过类名生成实例对象并将其返回
            Class c=Class.forName(cName);
            Object obj=c.newInstance();
            return obj;
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}