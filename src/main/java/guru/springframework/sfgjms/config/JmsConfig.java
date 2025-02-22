package guru.springframework.sfgjms.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

@Configuration
public class JmsConfig {


    public static final String MY_QUEUE = "hello-world";
    public static final String MY_SEND_RECEIVE_QUEUE = "reply-back";
    @Bean
    public MessageConverter messageConverter(){
        MappingJackson2MessageConverter mappingJackson2MessageConverter = new MappingJackson2MessageConverter();
        mappingJackson2MessageConverter.setTargetType(MessageType.TEXT);
        mappingJackson2MessageConverter.setTypeIdPropertyName("_type");


        return mappingJackson2MessageConverter;
    }

}
