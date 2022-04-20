package com.zhou.abstractfactory.factory;

import com.zhou.abstractfactory.menber.Captain;
import com.zhou.abstractfactory.menber.Sailor;
import com.zhou.abstractfactory.menber.Ship;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/20 15:39
 * @Description: 团队工厂能生产 船，水手和船长
 */
public interface TeamFactory {

    Captain createCaptain();

    Sailor createSailor();

    Ship createShip();

}
