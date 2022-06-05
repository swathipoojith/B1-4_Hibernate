package client;
import entities.Student;
import service.StudentService;
import service.StudentServiceImpl;

public class Client {



	public static void main(String[] args) {
		StudentService service=new StudentServiceImpl();
		Student student=new Student();
		
		student=service.findStudentById(21);
		service.removeStudent(student);
	}
}