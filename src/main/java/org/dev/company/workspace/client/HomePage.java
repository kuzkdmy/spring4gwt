package org.dev.company.workspace.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

public class HomePage implements EntryPoint {

    public void onModuleLoad() {
        RootPanel.get().add(GWT.<AppHomePage>create(AppHomePage.class));
    }
}
