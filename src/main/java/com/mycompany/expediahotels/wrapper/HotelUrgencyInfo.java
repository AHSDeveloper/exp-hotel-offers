package com.mycompany.expediahotels.wrapper;

/**
 *
 * @author Test
 */
public class HotelUrgencyInfo {

    private String lastBookedTime;

    private String airAttachEnabled;

    private String numberOfPeopleBooked;

    private String almostSoldStatus;

    private String numberOfRoomsLeft;

    private String link;

    private String[] almostSoldOutRoomTypeInfoCollection;

    private String numberOfPeopleViewing;

    private String airAttachRemainingTime;

    public String getLastBookedTime() {
        return lastBookedTime;
    }

    public void setLastBookedTime(String lastBookedTime) {
        this.lastBookedTime = lastBookedTime;
    }

    public String getAirAttachEnabled() {
        return airAttachEnabled;
    }

    public void setAirAttachEnabled(String airAttachEnabled) {
        this.airAttachEnabled = airAttachEnabled;
    }

    public String getNumberOfPeopleBooked() {
        return numberOfPeopleBooked;
    }

    public void setNumberOfPeopleBooked(String numberOfPeopleBooked) {
        this.numberOfPeopleBooked = numberOfPeopleBooked;
    }

    public String getAlmostSoldStatus() {
        return almostSoldStatus;
    }

    public void setAlmostSoldStatus(String almostSoldStatus) {
        this.almostSoldStatus = almostSoldStatus;
    }

    public String getNumberOfRoomsLeft() {
        return numberOfRoomsLeft;
    }

    public void setNumberOfRoomsLeft(String numberOfRoomsLeft) {
        this.numberOfRoomsLeft = numberOfRoomsLeft;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String[] getAlmostSoldOutRoomTypeInfoCollection() {
        return almostSoldOutRoomTypeInfoCollection;
    }

    public void setAlmostSoldOutRoomTypeInfoCollection(String[] almostSoldOutRoomTypeInfoCollection) {
        this.almostSoldOutRoomTypeInfoCollection = almostSoldOutRoomTypeInfoCollection;
    }

    public String getNumberOfPeopleViewing() {
        return numberOfPeopleViewing;
    }

    public void setNumberOfPeopleViewing(String numberOfPeopleViewing) {
        this.numberOfPeopleViewing = numberOfPeopleViewing;
    }

    public String getAirAttachRemainingTime() {
        return airAttachRemainingTime;
    }

    public void setAirAttachRemainingTime(String airAttachRemainingTime) {
        this.airAttachRemainingTime = airAttachRemainingTime;
    }

    @Override
    public String toString() {
        return "ClassPojo [lastBookedTime = " + lastBookedTime + ", airAttachEnabled = " + airAttachEnabled + ", numberOfPeopleBooked = " + numberOfPeopleBooked + ", almostSoldStatus = " + almostSoldStatus + ", numberOfRoomsLeft = " + numberOfRoomsLeft + ", link = " + link + ", almostSoldOutRoomTypeInfoCollection = " + almostSoldOutRoomTypeInfoCollection + ", numberOfPeopleViewing = " + numberOfPeopleViewing + ", airAttachRemainingTime = " + airAttachRemainingTime + "]";
    }
}
