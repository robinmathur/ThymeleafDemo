package com.rob.controller;

import com.rob.constants.EmpType;
import com.rob.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by robinmathur on 03/08/16.
 */
@Controller
public class EmployeeController {

    private  static final Logger log = LoggerFactory.getLogger(EmployeeController.class);

    @RequestMapping("/addEmployee")
    public String addEmployee(@ModelAttribute Employee employee, ModelMap model){
        log.info("Employee Added-");
        log.info(""+employee);
        model.addAttribute(employee);
        return "employee";
    }

    @RequestMapping("/getEmployee")
    public String getEmployee(ModelMap model){
        log.info("Employee Get");
        Employee employee = new Employee();
        employee.setEmpId(77);
        employee.setEmpName("Gaurav Singh");
        employee.setEmpDOB(new Date());
        employee.setEmpType(EmpType.HOD);
        employee.setActive(true);
        model.addAttribute(employee);
        log.info(""+employee);
        return "employee";
    }

    @RequestMapping("/newEmployee")
    public String newEmployee(ModelMap model){
        log.info("Employee New");
        Employee employee = new Employee();
        employee.setActive(true);
        model.addAttribute(employee);
        log.info(""+employee);
        return "employee-new";
    }


}
