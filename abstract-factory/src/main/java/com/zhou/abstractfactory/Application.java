package com.zhou.abstractfactory;

import com.zhou.abstractfactory.factory.factoryImpl.PermanentTeamFactory;
import com.zhou.abstractfactory.team.Team;
import com.zhou.abstractfactory.factory.factoryImpl.YoungTeamFactory;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Application {

    public static void main(String[] args) {

        Team team = new Team();

        team.createTeam(new YoungTeamFactory());
        log.info("正在创建一支年轻的队伍...");
        log.info("-->" +team.getCaptain().getDescription());
        log.info("-->" +team.getSailor().getDescription());
        log.info("-->" +team.getShip().getDescription());

        team.createTeam(new PermanentTeamFactory());
        log.info("正在创建一支久经考验的队伍...");
        log.info("-->" + team.getCaptain().getDescription());
        log.info("-->" + team.getShip().getDescription());
        log.info("-->" + team.getSailor().getDescription());

    }

}
