package org.dev.company.workspace.shared;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GreetingServiceAsync {
    void greet(AsyncCallback<String> async);
}
