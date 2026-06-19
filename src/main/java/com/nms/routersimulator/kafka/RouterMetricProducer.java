package com.nms.routersimulator.kafka;


import com.nms.routersimulator.model.RouterMetric;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RouterMetricProducer {


    private final KafkaTemplate<String, RouterMetric> kafkaTemplate;

    public void sendMetric(RouterMetric metric) {

        kafkaTemplate.send("router-metrics", metric);

        System.out.println("Message Sent: " + metric);
    }


}

