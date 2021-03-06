/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import org.json.*;
import weaver.general.Util;
import java.util.*;
import weaver.workflow.workflow.WorkTypeComInfo;

public class _workflowcentertreedata__jsp extends com.caucho.jsp.JavaPage
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
    response.setContentType("application/x-json;charset=UTF-8");
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
      weaver.conn.RecordSet rsIn;
      rsIn = (weaver.conn.RecordSet) pageContext.getAttribute("rsIn");
      if (rsIn == null) {
        rsIn = new weaver.conn.RecordSet();
        pageContext.setAttribute("rsIn", rsIn);
      }
      out.write(_jsp_string2, 0, _jsp_string2.length);
      
String node=Util.null2String(request.getParameter("node")); 

String arrNode[]=Util.TokenizerString2(node,"_");
String type=arrNode[0];
String value=arrNode[1];

String scope = Util.null2String(request.getParameter("scope"));

String typeids="";
String flowids="";
String nodeids="";
ArrayList typeidList=new ArrayList();
ArrayList flowidList=new ArrayList();
ArrayList nodeidList=new ArrayList();

rs.executeSql("select * from mobileconfig where mc_type=5 and mc_scope="+scope+" and mc_name='typeids' ");
if(rs.next()){
	typeids=Util.null2String(rs.getString("mc_value")); 
	typeidList=Util.TokenizerString(typeids,",");
}

rs.executeSql("select * from mobileconfig where mc_type=5 and mc_scope="+scope+" and mc_name='flowids' ");
if(rs.next()){
	flowids=Util.null2String(rs.getString("mc_value"));
	flowidList=Util.TokenizerString(flowids,",");
}

rs.executeSql("select * from mobileconfig where mc_type=5 and mc_scope="+scope+" and mc_name='nodeids' ");
if(rs.next()){
	nodeids=Util.null2String(rs.getString("mc_value")); 
	nodeidList=Util.TokenizerString(nodeids,",");
}


JSONArray jsonArrayReturn= new JSONArray();

if("root".equals(type)){ //\u4e3b\u76ee\u5f55\u4e0b\u7684\u6570\u636e
	WorkTypeComInfo wftc=new WorkTypeComInfo();
	while(wftc.next()){	
		JSONObject jsonTypeObj=new JSONObject();	
		String wfTypeId=wftc.getWorkTypeid();
		String wfTypeName=wftc.getWorkTypename();
		//if("1".equals(wfTypeId)) continue; 
		jsonTypeObj.put("id","wftype_"+wfTypeId);
		jsonTypeObj.put("text",wfTypeName);
		if(!typeidList.contains(wfTypeId)){
			jsonTypeObj.put("checked",false);	   
		} else {
			jsonTypeObj.put("checked",true);
			jsonTypeObj.put("expanded",true);
		}
	    jsonTypeObj.put("draggable",false);
	    jsonTypeObj.put("leaf",false);
		jsonArrayReturn.put(jsonTypeObj);
	}
} else if ("wftype".equals(type)){
	rs.executeSql("select id,workflowname from workflow_base where isvalid='1' and workflowtype="+value);
	
	while (rs.next()){
		
		JSONObject jsonWfObj=new JSONObject();	
		String wfId=Util.null2String(rs.getString("id"));
		String wfName=Util.null2String(rs.getString("workflowname"));
		jsonWfObj.put("id","wf_"+wfId);
		jsonWfObj.put("text",wfName);
		jsonWfObj.put("draggable",false);

		if(!flowidList.contains(wfId)){
			jsonWfObj.put("checked",false);	   
		} else {
			jsonWfObj.put("checked",true);
			jsonWfObj.put("expanded",true);
		}
		jsonWfObj.put("leaf",true);
		jsonArrayReturn.put(jsonWfObj);
	} 	
}else {
	rsIn.executeSql("select a.nodeId,b.nodeName,a.nodeType from  workflow_flownode a,workflow_nodebase b where (b.IsFreeNode is null or b.IsFreeNode!='1') and a.nodeId=b.id  and a.workflowId="+value+" order by nodetype");

	JSONArray jsonNodeArrayObj= new JSONArray();
	while (rsIn.next()){
		int nodeType=Util.getIntValue(rsIn.getString("nodeType"));

		JSONObject jsonNodeObj=new JSONObject();	
		String nodeId=Util.null2String(rsIn.getString("nodeId"));
		String nodeName=Util.null2String(rsIn.getString("nodeName"));
		jsonNodeObj.put("id","node_"+nodeId);
		jsonNodeObj.put("text",nodeName);
		jsonNodeObj.put("leaf",true);
		jsonNodeObj.put("draggable",false);			
		
		if(!nodeidList.contains(nodeId)){
			jsonNodeObj.put("checked",false);	   
		} else {
			jsonNodeObj.put("checked",true);
			jsonNodeObj.put("expanded",true);
		}
		jsonNodeObj.put("leaf",true);
		
		jsonArrayReturn.put(jsonNodeObj);		
	}
}
out.println(jsonArrayReturn.toString());

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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/WorkflowCenterTreeData.jsp"), -6328459138167552675L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string0;
  private final static char []_jsp_string1;
  private final static char []_jsp_string2;
  static {
    _jsp_string0 = "\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string1 = "\r\n".toCharArray();
    _jsp_string2 = "\r\n\r\n".toCharArray();
  }
}
