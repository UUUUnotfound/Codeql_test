/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin._browser;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import java.util.*;
import weaver.conn.*;
import weaver.mobile.webservices.*;
import weaver.general.*;
import weaver.hrm.*;
import weaver.systeminfo.*;
import weaver.systeminfo.setting.*;

public class _workflowcenterbrowser__jsp extends com.caucho.jsp.JavaPage
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
      
String username = request.getParameter("username");
String password = request.getParameter("password");
String formids = request.getParameter("formids");
String flag = request.getParameter("flag");
RecordSet rs = new RecordSet() ;

User user = HrmUserVarify.checkUser (request , response) ;
if(user == null){

	int logintype = 0;
	rs.execute("select * from mobileconfig where mc_type = 7");
	if(rs.next()) {
		logintype = Util.getIntValue(rs.getString("mc_value"),0);
	}
	
	MobileService ms = new MobileServiceImpl();
	if(ms.checkUserLogin(username, password, logintype)==1) {
		user = new User() ;
		rs.execute("SELECT id,firstname,lastname,systemlanguage,seclevel FROM HrmResourceManager WHERE loginid='"+username+"'");
		if(rs.next()){
			user.setUid(rs.getInt("id"));
			user.setLoginid(username);
			user.setFirstname(rs.getString("firstname"));
			user.setLastname(rs.getString("lastname"));
			user.setLanguage(Util.getIntValue(rs.getString("systemlanguage"),0));
			user.setSeclevel(rs.getString("seclevel"));
			user.setLogintype("1");
			request.getSession(true).setAttribute("weaver_user@bean",user) ;
		}
	} else {
		out.println("Login Error !");
		return;
	}
}

      out.write(_jsp_string1, 0, _jsp_string1.length);
      
String scope = Util.null2String(request.getParameter("scope"));
String initvalue = Util.null2String(request.getParameter("initvalue"));

      out.write(_jsp_string2, 0, _jsp_string2.length);
      out.print((scope));
      out.write(_jsp_string3, 0, _jsp_string3.length);
      out.print((initvalue));
      out.write(_jsp_string4, 0, _jsp_string4.length);
      out.print((formids));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((SystemEnv.getHtmlLabelName(21674,user.getLanguage())));
      out.write(_jsp_string6, 0, _jsp_string6.length);
      out.print((SystemEnv.getHtmlLabelName(21674,user.getLanguage())));
      out.write(_jsp_string7, 0, _jsp_string7.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/browser/WorkflowCenterBrowser.jsp"), -7421830246937012998L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string1;
  private final static char []_jsp_string6;
  private final static char []_jsp_string4;
  private final static char []_jsp_string5;
  private final static char []_jsp_string0;
  private final static char []_jsp_string2;
  private final static char []_jsp_string3;
  private final static char []_jsp_string7;
  static {
    _jsp_string1 = "\r\n<LINK href=\"/css/Weaver_wev8.css\" type=text/css rel=STYLESHEET>\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"/js/extjs/resources/css/ext-all_wev8.css\" />\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"/js/extjs/resources/css/xtheme-gray_wev8.css\" />\r\n\r\n<form name=\"frmFlwCenter\"  id=\"frmFlwCenter\" action=\"\" method=\"post\">\r\n	<input type='hidden' name='typeids'  id='typeids'>\r\n	<input type='hidden' name='flowids'  id='flowids'>\r\n	<input type='hidden' name='nodeids'  id='nodeids'>\r\n	<input type=\"hidden\"  id=\"btnSave\"  onclick='onGetChecked()'>\r\n	<div id=\"tree\"></div>\r\n<form>\r\n\r\n<script type=\"text/javascript\" src=\"/js/homepage/extjs/adapter/ext/ext-base_wev8.js\"></script>\r\n<script type=\"text/javascript\" src=\"/js/homepage/extjs/ext-all_wev8.js\"></script>\r\n<!-- Files needed for SwfUploaderPanel -->\r\n\r\n".toCharArray();
    _jsp_string6 = "', 				\r\n				collapsible      : false,\r\n				animCollapse     : false,\r\n				border           : true,\r\n				//id               : \"tree_projectcategory\",\r\n				el               :'tree',				\r\n				autoScroll       : true,\r\n				animate          : false,					\r\n				containerScroll  : true,\r\n				height           : 400,				\r\n				rootVisible:true,\r\n				loader           : Tree_Category_Loader	\r\n			});\r\n\r\n\r\n\r\n			  \r\n			// SET the root node.\r\n			//lable 1478: \u76ee\u5f55\u4fe1\u606f\r\n			var Tree_Category_Root = new Ext.tree.AsyncTreeNode({\r\n				text		: '".toCharArray();
    _jsp_string4 = "',formids:'".toCharArray();
    _jsp_string5 = "'},\r\n				dataUrl   :\"WorkflowCenterTreeData.jsp\"\r\n			});\r\n\r\n			\r\n				\r\n			//lable 21409:\u5177\u6709\u521b\u5efa\u6743\u9650\u7684\u76ee\u5f55\r\n			Tree_Category = new Ext.tree.TreePanel({\r\n				//title            : '".toCharArray();
    _jsp_string0 = "\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string2 = "\r\n\r\n<SCRIPT LANGUAGE=\"JavaScript\">\r\n	 var Tree_Category;\r\n	 Ext.onReady(function() {	\r\n		 \r\n\r\n			Ext.BLANK_IMAGE_URL = '/js/extjs/resources/images/default/s_wev8.gif';\r\n		   // Define Tree.\r\n			var Tree_Category_Loader = new Ext.tree.TreeLoader({\r\n				baseParams:{scope:'".toCharArray();
    _jsp_string3 = "',initvalue:'".toCharArray();
    _jsp_string7 = "',\r\n				\r\n				draggable	: false,\r\n				id		: 'root_0'  //root  main  sub\r\n			});			\r\n			Tree_Category.setRootNode(Tree_Category_Root);\r\n			Tree_Category.on('sleep', function(node) {\r\n				if(!node.isExpanded()){\r\n					setTimeout( function() {Tree_Category.fireEvent('sleep', node); }, 1000); \r\n				} else {\r\n					Tree_Category.fireEvent('checkchange', node, node.attributes.checked); \r\n				}\r\n				\r\n			});\r\n			Tree_Category.on('checkchange', function(node, checked) {				\r\n				if(!node.isExpanded()&&!node.isLeaf()){	\r\n					node.expand();\r\n					Tree_Category.fireEvent('sleep', node); \r\n				} else {\r\n				node.eachChild(function(child) { \r\n				   child.attributes.checked = checked;  \r\n				   child.fireEvent('checkchange', child, checked); \r\n				   child.ui.toggleCheck(checked);  \r\n				});			\r\n\r\n				 node.attributes.checked = checked; \r\n				 node.ui.toggleCheck(checked);\r\n/*\r\n				 if(checked){\r\n					 try{\r\n						 node.parentNode.attributes.checked = checked; \r\n						 node.parentNode.ui.toggleCheck(checked);\r\n\r\n						 node.parentNode.parentNode.attributes.checked = checked; \r\n						 node.parentNode.parentNode.ui.toggleCheck(checked);\r\n					 } catch(e){}\r\n				 } else {\r\n					  try{\r\n						 //\u67e5\u770b\u4e00\u4e0b\u5176\u5144\u5f1f\u8282\u70b9\u662f\u4e0d\u662f\u90fd\u4e3a\u7a7a\r\n						 var isAllUncheck=true;\r\n						 node.parentNode.eachChild(function(child) { \r\n							 if(child.attributes.checked) {\r\n								 isAllUncheck=false;\r\n							 }\r\n						 });	\r\n\r\n						 if(isAllUncheck){\r\n							 node.parentNode.attributes.checked = checked; \r\n							 node.parentNode.ui.toggleCheck(checked);\r\n						 }\r\n\r\n						  //\u67e5\u770b\u4e00\u4e0b\u5176\u6240\u6709\u7684\u4e0a\u7ea7\u8282\u70b9\u662f\u4e0d\u662f\u90fd\u4e3a\u7a7a\r\n\r\n						 isAllUncheck=true;\r\n						 node.parentNode.parentNode.eachChild(function(child) { \r\n							 if(child.attributes.checked) {\r\n								 isAllUncheck=false;							\r\n							 }\r\n						 });	\r\n\r\n						  if(isAllUncheck){\r\n							 node.parentNode.parentNode.attributes.checked = checked; \r\n							 node.parentNode.parentNode.ui.toggleCheck(checked);\r\n						  }\r\n					 } catch(e){}\r\n				 }\r\n					 */\r\n				}\r\n		    });\r\n			Tree_Category.render();			\r\n			Tree_Category_Root.expand();						\r\n	});\r\n\r\n\r\n	function onGetChecked(){\r\n		var objs=Tree_Category.getChecked(\"id\");\r\n		var typeids=\"\";\r\n	    var flowids=\"\";\r\n        var nodeids=\"\";\r\n		\r\n		for(var i=0;i<objs.length;i++){\r\n			var obj=objs[i];\r\n			var pos=obj.indexOf(\"_\");			\r\n			if(pos!=-1){\r\n				var type=obj.substring(0,pos);\r\n				var content=obj.substring(pos+1);\r\n				if(type==\"wftype\"){\r\n					typeids+=content+\",\";\r\n				} else if(type==\"wf\"){\r\n					flowids+=content+\",\";\r\n				} else if(type==\"node\"){\r\n					nodeids+=content+\",\";\r\n				}				\r\n			}\r\n		}		\r\n		if(typeids!==\"\") typeids=typeids.substring(0,typeids.length-1);\r\n		if(flowids!==\"\") flowids=flowids.substring(0,flowids.length-1);\r\n		if(nodeids!==\"\") nodeids=nodeids.substring(0,nodeids.length-1);\r\n		\r\n		document.getElementById(\"typeids\").value=typeids;\r\n		document.getElementById(\"flowids\").value=flowids;\r\n		document.getElementById(\"nodeids\").value=nodeids;\r\n	}\r\n</script>\r\n\r\n	\r\n\r\n".toCharArray();
  }
}
