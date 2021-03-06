/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin._task;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import weaver.general.*;
import net.sf.json.JSONObject;
import weaver.file.FileUpload;
import weaver.workrelate.util.*;
import weaver.conn.RecordSet;
import java.util.*;
import weaver.hrm.*;
import weaver.systeminfo.*;
import weaver.general.StaticObj;
import weaver.general.Util;
import weaver.hrm.settings.RemindSettings;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class _addoperation__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;

  public String saveTask(String name,String creater,String currentDate,String currentTime,String tomorrow,
  	String enddate,int level,String principalid,String remark,String partnerids,String parentid,
  	String sorttype,String datetype){
  	String sql = "insert into TM_TaskInfo (name,status,creater,createdate,createtime,begindate,enddate,lev,principalid,"
  	+"parentid,tag,remark,risk,difficulty,assist,taskids,goalids,docids,wfids,meetingids,crmids,projectids,fileids)"
  	+" values('"+name+"',1,"+creater+",'"+currentDate+"','"+currentTime+"','','"+enddate+"',"+level+","
  	+principalid+",'"+parentid+"','','"+remark+"','','','','','','','','','','','')";
  	RecordSet rs = new RecordSet();
  	boolean res = rs.executeSql(sql);
  	String taskId = "";
  	if(res){
  		rs.executeSql("select max(id) from TM_TaskInfo");
  		if(rs.next()) taskId = rs.getString(1);
  		//\u8bb0\u5f55\u65e5\u5fd7
  		rs.executeSql("insert into TM_TaskLog (taskid,type,operator,operatedate,operatetime,operatefiled,operatevalue)"
  				+" values("+taskId+",1,"+creater+",'"+currentDate+"','"+currentTime+"','','')");
  		//\u589e\u52a0\u4e2a\u4ebaTodolist\u6807\u8bb0
  		if(sorttype.equals("5")){
  			String tododate = "";
  			if(datetype.equals("1")){
  				tododate = currentDate;
  			}else if(datetype.equals("2")){
  				tododate = tomorrow;
  			}else if(datetype.equals("3")){
  				tododate = TimeUtil.dateAdd(currentDate,7);
  			}else if(datetype.equals("5")){
  				tododate = "1";
  			}
  			if(!tododate.equals("")){
  				sql = "insert into TM_TaskTodo (taskid,userid,tododate) values('"+taskId+"','"+principalid+"','"+tododate+"')";
  				rs.executeSql(sql);
  			}
  		}
  		//\u589e\u52a0\u53c2\u4e0e\u4eba
  		List partneridList = Util.TokenizerString(partnerids,",");
  		String partnerid = "";
  		for(int i=0;i<partneridList.size();i++){
  			partnerid = Util.null2String((String)partneridList.get(i));
  			if(!partnerid.equals("")){
  				rs.executeSql("insert into TM_TaskPartner (taskid,partnerid) values("+taskId+","+partnerid+")");
  			}
  		}
  		//\u53d1\u9001\u6d88\u606f\u63d0\u9192
  		SendMsg.sendMsg(taskId,creater,"newTask","","","","","","","");
  	}
  	return taskId;
  }
  
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
      
	request.setCharacterEncoding("UTF-8");
	JSONObject json = new JSONObject();
	int status = 1;String msg = "";
	try{
		FileUpload fu = new FileUpload(request);
		String name = Util.null2String(fu.getParameter("taskName"));
		if(!name.equals("")){
			String sorttype = Util.null2String(fu.getParameter("sorttype"));
			String datetype = Util.null2String(fu.getParameter("datetype"));
			String principalid = Util.null2String(fu.getParameter("principalid"));
			if(principalid.equals("") || principalid.equals("0")){
				principalid = user.getUID()+"";
			}
			String currentDate = TimeUtil.getCurrentDateString();
			String currentTime = TimeUtil.getOnlyCurrentTimeString();
			String tomorrow = TimeUtil.dateAdd(currentDate,1);
			String enddate = Util.null2String(fu.getParameter("enddate"));
			int level = Util.getIntValue(fu.getParameter("lev"),0);
			String remark = Util.convertInput2DB(fu.getParameter("remark"));
			String partnerids = Util.null2String(fu.getParameter("partnerid"));//\u53c2\u4e0e\u4eba
			String taskId = this.saveTask(name, user.getUID()+"", currentDate, currentTime,
					tomorrow, enddate, level,principalid, remark, partnerids, "", sorttype, datetype);
			//\u589e\u52a0\u4e0b\u7ea7\u4efb\u52a1
			String[] subTask = fu.getParameterValues("subTask");
			String[] subMan = fu.getParameterValues("subMan");
			if(null!=subTask&&subTask.length>0){
				for(int i=0;i<subTask.length;i++){
					String subTaskName = subTask[i];
					String subTaskMan = subMan[i];
					if(null!=subTaskName&&!subTaskName.trim().equals("")){
						subTaskName = new String(subTaskName.getBytes("ISO8859_1"),"GBK");
						this.saveTask(subTaskName,user.getUID()+"",currentDate,currentTime,tomorrow,"",0, 
								subTaskMan, "", "", taskId, "", "");
					}
				}
			}
			status = 0;
		}else{
			msg = "\u4efb\u52a1\u540d\u79f0\u4e0d\u80fd\u4e3a\u7a7a";
		}
	}catch(Exception e){
		e.printStackTrace();
		msg = "\u4fdd\u5b58\u4efb\u52a1\u5931\u8d25,\u8bf7\u7a0d\u540e\u518d\u8bd5";
	}
	json.put("status",status);
	json.put("msg",msg);
	out.print(json.toString());

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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/task/addOperation.jsp"), -6314095309036379096L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("page/maint/common/initNoCache.jsp"), 3270256153856711871L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string0;
  private final static char []_jsp_string1;
  private final static char []_jsp_string2;
  static {
    _jsp_string0 = "\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string1 = "\r\n".toCharArray();
    _jsp_string2 = "\r\n\r\n".toCharArray();
  }
}
