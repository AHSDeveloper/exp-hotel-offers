package com.mycompany.expediahotels.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
import com.mycompany.expediahotels.wrapper.HotelOffer;
import org.springframework.stereotype.Component;

/**
 *
 * @author Test
 */
@Component
public class HotelServiceImp implements HotelService {

    public HotelOffer readHotelOffer(String targetedUrl) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(new URL(targetedUrl), HotelOffer.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new HotelOffer();
    }
}
