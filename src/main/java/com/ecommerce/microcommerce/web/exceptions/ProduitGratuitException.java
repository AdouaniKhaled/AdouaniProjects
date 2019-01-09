package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by kadouani on 09/01/2019.
 */
@ResponseStatus(HttpStatus.PAYMENT_REQUIRED)
public class ProduitGratuitException  extends RuntimeException {
    public ProduitGratuitException(String s) {
        super(s);
    }
}
