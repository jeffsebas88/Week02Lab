/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 643507
 */
public class AgeCalculatorServlet extends HttpServlet {

  
 
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {     
      getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").
                forward(request, response);
    }
    
    @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          String ages = request.getParameter("age");
       
        if(ages == null || ages.isEmpty()){
            
            //Sets error message for request back to index.jsp
          
            request.setAttribute("errormessage", "You Must Give Your Current Age.");
            
            //populate the JSP value with the age
            request.setAttribute("realAge", ages);
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").
                forward(request, response);
    return;
        }
        int realAges = Integer.parseInt(ages)+ 1;
        request.setAttribute("sentence", "This is how old you will be next Year: "+realAges);
       
     getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").
                forward(request, response);
    }
    
    }


