package org.dev.company.workspace.shared;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("rpc/greet")
public interface GreetingService extends RemoteService {
    String greet();

    final class App {

        private App() {
        }

        private static final GreetingServiceAsync INSTANCE = (GreetingServiceAsync) GWT.create(GreetingService.class);

        public static GreetingServiceAsync getInstance() {
            return INSTANCE;
        }
    }
}
