/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin._1;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import weaver.file.FileUpload;
import weaver.systeminfo.SystemEnv;
import org.json.JSONObject;
import weaver.hrm.User;
import weaver.hrm.HrmUserVarify;
import weaver.general.*;
import weaver.conn.*;
import java.util.*;

public class _fnaifoverjsonmobileajax__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    javax.servlet.ServletContext application = _jsp_application;
    com.caucho.jsp.PageContextImpl pageContext = _jsp_application.getJspApplicationContext().allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);
    javax.servlet.jsp.PageContext _jsp_parentContext = pageContext;
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    response.setContentType("text/html; charset=UTF-8");
    request.setCharacterEncoding("UTF-8");
    try {
      out.write(_jsp_string0, 0, _jsp_string0.length);
      weaver.conn.RecordSet rs;
      rs = (weaver.conn.RecordSet) pageContext.getAttribute("rs");
      if (rs == null) {
        rs = new weaver.conn.RecordSet();
        pageContext.setAttribute("rs", rs);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      
User user = HrmUserVarify.getUser (request , response) ;
if(user==null){
	response.sendRedirect("/notice/noright.jsp") ;
	return ;
}

String poststr  = request.getParameter("poststr");//\u79d1\u76ee+\u62a5\u9500\u7c7b\u578b+\u62a5\u9500\u5355\u4f4d+\u62a5\u9500\u65e5\u671f+\u5b9e\u62a5\u91d1\u989d
int requestid  = Util.getIntValue(request.getParameter("requestid"),0);//\u6d41\u7a0bid
int workflowid  = Util.getIntValue(request.getParameter("workflowid"),0);//\u6d41\u7a0bid

if("".equals(poststr) && requestid <= 0 && workflowid <= 0){
    FileUpload fu = new FileUpload(request,false);
    poststr = Util.null2String(fu.getParameter("poststr"));
    requestid = Util.getIntValue(fu.getParameter("requestid"), 0);
    workflowid = Util.getIntValue(fu.getParameter("workflowid"), 0);
}

//\u7531\u4e8e\u624b\u673a\u7248\u505a\u4e86\u7279\u6b8a\u5904\u7406\uff0c\u4e0d\u80fd\u4f7f\u7528|\u7b49\u5b57\u7b26\u4f20\u53c2\uff0c\u6545\u4f7f\u7528\u4e86,s,\u66ff\u6362\u4e86|\u8fdb\u884c\u4f20\u53c2\uff0c\u6b64\u5904\u9700\u8981\u5c06,s,\u66ff\u6362\u6210|\u4ee5\u4fbf\u540e\u7eed\u4e1a\u52a1\u903b\u8f91\u8bc6\u522b
poststr = poststr.replaceAll(",s,", "|");


      pageContext.include("/fna/budget/FnaifoverJsonAjax.jsp", "poststr=" + com.caucho.el.Expr.toString(poststr, null)+ "&" + "requestid=" + com.caucho.el.Expr.toString(requestid, null)+ "&" + "workflowid=" + com.caucho.el.Expr.toString(workflowid, null)+ "&" + "isMobile=" + ("1"), true);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      _jsp_application.getJspApplicationContext().freePageContext(pageContext);
    }
  }

  private java.util.ArrayList _caucho_depends = new java.util.ArrayList();

  public java.util.ArrayList _caucho_getDependList()
  {
    return _caucho_depends;
  }

  public void _caucho_addDepend(com.caucho.vfs.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;
    if (com.caucho.server.util.CauchoSystem.getVersionId() != 1886798272571451039L)
      return true;
    for (int i = _caucho_depends.size() - 1; i >= 0; i--) {
      com.caucho.vfs.Dependency depend;
      depend = (com.caucho.vfs.Dependency) _caucho_depends.get(i);
      if (depend.isModified())
        return true;
    }
    return false;
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public java.util.HashMap<String,java.lang.reflect.Method> _caucho_getFunctionMap()
  {
    return _jsp_functionMap;
  }

  public void init(ServletConfig config)
    throws ServletException
  {
    com.caucho.server.webapp.WebApp webApp
      = (com.caucho.server.webapp.WebApp) config.getServletContext();
    super.init(config);
    com.caucho.jsp.TaglibManager manager = webApp.getJspApplicationContext().getTaglibManager();
    com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.PageContextImpl(webApp, this);
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.server.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/1/FnaifoverJsonMobileAjax.jsp"), -5893501388421205221L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string0;
  private final static char []_jsp_string1;
  static {
    _jsp_string0 = "\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string1 = "\r\n".toCharArray();
  }
}
