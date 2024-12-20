/*
 * Copyright (c)
 * Author: Szymon Kiciński
 */

package pl.kafka.spring.consumer.domain;

import pl.kafka.spring.event.MessageReadEvent;

public interface MessageReadConsumer {

    void consume(final MessageReadEvent event);
}
