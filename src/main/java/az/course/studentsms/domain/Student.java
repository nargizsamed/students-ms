package az.course.studentsms.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "students")
@NamedQuery(name = "Student.findByNameNamed", query = "SELECT s from Student s where s.name= 'Nargiz'")
public class Student { //students

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer age;

    private String homeAddress;

    @Column(nullable = false)
    private String school;

    private String description;

    private Long grade;

    private Long test;

}
