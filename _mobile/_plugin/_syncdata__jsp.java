/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import net.sf.json.*;
import java.util.*;
import weaver.general.*;
import weaver.hrm.*;
import weaver.file.*;

public class _syncdata__jsp extends com.caucho.jsp.JavaPage
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
    response.setContentType("application/json;charset=UTF-8");
    request.setCharacterEncoding("UTF-8");
    try {
      out.write(_jsp_string0, 0, _jsp_string0.length);
      weaver.mobile.plugin.ecology.service.HrmResourceService hrs;
      hrs = (weaver.mobile.plugin.ecology.service.HrmResourceService) pageContext.getAttribute("hrs");
      if (hrs == null) {
        hrs = new weaver.mobile.plugin.ecology.service.HrmResourceService();
        pageContext.setAttribute("hrs", hrs);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.mobile.plugin.ecology.service.PluginServiceImpl ps;
      ps = (weaver.mobile.plugin.ecology.service.PluginServiceImpl) pageContext.getAttribute("ps");
      if (ps == null) {
        ps = new weaver.mobile.plugin.ecology.service.PluginServiceImpl();
        pageContext.setAttribute("ps", ps);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      
	out.clearBuffer();

	User user = HrmUserVarify.getUser (request , response) ;
	if(user==null) {
		Map result = new HashMap();
		//\u672a\u767b\u5f55\u6216\u767b\u5f55\u8d85\u65f6
		result.put("error", "005");
		
		JSONObject jo = JSONObject.fromObject(result);
		out.println(jo);
		
		return;
	}

	FileUpload fu = new FileUpload(request); 
	String type = Util.null2String(fu.getParameter("type"));
	
	Map result = new HashMap();
	
	if("HrmResource".equalsIgnoreCase(type)) {
		result = hrs.getAllUser(user);
	} else if("HrmDepartment".equalsIgnoreCase(type)) {
		result = hrs.getAllDepartment(user);
	} else if("HrmSubCompany".equalsIgnoreCase(type)) {
		result = hrs.getAllSubCompany(user);
	} else if("HrmCompany".equalsIgnoreCase(type)) {
		result = hrs.getAllCompany(user);
	} else if("HrmGroup".equalsIgnoreCase(type)) {
		result = hrs.getUserGroups(user);
	} else if("HrmGroupMember".equalsIgnoreCase(type)) {
		result = hrs.getGroupMember(user);
	} else if("WorkPlanType".equalsIgnoreCase(type)) {
		result = hrs.getWorkPlanType(user);
	} else if("WorkFlowType".equalsIgnoreCase(type)) {
		result = hrs.getWorkFlowType(user);
	} else if("getBlackWorkFlow".equalsIgnoreCase(type)) {
		result = hrs.getBlackWorkFlow(user);
	} else if("setBlackWorkFlow".equalsIgnoreCase(type)) {
		String workflows = fu.getParameter("workflow");
		result = hrs.setBlackWorkFlow(user, workflows);
	} else if("getHideModule".equalsIgnoreCase(type)) {
		result = hrs.getHideModule(user);
	} else if("setHideModule".equalsIgnoreCase(type)) {
		String hidemodule = fu.getParameter("hidemodule");
		result = hrs.setHideModule(user, hidemodule);
	} else if("getHrmSubCompanyTree".equalsIgnoreCase(type)) {
		result = hrs.getHrmSubCompanyTree(user);
	} else if("setAvatar".equalsIgnoreCase(type)) {
		result = hrs.setUserAvatar(fu,user);
	} else {
		String[] tablenames = fu.getParameters("tablename");
		String[] timestamps = fu.getParameters("timestamp");
		result = hrs.getTableStatus(tablenames, timestamps);
	}
	
	if(result!=null) {
		JSONObject jro = JSONObject.fromObject(result);
		out.println(jro);
	}

      out.write(_jsp_string1, 0, _jsp_string1.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/syncData.jsp"), 3267574753190650454L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string0;
  private final static char []_jsp_string1;
  static {
    _jsp_string0 = "\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string1 = "\r\n".toCharArray();
  }
}
