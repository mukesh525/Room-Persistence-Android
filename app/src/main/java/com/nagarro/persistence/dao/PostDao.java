package com.nagarro.persistence.dao;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.nagarro.persistence.entity.Post;

import java.util.List;

public interface PostDao {

    @Query("SELECT * FROM post")
    List<Post> getAll();

    @Query("SELECT * FROM post where post_name LIKE  :firstName AND last_name LIKE :lastName")
    Post findByName(String firstName, String lastName);

    @Query("SELECT COUNT(*) from post")
    int countUsers();

    @Insert
    void insertAll(Post... users);

    @Delete
    void delete(Post user);
}
