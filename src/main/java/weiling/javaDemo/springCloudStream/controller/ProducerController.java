package weiling.javaDemo.springCloudStream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import weiling.javaDemo.springCloudStream.config.Source;

@RestController
public class ProducerController {
    @Autowired
    private Source source;

    @GetMapping("/testConnect2")
    public void sendSucceed() {
        source.message2().send(MessageBuilder.withPayload("Hello World...")
                .build());
    }

    @GetMapping("/testConnect3")
    public void sendSucceed3() {
        source.message3().send(MessageBuilder.withPayload("Hello World...")
                .build());
    }
}