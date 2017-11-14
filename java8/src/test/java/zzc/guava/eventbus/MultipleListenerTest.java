package zzc.guava.eventbus;

import com.google.common.eventbus.EventBus;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleListenerTest {
    @Test
    public void listenInteger() throws Exception {
    }

    @Test
    public void listenLong() throws Exception {
    }

    @Test
    public void getLastInteger() throws Exception {
    }

    @Test
    public void getLastLong() throws Exception {
    }

    @Test
    public void multi_test_listener(){
        EventBus eventBus = new EventBus("test");
        MultipleListener multiListener = new MultipleListener();

        eventBus.register(multiListener);

        eventBus.post(new Integer(100));
        eventBus.post(new Integer(200));
        eventBus.post(new Integer(300));
        eventBus.post(new Long(800));
        eventBus.post(new Long(800990));
        eventBus.post(new Long(800882934));

        System.out.println("LastInteger:"+multiListener.getLastInteger());
        System.out.println("LastLong:"+multiListener.getLastLong());

    }

}