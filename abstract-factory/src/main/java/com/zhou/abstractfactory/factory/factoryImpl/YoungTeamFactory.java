package com.zhou.abstractfactory.factory.factoryImpl;

import com.zhou.abstractfactory.factory.TeamFactory;
import com.zhou.abstractfactory.menber.Captain;
import com.zhou.abstractfactory.menber.Sailor;
import com.zhou.abstractfactory.menber.Ship;
import com.zhou.abstractfactory.menber.menberImpl.NewShip;
import com.zhou.abstractfactory.menber.menberImpl.YoungCaptain;
import com.zhou.abstractfactory.menber.menberImpl.YoungSailor;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/20 15:46
 * @Description:
 */
public class YoungTeamFactory implements TeamFactory {
    @Override
    public Captain createCaptain() {
        return new YoungCaptain();
    }

    @Override
    public Sailor createSailor() {
        return new YoungSailor();
    }

    @Override
    public Ship createShip() {
        return new NewShip();
    }
}
