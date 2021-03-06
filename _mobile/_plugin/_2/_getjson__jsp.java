/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin._2;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import net.sf.json.*;
import java.util.*;
import weaver.general.*;
import weaver.file.*;
import weaver.hrm.*;
import org.apache.commons.lang.*;

public class _getjson__jsp extends com.caucho.jsp.JavaPage
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
      weaver.mobile.plugin.ecology.service.DocumentService documentService;
      documentService = (weaver.mobile.plugin.ecology.service.DocumentService) pageContext.getAttribute("documentService");
      if (documentService == null) {
        documentService = new weaver.mobile.plugin.ecology.service.DocumentService();
        pageContext.setAttribute("documentService", documentService);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      
out.clearBuffer();
User user = HrmUserVarify.getUser (request , response) ;
if(user==null) {
	Map<String, Object> result = new HashMap<String, Object>();
	//\u672a\u767b\u5f55\u6216\u767b\u5f55\u8d85\u65f6
	result.put("error", "200001");
	
	JSONObject jo = JSONObject.fromObject(result);
	out.println(jo);
	
	return;
}

response.setContentType("application/json;charset=UTF-8");

FileUpload fu = new FileUpload(request);

int module = Util.getIntValue(fu.getParameter("module"));
int scope = Util.getIntValue(fu.getParameter("scope"));
int pageindex = Util.getIntValue(fu.getParameter("pageindex"), 1);
int pagesize = Util.getIntValue(fu.getParameter("pagesize"), 10);

String func = fu.getParameter("func");

int columnid = Util.getIntValue(fu.getParameter("columnid"));

String docsubject = fu.getParameter("docsubject");
int createrid = Util.getIntValue(fu.getParameter("createrid"));
int createrdept = Util.getIntValue(fu.getParameter("createrdept"));
int ownerid = Util.getIntValue(fu.getParameter("ownerid"));
int ownerdept = Util.getIntValue(fu.getParameter("ownerdept"));
int createdate = Util.getIntValue(fu.getParameter("createdate"));
String startdate = fu.getParameter("startdate");
String enddate = fu.getParameter("enddate");
int seccategory = Util.getIntValue(fu.getParameter("seccategory"));

Map<String, Object> result = new HashMap<String, Object>();

if("getcolumn".equals(func)) {
	result = documentService.getColumnList(scope);
} else if("search".equals(func)) {
	List<String> conditions = new ArrayList<String>();
	if(StringUtils.isNotBlank(docsubject)) conditions.add("t1.docsubject like '%"+docsubject+"%'");
	if(createrid > 0) conditions.add("t1.doccreaterid="+createrid);
	if(createrdept > 0) conditions.add("t1.doccreaterid in (select id from HrmResource where departmentid="+createrdept+")");
	if(ownerid > 0) conditions.add("t1.ownerid="+ownerid);
	if(ownerdept > 0) conditions.add("t1.docdepartmentid="+ownerdept);
	if(seccategory > 0) conditions.add("t1.seccategory="+seccategory);
	
	if(createdate >= 1 && createdate <= 6) {
		if(createdate == 1) {//\u4eca\u5929
			startdate = TimeUtil.getCurrentDateString();
			enddate = TimeUtil.getCurrentDateString();
		} else if(createdate == 2) {//\u672c\u5468
			startdate = TimeUtil.getFirstDayOfWeek();
			enddate = StringUtils.substring(TimeUtil.getLastDayOfWeek(), 0, 10);
		} else if(createdate == 3) {//\u672c\u6708
			startdate = TimeUtil.getFirstDayOfMonth();
			enddate = StringUtils.substring(TimeUtil.getLastDayOfMonth(), 0, 10);
		} else if(createdate == 4) {//\u672c\u5b63
			startdate = TimeUtil.getFirstDayOfSeason();
			enddate = StringUtils.substring(TimeUtil.getLastDayDayOfSeason(), 0, 10);
		} else if(createdate == 5) {//\u672c\u5e74
			startdate = TimeUtil.getFirstDayOfTheYear();
			enddate = StringUtils.substring(TimeUtil.getLastDayOfYear(), 0, 10);
		} else if(createdate == 6) {//\u6307\u5b9a\u8303\u56f4
			try {
				if(StringUtils.isNotBlank(startdate)) startdate = TimeUtil.SetDateFormat(startdate, "yyyy-MM-dd");
			} catch(Exception e) {
				startdate = "";
			}
			try {
				if(StringUtils.isNotBlank(enddate)) enddate = TimeUtil.SetDateFormat(enddate, "yyyy-MM-dd");
			} catch(Exception e) {
				enddate = "";
			}
		}
		
		if(StringUtils.isNotBlank(startdate)) conditions.add("t1.doccreatedate >= '"+startdate+"'");
		if(StringUtils.isNotBlank(enddate)) conditions.add("t1.doccreatedate <= '"+enddate+"'");
	}
	
	result = documentService.getDocumentList2(3, user, pageindex, pagesize, 0, conditions);
} else if("favorite".equals(func)) {
	List<String> conditions = new ArrayList<String>();
	conditions.add("exists(select 1 from SysFavourite where favouriteObjId=t1.id and favouritetype=1 and Resourceid="+user.getUID()+")");
	if(StringUtils.isNotBlank(docsubject)) conditions.add("t1.docsubject like '%"+docsubject+"%'");
	result = documentService.getDocumentList2(3, user, pageindex, pagesize, 0, conditions);
} else if("gethome".equals(func) || module == 2) {//\u9ed8\u8ba4\u641c\u7d22\uff0c\u653e\u5728\u6700\u540e
	List<String> conditions = new ArrayList<String>();
	if(StringUtils.isNotBlank(docsubject)) conditions.add("t1.docsubject like '%"+docsubject+"%'");
	result = documentService.getDocumentList2(module, user, pageindex, pagesize, columnid, conditions);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/2/getjson.jsp"), 2519767705647286356L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string1;
  private final static char []_jsp_string0;
  static {
    _jsp_string1 = "\r\n".toCharArray();
    _jsp_string0 = "\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
  }
}
