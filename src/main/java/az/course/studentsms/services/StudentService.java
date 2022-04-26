package az.course.studentsms.services;

import az.course.studentsms.domain.Student;
import az.course.studentsms.domain.Student_;
import az.course.studentsms.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final EntityManager em;
    private final StudentRepository studentRepository;

    public void specExecutor(String name, Integer age) {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Student> cq = cb.createQuery(Student.class);
//        System.out.println("Criteri query :" + cq);
        Root<Student> student = cq.from(Student.class);
//        System.out.println("Root : " + student.toString());

        List<Predicate> predicates = new ArrayList<>();

        Predicate studentNamePredicate = cb.equal(student.get(Student_.NAME), name);
        Predicate studentAgePredicate = cb.greaterThan(student.get(Student_.AGE), age);


        if (name != null)
            predicates.add(studentNamePredicate);
        if (age != null)
            predicates.add(studentAgePredicate);

        cb.and(predicates.toArray(new Predicate[predicates.size()]));

//        cq.where(predicates.toArray(new Predicate[predicates.size()]));

//        cb.or(studentNamePredicate);
//        cq.where(studentNamePredicate);

        TypedQuery<Student> query = em.createQuery(cq);
        query.getResultList()
                .stream()
                .forEach(System.out::println);
    }

    public void specificationExecutorInAction(String name) {
        studentRepository.findAll((root, query, criteriaBuilder) -> criteriaBuilder.like(root.get(Student_.NAME), "%" + name + "%"))
                .stream()
                .forEach(System.out::println);

    }

    private Specification<Student> nameLike(String name) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get(Student_.NAME), "%" + name + "%");
    }

    private Specification<Student> test(Integer age) {
        List<Student> list = new ArrayList<>();
        list.
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get(Student_.AGE), age);
    }
}
