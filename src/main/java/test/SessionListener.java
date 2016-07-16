package test;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by wanwan on 16/7/10.
 */
public class SessionListener implements HttpSessionListener {


    private static  int count;

    public static int getCount() {
        return count;
    }

    public void sessionCreated(HttpSessionEvent httpSessionEvent) {

        SessionListener.count++;
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {

        SessionListener.count--;

     }
}
