package com.pratiksha.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pratiksha.spring.models.Admin;
import com.pratiksha.spring.models.Course;
import com.pratiksha.spring.models.Student;
import com.pratiksha.spring.repos.AdminRepo;
import com.pratiksha.spring.repos.CourseRepo;
import com.pratiksha.spring.repos.StudentRepo;


@Controller
public class MyController {

	@Autowired
	StudentRepo studentrepo;
	
	@Autowired
	AdminRepo adminrepo;
	
	
	@Autowired
	CourseRepo courserepo;
	  
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	//@Query(value = "insert into student (name) VALUES (:name)")
    @Transactional
	@RequestMapping("/addStudent")
	public String addStudent(Student student) {
	
		studentrepo.save(student);
		return "Student_login.jsp";
	}
  
		
	  @RequestMapping("/studentlogin")
	    public String loginStudent(Student student) {
		  System.out.println("Inside student login");
	        List<Student> students = studentrepo.findAll();
	        for (Student other : students) {
	            if (other.equals(student)) {
	            	System.out.println("Successful login!");
	            	return "successlogin.jsp";
	            }
	        }
	        //return State.FAILURE;
			return "Student_login.jsp";
	    }
	  
	  @RequestMapping("/Adminlogin")
	    public String loginAdmin(Admin admin) {
		  System.out.println("Inside student login");
	        List<Admin> admins = adminrepo.findAll();
	        for (Admin other : admins) {
	            if (other.equals(admin)) {
	            	System.out.println("Successful login!");
	            	return "successlogin.jsp";
	            }
	        }
			return "Student_login.jsp";
	    }
	  
	  @ResponseBody
	  @RequestMapping(value="/AdminPortal" ,method=RequestMethod.GET )
	    public ModelAndView getCourseList() {
		  System.out.println("Inside AdminPortal");
	        List<Course> courses = courserepo.findAll();
	        ModelAndView model = new ModelAndView("AdminPortal.jsp");
	       // courseListWrapper wrapper = new courseListWrapper();
	        //wrapper.setCourses(new ArrayList<Course>(courses));
	        //model.addObject("courseListWrapper",wrapper);
	        for(int i=0;i<courses.size();i++)
	        {
	        	System.out.println(courses.get(i));
	        }
	       
	        model.addObject("courses",courses);
	        return model;
			
	    }
	  
	    @Transactional
		@RequestMapping("/addCourse")
		public ModelAndView addCourse(Course course) {
		
			courserepo.save(course);

			return new ModelAndView("redirect:/AdminPortal");
			
		}
	  
	 
}
