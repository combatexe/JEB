package org.pcsoft.framework.jeb.qualifier.threading;

import org.pcsoft.framework.jeb.annotation.handler.RunOnThreadBase;

/**
 * Created by pfeifchr on 27.05.2016.
 */
@RunOnMyThread1
public class RunOnThreadMyThread1 extends RunOnThreadBase<RunOnMyThread1> {
    public static final String THREAD_NAME = "MyThread.1";

    @Override
    public void runOnThread(final RunOnMyThread1 annotation, final MethodInvokeListener methodInvokeListener) {
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                methodInvokeListener.onInvokeMethod();
            }
        }, THREAD_NAME);
        thread.setDaemon(true);
        thread.start();
    }
}
