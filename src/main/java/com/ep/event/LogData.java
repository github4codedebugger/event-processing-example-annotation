package com.ep.event;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@Builder
public class LogData {
    private Map<String, String> dataMap;
}
