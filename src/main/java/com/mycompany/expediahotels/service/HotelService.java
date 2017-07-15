package com.mycompany.expediahotels.service;

import com.mycompany.expediahotels.wrapper.HotelOffer;
import org.springframework.stereotype.Service;

/**
 *
 * @author Test
 */
@Service("HotelService")
public interface HotelService {

    public HotelOffer readHotelOffer(String targetedUrl);
}
