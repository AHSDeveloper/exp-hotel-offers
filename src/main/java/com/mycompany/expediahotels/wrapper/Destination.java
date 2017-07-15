package com.mycompany.expediahotels.wrapper;

/**
 *
 * @author Test
 */
public class Destination {

    private String province;

    private String longName;

    private String regionID;

    private String city;

    private String country;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "ClassPojo [province = " + province + ", longName = " + longName + ", regionID = " + regionID + ", city = " + city + ", country = " + country + "]";
    }
}
