package com.example.easybankproject.ui;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("History")
@Route(value = "history", layout = MainLayout.class)
public class HistoryView extends VerticalLayout {
    String url = "http://localhost:8080/api/user/history";
    String message;

    public HistoryView() {
        this.message = "Your history is empty.";
    }
}
