package be.heh.testarchitecturehexa.adaptater.out;

import be.heh.testarchitecturehexa.model.Student;

import java.util.ArrayList;
import java.util.List;

//@Component
public class StudentMapper {

    List<Student> mapToDomainEntity(List<StudentJpaEntity> students){
        List<Student> studentsList = new ArrayList<>();

        for (StudentJpaEntity studentJpaEntity: students) {
            studentsList.add(new Student(studentJpaEntity.getNom(),studentJpaEntity.getPrenom(),studentJpaEntity.getDateAnniversaire()));
        }
        return studentsList;
    }
}
