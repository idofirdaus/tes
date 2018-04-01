package com.example.idofirdaus.firdausadinugroho_1202154378_modul6.fragment;

import com.google.firebase.database.DatabaseReference;

public class MyPostsFragment extends PostListFragment {

    public MyPostsFragment() {}



    @Override

    public DatabaseReference getQuery(DatabaseReference databaseReference) {

        // All my posts

        return databaseReference.child("user-posts")

                .child(getUid());

    }
}
