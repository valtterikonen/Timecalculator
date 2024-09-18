package com.example.easybankproject.ui;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Notifications")
@Route(value = "notifications", layout = MainLayout.class)

public class Notifications extends VerticalLayout {

    String url = "http://localhost:8080/api/user/notifications";
    String message;
    public Notifications() {
        this.message = "You have new notifications.";
    }
}
