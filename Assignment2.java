
public final class Student {
    private final String name;
    private final int rollNumber;
    private final String[] subjects;

    public Student(String name, int rollNumber, String[] subjects) {
        this.name = name;
        this.rollNumber = rollNumber;
        // Defensive copy to ensure immutability
        this.subjects = new String[subjects.length];
        for (int i = 0; i < subjects.length; i++) {
            this.subjects[i] = subjects[i];
        }
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    // Return a copy to prevent modification
    public String[] getSubjects() {
        String[] copy = new String[subjects.length];
        for (int i = 0; i < subjects.length; i++) {
            copy[i] = subjects[i];
        }
        return copy;
    }
}

// Example usage
class Main {
    public static void main(String[] args) {
        String[] subs = {"Math", "Science"};
        Student st = new Student("Ravi", 123, subs);

        System.out.println("Name: " + st.getName());
        System.out.println("Roll Number: " + st.getRollNumber());
        String[] stSubjects = st.getSubjects();
        for (int i = 0; i < stSubjects.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + stSubjects[i]);
        }

        // Modify passed array to show immutability
        subs[0] = "English";
        System.out.println("After external array change:");
        String[] stSubjects2 = st.getSubjects();
        for (int i = 0; i < stSubjects2.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + stSubjects2[i]);
        }
    }
}
