package com.example.idofirdaus.firdausadinugroho_1202154378_modul6.model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.IgnoreExtraProperties;


@IgnoreExtraProperties
public class User {

    public String username;

    public String email;



    public User() {

        // Default constructor required for calls to DataSnapshot.getValue(User.class)

    }



    public User(String username, String email) {

        this.username = username;

        this.email = email;

    }
}
