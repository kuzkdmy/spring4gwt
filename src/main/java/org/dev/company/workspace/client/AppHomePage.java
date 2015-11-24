package org.dev.company.workspace.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import org.dev.company.workspace.shared.GreetingService;

public class AppHomePage extends Composite {

    @UiField
    Button testBtn;

    @UiHandler("testBtn")
    void onLabelClick(ClickEvent event) {
        GreetingService.App.getInstance().greet(new AsyncCallback<String>() {
            @Override
            public void onFailure(Throwable throwable) {
                Window.alert("fail " + throwable.getMessage() );
            }

            @Override
            public void onSuccess(String s) {
                Window.alert(s);
            }
        });
    }

    public AppHomePage() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }


    interface AppHomePageUiBinder extends UiBinder<HTMLPanel, AppHomePage> {
    }

    private static AppHomePageUiBinder ourUiBinder = GWT.create(AppHomePageUiBinder.class);
}