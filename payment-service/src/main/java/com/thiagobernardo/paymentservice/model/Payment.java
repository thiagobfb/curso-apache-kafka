package com.thiagobernardo.paymentservice.model;

import lombok.Getter;

@Getter
public class Payment {

    private Long id;
    private Long idUser;
    private Long idProduto;
    private String cardNumber;
}
