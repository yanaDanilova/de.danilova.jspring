package de.danilova.jspring;

import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    private Registry registry;

    @Qualifier("registry")
    public void setRegistry(Registry registry) {
        this.registry = registry;
    }


    public void requestReferralOnRegistry(){
        registry.issuingDirection();

    }
}
