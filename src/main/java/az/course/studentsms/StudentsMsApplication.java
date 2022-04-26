package az.course.studentsms;

import az.course.studentsms.domain.Student;
import az.course.studentsms.repository.StudentRepository;
import az.course.studentsms.services.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class StudentsMsApplication implements CommandLineRunner {

	private final StudentRepository studentRepository;
	private final StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(StudentsMsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		log.info("Inserting data into table");
//		Student student = new Student();
//		student.setAge(20);
//		student.setHomeAddress("Baku");
////		student.setSchool("Ingress");
//		student.setName("Ceyhun M.");
//
//		studentRepository.save(student);

//		studentRepository.findStudentByName().stream().forEach(System.out::println);

//		studentRepository.findByAge(14).stream().forEach(System.out::println);

//		studentRepository.findByNameNamed("Nargiz").stream().forEach(System.out::println);

//		studentService.specExecutor(null, 30);
		studentService.specificationExecutorInAction("Nar");

	}
}
