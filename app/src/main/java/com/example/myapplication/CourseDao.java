package com.example.myapplication;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CourseDao {
    @Insert
    void insert(Course course);

    @Query("SELECT * FROM course_table ORDER BY id ASC")
    LiveData<List<Course>> getAllCourses();
}
