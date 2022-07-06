package weiling.javaDemo.springCloudStream.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import weiling.javaDemo.springCloudStream.config.Sink;

@Service
@Slf4j
public class ComsumerService {


    @StreamListener(value = Sink.INPUT2)
    public void receiveSucceed_v2(@Payload String message) {
        String msg = "StreamReceiver v2: " + message;
        log.info(msg);
    }

    @StreamListener(value = Sink.INPUT3)
    public void receiveSucceed_v3(@Payload String message) {
        String msg = "StreamReceiver v3: " + message;
        log.info(msg);
    }
}