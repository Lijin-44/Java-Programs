import java.util.Scanner;

class Student {
    int rollno;
    String name;
    int marks;
    static int count = 0;

    Student(int r, String n, int m) {
        rollno = r;
        name = n;
        marks = m;
        count++;
    }

    void display() {
        System.out.println(rollno + "\t" + name + "\t" + marks);
    }

    static void compare(Student s1, Student s2) {
        if (s1.marks > s2.marks)
            System.out.println(s1.name + " has higher marks");
        else if (s2.marks > s1.marks)
            System.out.println(s2.name + " has higher marks");
        else
            System.out.println("Both have equal marks");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));
            System.out.print("Roll No: ");
            int r = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Marks: ");
            int m = sc.nextInt();

            s[i] = new Student(r, name, m);
        }

        // Rank list (simple sorting)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s[i].marks < s[j].marks) {
                    Student temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }

        System.out.println("\nRank List:");
        System.out.println("Roll\tName\tMarks");
        for (Student st : s)
            st.display();

        System.out.println("\nTotal Students: " + count);

        if (n >= 2)
            compare(s[0], s[1]);
    }
}
