package com.ep.event;

import com.ep.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class AuditEventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishEvent(String message) {

        Map<String, String> data = CommonUtils.requestData();
        data.put("message", message);


        applicationEventPublisher.publishEvent(new AuditEvent(LogData.builder().dataMap(data).build()));
    }
}
