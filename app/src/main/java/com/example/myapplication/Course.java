package com.example.myapplication;
@Entity(tableName = "course_table")
public class Course {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;

    public Course(String title) {
        this.title = title;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
}