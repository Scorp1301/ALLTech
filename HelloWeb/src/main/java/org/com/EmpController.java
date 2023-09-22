package org.com;

import org.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/empform")
public class EmpController {
	@RequestMapping(method = RequestMethod.GET)
	public String goEmpForm() {
		return "emp_form";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView goEmpForm(@RequestParam("id") int id, @RequestParam("name") String name ) {
		ModelAndView view = new ModelAndView("welcome");
		Employee employee = new Employee();
		
		employee.setId(id);
		employee.setName(name);
		
		view.addObject("employee", employee);
		
		return view;
		
	}
	

}
