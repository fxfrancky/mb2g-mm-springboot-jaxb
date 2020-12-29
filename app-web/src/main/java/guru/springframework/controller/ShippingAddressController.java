package guru.springframework.controller;

import guru.springframework.domain.ShippingAddress;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingAddressController {


//ShippingAddressController
//    public Shi getShippingAdress(){
//
//    }

    @GetMapping("/shipping-addresse")
    public ShippingAddress findShippingAddress( ){
        ShippingAddress shippingAddress = new ShippingAddress();
        shippingAddress.setPostalCode("57000");
        shippingAddress.setLocality("Metz");
        shippingAddress.setRegion("Grand Est");
        shippingAddress.setCountryName("France");
        shippingAddress.setPostOfficeBox("20");
        shippingAddress.setStreetAddress("rue LANCON");
        return shippingAddress;

    }
}
