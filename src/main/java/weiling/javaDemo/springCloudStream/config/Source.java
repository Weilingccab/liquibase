package weiling.javaDemo.springCloudStream.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface Source {
    String OUTPUT2 = "test2-out";
    String OUTPUT3 = "test3-out";

    @Output(OUTPUT2)
    MessageChannel message2();

    @Output(OUTPUT3)
    MessageChannel message3();
}
