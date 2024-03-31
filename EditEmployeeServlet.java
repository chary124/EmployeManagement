package test;

import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditEmployeeServlet extends HttpServlet{
@Override
//Venkatesh Maipathii
 protected void doGet(HttpServletRequest req,HttpServletResponse res)throws
ServletException,
 IOException{
 HttpSession hs = req.getSession(false);
 if(hs==null) {
 req.setAttribute("msg", "Session Expired...<br>");
 req.getRequestDispatcher("Msg.jsp").forward(req, res);
 }else {
 String eId = req.getParameter("eid");
 ArrayList<EmployeeBean> al =
(ArrayList<EmployeeBean>)hs.getAttribute("alist");
 Iterator<EmployeeBean> it = al.iterator();
 while(it.hasNext()) {
 EmployeeBean eb = (EmployeeBean)it.next();
 if(eId.equals(eb.geteId())) {
 req.setAttribute("ebean", eb);
 break;
 }
 }//end of loop
 req.getRequestDispatcher("EditEmployee.jsp").forward(req, res);
 }//end of else
 }
}
