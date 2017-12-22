package com.rob.aspect;

import com.rob.constants.EmpType;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by robinmathur on 06/08/16.
 */
@ControllerAdvice
public class ContrAdvice {

    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        // true passed to CustomDateEditor constructor means convert empty String to null
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("dd-MM-yyyy"), true));
    }

    @ModelAttribute("empTypes")
    public List<EmpType> loadEmpType(){
        return Arrays.asList(EmpType.values());
    }
}
