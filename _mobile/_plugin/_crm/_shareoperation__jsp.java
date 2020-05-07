/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin._crm;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import weaver.file.FileUpload;
import java.util.*;
import weaver.hrm.*;
import weaver.systeminfo.*;
import weaver.general.StaticObj;
import weaver.general.Util;
import weaver.hrm.settings.RemindSettings;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.sql.Timestamp;

public class _shareoperation__jsp extends com.caucho.jsp.JavaPage
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
      
	
	response.setHeader("cache-control", "no-cache");
	response.setHeader("pragma", "no-cache");
	response.setHeader("expires", "Mon 1 Jan 1990 00:00:00 GMT");
	

	User user = HrmUserVarify.getUser (request , response) ;
	if(user == null)  return ;
	Log logger= LogFactory.getLog(this.getClass());
	String isIE = (String)session.getAttribute("browser_isie");

      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.conn.RecordSet RecordSet;
      RecordSet = (weaver.conn.RecordSet) pageContext.getAttribute("RecordSet");
      if (RecordSet == null) {
        RecordSet = new weaver.conn.RecordSet();
        pageContext.setAttribute("RecordSet", RecordSet);
      }
      out.write(_jsp_string2, 0, _jsp_string2.length);
      weaver.hrm.resource.ResourceComInfo ResourceComInfo;
      ResourceComInfo = (weaver.hrm.resource.ResourceComInfo) pageContext.getAttribute("ResourceComInfo");
      if (ResourceComInfo == null) {
        ResourceComInfo = new weaver.hrm.resource.ResourceComInfo();
        pageContext.setAttribute("ResourceComInfo", ResourceComInfo);
      }
      out.write(_jsp_string3, 0, _jsp_string3.length);
      weaver.crm.CrmViewer CrmViewer;
      CrmViewer = (weaver.crm.CrmViewer) pageContext.getAttribute("CrmViewer");
      if (CrmViewer == null) {
        CrmViewer = new weaver.crm.CrmViewer();
        pageContext.setAttribute("CrmViewer", CrmViewer);
      }
      out.write(_jsp_string4, 0, _jsp_string4.length);
      weaver.crm.CrmShareBase CrmShareBase;
      CrmShareBase = (weaver.crm.CrmShareBase) pageContext.getAttribute("CrmShareBase");
      if (CrmShareBase == null) {
        CrmShareBase = new weaver.crm.CrmShareBase();
        pageContext.setAttribute("CrmShareBase", CrmShareBase);
      }
      out.write(_jsp_string5, 0, _jsp_string5.length);
      
char flag = 2;
String ProcPara = "";
FileUpload fu=new FileUpload(request);
String id = Util.null2String(fu.getParameter("id"));
String method = Util.null2String(fu.getParameter("method"));
String CustomerID = Util.null2String(fu.getParameter("CustomerID")); 
String relatedshareid = Util.null2String(fu.getParameter("relatedshareid")); 
String sharetype = Util.null2String(fu.getParameter("sharetype")); 
String rolelevel = Util.null2String(fu.getParameter("rolelevel")); 
rolelevel="0";
String seclevel = Util.null2String(fu.getParameter("seclevel"));
String sharelevel = Util.null2String(fu.getParameter("sharelevel"));
String CurrentUser = ""+user.getUID();
String ClientIP = request.getRemoteAddr();
String SubmiterType = ""+user.getLogintype();

Date newdate = new Date() ;
long datetime = newdate.getTime() ;
Timestamp timestamp = new Timestamp(datetime) ;
String CurrentDate = (timestamp.toString()).substring(0,4) + "-" + (timestamp.toString()).substring(5,7) + "-" +(timestamp.toString()).substring(8,10);
String CurrentTime = (timestamp.toString()).substring(11,13) + ":" + (timestamp.toString()).substring(14,16) + ":" +(timestamp.toString()).substring(17,19);
boolean isfromtab =  Util.null2String(request.getParameter("isfromtab")).equals("true")?true:false;
String userid = "0" ;
String departmentid = "0" ;
String roleid = "0" ;
String foralluser = "0" ;

if(sharetype.equals("1")) userid = relatedshareid ;
if(sharetype.equals("2")) departmentid = relatedshareid ;
if(sharetype.equals("3")) roleid = relatedshareid ;
if(sharetype.equals("4")) foralluser = "1" ;

String module=Util.null2String((String)request.getParameter("module"));
String scope=Util.null2String((String)request.getParameter("scope"));

if(method.equals("delete"))
{
    String user_id = "";
	RecordSet.executeSql("select userid from CRM_ShareInfo where id = "+id);
    if(RecordSet.next()) user_id = RecordSet.getString(1);
	
	RecordSet.executeProc("CRM_ShareInfo_Delete",id);

	ProcPara = CustomerID;
	ProcPara += flag+"ds";
	ProcPara += flag+"0";
	ProcPara += flag+id;
	ProcPara += flag+CurrentDate;
	ProcPara += flag+CurrentTime;
	ProcPara += flag+CurrentUser;
	ProcPara += flag+SubmiterType;
	ProcPara += flag+ClientIP;
	RecordSet.executeProc("CRM_Log_Insert",ProcPara);   	
	
	CrmShareBase.resetContactShare(""+CustomerID);//\u91cd\u65b0\u8ba1\u7b97\u8be5\u5ba2\u6237\u7684\u5ba2\u6237\u8054\u7cfb\u7684\u5171\u4eab
}


if(method.equals("add"))
{
	
	String[] relatedshareids=relatedshareid.split(",");
	for(int i=0;i<relatedshareids.length;i++){
		
		if(relatedshareids[i].equals("")) continue;
		String sharevalue=relatedshareids[i];
		
	    if(sharetype.equals("4")) 
	    	sharevalue = "1" ;
	    
	    if(sharetype.equals("1")) userid = sharevalue ;
	    if(sharetype.equals("2")) departmentid = sharevalue ;
	    if(sharetype.equals("3")) roleid = sharevalue ;
	    if(sharetype.equals("4")) foralluser = "1" ;
	    
	    String sql="INSERT INTO CRM_ShareInfo ( relateditemid, sharetype, seclevel, rolelevel, sharelevel, userid, departmentid, roleid, foralluser,contents )"+ 
	    			"VALUES ("+CustomerID+" ,"+sharetype+" ,"+seclevel+" , "+rolelevel+" , "+sharelevel+", "+userid+", "+departmentid+", "+roleid+", "+foralluser+", "+sharevalue+")";
	    
		if(RecordSet.execute(sql)){
			String shareid = "";
			RecordSet.execute("select max(id) as id from CRM_ShareInfo where relateditemid="+CustomerID+"  and contents="+sharevalue);
			if(RecordSet.next()){
				shareid = RecordSet.getString("id");
			}
		
		if(sharetype.equals("3")){
		    String crm_manager = "";
		    RecordSet.executeSql("select manager from crm_customerinfo where id="+CustomerID);
		    if(RecordSet.next()) crm_manager = RecordSet.getString("manager");
		    int crm_manager_dept = Util.getIntValue(ResourceComInfo.getDepartmentID(crm_manager),-1);//\u90e8\u95e8id
		    int crm_manager_com = Util.getIntValue(ResourceComInfo.getSubCompanyID(crm_manager),-1);//\u5206\u90e8id
		    if(rolelevel.equals("0"))
		        RecordSet.executeSql("update CRM_ShareInfo set deptorcomid="+crm_manager_dept+" where relateditemid="+CustomerID+" and id="+shareid);
		    else if(rolelevel.equals("1"))
		        RecordSet.executeSql("update CRM_ShareInfo set deptorcomid="+crm_manager_com+" where relateditemid="+CustomerID+" and id="+shareid);
		}
	}
    
	//\u6253\u5370\u65e5\u5fd7
	String Remark="sharetype:"+sharetype+"seclevel:"+seclevel+"rolelevel:"+rolelevel+"sharelevel:"+sharelevel+"userid:"+userid+"departmentid:"+departmentid+"roleid:"+roleid+"foralluser:"+foralluser;
	ProcPara = CustomerID;
	ProcPara += flag+"ns";
	ProcPara += flag+"0";
	ProcPara += flag+Remark;
	ProcPara += flag+CurrentDate;
	ProcPara += flag+CurrentTime;
	ProcPara += flag+CurrentUser;
	ProcPara += flag+SubmiterType;
	ProcPara += flag+ClientIP;
	RecordSet.executeProc("CRM_Log_Insert",ProcPara);

	//CrmViewer.setCrmShareByCrm(""+CustomerID);
	RecordSet.executeSql("select max(id) as shareobjid from CRM_ShareInfo where relateditemid="+CustomerID+"  and contents="+sharevalue);
	RecordSet.next();
	String shareobjid = RecordSet.getString("shareobjid");
	CrmShareBase.setCRM_WPShare_newCRMShare(""+CustomerID,shareobjid);
	
	}
	//System.out.println("/mobile/plugin/crm/CrmAddShare.jsp?module="+module+"&scope="+scope+"&CustomerID="+CustomerID);
	//response.sendRedirect("/mobile/plugin/crm/CrmAddShare.jsp?module="+module+"&scope="+scope+"&CustomerID="+CustomerID);
	//String url="/mobile/plugin/crm/CrmAddShare.jsp?module="+module+"&scope="+scope+"&customerid="+CustomerID;
	//out.println("<script>window.location.href='"+url+"'</script>");
}

if(method.equals("edit"))
{
	String oldsharetype = "";
	String oldcontents = "";
	String oldroleid = "";
	String oldrolelevel = "";
	String oldforalluser = "";
	String oldseclevel = "";
	RecordSet.executeSql("select * from CRM_ShareInfo where id="+id);
	if(RecordSet.next()){
	    oldsharetype = RecordSet.getString("sharetype");
	    oldcontents = RecordSet.getString("contents");
	    oldroleid = RecordSet.getString("roleid");
	    oldrolelevel = RecordSet.getString("rolelevel");
	    oldforalluser = RecordSet.getString("foralluser");
	    oldseclevel = RecordSet.getString("seclevel");
	}
	
	ProcPara = id;
	ProcPara += CustomerID;
	ProcPara += flag+sharetype;
	ProcPara += flag+seclevel;
	ProcPara += flag+rolelevel;
	ProcPara += flag+sharelevel;
	ProcPara += flag+userid;
	ProcPara += flag+departmentid;
	ProcPara += flag+roleid;
	ProcPara += flag+foralluser;
	String tempcontents="";
    if(sharetype.equals("1")) tempcontents = userid ;
    if(sharetype.equals("2")) tempcontents = departmentid ;
    if(sharetype.equals("3")) tempcontents = roleid ;
    if(sharetype.equals("4")) tempcontents = "1" ;
    ProcPara += flag+tempcontents;
	RecordSet.executeProc("CRM_ShareInfo_Update",ProcPara);
	if(sharetype.equals("3")){
	    String crm_manager = "";
	    RecordSet.executeSql("select manager from crm_customerinfo where id="+CustomerID);
	    if(RecordSet.next()) crm_manager = RecordSet.getString("manager");
	    int crm_manager_dept = Util.getIntValue(ResourceComInfo.getDepartmentID(crm_manager),-1);//\u90e8\u95e8id
	    int crm_manager_com = Util.getIntValue(ResourceComInfo.getSubCompanyID(crm_manager),-1);//\u5206\u90e8id
	    if(rolelevel.equals("0"))
	        RecordSet.executeSql("update CRM_ShareInfo set deptorcomid="+crm_manager_dept+" where relateditemid="+CustomerID+" and id="+id);
	    else if(rolelevel.equals("1"))
	        RecordSet.executeSql("update CRM_ShareInfo set deptorcomid="+crm_manager_com+" where relateditemid="+CustomerID+" and id="+id);
	}
	//CrmViewer.setCrmShareByCrm(""+CustomerID);
	//\u7f16\u8f91\u5171\u4eab\u65f6\u91cd\u65b0\u8ba1\u7b97\u5ba2\u6237\u8054\u7cfb\u7684\u5171\u4eab\u3002
	if(!sharetype.equals(oldsharetype)||!tempcontents.equals(oldcontents)||!roleid.equals(oldroleid)||!rolelevel.equals(oldrolelevel)||!foralluser.equals(oldforalluser)||!seclevel.equals(oldseclevel)) 
	    CrmShareBase.resetContactShare(""+CustomerID);

	response.sendRedirect("/CRM/data/ViewCustomer.jsp?CustomerID="+CustomerID);
	return;
}

      out.write(_jsp_string2, 0, _jsp_string2.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/crm/ShareOperation.jsp"), 4217670532558440935L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("page/maint/common/initNoCache.jsp"), 3270256153856711871L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string4;
  private final static char []_jsp_string3;
  private final static char []_jsp_string1;
  private final static char []_jsp_string0;
  private final static char []_jsp_string2;
  private final static char []_jsp_string5;
  static {
    _jsp_string4 = "-->\r\n".toCharArray();
    _jsp_string3 = "\r\n<!--".toCharArray();
    _jsp_string1 = "\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string0 = "\r\n\r\n \r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string2 = "\r\n".toCharArray();
    _jsp_string5 = "\r\n\r\n".toCharArray();
  }
}