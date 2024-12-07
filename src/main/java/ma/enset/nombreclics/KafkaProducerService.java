package ma.enset.nombreclics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    public void sendClick(String userId) {
        kafkaTemplate.send("clicks", userId, "click");
    }
}


