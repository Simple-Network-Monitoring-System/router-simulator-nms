package com.nms.routersimulator.scheduler;



import com.nms.routersimulator.kafka.RouterMetricProducer;
import com.nms.routersimulator.model.RouterMetric;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Random;

@Component
@RequiredArgsConstructor
public class RouterSimulatorScheduler {


    private final RouterMetricProducer producer;

    private final Random random = new Random();

    @Scheduled(fixedRate = 5000)
    public void generateMetrics() {

        RouterMetric metric = RouterMetric.builder()
                .deviceId("router-" + random.nextInt(100))
                .temperature(30 + random.nextDouble() * 20)
                .numPackets((long) random.nextInt(100000))
                .health(random.nextBoolean() ? "UP" : "DOWN")
                .timestamp(LocalDateTime.now())
                .build();

        producer.sendMetric(metric);
    }


}

