package com.mycompany.expediahotels.wrapper;

/**
 *
 * @author Test
 */
public class HotelPricingInfo {

    private String hotelTotalBaseRate;

    private String totalPriceValue;

    private String averagePriceValue;

    private String hotelTotalMandatoryTaxesAndFees;

    private String hotelTotalTaxesAndFees;

    private String originalPricePerNight;

    private String drr;

    private String percentSavings;

    private String currency;

    public String getHotelTotalBaseRate() {
        return hotelTotalBaseRate;
    }

    public void setHotelTotalBaseRate(String hotelTotalBaseRate) {
        this.hotelTotalBaseRate = hotelTotalBaseRate;
    }

    public String getTotalPriceValue() {
        return totalPriceValue;
    }

    public void setTotalPriceValue(String totalPriceValue) {
        this.totalPriceValue = totalPriceValue;
    }

    public String getAveragePriceValue() {
        return averagePriceValue;
    }

    public void setAveragePriceValue(String averagePriceValue) {
        this.averagePriceValue = averagePriceValue;
    }

    public String getHotelTotalMandatoryTaxesAndFees() {
        return hotelTotalMandatoryTaxesAndFees;
    }

    public void setHotelTotalMandatoryTaxesAndFees(String hotelTotalMandatoryTaxesAndFees) {
        this.hotelTotalMandatoryTaxesAndFees = hotelTotalMandatoryTaxesAndFees;
    }

    public String getHotelTotalTaxesAndFees() {
        return hotelTotalTaxesAndFees;
    }

    public void setHotelTotalTaxesAndFees(String hotelTotalTaxesAndFees) {
        this.hotelTotalTaxesAndFees = hotelTotalTaxesAndFees;
    }

    public String getOriginalPricePerNight() {
        return originalPricePerNight;
    }

    public void setOriginalPricePerNight(String originalPricePerNight) {
        this.originalPricePerNight = originalPricePerNight;
    }

    public String getDrr() {
        return drr;
    }

    public void setDrr(String drr) {
        this.drr = drr;
    }

    public String getPercentSavings() {
        return percentSavings;
    }

    public void setPercentSavings(String percentSavings) {
        this.percentSavings = percentSavings;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "ClassPojo [hotelTotalBaseRate = " + hotelTotalBaseRate + ", totalPriceValue = " + totalPriceValue + ", averagePriceValue = " + averagePriceValue + ", hotelTotalMandatoryTaxesAndFees = " + hotelTotalMandatoryTaxesAndFees + ", hotelTotalTaxesAndFees = " + hotelTotalTaxesAndFees + ", originalPricePerNight = " + originalPricePerNight + ", drr = " + drr + ", percentSavings = " + percentSavings + ", currency = " + currency + "]";
    }
}
