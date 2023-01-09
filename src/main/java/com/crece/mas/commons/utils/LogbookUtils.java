package com.crece.mas.commons.utils;

import org.zalando.logbook.*;
import org.zalando.logbook.servlet.LogbookFilter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Collections.singleton;
import static org.zalando.logbook.json.JsonBodyFilters.replaceJsonStringProperty;
import static org.zalando.logbook.json.JsonPathBodyFilters.jsonPath;

public class LogbookUtils {
    public static LogbookFilter createDefault() {
        LogbookFilter filter = new LogbookFilter(
                Logbook.builder()
                        .strategy(new DefaultStrategy())
                        .sink(new DefaultSink(new SplunkHttpLogFormatter(), new DefaultHttpLogWriter()))
                        .build());
        return filter;
    }

    public static LogbookFilter createSecureDefault() {
        return new LogbookFilter(
                Logbook.builder()
                        .strategy(new WithoutBodyStrategy())
                        .sink(new DefaultSink(new SplunkHttpLogFormatter(), new DefaultHttpLogWriter()))
                        .build());
    }

    public static LogbookFilter createBodyObfuscation(Optional<String[]> fields) {
        Set<String> filters = new HashSet<>();
        if(fields != null && fields.isPresent()) {
            Arrays.stream(fields.get()).forEach(filter -> filters.add(filter));
        }

        LogbookFilter filter = new LogbookFilter(
                Logbook.builder()
                        .strategy(new DefaultStrategy())
                        .bodyFilter(replaceJsonStringProperty(filters, "***"))
                        .sink(new DefaultSink(new SplunkHttpLogFormatter(), new DefaultHttpLogWriter()))
                        .build());
        return filter;
    }
}
