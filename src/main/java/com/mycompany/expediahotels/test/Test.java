package com.mycompany.expediahotels.test;

import com.mycompany.expediahotels.service.HotelServiceImp;
import com.mycompany.expediahotels.wrapper.HotelOffer;

/**
 *
 * @author Test
 */
public class Test {

    private final static String HOTEL_OFFERS_URL = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";

    public static void main(String[] args) {
        HotelServiceImp hotelService = new HotelServiceImp();
        HotelOffer ho = hotelService.readHotelOffer(HOTEL_OFFERS_URL);
        System.out.println(ho);
    }
}
