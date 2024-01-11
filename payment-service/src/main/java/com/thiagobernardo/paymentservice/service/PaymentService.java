package com.thiagobernardo.paymentservice.service;

import com.thiagobernardo.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
