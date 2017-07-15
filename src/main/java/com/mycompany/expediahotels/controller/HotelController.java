package com.mycompany.expediahotels.controller;

import com.mycompany.expediahotels.service.HotelService;
import com.mycompany.expediahotels.wrapper.HotelOffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Test
 */
@Controller
@RequestMapping(value = "/")
public class HotelController {

    private final static String HOTEL_OFFERS_URL = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";

    @Autowired
    private HotelService hotelService;

    @RequestMapping(value = "/getHotelOffers", method = RequestMethod.GET)
    public ModelAndView getHotelOffers(@RequestParam("destinationName") String destinationName,
            @RequestParam("minTripStartDate") String minTripStartDate,
            @RequestParam("maxTripStartDate") String maxTripStartDate,
            @RequestParam("lengthOfStay") String lengthOfStay,
            @RequestParam("minStarRating") String minStarRating,
            @RequestParam("maxStarRating") String maxStarRating,
            @RequestParam("minTotalRate") String minTotalRate,
            @RequestParam("maxTotalRate") String maxTotalRate,
            @RequestParam("minGuestRating") String minGuestRating,
            @RequestParam("maxGuestRating") String maxGuestRating) {

        StringBuilder queryParams = new StringBuilder("");

        if (!"".equals(destinationName)) {
            queryParams.append("&destinationName=");
            queryParams.append(destinationName);
        }
        if (!"".equals(minTripStartDate)) {
            queryParams.append("&minTripStartDate=");
            queryParams.append(minTripStartDate);
        }
        if (!"".equals(maxTripStartDate)) {
            queryParams.append("&maxTripStartDate=");
            queryParams.append(maxTripStartDate);
        }
        if (!"".equals(lengthOfStay)) {
            queryParams.append("&lengthOfStay=");
            queryParams.append(lengthOfStay);
        }
        if (!"0".equals(minStarRating)) {
            queryParams.append("&minStarRating=");
            queryParams.append(minStarRating);
        }
        if (!"0".equals(maxStarRating)) {
            queryParams.append("&maxStarRating=");
            queryParams.append(maxStarRating);
        }
        if (!"0".equals(minTotalRate)) {
            queryParams.append("&minTotalRate=");
            queryParams.append(minTotalRate);
        }
        if (!"0".equals(maxTotalRate)) {
            queryParams.append("&maxTotalRate=");
            queryParams.append(maxTotalRate);
        }
        if (!"0".equals(minGuestRating)) {
            queryParams.append("&minGuestRating=");
            queryParams.append(minGuestRating);
        }
        if (!"0".equals(maxGuestRating)) {
            queryParams.append("&maxGuestRating=");
            queryParams.append(maxGuestRating);
        }

        System.out.println(HOTEL_OFFERS_URL + queryParams.toString());
        HotelOffer hotelOffer = hotelService.readHotelOffer(HOTEL_OFFERS_URL + queryParams.toString());
        ModelAndView model = new ModelAndView("index");
        model.addObject("hotelOffersList", hotelOffer.getOffers().getHotel());

        return model;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView redirect() {

        ModelAndView model = new ModelAndView("index");
        return model;
    }
}
