package com.zhou.memento;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MementoApplication {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        log.info("Current State: " + originator.getState());
        originator.setStateFromMemento(careTaker.get(0));
        log.info("First saved State: " + originator.getState());
        originator.setStateFromMemento(careTaker.get(1));
        log.info("Second saved State: " + originator.getState());
    }

}
