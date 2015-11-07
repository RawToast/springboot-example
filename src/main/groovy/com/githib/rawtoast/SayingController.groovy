
package com.githib.rawtoast

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(locations = "classpath:saying.properties", ignoreUnknownFields = false, prefix = "saying")
public class SayingController {

    private static final String responsePrefix = "Hello,";
    private final AtomicLong counter = new AtomicLong();
    String defaultName

    @RequestMapping("/saying")
    public Saying greeting(@RequestParam(value="name", defaultValue="") String name) {

        def responseName = defaultName

        if (name){
         responseName = name
        }
        responseName = "$responsePrefix $responseName!"

        return new Saying(id: counter.incrementAndGet(), content: responseName)
    }

}