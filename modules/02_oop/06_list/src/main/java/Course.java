public class Course {

    private final String courseName;
    private String lecturerName;
    private int roomNumber;

    Course(String courseName, String lecturerName, int roomNumber) {
        this.courseName = courseName;
        this.lecturerName = lecturerName;
        this.roomNumber = roomNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }
}
