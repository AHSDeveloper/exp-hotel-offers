package com.mycompany.expediahotels.wrapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Test
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelOffer {

    private Offers offers;

    public Offers getOffers() {
        return offers;
    }

    public void setOffers(Offers offers) {
        this.offers = offers;
    }

    @Override
    public String toString() {
        return "ClassPojo [offers = " + offers + "]";
    }
}
