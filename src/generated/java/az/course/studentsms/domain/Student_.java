package az.course.studentsms.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Student.class)
public abstract class Student_ {

	public static volatile SingularAttribute<Student, Long> test;
	public static volatile SingularAttribute<Student, String> school;
	public static volatile SingularAttribute<Student, Long> grade;
	public static volatile SingularAttribute<Student, String> name;
	public static volatile SingularAttribute<Student, String> description;
	public static volatile SingularAttribute<Student, Long> id;
	public static volatile SingularAttribute<Student, Integer> age;
	public static volatile SingularAttribute<Student, String> homeAddress;

	public static final String TEST = "test";
	public static final String SCHOOL = "school";
	public static final String GRADE = "grade";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String AGE = "age";
	public static final String HOME_ADDRESS = "homeAddress";

}

