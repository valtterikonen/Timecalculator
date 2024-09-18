package com.example.easybankproject.ui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datetimepicker.DateTimePicker;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@CssImport("./styles/userprofile.css")
@PageTitle("User Profile")
@Route(value = "profile", layout = MainLayout.class)
public class UserProfileView extends VerticalLayout {

    String url = "http://localhost:8080/api/user/profile";

    public UserProfileView() {
        TextField firstName = new TextField("First Name");
        TextField lastName = new TextField("Last Name");
        DateTimePicker dateOfBirth = new DateTimePicker("Date of Birth");
        EmailField email = new EmailField("Email");
        TextField phoneNumber = new TextField("Phone Number");
        TextField streetAddress = new TextField("Street Address");

        Button saveButton = new Button("Save");

        add(firstName, lastName, dateOfBirth, email, phoneNumber, streetAddress, saveButton);
    }
}
