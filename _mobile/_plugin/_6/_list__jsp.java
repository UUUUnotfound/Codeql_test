/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin._6;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import weaver.general.*;
import java.util.*;
import weaver.hrm.*;
import weaver.systeminfo.*;

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
    response.setContentType("text/html; charset=UTF-8");
    request.setCharacterEncoding("UTF-8");
    try {
      out.write(_jsp_string0, 0, _jsp_string0.length);
      weaver.hrm.resource.ResourceComInfo resourceComInfo;
      resourceComInfo = (weaver.hrm.resource.ResourceComInfo) pageContext.getAttribute("resourceComInfo");
      if (resourceComInfo == null) {
        resourceComInfo = new weaver.hrm.resource.ResourceComInfo();
        pageContext.setAttribute("resourceComInfo", resourceComInfo);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.conn.RecordSet recordSet;
      recordSet = (weaver.conn.RecordSet) pageContext.getAttribute("recordSet");
      if (recordSet == null) {
        recordSet = new weaver.conn.RecordSet();
        pageContext.setAttribute("recordSet", recordSet);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.conn.RecordSet rs;
      rs = (weaver.conn.RecordSet) pageContext.getAttribute("rs");
      if (rs == null) {
        rs = new weaver.conn.RecordSet();
        pageContext.setAttribute("rs", rs);
      }
      out.write(_jsp_string2, 0, _jsp_string2.length);
      
request.setCharacterEncoding("UTF-8");
response.setContentType("text/html;charset=UTF-8");

User user = HrmUserVarify.getUser(request , response);
if(user == null)  return ;

int detailid = Util.getIntValue((String)request.getParameter("detailid"));
String from = Util.null2String((String)request.getParameter("from"));
String module = Util.null2String((String)request.getParameter("module"));
String scope = Util.null2String((String)request.getParameter("scope"));
String clienttype = Util.null2String((String)request.getParameter("clienttype"));

      out.write(_jsp_string3, 0, _jsp_string3.length);
      if (clienttype.equals("Webclient")) {
      out.write(_jsp_string4, 0, _jsp_string4.length);
      } else {
      out.write(_jsp_string5, 0, _jsp_string5.length);
      }
      out.write(_jsp_string6, 0, _jsp_string6.length);
      out.print((module));
      out.write(_jsp_string7, 0, _jsp_string7.length);
      out.print((scope));
      out.write(_jsp_string8, 0, _jsp_string8.length);
      out.print((from));
      out.write(_jsp_string9, 0, _jsp_string9.length);
      out.print((detailid));
      out.write(_jsp_string10, 0, _jsp_string10.length);
      out.print((module));
      out.write(_jsp_string7, 0, _jsp_string7.length);
      out.print((scope));
      out.write(_jsp_string8, 0, _jsp_string8.length);
      out.print((from));
      out.write(_jsp_string9, 0, _jsp_string9.length);
      out.print((detailid));
      out.write(_jsp_string11, 0, _jsp_string11.length);
      out.print((module));
      out.write(_jsp_string7, 0, _jsp_string7.length);
      out.print((scope));
      out.write(_jsp_string12, 0, _jsp_string12.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/6/list.jsp"), 4398605495960997859L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string7;
  private final static char []_jsp_string12;
  private final static char []_jsp_string10;
  private final static char []_jsp_string4;
  private final static char []_jsp_string6;
  private final static char []_jsp_string9;
  private final static char []_jsp_string11;
  private final static char []_jsp_string5;
  private final static char []_jsp_string8;
  private final static char []_jsp_string1;
  private final static char []_jsp_string3;
  private final static char []_jsp_string0;
  private final static char []_jsp_string2;
  static {
    _jsp_string7 = "&scope=".toCharArray();
    _jsp_string12 = "\";\r\n}\r\n\r\n</script>\r\n\r\n</BODY>\r\n</HTML>".toCharArray();
    _jsp_string10 = "&unit=1&ot=\"+type+\"&o=\"+id;\r\n		$.get(url, function(data) {\r\n	    	\r\n			if(data.indexOf('{\"error\":')==0) {\r\n				var errormsg = eval('(' + data + ')').error;\r\n				if(errormsg&&errormsg.length>0) {\r\n					alert(errormsg);\r\n					location = \"/login.do\";\r\n					return;\r\n				}\r\n			}\r\n			\r\n			if(data.trim().length>0) {\r\n			\r\n				var doms = $(data);\r\n				\r\n				$(\"#orglist\").html(\"\");\r\n				\r\n		    	for(var i=0;i<doms.length;i++) {\r\n		    		var dom = doms[i];\r\n		   			\r\n		    		if(dom && dom.tagName) {\r\n		    			if(dom.tagName==\"META\") {\r\n		    			} else if(dom.tagName==\"TITLE\") {\r\n		    			} else if(dom.tagName==\"SCRIPT\") {\r\n		    			} else if(dom.tagName==\"LINK\") {\r\n		    			} else if(dom.tagName==\"STYLE\") {\r\n		    			} else if(dom.tagName && dom.outerHTML) {\r\n		    				$(\"#orglist\").append(dom.outerHTML);\r\n		    			}\r\n		    		}\r\n		    	}\r\n			} else {\r\n				$(\"#orglist\").html(\"\");\r\n			}\r\n		});\r\n\r\n	} else if(type==3&&id>0) {\r\n		\r\n	} else {\r\n		if($(\"#t_\"+type+\"_\"+id).attr(\"expand\")==1){\r\n			$(\"#s_\"+type+\"_\"+id).hide();\r\n			$(\"#t_\"+type+\"_\"+id).attr(\"expand\",\"0\");\r\n			if($(\"#t_\"+type+\"_\"+id).find(\"img\").length>1) $(\"#t_\"+type+\"_\"+id).find(\"img\")[1].src=\"/mobile/plugin/6/images/icon4_wev8.png\";\r\n		} else {\r\n			$(\"#s_\"+type+\"_\"+id).show();\r\n			$(\"#t_\"+type+\"_\"+id).attr(\"expand\",\"1\");\r\n			if($(\"#t_\"+type+\"_\"+id).find(\"img\").length>1) $(\"#t_\"+type+\"_\"+id).find(\"img\")[1].src=\"/mobile/plugin/6/images/icon5_wev8.png\";\r\n			if($(\"#t_\"+type+\"_\"+id).attr(\"isload\")==0) {\r\n				\r\n				var ileft = parseInt($(\"#i_\"+type+\"_\"+id).css(\"left\"),0);\r\n				var lleft = parseInt($(\"#l_\"+type+\"_\"+id).css(\"left\"),0);\r\n				\r\n				$(\"#s_\"+type+\"_\"+id).html('<div style=\"position:relative;height:35px;line-height:38px;padding-left:30px;\"><div style=\"position:absolute;top:8px;height:20px;line-height:20px;\"><img height=\"20\" src=\"/mobile/plugin/6/images/waiting_wev8.gif\"></div><div style=\"position:absolute;top:4px;left:50px;height:30px;line-height:30px;\">\u6b63\u5728\u8bfb\u53d6\u6570\u636e...</div></div>');\r\n\r\n				var url = \"/mobile/plugin/6/get.jsp?module=".toCharArray();
    _jsp_string4 = "display:block;".toCharArray();
    _jsp_string6 = "\">\r\n		<table style=\"width: 100%; height: 40px;\">\r\n			<tr>\r\n				<td width=\"10%\" align=\"left\" valign=\"middle\" style=\"padding-left:5px;\">\r\n					<a href=\"javascript:goBack();\">\r\n						<div style=\"width:56px;height:26px;background:url('/images/bg-top-btn_wev8.png') no-repeat;text-align:center;line-height:26px;color:#000;\">\r\n						\u8fd4\u56de\r\n						</div>\r\n					</a>\r\n				</td>\r\n				<td align=\"center\" valign=\"middle\">\r\n					<div id=\"view_title\">\u6309\u7ec4\u7ec7\u67e5\u770b</div>\r\n				</td>\r\n				<td width=\"10%\" align=\"right\" valign=\"middle\" style=\"padding-right:5px;\">\r\n				</td>\r\n			</tr>\r\n		</table>\r\n	</div>\r\n\r\n	<div id=\"orglist\" style=\"width:100%;height:100%;background:#E0E0E0;\">\r\n	\r\n	</div>\r\n\r\n</div>\r\n\r\n<div id=\"loading\">\u6b63\u5728\u52a0\u8f7d\u6570\u636e\uff0c\u8bf7\u7a0d\u7b49...</div>\r\n<div id=\"loadingmask\" class=\"ui-widget-overlay\"></div>\r\n\r\n<script type=\"text/javascript\">\r\n$(document).ready(function() {\r\n	\r\n	$.ajaxSetup({ cache: false });\r\n	\r\n	clickOrg(0,0);\r\n	\r\n	$( \"#loading\" ).hide();\r\n	$( \"#loadingmask\" ).hide();\r\n	\r\n});\r\n\r\nfunction clickOrg(type,id) {\r\n	if(type==0&&id==0) {\r\n		$(\"#orglist\").html('<div style=\"position:relative;height:35px;line-height:38px;padding-left:30px;\"><div style=\"position:absolute;top:8px;height:20px;line-height:20px;\"><img height=\"20\" src=\"/mobile/plugin/6/images/waiting_wev8.gif\"></div><div style=\"position:absolute;top:4px;left:50px;height:30px;line-height:30px;\">\u6b63\u5728\u8bfb\u53d6\u6570\u636e...</div></div>');\r\n\r\n		var url = \"/mobile/plugin/6/get.jsp?module=".toCharArray();
    _jsp_string9 = "&detailid=".toCharArray();
    _jsp_string11 = "&unit=1&ot=\"+type+\"&o=\"+id;\r\n				$.get(url, function(data) {\r\n			    	\r\n					if(data.indexOf('{\"error\":')==0) {\r\n						var errormsg = eval('(' + data + ')').error;\r\n						if(errormsg&&errormsg.length>0) {\r\n							alert(errormsg);\r\n							location = \"/login.do\";\r\n							return;\r\n						}\r\n					}\r\n					\r\n					if(data.trim().length>0) {\r\n					\r\n						var doms = $(data);\r\n						\r\n						$(\"#s_\"+type+\"_\"+id).html('');\r\n						\r\n				    	for(var i=0;i<doms.length;i++) {\r\n				    		var dom = doms[i];\r\n				   			\r\n				    		if(dom && doms[i].tagName) {\r\n				    			\r\n				    			if(dom.tagName==\"META\") {\r\n				    			} else if(dom.tagName==\"TITLE\") {\r\n				    			} else if(dom.tagName==\"SCRIPT\") {\r\n				    			} else  if(dom.tagName==\"LINK\") {\r\n				    			} else if(dom.tagName==\"STYLE\") {\r\n				    			} else if(dom.tagName && dom.outerHTML) {\r\n				    				$(\"#s_\"+type+\"_\"+id).append(dom.outerHTML);\r\n				    			}\r\n\r\n				    			if($(\"#i\"+dom.id.substring(1)).length>0) \r\n				    				$(\"#i\"+dom.id.substring(1)).css(\"left\",(ileft+20)+\"px\");\r\n				    			if($(\"#l\"+dom.id.substring(1)).length>0) \r\n				    				$(\"#l\"+dom.id.substring(1)).css(\"left\",(lleft+20)+\"px\");\r\n				    			if($(\"#b\"+dom.id.substring(1)).length>0) \r\n				    				$(\"#b\"+dom.id.substring(1)).css(\"left\",(ileft+0)+\"px\");\r\n				    			\r\n\r\n				    		}\r\n				    	}\r\n				    	\r\n				    	$(\"#t_\"+type+\"_\"+id).attr(\"isload\",\"1\");\r\n					} else {\r\n						$(\"#s_\"+type+\"_\"+id).html('');\r\n					}\r\n				});\r\n				\r\n			}\r\n		}\r\n	}\r\n}\r\n\r\nfunction goBack() {\r\n	location = \"/list.do?module=".toCharArray();
    _jsp_string5 = "display:none;".toCharArray();
    _jsp_string8 = "&from=".toCharArray();
    _jsp_string1 = "\r\n".toCharArray();
    _jsp_string3 = "\r\n<!DOCTYPE html>\r\n<html>\r\n<head>\r\n	<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n	<meta name=\"author\" content=\"Weaver E-Mobile Dev Group\" />\r\n	<meta name=\"description\" content=\"Weaver E-mobile\" />\r\n	<meta name=\"keywords\" content=\"weaver,e-mobile\" />\r\n	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n	<title>\u6309\u7ec4\u7ec7\u67e5\u8be2</title>\r\n	<script type='text/javascript' src='/mobile/plugin/js/jquery/jquery_wev8.js'></script>\r\n	<script type='text/javascript' src='/mobile/plugin/js/jquery/jquery-ui_wev8.js'></script>\r\n	<link rel=\"stylesheet\" href=\"/mobile/plugin/css/cupertino/jquery-ui_wev8.css\" type=\"text/css\">\r\n	<link rel=\"stylesheet\" href=\"/mobile/plugin/css/mobile_wev8.css\" type=\"text/css\">\r\n</head>\r\n<body>\r\n\r\n<div id=\"view_page\">\r\n\r\n	<div id=\"view_header\" style=\"".toCharArray();
    _jsp_string0 = "\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string2 = "\r\n\r\n".toCharArray();
  }
}
