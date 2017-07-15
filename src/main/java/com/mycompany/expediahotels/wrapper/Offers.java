package com.mycompany.expediahotels.wrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author Test
 */
public class Offers {

    @JsonProperty("Hotel")
    private List<Hotel> Hotel;

    public List<Hotel> getHotel() {
        return Hotel;
    }

    public void setHotel(List<Hotel> Hotel) {
        this.Hotel = Hotel;
    }

    @Override
    public String toString() {
        return "ClassPojo [Hotel = " + Hotel + "]";
    }
}
