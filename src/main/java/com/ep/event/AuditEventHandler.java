package com.ep.event;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AuditEventHandler {

    @EventListener
    @Async
    public void handleEvent(AuditEvent auditEvent) {
        try {
            String data = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(auditEvent.getData());
            System.out.println("sending data to security audit service : " + data);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
