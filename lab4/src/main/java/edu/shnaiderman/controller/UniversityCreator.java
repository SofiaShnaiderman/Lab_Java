package edu.shnaiderman.controller;

import edu.shnaiderman.model.*;

public class UniversityCreator {
    public UniversityCreator() {
    }

    public University createUniversity(String name, Human headmaster) {
        return new University(name, headmaster);
    }

    public University createTypicalUniversity() {
        UniversityCreator universityCreator = new UniversityCreator();
        FacultyCreator facultyCreator = new FacultyCreator();
        DepartmentCreator departmentCreator = new DepartmentCreator();
        GroupCreator groupCreator = new GroupCreator();
        StudentCreator studentCreator = new StudentCreator();

        Human headmaster = new Human("Sofia", "Shnaiderman", "Volodymyrivna", Sex.FEMALE);
        University university = universityCreator.createUniversity("JAVA", headmaster);
        System.out.println(university);


        Human dean = new Human("Marco", "Ohms", "-", Sex.MALE);
        Faculty faculty = facultyCreator.createFaculty("Computer Science", dean);
        university.addFaculty(faculty);
        System.out.println(faculty);


        Human head = new Human("Alice", "Logmann", "-", Sex.FEMALE);
        Department department = departmentCreator.createDepartment("Programming", head);
        faculty.addDepartment(department);
        System.out.println(department);


        Group group = groupCreator.createGroup("Java Programming");
        department.addGroup(group);
        System.out.println(group);


        Student student1 = studentCreator.createStudent("Marilyn", "Menson", "Warner", Sex.MALE);
        Student student2 = studentCreator.createStudent("Brian", "Hugh", "Warner", Sex.MALE);
        group.addStudent(student1);
        group.addStudent(student2);

        System.out.println(student1);
        System.out.println(student1);

        return university;
    }
}