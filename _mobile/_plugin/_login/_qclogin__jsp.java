/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin._login;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import java.util.*;

public class _qclogin__jsp extends com.caucho.jsp.JavaPage
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
    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");
    request.setCharacterEncoding("UTF-8");
    try {
      out.write(_jsp_string0, 0, _jsp_string0.length);
      
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write(_jsp_string1, 0, _jsp_string1.length);
      out.print((basePath));
      out.write(_jsp_string2, 0, _jsp_string2.length);
      out.print((session.getId() ));
      out.write(_jsp_string3, 0, _jsp_string3.length);
      out.print((session.getId() ));
      out.write(_jsp_string4, 0, _jsp_string4.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/login/QCLogin.jsp"), -4344308135441353619L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string4;
  private final static char []_jsp_string1;
  private final static char []_jsp_string3;
  private final static char []_jsp_string2;
  private final static char []_jsp_string0;
  static {
    _jsp_string4 = "</div>\r\n  			</td>\r\n  		</tr>\r\n  	</table>\r\n  </body>\r\n</html>\r\n".toCharArray();
    _jsp_string1 = "\r\n\r\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n<html>\r\n  <head>\r\n    <base href=\"".toCharArray();
    _jsp_string3 = "\");\r\n		}, 1000);\r\n	});\r\n	\r\n	\r\n	function getloginstatus(key) {\r\n		jQuery.ajax({\r\n            url: \"/QCLoginStatus.jsp?loginkey=\" + key + \"&rdm=\" + new Date().getTime(),\r\n            dataType: \"text\", \r\n            contentType : \"charset=UTF-8\", \r\n            error:function(ajaxrequest){}, \r\n            success:function(content){\r\n				window.console.log(jQuery.trim(content));\r\n				if (jQuery.trim(content) != '0') {\r\n					window.console.log(\"Successful user login!\");\r\n					window.clearInterval(loginInterval);\r\n					window.location.href = jQuery.trim(content);\r\n				}\r\n            }\r\n        });\r\n	}\r\n	\r\n	</script>\r\n  </head>\r\n  \r\n  <body>\r\n  	<table width=\"300px\" cellpadding=\"5\" cellspacing=\"0\" align=\"top\" style=\"border:1px solid #666666;\">\r\n  		<colgroup>\r\n  			<col width=\"30%\">\r\n  			<col width=\"*\">\r\n  		</colgroup>\r\n  		<tr>\r\n  			<td colspan=\"2\" align=\"center\">\r\n  				<h1>QC\u767b\u5f55</h1>\r\n  				\u8bf7\u626b\u63cf\u767b\u5f55\r\n  			</td>\r\n  		</tr>\r\n  		<tr>\r\n  			<td colspan=\"2\" align=\"center\">\r\n  				<div>".toCharArray();
    _jsp_string2 = "\">\r\n    \r\n    <title>My JSP 'QCLogin.jsp' starting page</title>\r\n    \r\n	<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n	<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n	<meta http-equiv=\"expires\" content=\"0\">    \r\n	<!--\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"styles_wev8.css\">\r\n	-->\r\n	<script type=\"text/javascript\" src=\"/express/js/jquery-1.8.3.min_wev8.js\"></script>\r\n	<style type=\"text/css\">\r\n	* {\r\n		font-family: '\u5fae\u8f6f\u96c5\u9ed1';\r\n	}\r\n	</style>\r\n	\r\n	<script type=\"text/javascript\">\r\n	var loginInterval = null;\r\n	$(function () {\r\n		loginInterval = window.setInterval(function () {\r\n			getloginstatus(\"".toCharArray();
    _jsp_string0 = "\r\n\r\n".toCharArray();
  }
}
