package weiling.javaDemo.springCloudStream.config;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;

import java.util.function.Consumer;

@Slf4j
@RequiredArgsConstructor
@Configuration
public class StreamBridgeListener {

    @Bean
    public Consumer<Message<String>> printHello() {
        return msg -> {
            log.info(msg.getPayload() + ":listener print hello");
        };
    }

    @Bean
    public Consumer<Message<String>> printMessage() {
        return msg -> {
            log.info(msg.getPayload() + ":listener print message");
        };
    }
}
