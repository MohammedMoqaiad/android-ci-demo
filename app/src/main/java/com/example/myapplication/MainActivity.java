package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        private RecyclerView recyclerView;
        private CourseAdapter courseAdapter;
        private CourseViewModel courseViewModel;

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Button loginButton = findViewById(R.id.btn_login);
            Button registerButton = findViewById(R.id.btn_register);
            recyclerView = findViewById(R.id.recycler_view);


            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            courseAdapter = new CourseAdapter();
            recyclerView.setAdapter(courseAdapter);

            courseViewModel = new ViewModelProvider(this).get(CourseViewModel.class);
            courseViewModel.getAllCourses().observe(this, courses -> courseAdapter.setCourses(courses));

            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, LoginActivity.class));
                }
            });

            registerButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, RegisterActivity.class));
                }
            });
        }
    }
}