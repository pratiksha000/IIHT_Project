package com.pratiksha.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pratiksha.spring.models.Admin;
import com.pratiksha.spring.models.Course;
import com.pratiksha.spring.models.Enrollment;
import com.pratiksha.spring.models.Student;
import com.pratiksha.spring.repos.AdminRepo;
import com.pratiksha.spring.repos.CourseRepo;
import com.pratiksha.spring.repos.EnrollmentRepo;
import com.pratiksha.spring.repos.StudentRepo;


@Controller
public class MyController {

	@Autowired
	StudentRepo studentrepo;
	
	@Autowired
	AdminRepo adminrepo;
	
	
	@Autowired
	CourseRepo courserepo;
	  
	@Autowired
	EnrollmentRepo enrollmentrepo;
	
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
  
	@ResponseBody
	  @RequestMapping("/studentlogin")
	    public String loginStudent(Student student) {
		  System.out.println("Inside student login");
	        List<Student> students = studentrepo.findAll();
	        for (Student other : students) {
	            if (other.equals(student)) {
	            	System.out.println("Successful login!");
	            	List<Course> courses= courserepo.findAll();
	    		 String code=
	    				"<center><H1>Listing All Courses</H1><br><br><br><table border=\"3\" cellpadding=\"3\" cellspacing=\"3\"><tr><td>Course Id</td><td>Course Name</td><td>Course Description</td><td>Action</td></tr>";
	    		   for (Course ad : courses) {
	    			   System.out.println(other.getId()+" "+ad.getId());
	    		  code+="<tr><td>"+Integer.toString(ad.getId())+"</td><td>"+ad.getName()+
	    		  "</td><td>"+ad.getDescription()+"</td><td><a href ='"+EnrollStudent(other.getId(),ad.getId())+"'>Enroll</a></td></tr>"; 
	    		  } 
	    		   code+="</table></center>";
	    		   return code;
	    		   
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
	    public String getCourseList() {
		  System.out.println("Inside AdminPortal");
		  List<Course> courses= courserepo.findAll();

	        for(int i=0;i<courses.size();i++)
	        {
	        	System.out.println(courses.get(i));
	        }
		 String code=
				"<center><H1>Listing All Courses</H1><br><br><br><table border=\"3\" cellpadding=\"3\" cellspacing=\"3\"><tr><td>Course Id</td><td>Course Name</td><td>Course Description</td></tr>";
		   for (Course ad : courses) {
		  code+="<tr><td>"+Integer.toString(ad.getId())+"</td><td>"+ad.getName()+
		  "</td><td>"+ad.getDescription()+"</td></tr>"; 
		  } 
		   code+="</table></center>"; 
		   
		 
		  return code;
		
	       	
	    }
	  
	    @Transactional
		@RequestMapping("/addCourse")
		public ModelAndView addCourse(Course course) {
	
			courserepo.save(course);

			return new ModelAndView("redirect:/AdminPortal");
			
		}
	    
	//Deleting  course by taking id from url   
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value="/deleteCourse/{id}", method=RequestMethod.GET) public
	 * ModelAndView deleteCourse(@PathVariable("id")int id) {
	 * 
	 * courserepo.deleteById(id);
	 * 
	 * return new ModelAndView("redirect:/AdminPortal");
	 * 
	 * }
	 */
	   
	 //2nd method to delete course
	    @RequestMapping("/deleteCourse")
		public ModelAndView deleteCourse(int id) {
	
			courserepo.deleteById(id);

			return new ModelAndView("redirect:/AdminPortal");
			
		}
	  
	/*
	 * @RequestMapping(value="/updateCourse/{id}", method=RequestMethod.GET) public
	 * ModelAndView updateCourse(@PathVariable("id")int id) {
	 * System.out.println("Inside updatecourse"); ModelAndView model=new
	 * ModelAndView("CourseForm.jsp"); Optional<Course>
	 * course=courserepo.findById(id); model.addObject("courseform",course); return
	 * model;}
	 */
	    	
	   // @RequestMapping("/EnrollStudent/{student_id}/{course_id}")
		//public String EnrollStudent(@PathVariable("student_id") int student_id,@PathVariable("course_id")int course_id )
	    public String EnrollStudent( int student_id,int course_id ){
	    	Enrollment enrollment =new Enrollment();
	    	enrollment.setStudent_id(student_id);
	    	enrollment.setCourse_id(course_id);
			enrollmentrepo.save(enrollment);
			System.out.println("Successfully enrolled");
			return "CourseEnroll.jsp";
			
		}  
			
			
		
	 
}
