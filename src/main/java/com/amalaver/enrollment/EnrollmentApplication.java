package com.amalaver.enrollment;

import java.util.Date;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.amalaver.enrollment.data.entities.Course;
import com.amalaver.enrollment.data.entities.Professor;
import com.amalaver.enrollment.data.entities.Student;
import com.amalaver.enrollment.data.repository.CourseRepository;
import com.amalaver.enrollment.data.repository.ProfessorRepository;
import com.amalaver.enrollment.data.repository.StudentRepository;
import com.amalaver.enrollment.negocio.enums.CourseTypeEnum;
import com.amalaver.enrollment.negocio.enums.GenderEnum;
import com.amalaver.enrollment.negocio.enums.HireTypeEnum;
import com.amalaver.enrollment.negocio.enums.StatusEnum;

@SpringBootApplication
public class EnrollmentApplication implements CommandLineRunner{
	
	private static final Logger log = LoggerFactory.getLogger(EnrollmentApplication.class);

	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private ProfessorRepository professorRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(EnrollmentApplication.class);
		application.run();
	}

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		
//		Course course = new Course();
//		course.setCourseType(CourseTypeEnum.PROGRAMACION.getValor());
//		course.setCourseCode("PR001");
//		course.setCourseName("Programación Java");
//		course.setDescription("Este curso es de programación");
//		course.setDateCreated(new Date());
//		course.setNumberOfHours((short)80);
//		course.setPrerequisite("Se requiere conocimiento de algoritmos");
//		course.setStatus(StatusEnum.ACTIVO.getValor());
//		courseRepository.save(course);
//		
//		log.info("Nuevo Curso:::" + course.getIdCourse());
		
		Professor professor = new Professor();
		professor.setBirthDate(new Date());
		professor.setDateCreated(new Date());
		professor.setEmailAddress("abc@gmail.com");
		professor.setFirstName("Julio");
		professor.setLastName("Rivero");
		professor.setGender(GenderEnum.MASCULINO.getValor());
		professor.setHireType(HireTypeEnum.COMPLETO.getValor());
		professor.setStatus(StatusEnum.ACTIVO.getValor());
		professor.setUserCreated("amalaver");
		professorRepository.save(professor);
		
		log.info("Nuevo Profesor:::" + professor.getIdProfessor());
		
		Student student = new Student();
		student.setBirthDate(new Date());
		student.setDateCreated(new Date());
		student.setEmailAddress("almalaver@gmail.com");
		student.setFirstName("Aldo");
		student.setLastName("Malaver");
		student.setGender(GenderEnum.MASCULINO.getValor());
		student.setStatus(StatusEnum.ACTIVO.getValor());
		student.setUserCreated("amalaver");
		
		studentRepository.save(student);
		
		log.info("Nuevo estudiante:::" + student.getIdStudent());
	}
}
