package net.basicSpingApp.gipost;

import net.basicSpingApp.gipost.repository.GroupRepository;
import net.basicSpingApp.gipost.repository.StudentRepository;
import net.basicSpingApp.gipost.service.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class mainApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private GroupRepository groupRepository;


	public void run(String... args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("daos.xml");
		StudentDAO studentDAO = context.getBean("studentDAO", StudentDAO.class);
		Group group1 = new Group("IST-119");
		Student student1 = new Student("Bogdan", "Vasilenko", "Dest123@mail.ru", group1);
		studentDAO.create(student1);
		Student student2 = new Student("Alexnadr", "Ratnikov", "sanjay@gmail.com", group1);
		studentDAO.create(student2);
		List<Student> students = studentDAO.getAll();
		for(Student student: students){
			System.out.println("Студент : " + student.getFirstName() + " " + student.getLastName());
			System.out.println("Группа : " + student.getGroup().getName() + " Почта :" + student.getEmail());;
		}
	}


