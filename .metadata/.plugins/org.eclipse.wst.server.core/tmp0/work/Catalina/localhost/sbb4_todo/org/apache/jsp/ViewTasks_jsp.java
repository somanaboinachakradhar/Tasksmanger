/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.93
 * Generated at: 2025-03-03 09:36:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.Task;
import java.util.List;

public final class ViewTasks_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("beans.Task");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!-- ViewTasks.jsp -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Display Tasks</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<p align=\"right\">\r\n");
      out.write("		");

		Object obj = session.getAttribute("regId");
		Integer in = (Integer) obj;
		int regId = in.intValue();

		dao.ToDoDAO dao1 = dao.ToDoDAOImpl.getInstance();
		String flname = dao1.getFLNameByRegID(regId);
		
      out.write("\r\n");
      out.write("		Welcome\r\n");
      out.write("		");
      out.print(flname);
      out.write(", <a href=\"./LogoutServlet\">Logout</a>\r\n");
      out.write("	</p>\r\n");
      out.write("\r\n");
      out.write("	<form method=\"post\" action=\"./AddTaskServlet\">\r\n");
      out.write("		<table border=\"1\" align=\"center\" width=\"20%\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>Task Name</th>\r\n");
      out.write("				<td><input type=\"text\" name=\"taskName\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>Task Date</th>\r\n");
      out.write("				<td><input type=\"date\" name=\"taskDate\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>Task Status</th>\r\n");
      out.write("				<td><select name=\"taskStatus\" size=\"1\">\r\n");
      out.write("						<option value=\"1\">Not Yet Started</option>\r\n");
      out.write("						<option value=\"2\">In Progress</option>\r\n");
      out.write("						<option value=\"3\">Completed</option>\r\n");
      out.write("				</select></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th><input type=\"submit\" name=\"submit\" value=\"Add Task\"></th>\r\n");
      out.write("				<td><input type=\"reset\" name=\"reset\" value=\"Clear\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("	</form>\r\n");
      out.write("\r\n");
      out.write("	<hr />\r\n");
      out.write("\r\n");
      out.write("	");

	List<Task> tasks = dao1.findTasksByRegId(regId);
	
      out.write("\r\n");
      out.write("	<table border=\"1\" width=\"50%\" align=\"center\">\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>Task ID</th>\r\n");
      out.write("			<th>Task Name</th>\r\n");
      out.write("			<th>Task Date</th>\r\n");
      out.write("			<th>Task Status</th>\r\n");
      out.write("			<th></th>\r\n");
      out.write("		</tr>\r\n");
      out.write("		");

		for (Task task : tasks) {
			int taskId = task.getTaskId();
			String taskName = task.getTaskName();
			String taskDate = task.getTaskDate();
			int taskStatus = task.getTaskStatus();
		
      out.write("\r\n");
      out.write("		");

		if (taskStatus == 3) {
		
      out.write("\r\n");
      out.write("		<tr style=\"text-decoration: line-through;\">\r\n");
      out.write("			<td>");
      out.print(taskId);
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(taskName);
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(taskDate);
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(taskStatus);
      out.write("</td>\r\n");
      out.write("			<td>Completed</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		");

		} else {
		
      out.write("\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>");
      out.print(taskId);
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(taskName);
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(taskDate);
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(taskStatus);
      out.write("</td>\r\n");
      out.write("			<td><a\r\n");
      out.write("				href=\"./MarkTaskCompletedServlet?regId=");
      out.print(regId);
      out.write("&taskId=");
      out.print(taskId);
      out.write("\">Complete</a></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		");

		}
		
      out.write("\r\n");
      out.write("		");

		}
		
      out.write("\r\n");
      out.write("	</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
