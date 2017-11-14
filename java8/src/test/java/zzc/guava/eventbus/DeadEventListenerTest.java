package zzc.guava.eventbus;

import com.google.common.eventbus.EventBus;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeadEventListenerTest {
    @Test
    public void listen() throws Exception {
    }

    @Test
    public void isNotDelivered() throws Exception {
    }

    @Test
    public void testDeadEventListeners() throws Exception {

        EventBus eventBus = new EventBus("test");

        DeadEventListener deadEventListener = new DeadEventListener();
        eventBus.register(deadEventListener);

        eventBus.post(new TestEvent(200));
        eventBus.post(new TestEvent(300));

        System.out.println("deadEvent:" + deadEventListener.isNotDelivered());

    }
}