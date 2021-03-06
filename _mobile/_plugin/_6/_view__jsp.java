/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin._6;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import weaver.hrm.location.LocationComInfo;
import weaver.hrm.company.DepartmentComInfo;
import weaver.hrm.company.SubCompanyComInfo;
import weaver.hrm.resource.ResourceComInfo;
import weaver.hrm.job.JobTitlesComInfo;
import weaver.hrm.job.JobActivitiesComInfo;
import weaver.general.*;
import weaver.systeminfo.*;
import java.util.*;
import weaver.hrm.*;

public class _view__jsp extends com.caucho.jsp.JavaPage
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
      
request.setCharacterEncoding("UTF-8");
response.setContentType("text/html;charset=UTF-8");

User user = HrmUserVarify.getUser(request , response);
if(user == null)  return ;

int detailid = Util.getIntValue((String)request.getParameter("detailid"));

if(detailid==-1) {
	String url = "/mobile/plugin/6/list.jsp";
	if(request.getQueryString()!=null&&!"".equals(request.getQueryString())) url += "?" + request.getQueryString();
	response.sendRedirect(url);
	return;
}
//\u6807\u8bb0\u662f\u4ece\u5fae\u641c\u6a21\u5757\u8fdb\u5165start
String fromES=Util.null2String((String)request.getParameter("fromES"));
//\u6807\u8bb0\u662f\u4ece\u5fae\u641c\u6a21\u5757\u8fdb\u5165end
String from = Util.null2String((String)request.getParameter("from"));
String module = Util.null2String((String)request.getParameter("module"));
String scope = Util.null2String((String)request.getParameter("scope"));
String clienttype = Util.null2String((String)request.getParameter("clienttype"));

ResourceComInfo rci = new ResourceComInfo();
SubCompanyComInfo scci = new SubCompanyComInfo();
DepartmentComInfo dci = new DepartmentComInfo();
LocationComInfo lci = new LocationComInfo();
JobTitlesComInfo jtci = new JobTitlesComInfo();
JobActivitiesComInfo jaci = new JobActivitiesComInfo();

String status = Util.null2String(rci.getStatus(detailid+"")+"");
String statusname = "";
if(status.equals("0")) statusname=SystemEnv.getHtmlLabelName(15710,user.getLanguage());
if(status.equals("1")) statusname=SystemEnv.getHtmlLabelName(15711,user.getLanguage());
if(status.equals("2")) statusname=SystemEnv.getHtmlLabelName(480,user.getLanguage());
if(status.equals("3")) statusname=SystemEnv.getHtmlLabelName(15844,user.getLanguage());
if(status.equals("4")) statusname=SystemEnv.getHtmlLabelName(6094,user.getLanguage());
if(status.equals("5")) statusname=SystemEnv.getHtmlLabelName(6091,user.getLanguage());
if(status.equals("6")) statusname=SystemEnv.getHtmlLabelName(6092,user.getLanguage());
if(status.equals("7")) statusname=SystemEnv.getHtmlLabelName(2245,user.getLanguage());
if(status.equals("10")) statusname=SystemEnv.getHtmlLabelName(1831,user.getLanguage());

      out.write(_jsp_string1, 0, _jsp_string1.length);
      out.print((rci.getLastname(detailid+"") ));
      out.write(_jsp_string2, 0, _jsp_string2.length);
      out.print((rci.getLastname(detailid+"") ));
      out.write(_jsp_string3, 0, _jsp_string3.length);
      out.print((rci.getLastname(detailid+"") ));
      out.write(_jsp_string4, 0, _jsp_string4.length);
      out.print((jtci.getJobTitlesname(rci.getJobTitle(detailid+"")) ));
      out.write('/');
      out.print((jaci.getJobActivitiesname(jtci.getJobactivityid(rci.getJobTitle(detailid+""))) ));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((scci.getSubCompanyname(rci.getSubCompanyID(detailid+"")) ));
      out.write(_jsp_string6, 0, _jsp_string6.length);
      out.print((dci.getDepartmentname(rci.getDepartmentID(detailid+"")) ));
      out.write(_jsp_string7, 0, _jsp_string7.length);
      
			if(rci.getMessagerUrls(detailid+"")!=null&&!"".equals(rci.getMessagerUrls(detailid+""))) {
			
      out.write(_jsp_string8, 0, _jsp_string8.length);
      out.print((rci.getMessagerUrls(detailid+"")));
      out.write(_jsp_string9, 0, _jsp_string9.length);
      
			} else {
			
      out.write(_jsp_string10, 0, _jsp_string10.length);
       
			}
			
      out.write(_jsp_string11, 0, _jsp_string11.length);
      out.print((rci.getLastname(rci.getManagerID(detailid+"")) ));
      out.write(_jsp_string12, 0, _jsp_string12.length);
      out.print((statusname ));
      out.write(_jsp_string13, 0, _jsp_string13.length);
      out.print((lci.getLocationname(rci.getLocationid(detailid+"")) ));
      out.write(_jsp_string14, 0, _jsp_string14.length);
      out.print((rci.getTelephone(detailid+"") ));
      out.write(_jsp_string15, 0, _jsp_string15.length);
      if(rci.getTelephone(detailid+"")!=null&&!"".equals(rci.getTelephone(detailid+""))) { 
      out.write(_jsp_string16, 0, _jsp_string16.length);
      out.print((rci.getTelephone(detailid+"") ));
      out.write(_jsp_string17, 0, _jsp_string17.length);
       } 
      out.write(_jsp_string18, 0, _jsp_string18.length);
      out.print((rci.getMobile(detailid+"") ));
      out.write(_jsp_string15, 0, _jsp_string15.length);
      if(rci.getMobile(detailid+"")!=null&&!"".equals(rci.getMobile(detailid+""))) { 
      out.write(_jsp_string19, 0, _jsp_string19.length);
      out.print((rci.getMobile(detailid+"") ));
      out.write(_jsp_string20, 0, _jsp_string20.length);
      out.print((rci.getMobile(detailid+"") ));
      out.write(_jsp_string21, 0, _jsp_string21.length);
       } 
      out.write(_jsp_string22, 0, _jsp_string22.length);
      out.print((rci.getEmail(detailid+"") ));
      out.write(_jsp_string15, 0, _jsp_string15.length);
      if(rci.getEmail(detailid+"")!=null&&!"".equals(rci.getEmail(detailid+""))) { 
      out.write(_jsp_string23, 0, _jsp_string23.length);
      out.print((rci.getEmail(detailid+"") ));
      out.write(_jsp_string24, 0, _jsp_string24.length);
       } 
      out.write(_jsp_string25, 0, _jsp_string25.length);
      out.print((fromES));
      out.write(_jsp_string26, 0, _jsp_string26.length);
      out.print((module));
      out.write(_jsp_string27, 0, _jsp_string27.length);
      out.print((scope));
      out.write(_jsp_string28, 0, _jsp_string28.length);
      out.print((module));
      out.write(_jsp_string27, 0, _jsp_string27.length);
      out.print((scope));
      out.write(_jsp_string29, 0, _jsp_string29.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/6/view.jsp"), 2286367804716989256L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string27;
  private final static char []_jsp_string2;
  private final static char []_jsp_string8;
  private final static char []_jsp_string10;
  private final static char []_jsp_string11;
  private final static char []_jsp_string14;
  private final static char []_jsp_string4;
  private final static char []_jsp_string3;
  private final static char []_jsp_string26;
  private final static char []_jsp_string18;
  private final static char []_jsp_string29;
  private final static char []_jsp_string6;
  private final static char []_jsp_string0;
  private final static char []_jsp_string17;
  private final static char []_jsp_string15;
  private final static char []_jsp_string28;
  private final static char []_jsp_string23;
  private final static char []_jsp_string9;
  private final static char []_jsp_string13;
  private final static char []_jsp_string7;
  private final static char []_jsp_string20;
  private final static char []_jsp_string5;
  private final static char []_jsp_string19;
  private final static char []_jsp_string21;
  private final static char []_jsp_string22;
  private final static char []_jsp_string25;
  private final static char []_jsp_string16;
  private final static char []_jsp_string12;
  private final static char []_jsp_string1;
  private final static char []_jsp_string24;
  static {
    _jsp_string27 = "&scope=".toCharArray();
    _jsp_string2 = "</title>\r\n	<script type='text/javascript' src='/mobile/plugin/js/jquery/jquery_wev8.js'></script>\r\n	<script type='text/javascript' src='/mobile/plugin/js/jquery/jquery-ui_wev8.js'></script>\r\n	<link rel=\"stylesheet\" href=\"/mobile/plugin/css/cupertino/jquery-ui_wev8.css\" type=\"text/css\">\r\n	<link rel=\"stylesheet\" href=\"/mobile/plugin/css/mobile_wev8.css\" type=\"text/css\">\r\n	<style type=\"text/css\">\r\n	.textfield {\r\n		width:100%;\r\n		height:32px;\r\n		line-height:30px;\r\n	}\r\n	</style>\r\n</head>\r\n<body>\r\n\r\n<div id=\"view_page\">\r\n\r\n	<div id=\"view_header\">\r\n		<table style=\"width: 100%; height: 40px;\">\r\n			<tr>\r\n				<td width=\"10%\" align=\"left\" valign=\"middle\" style=\"padding-left:5px;\">\r\n					<a href=\"javascript:goBack();\">\r\n						<div style=\"width:56px;height:26px;background:url('/images/bg-top-btn_wev8.png') no-repeat;text-align:center;line-height:26px;color:#000;\">\r\n						\u8fd4\u56de\r\n						</div>\r\n					</a>\r\n				</td>\r\n				<td align=\"center\" valign=\"middle\">\r\n					<div id=\"view_title\">".toCharArray();
    _jsp_string8 = "\r\n			<img src=\"".toCharArray();
    _jsp_string10 = "\r\n			<img src=\"/images/icon_user_wev8.png\" height=\"64px\" width=\"64px\" style=\"padding-top:30px;\">\r\n			".toCharArray();
    _jsp_string11 = "\r\n			</div>\r\n				\r\n		</div>\r\n		\r\n	</div>\r\n	\r\n	<div style=\"width:100%;height:103px;position:relative;\">\r\n	\r\n		<div style=\"position:absolute;left:10px;top:10px;right:10px;\">\r\n	\r\n		<div style=\"width:100%;height:90px;-webkit-border-radius:6px;-moz-border-radius:6px;background:url(/images/bg_w_65_wev8.png);border:solid 1px #DEDEDE;\">\r\n			<div class=\"textfield text-ellipsis\" style=\"border-bottom:solid 1px #DEDEDE;\">&nbsp;&nbsp;&nbsp;&nbsp;\u76f4\u63a5\u4e0a\u7ea7\uff1a".toCharArray();
    _jsp_string14 = "</div>\r\n		</div>\r\n		\r\n		</div>\r\n		\r\n	</div>\r\n	\r\n	<div style=\"width:100%;height:100px;position:relative;\">\r\n		\r\n		<div style=\"position:absolute;left:10px;top:10px;right:10px;\">\r\n		\r\n		<div style=\"width:100%;height:90px;-webkit-border-radius:6px;-moz-border-radius:6px;background:url(/images/bg_w_65_wev8.png);border:solid 1px #DEDEDE;\">\r\n			\r\n			<div style=\"width:100%;height:30px;position:relative;line-height:30px;border-bottom:solid 1px #DEDEDE;\">\r\n				<div style=\"position:absolute;left:0px;right:0px;top:0px;\">&nbsp;&nbsp;&nbsp;&nbsp;\u529e\u516c\u7535\u8bdd\uff1a".toCharArray();
    _jsp_string4 = "</div>\r\n				<div class=\"textfield text-ellipsis\" style=\"border-bottom:solid 1px #DEDEDE;\">&nbsp;&nbsp;&nbsp;&nbsp;\u5c97\u4f4d/\u804c\u52a1\uff1a".toCharArray();
    _jsp_string3 = "</div>\r\n				</td>\r\n				<td width=\"10%\" align=\"right\" valign=\"middle\" style=\"padding-right:5px;\">\r\n				</td>\r\n			</tr>\r\n		</table>\r\n	</div>\r\n	\r\n	<div style=\"width:100%;height:135px;position:relative;\">\r\n	\r\n		<div style=\"position:absolute;left:10px;top:10px;right:120px;\">\r\n	\r\n			<div style=\"width:100%;height:122px;-webkit-border-radius:6px;-moz-border-radius:6px;background:url(/images/bg_w_65_wev8.png);border:solid 1px #DEDEDE;\">\r\n				<div class=\"textfield text-ellipsis\" style=\"border-bottom:solid 1px #DEDEDE;\">&nbsp;&nbsp;&nbsp;&nbsp;\u59d3\u540d\uff1a".toCharArray();
    _jsp_string26 = "\";\r\n	if(fromES==\"true\"){\r\n		 location = \"/mobile/plugin/fullsearch/list.jsp?module=".toCharArray();
    _jsp_string18 = "\r\n			</div>\r\n\r\n			<div style=\"width:100%;height:30px;position:relative;line-height:30px;border-bottom:solid 1px #DEDEDE;\">\r\n				<div style=\"position:absolute;left:0px;right:0px;top:0px;\">&nbsp;&nbsp;&nbsp;&nbsp;\u79fb\u52a8\u7535\u8bdd\uff1a".toCharArray();
    _jsp_string29 = "\";\r\n	}\r\n}\r\n\r\nfunction doLeftButton() {\r\n	goBack();\r\n	return 1;\r\n}\r\n\r\n</script>\r\n\r\n</BODY>\r\n</HTML>".toCharArray();
    _jsp_string6 = "</div>\r\n				<div class=\"textfield text-ellipsis\">&nbsp;&nbsp;&nbsp;&nbsp;\u90e8\u95e8\uff1a".toCharArray();
    _jsp_string0 = "\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string17 = "\"><img width=\"30px\" src=\"/images/icon_dial_wev8.png\"></a></div>\r\n				".toCharArray();
    _jsp_string15 = "</div>\r\n				".toCharArray();
    _jsp_string28 = "&fromES=true\";\r\n	}else{\r\n		location = \"/list.do?module=".toCharArray();
    _jsp_string23 = "\r\n				<div style=\"position:absolute;right:0px;top:0px;\"><a href=\"mailto:".toCharArray();
    _jsp_string9 = "\" height=\"64px\" width=\"64px\" style=\"padding-top:30px;\">\r\n			".toCharArray();
    _jsp_string13 = "</div>\r\n			<div class=\"textfield text-ellipsis\">&nbsp;&nbsp;&nbsp;&nbsp;\u529e\u516c\u5730\u70b9\uff1a".toCharArray();
    _jsp_string7 = "</div>\r\n			</div>\r\n			\r\n		</div>\r\n			\r\n		<div style=\"position:absolute;width:10px;top:10px;right:100px;\"></div>\r\n\r\n		<div style=\"position:absolute;width:100px;top:10px;right:10px;\">\r\n		\r\n			<div style=\"width:100px;height:122px;-webkit-border-radius:6px;-moz-border-radius:6px;background:url(/images/bg_w_65_wev8.png);border:solid 1px #CCC;text-align:center;line-height:90px;\">\r\n			".toCharArray();
    _jsp_string20 = "\"><img width=\"30px\" src=\"/images/icon_dial_wev8.png\"></a></div>\r\n				<div style=\"position:absolute;right:0px;top:0px;\"><a href=\"sms:".toCharArray();
    _jsp_string5 = "</div>\r\n				<div class=\"textfield text-ellipsis\" style=\"border-bottom:solid 1px #DEDEDE;\">&nbsp;&nbsp;&nbsp;&nbsp;\u5206\u90e8\uff1a".toCharArray();
    _jsp_string19 = "\r\n				<div style=\"position:absolute;right:35px;top:0px;\"><a href=\"tel://".toCharArray();
    _jsp_string21 = "\"><img width=\"30px\" src=\"/images/icon_sms_wev8.png\"></a></div>\r\n				".toCharArray();
    _jsp_string22 = "\r\n			</div>\r\n			\r\n			<div style=\"width:100%;height:30px;position:relative;line-height:30px;\">\r\n				<div style=\"position:absolute;left:0px;right:0px;top:0px;\">&nbsp;&nbsp;&nbsp;&nbsp;\u7535\u5b50\u90ae\u4ef6\uff1a".toCharArray();
    _jsp_string25 = "\r\n			</div>\r\n\r\n		</div>\r\n		\r\n		</div>\r\n		\r\n	</div>\r\n	\r\n</div>\r\n\r\n<div id=\"loading\">\u6b63\u5728\u52a0\u8f7d\u6570\u636e\uff0c\u8bf7\u7a0d\u7b49...</div>\r\n<div id=\"loadingmask\" class=\"ui-widget-overlay\"></div>\r\n\r\n<script type=\"text/javascript\">\r\n$(document).ready(function() {\r\n	\r\n	$( \"#loading\" ).hide();\r\n	$( \"#loadingmask\" ).hide();\r\n	\r\n});\r\n\r\nfunction goBack() {\r\n	var fromES=\"".toCharArray();
    _jsp_string16 = "\r\n				<div style=\"position:absolute;right:0px;top:0px;\"><a href=\"tel://".toCharArray();
    _jsp_string12 = "</div>\r\n			<div class=\"textfield text-ellipsis\" style=\"border-bottom:solid 1px #DEDEDE;\">&nbsp;&nbsp;&nbsp;&nbsp;\u72b6\u6001\uff1a".toCharArray();
    _jsp_string1 = "\r\n<!DOCTYPE html>\r\n<html>\r\n<head>\r\n	<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n	<meta name=\"author\" content=\"Weaver E-Mobile Dev Group\" />\r\n	<meta name=\"description\" content=\"Weaver E-mobile\" />\r\n	<meta name=\"keywords\" content=\"weaver,e-mobile\" />\r\n	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n	<title>".toCharArray();
    _jsp_string24 = "\"><img width=\"30px\" src=\"/images/icon_email_wev8.png\"></a></div>\r\n				".toCharArray();
  }
}
