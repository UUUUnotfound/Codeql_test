/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin._browser;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import weaver.general.Util;
import java.util.*;
import weaver.hrm.User;
import weaver.systeminfo.SystemEnv;
import weaver.file.FileUpload;
import weaver.hrm.*;

public class _hrmrolesbrowser__jsp extends com.caucho.jsp.JavaPage
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
      weaver.conn.RecordSet RecordSet;
      RecordSet = (weaver.conn.RecordSet) pageContext.getAttribute("RecordSet");
      if (RecordSet == null) {
        RecordSet = new weaver.conn.RecordSet();
        pageContext.setAttribute("RecordSet", RecordSet);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.hrm.company.DepartmentComInfo DepartmentComInfo;
      DepartmentComInfo = (weaver.hrm.company.DepartmentComInfo) pageContext.getAttribute("DepartmentComInfo");
      if (DepartmentComInfo == null) {
        DepartmentComInfo = new weaver.hrm.company.DepartmentComInfo();
        pageContext.setAttribute("DepartmentComInfo", DepartmentComInfo);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.filter.XssUtil xssUtil;
      xssUtil = (weaver.filter.XssUtil) pageContext.getAttribute("xssUtil");
      if (xssUtil == null) {
        xssUtil = new weaver.filter.XssUtil();
        pageContext.setAttribute("xssUtil", xssUtil);
      }
      out.write(_jsp_string2, 0, _jsp_string2.length);
      
FileUpload fu = new FileUpload(request);
request.setCharacterEncoding("UTF-8");
response.setContentType("text/html;charset=UTF-8");
  
  User user = HrmUserVarify.getUser(request , response);
  if(user==null){
	  out.println("\u767b\u9646\u8d85\u65f6,\u8bf7\u91cd\u65b0\u767b\u9646!");
	  return ;
  }

      out.write(_jsp_string3, 0, _jsp_string3.length);
      
String rolesname = Util.null2String(fu.getParameter("rolesname"));
String rolesmark = Util.null2String(fu.getParameter("rolesmark"));
String sqlwhere = Util.null2String(fu.getParameter("sqlwhere"));
int ishead = 0;
if(!sqlwhere.equals("")) ishead = 1;
if(!rolesname.equals("")){
	if(ishead==0){
		ishead = 1;
		sqlwhere += " where rolesname like '%" + Util.fromScreen2(rolesname,user.getLanguage()) +"%' ";
	}
	else 
		sqlwhere += " and rolesname like '%" + Util.fromScreen2(rolesname,user.getLanguage()) +"%' ";
}
if(!rolesmark.equals("")){
	if(ishead==0){
		ishead = 1;
		sqlwhere += " where rolesmark like '%" + Util.fromScreen2(rolesmark,user.getLanguage()) +"%' ";
	}
	else
		sqlwhere += " and rolesmark like '%" + Util.fromScreen2(rolesmark,user.getLanguage()) +"%' ";
}
String sqlstr = "select * from HrmRoles " + sqlwhere+" order by rolesmark" ;

      out.write(_jsp_string4, 0, _jsp_string4.length);
      out.print((xssUtil.put(Util.null2String(request.getParameter("sqlwhere")))));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((SystemEnv.getHtmlLabelName(15068,user.getLanguage())));
      out.write(_jsp_string6, 0, _jsp_string6.length);
      out.print((rolesmark));
      out.write(_jsp_string7, 0, _jsp_string7.length);
      out.print((SystemEnv.getHtmlLabelName(85,user.getLanguage())));
      out.write(_jsp_string8, 0, _jsp_string8.length);
      out.print((rolesname));
      out.write(_jsp_string9, 0, _jsp_string9.length);
      out.print((SystemEnv.getHtmlLabelName(15068,user.getLanguage())));
      out.write(_jsp_string10, 0, _jsp_string10.length);
      out.print((SystemEnv.getHtmlLabelName(15068,user.getLanguage())));
      out.write(_jsp_string11, 0, _jsp_string11.length);
      out.print((SystemEnv.getHtmlLabelName(85,user.getLanguage())));
      out.write(_jsp_string12, 0, _jsp_string12.length);
      
int i=0;
RecordSet.executeSql(sqlstr);
while(RecordSet.next()){
	String ids = RecordSet.getString("id");
	String rolesmarks = Util.toScreen(RecordSet.getString("rolesmark"),user.getLanguage());
	String rolesnames = Util.toScreen(RecordSet.getString("rolesname"),user.getLanguage());
	if(i==0){
		i=1;

      out.write(_jsp_string13, 0, _jsp_string13.length);
      
	}else{
		i=0;

      out.write(_jsp_string14, 0, _jsp_string14.length);
      
}

      out.write(_jsp_string15, 0, _jsp_string15.length);
      out.print((ids));
      out.write(_jsp_string16, 0, _jsp_string16.length);
      out.print((rolesmarks));
      out.write(_jsp_string17, 0, _jsp_string17.length);
      out.print((rolesnames));
      out.write(_jsp_string18, 0, _jsp_string18.length);
      }

      out.write(_jsp_string19, 0, _jsp_string19.length);
      out.print((SystemEnv.getHtmlLabelName(197,user.getLanguage())));
      out.write(_jsp_string20, 0, _jsp_string20.length);
      out.print((SystemEnv.getHtmlLabelName(311,user.getLanguage())));
      out.write(_jsp_string21, 0, _jsp_string21.length);
      out.print((SystemEnv.getHtmlLabelName(201,user.getLanguage())));
      out.write(_jsp_string22, 0, _jsp_string22.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/browser/HrmRolesBrowser.jsp"), -835025034167783683L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/browser/MobileInit.jsp"), 1397717249655627205L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string15;
  private final static char []_jsp_string18;
  private final static char []_jsp_string17;
  private final static char []_jsp_string10;
  private final static char []_jsp_string4;
  private final static char []_jsp_string21;
  private final static char []_jsp_string14;
  private final static char []_jsp_string3;
  private final static char []_jsp_string6;
  private final static char []_jsp_string7;
  private final static char []_jsp_string16;
  private final static char []_jsp_string0;
  private final static char []_jsp_string12;
  private final static char []_jsp_string19;
  private final static char []_jsp_string22;
  private final static char []_jsp_string9;
  private final static char []_jsp_string8;
  private final static char []_jsp_string2;
  private final static char []_jsp_string1;
  private final static char []_jsp_string5;
  private final static char []_jsp_string20;
  private final static char []_jsp_string13;
  private final static char []_jsp_string11;
  static {
    _jsp_string15 = "\r\n	<TD style=\"display:none\"><A HREF=#>".toCharArray();
    _jsp_string18 = "</TD>\r\n</TR>\r\n".toCharArray();
    _jsp_string17 = "</TD>\r\n	<TD>".toCharArray();
    _jsp_string10 = "</TH>      \r\n	  <TH width=40%>".toCharArray();
    _jsp_string4 = "\r\n<BODY style=\"overflow-y: hidden;\">\r\n<FORM NAME=SearchForm id=\"SearchForm\"  STYLE=\"margin-bottom:0\"  method=post>\r\n<input class=inputstyle type=\"hidden\" name=\"sqlwhere\" value='".toCharArray();
    _jsp_string21 = "</BUTTON>&nbsp;&nbsp;\r\n    <BUTTON class=btnReset accessKey=T  id=\"cancelBtn\" onclick=\"window.parent.close();\";><U>T</U>-".toCharArray();
    _jsp_string14 = "\r\n<TR class=DataDark>\r\n".toCharArray();
    _jsp_string3 = "\r\n<HTML>\r\n<HEAD>\r\n<base target=\"_self\">\r\n<link href=\"css/Weaver_wev8.css\" type=text/css rel=STYLESHEET>\r\n<script type='text/javascript' src='/js/jquery/jquery_wev8.js'></script>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n</HEAD>\r\n".toCharArray();
    _jsp_string6 = "</TD>\r\n      <TD width=35% class=field> \r\n        <input class=inputstyle name=rolesmark id=\"rolesmark\" value=\"".toCharArray();
    _jsp_string7 = "\">\r\n      </TD>\r\n      <TD width=15%>".toCharArray();
    _jsp_string16 = "</A></TD>\r\n	<TD>".toCharArray();
    _jsp_string0 = "\r\n\r\n\r\n\r\n\r\n \r\n\r\n".toCharArray();
    _jsp_string12 = "</TH>\r\n      </tr><TR class=Line><TH colspan=\"4\" ></TH></TR>\r\n".toCharArray();
    _jsp_string19 = "\r\n\r\n</TABLE>\r\n</div>\r\n<div align=\"center\" style=\"background:rgb(246, 246, 246);vertical-align: middle;padding-top: 8px;border-top:#dadee5 solid 1px;\">\r\n    <BUTTON class=btnSearch onclick=\"doSearch();\" accessKey=S  id=\"searchBtn\"><U>S</U>-".toCharArray();
    _jsp_string22 = "</BUTTON>\r\n</div>\r\n </td>\r\n</tr>\r\n</TABLE>\r\n</td>\r\n<td></td>\r\n</tr>\r\n<tr>\r\n<td height=\"10\" colspan=\"3\"></td>\r\n</tr>\r\n</table>\r\n\r\n</FORM>\r\n</BODY>\r\n</HTML>\r\n\r\n<script	language=\"javascript\">\r\nfunction resetForm(){\r\n	jQuery(\"#rolesmark\").val(\"\");\r\n	jQuery(\"#rolesname\").val(\"\");\r\n}\r\nfunction replaceToHtml(str){\r\n	var re = str;\r\n	var re1 = \"<\";\r\n	var re2 = \">\";\r\n	do{\r\n		re = re.replace(re1,\"&lt;\");\r\n		re = re.replace(re2,\"&gt;\");\r\n        re = re.replace(\",\",\"\uff0c\");\r\n	}while(re.indexOf(\"<\")!=-1 || re.indexOf(\">\")!=-1)\r\n	return re;\r\n}\r\n\r\nfunction BrowseTable_onmouseover(e){\r\n	e=e||event;\r\n   var target=e.srcElement||e.target;\r\n   if(\"TD\"==target.nodeName){\r\n		jQuery(target).parents(\"tr\")[0].className = \"Selected\";\r\n   }else if(\"A\"==target.nodeName){\r\n		jQuery(target).parents(\"tr\")[0].className = \"Selected\";\r\n   }\r\n}\r\nfunction BrowseTable_onmouseout(e){\r\n	var e=e||event;\r\n   var target=e.srcElement||e.target;\r\n   var p;\r\n	if(target.nodeName == \"TD\" || target.nodeName == \"A\" ){\r\n      p=jQuery(target).parents(\"tr\")[0];\r\n      if( p.rowIndex % 2 ==0){\r\n         p.className = \"DataDark\"\r\n      }else{\r\n         p.className = \"DataLight\"\r\n      }\r\n   }\r\n}\r\n\r\nfunction BrowseTable_onclick(e){\r\n	var e=e||event;\r\n	var target=e.srcElement||e.target;\r\n	if( target.nodeName ==\"TD\"||target.nodeName ==\"A\"  ){\r\n		var curTr=jQuery(target).parents(\"tr\")[0];\r\n		window.parent.parent.returnValue = {id:jQuery(curTr.cells[0]).text(),name:replaceToHtml(jQuery(curTr.cells[1]).text())};\r\n		window.parent.parent.close();\r\n	}\r\n}\r\n\r\n$(function(){\r\n	$(\"#BrowseTable\").mouseover(BrowseTable_onmouseover);\r\n	$(\"#BrowseTable\").mouseout(BrowseTable_onmouseout);\r\n	$(\"#BrowseTable\").click(BrowseTable_onclick);\r\n});\r\n\r\nfunction doSearch(){\r\n/*\r\n    var  searchStr=\"&rolesmark=\"+jQuery(\"#rolesmark\").val()+\"&rolesname=\"+jQuery(\"#rolesname\").val();\r\n    searchStr = decodeURIComponent(searchStr,true);\r\n    jQuery(\"#SearchForm\").attr(\"action\",\"/manager/getPage.do?pluginCode=1&page=HrmRolesBrowser\"+searchStr);\r\n*/    \r\n    document.SearchForm.submit();\r\n}\r\n\r\nfunction doClear(){\r\n   window.parent.parent.returnValue = {id:\"\",name:\"\"};\r\n   window.parent.parent.close();\r\n}\r\n</script>\r\n".toCharArray();
    _jsp_string9 = "\">\r\n      </TD>\r\n    </TR>\r\n    <TR class=spacing style=\"height: 1px;\"> \r\n      <TD class=line1 colspan=4></TD>\r\n    </TR>\r\n  </table>\r\n  \r\n<div style=\"height: 450px;overflow: auto;width: 100%\">  \r\n<TABLE ID=BrowseTable class=\"BroswerStyle\"  cellspacing=\"1\" STYLE=\"margin-top:0\" width=\"100%\">\r\n<TR class=DataHeader>\r\n      <TH width=0% style=\"display:none\">".toCharArray();
    _jsp_string8 = "</TD>\r\n      <TD width=35% class=field> \r\n        <input class=inputstyle name=rolesname id=\"rolesname\" value=\"".toCharArray();
    _jsp_string2 = "\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string1 = "\r\n".toCharArray();
    _jsp_string5 = "'>\r\n\r\n<table width=100% height=100% border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n<colgroup>\r\n<col width=\"10\">\r\n<col width=\"\">\r\n<col width=\"10\">\r\n<tr>\r\n<td ></td>\r\n<td valign=\"top\">\r\n<TABLE class=Shadow style=\"width: 100%\">\r\n<tr>\r\n<td valign=\"top\">\r\n<table width=100% class=ViewForm>\r\n    <TR class=Spacing style=\"height: 1px;\"> \r\n      <TD class=line1 colspan=4></TD>\r\n    </TR>\r\n    <TR> \r\n      <TD width=15%>".toCharArray();
    _jsp_string20 = "</BUTTON>&nbsp;&nbsp;\r\n	<BUTTON class=btn accessKey=R  id=\"resetBtn\" onclick=\"resetForm();\"><U>R</U>-\u91cd\u7f6e</BUTTON>&nbsp;&nbsp;\r\n	<BUTTON class=btn accessKey=2  id=\"clearBtn\" onclick=\"doClear();\"><U>2</U>-".toCharArray();
    _jsp_string13 = "\r\n<TR class=DataLight>\r\n".toCharArray();
    _jsp_string11 = "</TH>      \r\n	  <TH width=65%>".toCharArray();
  }
}