package main2;

import java.util.Date;

import cls.Course;
import cls.CourseList;
import cls.Professor;

public class Main3 {

   public static void main(String[] args) {
      
      // 1. ���� ����
      Professor professor = new Professor(3000, "��", "303ȣ", new Date());
      
      // 2. ���� ����
      Course course = new Course();
      course.setCode(4000);
      course.setCredit(3);
      course.setName("java ����");
      course.setDate( new Date());
      course.setProfessor(professor);
      
      // 3. ���� ���
      CourseList courseList = new CourseList();
      courseList.insertCourse(course);
      
      // 4. ���� ��ȸ
      courseList.printCourse();
      
      // 5. ����� ������ ���������� ��ȸ(���)
   }

}