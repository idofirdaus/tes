package com.example.idofirdaus.firdausadinugroho_1202154378_modul6.model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Comment {
    public String uid;

    public String author;

    public String text;



    public Comment() {

        // Default constructor required for calls to DataSnapshot.getValue(Comment.class)

    }



    public Comment(String uid, String author, String text) {

        this.uid = uid;

        this.author = author;

        this.text = text;

    }
}
