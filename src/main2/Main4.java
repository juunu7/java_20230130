package main2;

import java.util.Date;

import cls.Course;
import cls.Professor;
import cls.Register;
import cls.Student;

public class Main4 {

   public static void main(String[] args) {
      // 1. �л����
      
      Student student = new Student(100, "a", 1, new Date());
        
      // 2. �������
      Professor professor = new Professor(1, "a", "603", new Date());
   
      
      // 3. ������
      Course course = new Course();
      course.setCode(4000);
      course.setCredit(3);
      course.setName("java ����");
      course.setDate( new Date());
      course.setProfessor(professor);
      
      // 4. ������û(1����)
      Register register = new Register();
      register.setCode(3333);
      register.setCourse(null);
      
      // 5. ������û ���� ���(1����)
      
   }

}