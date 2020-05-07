/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin._1;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import weaver.general.*;
import java.util.*;
import weaver.hrm.*;
import weaver.file.FileUpload;
import weaver.systeminfo.*;
import weaver.mobile.webservices.workflow.*;

public class _createlist__jsp extends com.caucho.jsp.JavaPage
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
      weaver.mobile.webservices.workflow.WorkflowServiceImpl wsi;
      wsi = (weaver.mobile.webservices.workflow.WorkflowServiceImpl) pageContext.getAttribute("wsi");
      if (wsi == null) {
        wsi = new weaver.mobile.webservices.workflow.WorkflowServiceImpl();
        pageContext.setAttribute("wsi", wsi);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      
request.setCharacterEncoding("UTF-8");
response.setContentType("text/html;charset=UTF-8");
FileUpload fu = new FileUpload(request);

String module = Util.null2String((String)fu.getParameter("module"));
String scope = Util.null2String((String)fu.getParameter("scope"));
String title = Util.null2String((String)fu.getParameter("title"));
String clienttype = Util.null2String((String)fu.getParameter("clienttype"));
String clientlevel = Util.null2String((String)fu.getParameter("clientlevel"));

//\u73b0\u5df2\u5c06\u63d0\u4ea4\u8bf7\u6c42\u65b9\u5f0f\u4fee\u6539\u4e3apost\uff0c\u6545\u4e0d\u9700\u8981\u89e3\u7801\u3002
String keyword = Util.null2String((String)fu.getParameter("keyword"));

User user = HrmUserVarify.getUser (request , response) ;
if(user == null)  return ;

char flag=Util.getSeparator() ;

String[] conditions = new String[2];
conditions[0] = keyword;
conditions[1] = weaver.mobile.plugin.ecology.RequestOperation.AVAILABLE_WORKFLOW;

WorkflowBaseInfo[] wbis = wsi.getCreateWorkflowList(0, 99999999, 0, user.getUID(), 0, conditions);

      out.write(_jsp_string2, 0, _jsp_string2.length);
      if (clienttype.equals("Webclient")) {
      out.write(_jsp_string3, 0, _jsp_string3.length);
      } else {
      out.write(_jsp_string4, 0, _jsp_string4.length);
      }
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((module));
      out.write(_jsp_string6, 0, _jsp_string6.length);
      out.print((scope));
      out.write(_jsp_string7, 0, _jsp_string7.length);
      out.print((keyword));
      out.write(_jsp_string8, 0, _jsp_string8.length);
       
		String wtid = "";
		for(int i=0;wbis!=null&&i<wbis.length;i++) { 
			
			
      out.write(_jsp_string9, 0, _jsp_string9.length);
      
			if(!wbis[i].getWorkflowTypeId().equals(wtid)) {
			
      out.write(_jsp_string10, 0, _jsp_string10.length);
      out.print((wbis[i].getWorkflowTypeName() ));
      out.write(_jsp_string11, 0, _jsp_string11.length);
      
				wtid = wbis[i].getWorkflowTypeId();
			}
			
      out.write(_jsp_string12, 0, _jsp_string12.length);
      out.print((wbis[i].getWorkflowId()));
      out.write(_jsp_string13, 0, _jsp_string13.length);
      out.print((wbis[i].getWorkflowName() ));
      out.write(_jsp_string14, 0, _jsp_string14.length);
      
		}
		
      out.write(_jsp_string15, 0, _jsp_string15.length);
      out.print((module));
      out.write(_jsp_string16, 0, _jsp_string16.length);
      out.print((scope));
      out.write(_jsp_string17, 0, _jsp_string17.length);
      out.print((clienttype));
      out.write(_jsp_string18, 0, _jsp_string18.length);
      out.print((clientlevel));
      out.write(_jsp_string19, 0, _jsp_string19.length);
      out.print((module));
      out.write(_jsp_string16, 0, _jsp_string16.length);
      out.print((scope));
      out.write(_jsp_string20, 0, _jsp_string20.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/1/createlist.jsp"), 3193664928979303535L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string16;
  private final static char []_jsp_string8;
  private final static char []_jsp_string9;
  private final static char []_jsp_string20;
  private final static char []_jsp_string12;
  private final static char []_jsp_string11;
  private final static char []_jsp_string5;
  private final static char []_jsp_string3;
  private final static char []_jsp_string10;
  private final static char []_jsp_string2;
  private final static char []_jsp_string4;
  private final static char []_jsp_string7;
  private final static char []_jsp_string17;
  private final static char []_jsp_string6;
  private final static char []_jsp_string13;
  private final static char []_jsp_string19;
  private final static char []_jsp_string15;
  private final static char []_jsp_string14;
  private final static char []_jsp_string0;
  private final static char []_jsp_string18;
  private final static char []_jsp_string1;
  static {
    _jsp_string16 = "&scope=".toCharArray();
    _jsp_string8 = "\"></td>\r\n				<td>&nbsp;</td>\r\n			</tr>\r\n		</table>\r\n	</div>\r\n\r\n	<div class=\"list\" id=\"list\">\r\n		".toCharArray();
    _jsp_string9 = "\r\n			".toCharArray();
    _jsp_string20 = "\";\r\n}\r\n\r\n</script>\r\n\r\n</body>\r\n</html>".toCharArray();
    _jsp_string12 = "\r\n			\r\n			<a href=\"javascript:goCreate(".toCharArray();
    _jsp_string11 = "\r\n					</TD>\r\n					<TD class=\"itemnavpoint\">\r\n						\r\n					</TD>\r\n				 </TR>\r\n			</TABLE>\r\n			</div>\r\n			".toCharArray();
    _jsp_string5 = "\">\r\n		<table style=\"width:100%;height:40px;font-size:13px;\">\r\n			<tr>\r\n				<td width=\"10%\" align=\"left\" valign=\"middle\" style=\"padding-left:5px;\">\r\n					<a href=\"javascript:goBack();\">\r\n						<div style=\"width:56px;height:26px;background:url('/images/bg-top-btn_wev8.png') no-repeat;text-align:center;line-height:26px;color:#000;\">\r\n						\u8fd4\u56de\r\n						</div>\r\n					</a>\r\n				</td>\r\n				<td align=\"center\" valign=\"middle\">\r\n					<div id=\"view_title\">\u9009\u62e9\u6d41\u7a0b</div>\r\n				</td>\r\n				<td width=\"10%\" align=\"right\" valign=\"middle\" style=\"padding-right:5px;\">\r\n				</td>\r\n			</tr>\r\n		</table>\r\n	</div>\r\n\r\n	<form id=\"clform\" action=\"/mobile/plugin/1/createlist.jsp\" method=\"post\">\r\n	\r\n	<input type=\"hidden\" name=\"module\" value=\"".toCharArray();
    _jsp_string3 = "display:block;".toCharArray();
    _jsp_string10 = "\r\n			<div class=\"listitem\">\r\n			<table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"table-layout:fixed;\">\r\n				<tr>\r\n					<TD class=\"itemNo\">\r\n						<img src=\"/mobile/plugin/1/images/itemnavimg_wev8.png\" width=\"10px\" height=\"10px\" style=\"margin-top:8px;\"> \r\n					</TD>\r\n					<TD class=\"itemcontent\" >\r\n						".toCharArray();
    _jsp_string2 = "\r\n<!DOCTYPE html>\r\n<html>\r\n<head>\r\n	<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n	<meta name=\"author\" content=\"Weaver E-Mobile Dev Group\" />\r\n	<meta name=\"description\" content=\"Weaver E-mobile\" />\r\n	<meta name=\"keywords\" content=\"weaver,e-mobile\" />\r\n	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n	<title></title>\r\n	<script type='text/javascript' src='/mobile/plugin/js/jquery/jquery_wev8.js'></script>\r\n	<script type='text/javascript' src='/mobile/plugin/js/jquery/jquery-ui_wev8.js'></script>\r\n	<link rel=\"stylesheet\" href=\"/mobile/plugin/css/cupertino/jquery-ui_wev8.css\" type=\"text/css\">\r\n	<link rel=\"stylesheet\" href=\"/mobile/plugin/css/mobile_wev8.css\" type=\"text/css\">\r\n	<style type=\"text/css\">\r\n	.search {\r\n		width: 100%;\r\n		height: 42px;\r\n		text-align: center;\r\n		position: relative;\r\n		background: #7F94AF;\r\n		background: -moz-linear-gradient(0, #A4B0C0, #7F94AF);\r\n		background: -webkit-gradient(linear, 0 0, 0 100%, from(#A4B0C0), to(#7F94AF) );\r\n		border-bottom: 1px solid #5D6875;\r\n	}\r\n	.searchImg {\r\n		width: 25px;\r\n		padding: 2px;\r\n		margin-left: auto;\r\n		margin-right: auto;\r\n		border-top: 1px solid #687D97;\r\n		border-right: 0;\r\n		border-bottom: 1px solid #687D97;\r\n		border-left: 1px solid #687D97;\r\n		background: #fff;\r\n		-moz-border-radius: 5px 0 0 5px;\r\n		-webkit-border-radius: 5px 0 0 5px;\r\n		border-radius: 5px 0 0 5px;\r\n		-webkit-box-shadow: inset 0px 1px 0px 0px #BCBFC3;\r\n		-moz-box-shadow: inset 0px 1px 0px 0px #BCBFC3;\r\n		box-shadow: inset 0px 1px 0px 0px #BCBFC3;\r\n	}\r\n	.searchText {\r\n		width: 100%;\r\n		margin-left: auto;\r\n		margin-right: auto;\r\n		border-top: 1px solid #687D97;\r\n		border-right: 1px solid #687D97;\r\n		border-bottom: 1px solid #687D97;\r\n		border-left: 0;\r\n		background: #fff;\r\n		overflow:hidden;\r\n		-moz-border-radius: 0 5px 5px 0;\r\n		-webkit-border-radius: 0 5px 5px 0;\r\n		border-radius: 0 5px 5px 0;\r\n		-webkit-box-shadow: inset 0px 1px 0px 0px #BCBFC3;\r\n		-moz-box-shadow: inset 0px 1px 0px 0px #BCBFC3;\r\n		box-shadow: inset 0px 1px 0px 0px #BCBFC3;\r\n	}\r\n	.prompt {\r\n		color: #777878;\r\n	}\r\n	.list {\r\n		width: 100%;\r\n		background: url(/images/bg_w_75_wev8.png);\r\n	}\r\n	.listitem {\r\n		width:100%;\r\n		height:46px;\r\n		background-color:#EFF2F6;\r\n		border-bottom:1px solid #D8DDE4;\r\n	}\r\n	.itemnavpoint {\r\n		height:100%;width:26px;text-align:center;\r\n	}\r\n	.itemnavpoint img {\r\n		width:10px;\r\n		heigth:14px;\r\n	}\r\n	.itemNo {\r\n		height:100%;width:30px;text-align:center;\r\n		font-size: 16px;\r\n		color: #444;\r\n		font-weight: bold;\r\n	}\r\n	.itemcontent {\r\n		width:*;\r\n		height:100%;\r\n		font-size: 16px;\r\n		color: #444;\r\n		font-weight: bold;\r\n		word-break:keep-all;\r\n		text-overflow:ellipsis;\r\n		white-space:nowrap;\r\n		overflow:hidden;\r\n	}\r\n	.item {\r\n		width:100%;\r\n		height:46px;\r\n		background-color:#fff;\r\n		border-bottom:1px solid #c6c6c6;\r\n	}\r\n	\r\n	.itemLeft {\r\n		height:100%;width:45px;text-align:right;color:#c6c6c6;\r\n	}\r\n	.itemRt {\r\n		width:*;height:100%;font-size: 14px;color: #123885;word-break:keep-all;text-overflow:ellipsis;white-space:nowrap;overflow:hidden;\r\n	}\r\n	</style>\r\n</head>\r\n<body>\r\n\r\n<div id=\"view_page\">\r\n\r\n	<div id=\"view_header\" style=\"".toCharArray();
    _jsp_string4 = "display:none;".toCharArray();
    _jsp_string7 = "\">\r\n	\r\n	<div class=\"search\">\r\n		<div style=\"height:5px\"></div>\r\n		<table style=\"width:100%;height: 28px;\">\r\n			<tr>\r\n				<td>&nbsp;</td>\r\n				<td class=\"searchImg\" onclick=\"searchClick()\"><img src=\"/images/icon-search_wev8.png\"></td>\r\n				<td class=\"searchText\"><input type=\"text\" id=\"keyword\" name=\"keyword\" class=\"prompt\" style=\"border: none;width: 100%;height: 26px;\" value=\"".toCharArray();
    _jsp_string17 = "&clienttype=".toCharArray();
    _jsp_string6 = "\">\r\n	<input type=\"hidden\" name=\"scope\" value=\"".toCharArray();
    _jsp_string13 = ")\">\r\n			<div class=\"item\">\r\n			<table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"table-layout:fixed;\">\r\n				<tr>\r\n					<TD class=\"itemLeft\">\r\n					\r\n					</TD>\r\n					<TD class=\"itemRt\">\r\n						".toCharArray();
    _jsp_string19 = "\";\r\n}\r\n\r\nfunction goBack() {\r\n	location = \"/list.do?module=".toCharArray();
    _jsp_string15 = "\r\n	</div>\r\n\r\n	</form>\r\n</div>\r\n\r\n<script type=\"text/javascript\">\r\n$(document).ready(function() {\r\n\r\n	$.ajaxSetup({ cache: false });\r\n\r\n	$('#keyword').keypress(function(e) {\r\n        if(e.which == 13) {\r\n            jQuery(this).blur();\r\n			$(\"#clform\").submit();\r\n        }\r\n    });\r\n});\r\n\r\nfunction searchClick() {\r\n	$(\"#clform\").submit();\r\n}\r\n\r\nfunction goCreate(wid) {\r\n	location = \"/mobile/plugin/1/view.jsp?workflowid=\"+wid+\"&method=create&module=".toCharArray();
    _jsp_string14 = "\r\n					</TD>\r\n				 </TR>\r\n			</TABLE>\r\n			</div>\r\n			</a>\r\n			\r\n			<div class=\"blankLines\"></div>\r\n		".toCharArray();
    _jsp_string0 = "\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string18 = "&clientlevel=".toCharArray();
    _jsp_string1 = "\r\n\r\n".toCharArray();
  }
}
