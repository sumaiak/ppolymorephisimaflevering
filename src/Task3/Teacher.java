package Task3;


import java.util.ArrayList;

class Teacher extends  Person {
    ArrayList<String> canTeach;
    ArrayList<String> currentCourses;

    public Teacher(ArrayList<String> canTeach, String name, ArrayList<String> currentCourses) {
        super(name);
        this.canTeach = canTeach;
    }

    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course)) {
            currentCourses.add(course);
            return true;
        } else {
            return false;
        }
    }
}