package zzc.guava.eventbus;

import com.google.common.eventbus.EventBus;
import org.junit.Test;

import static org.junit.Assert.*;

public class EventListenerTest {
    @Test
    public void listen() throws Exception {
    }

    @Test
    public void getLastMessage() throws Exception {
    }
    @Test
    public void test_event(){
        EventBus eventBus = new EventBus("test");
        EventListener listener = new EventListener();

        eventBus.register(listener);

        eventBus.post(new TestEvent(200));
        eventBus.post(new TestEvent(300));
        eventBus.post(new TestEvent(400));

        System.out.println("LastMessage:"+listener.getLastMessage());
        ;
    }

}