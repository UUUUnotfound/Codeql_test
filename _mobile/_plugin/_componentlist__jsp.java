/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import java.net.*;
import net.sf.json.*;
import java.util.*;
import org.apache.commons.lang.*;
import org.apache.commons.codec.binary.Base64;
import weaver.general.*;
import weaver.file.*;
import weaver.hrm.*;
import weaver.conn.*;
import weaver.docs.news.*;
import weaver.workflow.workflow.WorkflowVersion;

public class _componentlist__jsp extends com.caucho.jsp.JavaPage
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

//-------------------------------------------
// mobile6.0\u65b0\u589e\u63a5\u53e3\u53c2\u6570 startr
//-------------------------------------------
//\u5f85\u529e\u662f\u5426\u5305\u542b\u6284\u9001(1)
int showcopy = Util.getIntValue(Util.null2String(fu.getParameter("showcopy")), 0);
//\u5df2\u529e\u662f\u5426\u5305\u542b\u529e\u7ed3(1)
int showcompele = Util.getIntValue(Util.null2String(fu.getParameter("showcompele")), 0);
//\u6d41\u7a0b\u65f6\u95f4\u6392\u5e8f\u89c4\u5219\uff1a0\uff1a\u5012\u5e8f\uff0c 1\uff1a\u6b63\u5e8f
int wforder = Util.getIntValue(Util.null2String(fu.getParameter("wforder")), 0);
//\u662f\u5426\u9700\u8981\u83b7\u53d6\u6d41\u7a0b\u7c7b\u578b\u96c6\u5408
int isneedgetwfids = Util.getIntValue(Util.null2String(fu.getParameter("isneedgetwfids")), 0);

//\u6d41\u7a0bID
int workflowid = Util.getIntValue(Util.null2String(fu.getParameter("workflowid")), 0);

//\u6d41\u7a0b\u7c7b\u578bID
int workflowtypeid = Util.getIntValue(Util.null2String(fu.getParameter("workflowtypeid")), 0);

//\u6d41\u7a0b\u5f52\u6863\u72b6\u6001\uff1a1\uff1a\u5168\u90e8\uff0c 2\uff1a\u672a\u5f52\u6863\uff0c 3\uff1a\u5df2\u5f52\u6863
int archivestatus = Util.getIntValue(Util.null2String(fu.getParameter("archivestatus")), 1);
//\u6d41\u7a0b\u7f16\u53f7
String requestmark = Util.null2String(fu.getParameter("requestmark"));
//\u521b\u5efa\u4ebaID
int createid = Util.getIntValue(Util.null2String(fu.getParameter("createid")), 0);
//\u521b\u5efa\u4eba\u7c7b\u578b
int createtype = Util.getIntValue(Util.null2String(fu.getParameter("createtype")), 0);
//\u8d77\u59cb\u548c\u7ed3\u675f\u521b\u5efa\u65e5\u671f\uff0c \u683c\u5f0f\uff1ayyyy-MM-dd
String createdatestart = Util.null2String(fu.getParameter("createdatestart"));
String createdateend = Util.null2String(fu.getParameter("createdateend"));
//-------------------------------------------
// mobile6.0\u65b0\u589e\u63a5\u53e3\u53c2\u6570 end
//-------------------------------------------

//\u56e0\u5ba2\u6237\u7aef\u4f7f\u7528GBK\u7f16\u7801\uff0c\u6545\u9700\u8981\u8f6c\u7801\u3002
//keyword = new String(keyword.getBytes("iso8859-1"), "UTF-8");

if(ps.verify(sessionkey)) {
	
	List conditions = new ArrayList();
	
	String listtypeidcondition = "";
	
	if(StringUtils.isNotEmpty(setting)) {
		if(module.equals("1")||module.equals("7")||module.equals("8")||module.equals("9")||module.equals("10")) {
			String condition = "";
			String cfgstr = setting;
			cfgstr = cfgstr.startsWith(",")?cfgstr.substring(1):cfgstr;
			if(StringUtils.isNotEmpty(cfgstr)) {
				String strSubClause = Util.getSubINClause(cfgstr, "t1.workflowid", "IN");
				if("".equals(condition)){
					 condition += strSubClause;
				} else {
					 condition += " or " + strSubClause;
				}
				if (condition != null && !"".equals(condition)) {
					condition = " (" + condition + ") ";
				}
				//\u4fdd\u5b58\u57fa\u7840\u6761\u4ef6
				listtypeidcondition = condition;
				conditions.add(condition);
			}
		} else if(module.equals("2")||module.equals("3")) {
			//String[] cfgarr = StringUtils.split(setting, "|");
			String[] cfgarr = setting.split("\\|");
			if(cfgarr!=null&&cfgarr.length>0){
				if (cfgarr[0].equals("1")) {
					//\u6765\u6e90\u65b0\u95fb\u4e2d\u5fc3
					String[] targets = StringUtils.split(cfgarr[1], ",");
					String where = "";
					
					DocNewsManager dnm = new DocNewsManager();
					dnm.setId(Util.getIntValue(targets[0]));
					dnm.getDocNewsInfoById();
					
					where = dnm.getNewsclause();

					where += (StringUtils.isEmpty(where)?"":" and ") + " docpublishtype in ('2','3') ";
					conditions.add(where);
				} else if (cfgarr[0].equals("2")) {
					//\u6765\u6e90\u6587\u6863\u76ee\u5f55
					String targets = cfgarr[1].startsWith(",") ? cfgarr[1].substring(1) : cfgarr[1];
					//String where = " seccategory in (" + targets + ") ";
					String where = " exists (select id from docseccategory where id = seccategory and id in (" + targets + "))";
					conditions.add(where);
				} else if (cfgarr[0].equals("3")) {
					//\u6765\u6e90\u865a\u62df\u76ee\u5f55
					String targets = cfgarr[1].startsWith(",") ? cfgarr[1].substring(1) : cfgarr[1];
					String where = " exists (select 1 from DocDummyDetail where docid = t1.id and catelogid in (" + targets + ")) ";
					conditions.add(where);
				} else if (cfgarr[0].equals("4")) {
					//\u6765\u6e90\u6307\u5b9a\u6587\u6863
					String targets = cfgarr[1].startsWith(",") ? cfgarr[1].substring(1) : cfgarr[1];
					String where = "";
					String[] tmpdocids = StringUtils.split(targets, ",");
					String docids = "";
					for (String docid : tmpdocids) {
						int editionid = 0;
						int newdocid = Util.getIntValue(docid);
						RecordSet rs = new RecordSet();
						rs.executeSql("select doceditionid from docdetail where id=" + docid);
						if(rs.next()) {
							editionid = Util.getIntValue(rs.getString("doceditionid"));
						}
						if (editionid > 0) {
							rs.executeSql("select id from docdetail where docedition=(select max(docedition) from docdetail where doceditionid=" + editionid + ") and doceditionid=" + editionid);
							if(rs.next()) {
								newdocid = Util.getIntValue(rs.getString("id"));
							}
						}
						docids += "," + newdocid;
					}
					docids = docids.startsWith(",") ? docids.substring(1) : docids;
					where = " id in (" + docids + ") ";
					conditions.add(where);
				}
				if(StringUtils.isEmpty(cfgarr[2])||"0".equals(cfgarr[2])){
					String where = " (isreply is null or isreply <> 1) ";
					conditions.add(where);
				}
			}
		}
	}
	
	Map result = new HashMap();
	
	if(module.equals("1")||module.equals("7")||module.equals("8")||module.equals("9")||module.equals("10")) {
		if(StringUtils.isNotEmpty(keyword)) {
			conditions.add(" (t1.requestnamenew like '%" + keyword + "%') ");
		}
		
		if(StringUtils.isNotEmpty(detailid)) {
			conditions.add(" (t1.requestid = "+detailid+") ");
		}
	
		//-------------------------------------------
		// mobile6.0\u65b0\u589e\u67e5\u8be2\u6761\u4ef6 start
		//-------------------------------------------
		
		//\u6dfb\u52a0\u5de5\u4f5c\u6d41\u8fc7\u6ee4
	    if (workflowid > 0) {
	        String strSubClause = Util.getSubINClause(WorkflowVersion.getAllVersionStringByWFIDs(workflowid + ""), "t1.workflowid", "IN");
	        conditions.add(strSubClause);
        }
		
	  	//\u6dfb\u52a0\u5de5\u4f5c\u6d41\u7c7b\u578b\u8fc7\u6ee4
	    if (workflowtypeid > 0) {
	        String strSubClause = " t1.workflowid in (select id from workflow_base where  ";
			//\u6d41\u7a0b\u7c7b\u578b=
			strSubClause += " workflowtype=" + workflowtypeid + ") ";
			conditions.add(strSubClause);
	    }
	  	//\u6d41\u7a0b\u5f52\u6863\u72b6\u6001
	  	if ((module.equals("8") || module.equals("9")) && archivestatus > 1) {
	  		//\u672a\u5f52\u6863
	  	    if (archivestatus == 2) {
	  	  		conditions.add(" t1.currentnodetype <> 3 ");
	  	    }
	  		//\u5df2\u5f52\u6863
	  	    if (archivestatus == 3) {
	  	  		conditions.add(" t1.currentnodetype = 3 ");
	  	    }
	  	}
	  	
	  	//\u6d41\u7a0b\u7f16\u53f7
	  	if (!"".equals(requestmark)) {
	  	  conditions.add(" t1.requestmark like '%" + requestmark + "%' ");
	  	}
	  	
	  	//\u521b\u5efa\u4eba
		if (createid > 0) {
		    conditions.add(" t1.creater=" + createid + " and t1.creatertype=" + createtype + " ");
		}
	  	
		//\u521b\u5efa\u8d77\u59cb\u65e5\u671f
		if (!"".equals(createdatestart)) {
		    conditions.add(" t1.createdate>='" + createdatestart + "' ");
		}
		
		//\u521b\u5efa\u7ed3\u675f\u65e5\u671f
		if (!"".equals(createdateend)) {
		    conditions.add(" t1.createdate<='" + createdateend + "' ");
		}
		
		//-------------------------------------------
		// mobile6.0\u65b0\u589e\u67e5\u8be2\u6761\u4ef6 end
		//-------------------------------------------
		
		//-------------------------------------------------------
		// mobile6.0\u65b0\u589e\u63a5\u53e3\uff08\u5f85\u529e\u5305\u542b\u6284\u9001\uff0c\u5df2\u529e\u5305\u542b\u529e\u7ed3\uff09 start
		//-------------------------------------------------------
		Map<String, String> otherParaMap = new HashMap<String, String>();
		otherParaMap.put("isshowcopy", String.valueOf(showcopy));
		otherParaMap.put("isshowprocessed", String.valueOf(showcompele));
		otherParaMap.put("isneedgetwfids", String.valueOf(isneedgetwfids));
		otherParaMap.put("order", String.valueOf(wforder));
		
		otherParaMap.put("listtypeidcondition", listtypeidcondition);
		//-------------------------------------------------------
		// mobile6.0\u65b0\u589e\u63a5\u53e3\uff08\u5f85\u529e\u5305\u542b\u6284\u9001\uff0c\u5df2\u529e\u5305\u542b\u529e\u7ed3\uff09 end
		//-------------------------------------------------------
		//result = (Map) ps.getWorkflowList(Util.getIntValue(module), Util.getIntValue(scope), conditions, Util.getIntValue(pageindex), Util.getIntValue(pagesize), sessionkey);
		result = (Map) ps.getWorkflowList(Util.getIntValue(module), Util.getIntValue(scope), conditions, Util.getIntValue(pageindex), Util.getIntValue(pagesize), sessionkey, otherParaMap);
	}
	
	if(module.equals("2")||module.equals("3")) {
		if(StringUtils.isNotEmpty(keyword)) {
			conditions.add(" (docsubject like '%"+keyword+"%') ");
		}
		
		if(StringUtils.isNotEmpty(detailid)) {
			conditions.add(" (id = "+detailid+") ");
		}

		result = ps.getDocumentList(conditions, Util.getIntValue(pageindex), Util.getIntValue(pagesize), sessionkey);
	}
	
	if(module.equals("6")) {
		if(StringUtils.isNotEmpty(keyword)) {
			conditions.add(" (lastname like '%"+keyword+"%' or pinyinlastname like '%"+keyword+"%' or workcode like '%"+keyword+"%' or mobile like '%"+keyword+"%' or telephone like '%"+keyword+"%') ");
		}
		
		if(StringUtils.isNotEmpty(detailid)) {
			conditions.add(" (id = "+detailid+") ");
		}

		result = ps.getUserList(conditions, Util.getIntValue(pageindex), Util.getIntValue(pagesize), hrmorder, sessionkey);
	}
	
	String key = "list";
	
	if(result!=null&&result.get("list")!=null) {
		
		List<Map<String,Object>> list = (List<Map<String,Object>>) result.get("list");

		if(module.equals("1")||module.equals("7")||module.equals("8")||module.equals("9")||module.equals("10")) {
			List<Map<String,Object>> newlist = new ArrayList<Map<String,Object>>();
			for(Map<String,Object> d:list) {
				Map<String,Object> newdata = new HashMap<String,Object>();
				
				String time = StringUtils.defaultIfEmpty((String) d.get("recivetime"),"");
				String image = StringUtils.defaultIfEmpty((String) d.get("creatorpic"),"");
				String id = StringUtils.defaultIfEmpty((String) d.get("wfid"),"");
				String isnew = StringUtils.defaultIfEmpty((String) d.get("isnew"),"");
				String subject = StringUtils.defaultIfEmpty((String) d.get("wftitle"),"").replace("&quot;", "\"");
				String description = "" +
									 "[" + StringUtils.defaultIfEmpty((String) d.get("wftype"),"") + "]" +
									 "   \u63a5\u6536\u65f6\u95f4 : " + StringUtils.defaultIfEmpty((String) d.get("recivetime"),"") +
									 "   \u6d41\u7a0b\u72b6\u6001 : " + StringUtils.defaultIfEmpty((String) d.get("status"),"") +
									 "   \u521b\u5efa\u4eba : " + StringUtils.defaultIfEmpty((String) d.get("creator"),"") +
									 "   \u521b\u5efa\u65f6\u95f4 : " + StringUtils.defaultIfEmpty((String) d.get("createtime"),"");
				
				newdata.put("time", time);
				newdata.put("image", image);
				newdata.put("id", id);
				newdata.put("isnew", isnew);
				newdata.put("subject", subject);
				newdata.put("description", description);
				
				//------------------------------------------
				// mobile6.0 \u8bf4\u660e\u62c6\u5206\u4e3a\u5355\u4e2a\u5bf9\u8c61 start
				//------------------------------------------
				newdata.put("wftype", StringUtils.defaultIfEmpty((String) d.get("wftype"),""));
				newdata.put("recivetime", StringUtils.defaultIfEmpty((String) d.get("recivetime"),""));
				newdata.put("status", StringUtils.defaultIfEmpty((String) d.get("status"),""));
				newdata.put("creator", StringUtils.defaultIfEmpty((String) d.get("creator"),""));
				newdata.put("createtime", StringUtils.defaultIfEmpty((String) d.get("createtime"),""));
				
				newdata.put("canmultisubmit", StringUtils.defaultIfEmpty((String) d.get("canMultiSubmit"),""));
				//\u521b\u5efa\u4ebaID
				newdata.put("creatorid", StringUtils.defaultIfEmpty((String) d.get("creatorid"),""));
				//------------------------------------------
				// mobile6.0 \u8bf4\u660e\u62c6\u5206\u4e3a\u5355\u4e2a\u5bf9\u8c61 end
				//------------------------------------------
				
				newlist.add(newdata);
			}
			result.put(key,newlist);
		} else if(module.equals("2")||module.equals("3")) {
			List<Map<String,Object>> newlist = new ArrayList<Map<String,Object>>();
			for(Map<String,Object> d:list) {
				Map<String,Object> newdata = new HashMap<String,Object>();
				
				String time = StringUtils.defaultIfEmpty((String) d.get("modifytime"),"");
				String image = StringUtils.defaultIfEmpty((String) d.get("docimg"),"");
				String id = StringUtils.defaultIfEmpty((String) d.get("docid"),"");
				String isnew = StringUtils.defaultIfEmpty((String) d.get("isnew"),"");
				String subject = StringUtils.defaultIfEmpty((String) d.get("docsubject"),"");
				String description = "" +
									 "   \u6240\u6709\u8005 : " + StringUtils.defaultIfEmpty((String) d.get("owner"),"") +
									 "   \u521b\u5efa\u65f6\u95f4 : " + StringUtils.defaultIfEmpty((String) d.get("createtime"),"") +
									 "   \u4fee\u6539\u65f6\u95f4 : " + StringUtils.defaultIfEmpty((String) d.get("modifytime"),"");
				
				newdata.put("time", time);
				newdata.put("image", image);
				newdata.put("id", id);
				newdata.put("isnew", isnew);
				newdata.put("subject", subject);
				newdata.put("description", description);
				newlist.add(newdata);
			}
			result.put(key,newlist);
		} else if(module.equals("6")) {
			List<Map<String,Object>> newlist = new ArrayList<Map<String,Object>>();
			for(Map<String,Object> d:list) {
				Map<String,Object> newdata = new HashMap<String,Object>();
				
				String time = "";
				String image = StringUtils.defaultIfEmpty((String) d.get("msgerurl"),"");
				String id = StringUtils.defaultIfEmpty((String) d.get("id"),"");
				String isnew = "";
				String subject = StringUtils.defaultIfEmpty((String) d.get("lastname"),"");
				String description = "" +
									 " [" + StringUtils.defaultIfEmpty((String) d.get("jobtitle"),"") + "]" +
									 " " + StringUtils.defaultIfEmpty((String) d.get("dept"),"") + " / " +
									 "" + StringUtils.defaultIfEmpty((String) d.get("subcom"),"");
				
				newdata.put("time", time);
				newdata.put("image", image);
				newdata.put("id", id);
				newdata.put("isnew", isnew);
				newdata.put("subject", subject);
				newdata.put("description", description);
				newlist.add(newdata);
			}
			result.put(key,newlist);
		}
		
	}	
	
	JSONObject jo = JSONObject.fromObject(result);
	out.println(jo);
}

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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/ComponentList.jsp"), 4767926930491005876L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string0;
  private final static char []_jsp_string1;
  static {
    _jsp_string0 = "\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string1 = "\r\n".toCharArray();
  }
}