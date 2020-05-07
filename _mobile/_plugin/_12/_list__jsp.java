/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin._12;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import java.net.*;
import net.sf.json.*;
import java.util.*;
import org.apache.commons.lang.*;
import weaver.general.*;
import weaver.hrm.*;
import weaver.file.*;
import weaver.mobile.plugin.ecology.service.EMessageService;

public class _list__jsp extends com.caucho.jsp.JavaPage
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
    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    request.setCharacterEncoding("UTF-8");
    try {
      out.write(_jsp_string0, 0, _jsp_string0.length);
      
out.clearBuffer();
User user = HrmUserVarify.getUser (request , response) ;
if(user==null) {
	Map result = new HashMap();
	//\u672a\u767b\u5f55\u6216\u767b\u5f55\u8d85\u65f6
	result.put("error", "200001");
	
	JSONObject jo = JSONObject.fromObject(result);
	out.println(jo);
	
	return;
}

response.setContentType("application/json;charset=UTF-8");

FileUpload fu = new FileUpload(request);

String module = Util.null2String(fu.getParameter("module"));
String scope = Util.null2String(fu.getParameter("scope"));
String detailid = Util.null2String(fu.getParameter("detailid"));
String pageindex = Util.null2String(fu.getParameter("pageindex"));
String pagesize = Util.null2String(fu.getParameter("pagesize"));

String keywordurl = Util.null2String(fu.getParameter("keyword"));
String keyword = URLDecoder.decode(keywordurl, "UTF-8");

String sessionkey = Util.null2String(fu.getParameter("sessionkey"));
String setting = Util.null2String(fu.getParameter("setting"));
String mconfig = Util.null2String(fu.getParameter("config"));

int hrmorder = Util.getIntValue(fu.getParameter("_hrmorder_"), 0);

//\u56e0\u5ba2\u6237\u7aef\u4f7f\u7528GBK\u7f16\u7801\uff0c\u6545\u9700\u8981\u8f6c\u7801\u3002
//keyword = new String(keyword.getBytes("iso8859-1"), "GBK");

List conditions = new ArrayList();
	
Map result = new HashMap();

if(module.equals("12")) {
	if(StringUtils.isNotEmpty(keyword)) {
		conditions.add(" (loginid like '%"+keyword+"%' or lastname like '%"+keyword+"%' or pinyinlastname like '%"+keyword+"%' or workcode like '%"+keyword+"%') ");
	}
	
	if(StringUtils.isNotEmpty(detailid)) {
		conditions.add(" (id = "+detailid+") ");
	}

	result = EMessageService.getInstance().getMessageUsers(conditions, Util.getIntValue(pageindex), Util.getIntValue(pagesize), hrmorder, user);
}

JSONObject jo = JSONObject.fromObject(result);
out.println(jo);


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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/12/list.jsp"), 1349340378652942117L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string0;
  static {
    _jsp_string0 = "\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
  }
}
