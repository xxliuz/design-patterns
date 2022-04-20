package com.zhou.abstractfactory.team;

import com.zhou.abstractfactory.factory.TeamFactory;
import com.zhou.abstractfactory.menber.Captain;
import com.zhou.abstractfactory.menber.Sailor;
import com.zhou.abstractfactory.menber.Ship;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/20 15:59
 * @Description:
 */
@Getter
@Setter
public class Team {
    private Captain captain;
    private Sailor sailor;
    private Ship ship;

    public void createTeam(final TeamFactory teamFactory){
        setCaptain(teamFactory.createCaptain());
        setSailor(teamFactory.createSailor());
        setShip(teamFactory.createShip());
    }

}
