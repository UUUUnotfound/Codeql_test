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
import weaver.file.*;
import weaver.hrm.*;

public class _syncuser__jsp extends com.caucho.jsp.JavaPage
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
      weaver.mobile.plugin.ecology.service.PluginServiceImpl ps;
      ps = (weaver.mobile.plugin.ecology.service.PluginServiceImpl) pageContext.getAttribute("ps");
      if (ps == null) {
        ps = new weaver.mobile.plugin.ecology.service.PluginServiceImpl();
        pageContext.setAttribute("ps", ps);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      
response.setContentType("application/json;charset=UTF-8");

FileUpload fu = new FileUpload(request);

boolean reload=Boolean.valueOf(Util.null2String(fu.getParameter("reload")));

List auths = new ArrayList();

String auth = Util.null2String(fu.getParameter("auth"));
JSONObject jo = JSONObject.fromObject(auth);
if(jo.containsKey("auths")) {
	
	JSONArray ja = jo.getJSONArray("auths");

	for(int i=0;ja!=null&&i<ja.size();i++) {
		
		JSONObject jao = ja.getJSONObject(i);
		
		Map map = new HashMap();
		
		String id="";
		if(jao.containsKey("id"))
			id = jao.getString("id");
		
		String type="";
		if(jao.containsKey("type"))
			type = jao.getString("type");
		
		String typename="";
		if(jao.containsKey("typename"))
			typename = jao.getString("typename");
		
		String seclevel="";
		if(jao.containsKey("seclevel"))
			seclevel = jao.getString("seclevel");

		String value="";
		if(jao.containsKey("value"))
			value = jao.getString("value");

		String valuename="";
		if(jao.containsKey("valuename"))
			valuename = jao.getString("valuename");

		String groupid="";
		if(jao.containsKey("groupid"))
			groupid = jao.getString("groupid");

		map.put("id", id);
		map.put("type", type);
		map.put("typename", typename);
		map.put("seclevel", seclevel);
		map.put("value", value);
		map.put("valuename", valuename);
		map.put("groupid", groupid);
		
		auths.add(map);
	}
}

Map result=new HashMap();

auths=ps.syncUserAuth(auths);

result.put("auths",auths);

JSONObject jsObject = JSONObject.fromObject(result);
out.println(jsObject);

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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/SyncUser.jsp"), 2625696052546872686L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string0;
  private final static char []_jsp_string1;
  static {
    _jsp_string0 = "\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string1 = "\r\n".toCharArray();
  }
}
