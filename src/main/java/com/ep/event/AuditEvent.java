package com.ep.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;


@Getter
public class AuditEvent<T> extends ApplicationEvent {
    private final T data;

    public AuditEvent(T data) {
        super(data);
        this.data = data;
    }
}
