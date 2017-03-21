package com.kode.designpattern.dutychain;

import java.util.Iterator;
import java.util.List;

/**
 * Created by zhongcy on 2017-03-02.
 */
public class HandlerFactory {
    private List<Handler> handlers;

    public void setSuccessors(List<Handler> handlers) {
        this.handlers = handlers;
        Iterator<Handler> iterator = handlers.iterator();
        if (iterator.hasNext()) {
            Handler handler = iterator.next();
            while (iterator.hasNext()) {
                Handler nextHandler = iterator.next();
                handler.setSuccessor(nextHandler);
                handler = nextHandler;
            }
        }
    }

    public void handleEvent(int day) {
        if (handlers != null) {
            handlers.iterator().next().handle(day);
        }
    }
}
