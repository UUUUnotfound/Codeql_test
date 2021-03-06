/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin._1;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import java.util.*;
import weaver.general.Util;
import weaver.hrm.User;
import weaver.hrm.HrmUserVarify;
import weaver.systeminfo.SystemEnv;

public class _browsersignature__jsp extends com.caucho.jsp.JavaPage
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
      
	response.setContentType("text/html;charset=UTF-8");
	String userId = Util.null2String(request.getParameter("userid"));
	User user = HrmUserVarify.getUser (request , response) ;
	List lstSigns = weaver.docs.docs.SignatureManager.getSignatureList(userId);
	
	if(lstSigns == null || lstSigns.size() == 0){

      out.write(_jsp_string1, 0, _jsp_string1.length);
        return; } 
      out.write(_jsp_string2, 0, _jsp_string2.length);
      out.print((SystemEnv.getHtmlLabelName(18214, user.getLanguage())));
      out.print((SystemEnv.getHtmlLabelName(30490, user.getLanguage())));
      out.write(_jsp_string3, 0, _jsp_string3.length);
      out.print((SystemEnv.getHtmlLabelName(18694, user.getLanguage())));
      out.write(_jsp_string4, 0, _jsp_string4.length);
       for(int i = 0; i<lstSigns.size() ; i++){  
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((((String[])lstSigns.get(i))[0]));
      out.write(_jsp_string6, 0, _jsp_string6.length);
      out.print((((String[])lstSigns.get(i))[1]));
      out.write(_jsp_string7, 0, _jsp_string7.length);
       } 
      out.write(_jsp_string8, 0, _jsp_string8.length);
      out.print((SystemEnv.getHtmlLabelName(826, user.getLanguage())));
      out.write(_jsp_string9, 0, _jsp_string9.length);
      out.print((SystemEnv.getHtmlLabelName(311, user.getLanguage())));
      out.write(_jsp_string10, 0, _jsp_string10.length);
      out.print((SystemEnv.getHtmlLabelName(201, user.getLanguage())));
      out.write(_jsp_string11, 0, _jsp_string11.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/1/browserSignature.jsp"), -2983219513367408650L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string1;
  private final static char []_jsp_string11;
  private final static char []_jsp_string2;
  private final static char []_jsp_string6;
  private final static char []_jsp_string0;
  private final static char []_jsp_string4;
  private final static char []_jsp_string5;
  private final static char []_jsp_string3;
  private final static char []_jsp_string10;
  private final static char []_jsp_string7;
  private final static char []_jsp_string9;
  private final static char []_jsp_string8;
  static {
    _jsp_string1 = "\r\n	<script type=\"text/javascript\">\r\n		jQuery(function(){\r\n    		parent.setMarkPath(-1);\r\n    		parent.closeSignatureDialog();\r\n		});\r\n	</script>\r\n".toCharArray();
    _jsp_string11 = "</div>\r\n   				</td>\r\n   			</tr>\r\n   		</table>\r\n  	  </form>\r\n  </body>\r\n</html>\r\n".toCharArray();
    _jsp_string2 = "\r\n	<script type=\"text/javascript\">\r\n		function ajaxinit(){\r\n		    var ajax=false;\r\n		    try {\r\n		        ajax = new ActiveXObject(\"Msxml2.XMLHTTP\");\r\n		    } catch (e) {\r\n		        try {\r\n		            ajax = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n		        } catch (E) {\r\n		            ajax = false;\r\n		        }\r\n		    }\r\n		    if (!ajax && typeof XMLHttpRequest!='undefined') {\r\n		    ajax = new XMLHttpRequest();\r\n		    }\r\n		    return ajax;\r\n		}\r\n		\r\n		function selectSignature(){\r\n			var markNameId = document.getElementById(\"markName\").value;\r\n			if(markNameId == \"\"){\r\n				alert(\"".toCharArray();
    _jsp_string6 = "\">".toCharArray();
    _jsp_string0 = "\r\n\r\n\r\n\r\n\r\n<html>\r\n  <head>\r\n    <title></title>\r\n	<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n	<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n	<meta http-equiv=\"expires\" content=\"0\">    \r\n	<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n	<meta http-equiv=\"description\" content=\"This is my page\">\r\n	\r\n	<script type='text/javascript' src='/mobile/plugin/js/jquery/jquery_wev8.js'></script>\r\n	<script type='text/javascript' src='/mobile/plugin/js/jquery/jquery-ui_wev8.js'></script>\r\n	<link rel=\"stylesheet\" href=\"/mobile/plugin/css/cupertino/jquery-ui_wev8.css\" type=\"text/css\">\r\n	<script type=\"text/javascript\" src=\"/js/mylibs/asyncbox/AsyncBox.v1.4_wev8.js\"></script>\r\n	<link rel=\"stylesheet\" href=\"/js/mylibs/asyncbox/skins/ZCMS/asyncbox_wev8.css\">\r\n	<style type=\"text/css\">\r\n		/**\u63a7\u5236alert\u5f39\u51fa\u6846\u7684\u7684\u5bbd\u5ea6 */\r\n		.asyncbox_table{\r\n			font-size: 12px!important;\r\n		}\r\n	\r\n		/**\u63a7\u5236alert\u5f39\u51fa\u6846\u7684\u7684\u5bbd\u5ea6 */\r\n		#asyncbox_alert_content {\r\n			height:auto!important;\r\n			min-height:10px!important;\r\n		}\r\n		\r\n		/**\u63a7\u5236alert\u5f39\u51fa\u6846\u7684\u7684\u5bbd\u5ea6*/\r\n		#asyncbox_alert{\r\n			min-width: 220px!important;\r\n			max-width: 280px!important;\r\n		}\r\n		\r\n		/**\u63a7\u5236\u9875\u9762\u4e0a\u6309\u94ae\u7684\u663e\u793a\u6837\u5f0f*/\r\n		.operationBt {\r\n			height: 24px;\r\n			margin-left: 8px;\r\n			margin-right: 8px;\r\n			margin-top: 8px;\r\n			margin-bottom: 8px;\r\n			line-height: 22px;\r\n			font-size: 14px;\r\n			padding-left: 10px;\r\n			padding-right: 10px;\r\n			color: #fff;\r\n			text-align: center;\r\n			-moz-border-radius: 5px;\r\n			-webkit-border-radius: 5px;\r\n			border-radius: 5px;\r\n			border: 1px solid #0084CB;\r\n			background: #0084CB;\r\n			background: -moz-linear-gradient(0, #30B0F5, #0084CB);\r\n			background: -webkit-gradient(linear, 0 0, 0 100%, from(#30B0F5), to(#0084CB) );\r\n			overflow: hidden;\r\n			width: 28px;\r\n			display: inline-block;\r\n		}\r\n	</style>\r\n".toCharArray();
    _jsp_string4 = ":</td>\r\n   				<td style=\"text-align:left; font-size:12px; color:#666666;width:50%;\">\r\n   				\r\n   					<select id=\"markName\" name=\"markName\" style=\"width:100%;height:25px;float:left;\" >\r\n   						".toCharArray();
    _jsp_string5 = "\r\n    						<option value=\"".toCharArray();
    _jsp_string3 = "!\");\r\n				return false;\r\n			}\r\n			\r\n			//\u53bb\u6389\u5bc6\u7801\u9a8c\u8bc1\u529f\u80fd\uff0c\u76f4\u63a5\u8bbe\u503c\u3002\r\n       		parent.setMarkPath(markNameId);\r\n       		parent.closeSignatureDialog();\r\n		}\r\n		\r\n		function clearSignature(){\r\n       		parent.setMarkPath(\"\");\r\n       		parent.closeSignatureDialog();\r\n		}\r\n	</script>\r\n  </head>\r\n  \r\n  <body>\r\n  	   <form id=\"eletricSignature\" name=\"eletricSignature\" method=\"post\">\r\n   		<table style=\"align:center;width:100%;\">\r\n			<colgroup>\r\n				<col width=\"50%\">\r\n				<col width=\"50%\">\r\n			</colgroup>\r\n   			<tr>\r\n   				<td style=\"text-align:left; font-size:12px; color:#666666;width:50%;\">\r\n   					".toCharArray();
    _jsp_string10 = "</div>\r\n   					\r\n   					<div class=\"operationBt\" style=\"text-align:center;\" onclick=\"parent.closeSignatureDialog();\">".toCharArray();
    _jsp_string7 = "</option>\r\n    					".toCharArray();
    _jsp_string9 = "</div>\r\n   					\r\n   					<div class=\"operationBt\" style=\"text-align:center;\" onclick=\"clearSignature();\">".toCharArray();
    _jsp_string8 = "\r\n   					</select>\r\n   				</td>\r\n   			</tr>\r\n  \r\n   			<tr><td colspan=\"2\" style=\"height:5px;border-top:1px solid #CFD3D8;width:100%;\"></td></tr>\r\n   			<tr>\r\n   				<td colspan=\"2\" align=\"center\">\r\n   					\r\n   					<div class=\"operationBt\" style=\"text-align:center;\" onclick=\"selectSignature();\">".toCharArray();
  }
}
