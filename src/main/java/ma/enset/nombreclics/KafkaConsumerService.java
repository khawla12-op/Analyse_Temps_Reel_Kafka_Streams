package ma.enset.nombreclics;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class KafkaConsumerService {
    private final Map<String, Long> clickCounts = new ConcurrentHashMap<>();

    @KafkaListener(topics = "click-counts", groupId = "clicks-consumer-group")
    public void consumeClickCounts(ConsumerRecord<String, Long> record) {
        clickCounts.put(record.key(), record.value());
    }

    public Map<String, Long> getClickCounts() {
        return clickCounts;
    }
}
