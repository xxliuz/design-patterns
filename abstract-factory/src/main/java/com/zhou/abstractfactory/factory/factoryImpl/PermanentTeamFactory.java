package com.zhou.abstractfactory.factory.factoryImpl;

import com.zhou.abstractfactory.factory.TeamFactory;
import com.zhou.abstractfactory.menber.Captain;
import com.zhou.abstractfactory.menber.Sailor;
import com.zhou.abstractfactory.menber.Ship;
import com.zhou.abstractfactory.menber.menberImpl.OldCaptain;
import com.zhou.abstractfactory.menber.menberImpl.OldSailor;
import com.zhou.abstractfactory.menber.menberImpl.OldShip;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/20 15:44
 * @Description: 久经考验的团队工厂
 */
public class PermanentTeamFactory implements TeamFactory {
    @Override
    public Captain createCaptain() {
        return new OldCaptain();
    }

    @Override
    public Sailor createSailor() {
        return new OldSailor();
    }

    @Override
    public Ship createShip() {
        return new OldShip();
    }
}
