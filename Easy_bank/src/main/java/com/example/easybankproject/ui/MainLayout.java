package com.example.easybankproject.ui;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.theme.lumo.LumoUtility;

@CssImport("./styles/mainlayout.css")
public class MainLayout extends AppLayout {

    private H2 viewTitle;

    public MainLayout() {
        setPrimarySection(Section.DRAWER);
        addNavBarContent();
        addDrawerContent();
    }

    private void addNavBarContent() {
        var toggle = new DrawerToggle();
        toggle.setAriaLabel("Toggle menu");
        toggle.setTooltipText("Toggle menu");

        viewTitle = new H2();
        viewTitle.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE, LumoUtility.Flex.GROW, LumoUtility.Padding.MEDIUM);

        var header = new Header(toggle, viewTitle);
        header.addClassNames(LumoUtility.AlignItems.CENTER, LumoUtility.JustifyContent.BETWEEN, LumoUtility.Padding.End.MEDIUM);

        addToNavbar(false, header);
    }

    private void addDrawerContent() {
        VerticalLayout drawerLayout = new VerticalLayout();
        drawerLayout.setWidthFull();
        drawerLayout.setAlignItems(FlexComponent.Alignment.CENTER);
        addToDrawer(drawerLayout);

        Image logo = new Image("./images/easybank_logo.jpg", "logo");
        logo.setWidth("180x");
        logo.setHeight("200px");
        drawerLayout.add(logo);

        VerticalLayout profileLayout = new VerticalLayout();
        profileLayout.setWidth("40px");
        profileLayout.setHeight("80px");
        profileLayout.setAlignItems(FlexComponent.Alignment.CENTER);
        RouterLink profileLink = new RouterLink("Profile", UserProfileView.class);
        profileLink.addClassNames("btn-hover", "color-5");
        profileLayout.add(profileLink);

        VerticalLayout notificationsLayout = new VerticalLayout();
        notificationsLayout.setWidth("40px");
        notificationsLayout.setHeight("80px");
        notificationsLayout.setAlignItems(FlexComponent.Alignment.CENTER);
        RouterLink notificationsLink = new RouterLink("Notifications", Notifications.class);
        notificationsLink.addClassNames("btn-hover", "color-5");
        notificationsLayout.add(notificationsLink);

        VerticalLayout historyLayout = new VerticalLayout();
        historyLayout.setWidth("40px");
        historyLayout.setHeight("80px");
        historyLayout.setAlignItems(FlexComponent.Alignment.CENTER);
        RouterLink historyLink = new RouterLink("History", HistoryView.class);
        historyLink.addClassNames("btn-hover", "color-5");
        historyLayout.add(historyLink);


        drawerLayout.add(profileLayout, notificationsLayout, historyLayout);

    }

    private String getCurrentPageTitle() {
        if (getContent() == null) {
            return "";
        } else {
            var title = getContent().getClass().getAnnotation(PageTitle.class);
            return title == null ? "" : title.value();
        }
    }

    @Override
    protected void afterNavigation() {
        super.afterNavigation();
        viewTitle.setText(getCurrentPageTitle());
    }
}
