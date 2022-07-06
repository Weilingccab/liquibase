package weiling.javaDemo.springCloudStream.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Sink {


    String INPUT2 = "test2-in";
    String INPUT3 = "test3-in";

    @Input(INPUT2)
    SubscribableChannel sub1();

    @Input(INPUT3)
    SubscribableChannel sub2();
}
