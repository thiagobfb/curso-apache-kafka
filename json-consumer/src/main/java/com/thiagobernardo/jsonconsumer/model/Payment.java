package com.thiagobernardo.jsonconsumer.model;

import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Getter
public class Payment implements Serializable {

    private Long id;
    private Long idUser;
    private Long idProduto;
    private String cardNumber;
}