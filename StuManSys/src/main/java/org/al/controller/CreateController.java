package org.al.controller;

import org.al.dao.StudentDao;
import org.al.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class CreateController {
	private StudentDao studentDao;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView createStudent(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("course") String course, ModelAndView mv){
		Student student = new Student();
		student.setId(id);
		student.setName(name);
		student.setEmail(email);
		student.setCourse(course);
		
		int counter = studentDao.create(student);
		
		if(counter > 0) {
			mv.addObject("msg", "Student is registered");
		}else {
			mv.addObject("msg", "Error");
		}
		
		mv.setViewName("create");
		
		return mv;
		
	}

}
