package weiling.javaDemo.springCloudStream.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ProducerController {

    @Autowired
    private StreamBridge streamBridge;


    @GetMapping("/printHello")
    public void printHello() {
        streamBridge.send("printHello-out-0", "print hello....");

    }

    @GetMapping("/printMessage")
    public void printMessage() {
        streamBridge.send("printMessage-out-0", "print message....");

    }
}