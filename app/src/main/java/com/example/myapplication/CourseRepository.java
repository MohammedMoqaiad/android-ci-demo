package com.example.myapplication;

public class CourseRepository {
    private CourseDao courseDao;
    private LiveData<List<Course>> allCourses;
    private ExecutorService executorService = Executors.newSingleThreadExecutor();

    public CourseRepository(Application application) {
        CourseDatabase database = CourseDatabase.getInstance(application);
        courseDao = database.courseDao();
        allCourses = courseDao.getAllCourses();
    }

    public void insert(Course course) {
        executorService.execute(() -> courseDao.insert(course));
    }

    public LiveData<List<Course>> getAllCourses() {
        return allCourses;
    }
}
