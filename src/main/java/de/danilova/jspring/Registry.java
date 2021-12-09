package de.danilova.jspring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component ("registry")
public class Registry {
    private Referral referral;

    @Qualifier ("referral")
    public void setReferral(Referral referral) {
        this.referral = referral;
    }

    public void issuingDirection(){
        referral.direct();
    }
}
