package com.thiagobernardo.jsonconsumer.listeners;

import com.thiagobernardo.jsonconsumer.model.Payment;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import static java.lang.Thread.sleep;

@Log4j2
@Component
public class JsonListener {

    @SneakyThrows
    @KafkaListener(groupId = "create-group", topics = "payment-topic", containerFactory = "jsonContainerFactory")
    public void antiFraud(@Payload Payment payment) {
        log.info("Recebendo pagamento {}", payment.toString());
        sleep(2000);
        log.info("Validando fraude...");
        sleep(2000);

        log.info("Compra aprovada...");
        sleep(2000);
    }

    @SneakyThrows
    @KafkaListener(groupId = "pdf-group", topics = "payment-topic", containerFactory = "jsonContainerFactory")
    public void pdfGenerator(@Payload Payment payment) {
        sleep(3000);
        log.info("Gerando PDF do produto de ID {}", payment.getId());
        sleep(3000);
    }

    @SneakyThrows
    @KafkaListener(groupId = "email-group", topics = "payment-topic", containerFactory = "jsonContainerFactory")
    public void sendEmail() {
        sleep(3000);
        log.info("Enviando email de confirmacao...");
    }
}
