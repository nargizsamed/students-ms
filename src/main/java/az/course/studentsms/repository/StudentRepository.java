package az.course.studentsms.repository;

import az.course.studentsms.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

//    @Query(nativeQuery = true, value = "SELECT * from students s where s.name= 'Nargiz'")
    @Query("SELECT s from Student s where s.name= 'Nargiz'")
    List<Student> findStudentByName();


    @Query("SELECT s from Student s where s.name= 'Nargiz'")
    List<Student> findByAge(Integer age);

    List<Student> findByNameNamed(String name);
}
