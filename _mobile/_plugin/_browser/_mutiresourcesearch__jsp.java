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
import weaver.hrm.*;
import weaver.file.FileUpload;

public class _mutiresourcesearch__jsp extends com.caucho.jsp.JavaPage
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
      weaver.hrm.company.DepartmentComInfo DepartmentComInfo;
      DepartmentComInfo = (weaver.hrm.company.DepartmentComInfo) pageContext.getAttribute("DepartmentComInfo");
      if (DepartmentComInfo == null) {
        DepartmentComInfo = new weaver.hrm.company.DepartmentComInfo();
        pageContext.setAttribute("DepartmentComInfo", DepartmentComInfo);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.hrm.roles.RolesComInfo RoleComInfo;
      RoleComInfo = (weaver.hrm.roles.RolesComInfo) pageContext.getAttribute("RoleComInfo");
      if (RoleComInfo == null) {
        RoleComInfo = new weaver.hrm.roles.RolesComInfo();
        pageContext.setAttribute("RoleComInfo", RoleComInfo);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.conn.RecordSet RecordSet;
      RecordSet = (weaver.conn.RecordSet) pageContext.getAttribute("RecordSet");
      if (RecordSet == null) {
        RecordSet = new weaver.conn.RecordSet();
        pageContext.setAttribute("RecordSet", RecordSet);
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
      
int uid=user.getUID();
    String resourcemulti = "";

    Cookie[] cks = request.getCookies();

    String rem = "";
	if(resourcemulti.length()>0){
		rem="2"+resourcemulti.substring(1);
	}else{
		rem="2"+resourcemulti;
	}
Cookie ck = new Cookie("resourcemulti"+uid,rem);
ck.setMaxAge(30*24*60*60);
response.addCookie(ck);
//\u7ec4\u5408\u67e5\u8be2\u4e0d\u63a5\u6536\u6761\u4ef6
String sqlwhere ="";// Util.null2String(request.getParameter("sqlwhere"));
String status ="";// Util.null2String(request.getParameter("status"));
String check_per = Util.null2String(request.getParameter("resourceids"));

String resourceids = "" ;
String resourcenames ="";

if(!check_per.equals("")){
	try{
	String strtmp = "select id,lastname from HrmResource where id in ("+check_per+")";
	RecordSet.executeSql(strtmp);
	Hashtable ht = new Hashtable();
	while(RecordSet.next()){
		ht.put(RecordSet.getString("id"),RecordSet.getString("lastname"));
		/*
		if(check_per.indexOf(","+RecordSet.getString("id")+",")!=-1){

				resourceids +="," + RecordSet.getString("id");
				resourcenames += ","+RecordSet.getString("lastname");
		}
		*/
	}

	StringTokenizer st = new StringTokenizer(check_per,",");

	while(st.hasMoreTokens()){
		String s = st.nextToken();
		resourceids +=","+s;
		resourcenames += ","+ht.get(s).toString();
	}
	}catch(Exception e){
		
	}
}

      out.write(_jsp_string4, 0, _jsp_string4.length);
      out.print((SystemEnv.getHtmlLabelName(413,user.getLanguage())));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((SystemEnv.getHtmlLabelName(169,user.getLanguage())));
      out.write(_jsp_string6, 0, _jsp_string6.length);
      out.print((SystemEnv.getHtmlLabelName(1831,user.getLanguage())));
      out.write(_jsp_string7, 0, _jsp_string7.length);
      out.print((SystemEnv.getHtmlLabelName(15710,user.getLanguage())));
      out.write(_jsp_string8, 0, _jsp_string8.length);
      out.print((SystemEnv.getHtmlLabelName(15711,user.getLanguage())));
      out.write(_jsp_string9, 0, _jsp_string9.length);
      out.print((SystemEnv.getHtmlLabelName(480,user.getLanguage())));
      out.write(_jsp_string10, 0, _jsp_string10.length);
      out.print((SystemEnv.getHtmlLabelName(15844,user.getLanguage())));
      out.write(_jsp_string11, 0, _jsp_string11.length);
      out.print((SystemEnv.getHtmlLabelName(6094,user.getLanguage())));
      out.write(_jsp_string12, 0, _jsp_string12.length);
      out.print((SystemEnv.getHtmlLabelName(6092,user.getLanguage())));
      out.write(_jsp_string13, 0, _jsp_string13.length);
      out.print((SystemEnv.getHtmlLabelName(2245,user.getLanguage())));
      out.write(_jsp_string14, 0, _jsp_string14.length);
      out.print((SystemEnv.getHtmlLabelName(141,user.getLanguage())));
      out.write(_jsp_string15, 0, _jsp_string15.length);
      out.print((SystemEnv.getHtmlLabelName(124,user.getLanguage())));
      out.write(_jsp_string16, 0, _jsp_string16.length);
      out.print((SystemEnv.getHtmlLabelName(6086,user.getLanguage())));
      out.write(_jsp_string17, 0, _jsp_string17.length);
      out.print((SystemEnv.getHtmlLabelName(122,user.getLanguage())));
      out.write(_jsp_string18, 0, _jsp_string18.length);
      out.print((xssUtil.put(Util.null2String(request.getParameter("sqlwhere")))));
      out.write(_jsp_string19, 0, _jsp_string19.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/browser/MutiResourceSearch.jsp"), -7493653074298705198L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/browser/MobileInit.jsp"), 1397717249655627205L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string9;
  private final static char []_jsp_string15;
  private final static char []_jsp_string5;
  private final static char []_jsp_string17;
  private final static char []_jsp_string14;
  private final static char []_jsp_string6;
  private final static char []_jsp_string8;
  private final static char []_jsp_string0;
  private final static char []_jsp_string7;
  private final static char []_jsp_string13;
  private final static char []_jsp_string4;
  private final static char []_jsp_string3;
  private final static char []_jsp_string12;
  private final static char []_jsp_string18;
  private final static char []_jsp_string16;
  private final static char []_jsp_string2;
  private final static char []_jsp_string1;
  private final static char []_jsp_string19;
  private final static char []_jsp_string11;
  private final static char []_jsp_string10;
  static {
    _jsp_string9 = "</option>\r\n          <option value=2 >".toCharArray();
    _jsp_string15 = "</TD>\r\n      <TD width=35% class=field>\r\n        <INPUT id=subcompanyid type=hidden name=subcompanyid class=\"wuiBrowser\" _url=\"HrmOrgTreeBrowser.jsp?browserType=subcompanySingle\" \r\n        	_callBack=\"$('#departmentidSpan').html('');$('#departmentid').val('');\"\r\n        >\r\n      </TD>\r\n<TD width=15%>".toCharArray();
    _jsp_string5 = "</TD>\r\n<TD width=35% class=field><input class=inputstyle name=lastname ></TD>\r\n\r\n<TD width=15%>".toCharArray();
    _jsp_string17 = "</TD>\r\n<TD width=35% class=field>\r\n        <input class=inputstyle name=jobtitle maxlength=60 >\r\n      </td>\r\n<td width=\"15%\">".toCharArray();
    _jsp_string14 = "</option>\r\n        </select>\r\n      </TD>\r\n</tr>\r\n<TR style=\"height:1px;\"><TD class=Line colSpan=4></TD>\r\n</TR>\r\n\r\n<tr>\r\n<TD width=15%>".toCharArray();
    _jsp_string6 = "</TD>\r\n      <TD width=35% class=field>\r\n        <select class=inputstyle id=status name=status >\r\n          <option value=\"\" selected>".toCharArray();
    _jsp_string8 = "</option>\r\n          <option value=1 >".toCharArray();
    _jsp_string0 = "\r\n\r\n\r\n\r\n\r\n \r\n".toCharArray();
    _jsp_string7 = "</option>\r\n          <option value=0 >".toCharArray();
    _jsp_string13 = "</option>\r\n          <option value=7 >".toCharArray();
    _jsp_string4 = "\r\n	<FORM NAME=SearchForm id=\"SearchForm\" STYLE=\"margin-bottom:0\" action=\"/mobile/plugin/browser/MutiResourceSelect.jsp\" method=post target=\"frame2\">\r\n	<input type=\"hidden\" name=\"isinit\" value=\"1\"/>\r\n<table width=100%  class=ViewForm  align=\"top\">\r\n<TR class= Spacing style=\"height:1px;\"><TD class=Line1 colspan=4></TD>\r\n</TR>\r\n<tr>\r\n<TD height=\"15\" colspan=4 > &nbsp;</TD>\r\n</tr>\r\n<TR>\r\n<TD width=15%>".toCharArray();
    _jsp_string3 = "\r\n<HTML>\r\n<HEAD>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n<link href=\"css/Weaver_wev8.css\" type=text/css rel=STYLESHEET>\r\n<script type='text/javascript' src='/js/jquery/jquery_wev8.js'></script>\r\n<script type='text/javascript' src='/wui/common/jquery/plugin/jQuery.modalDialog_wev8.js'></script>\r\n</HEAD>\r\n\r\n<body>\r\n".toCharArray();
    _jsp_string12 = "</option>\r\n          <option value=6 >".toCharArray();
    _jsp_string18 = "</td>\r\n		<TD width=35% class=field>\r\n	      \r\n        <input class=wuiBrowser type=hidden name=roleid _url=\"HrmRolesBrowser.jsp\">\r\n      </TD>\r\n\r\n</tr>\r\n<TR style=\"height:1px;\"><TD class=Line colSpan=4></TD>  \r\n    \r\n</table>\r\n<input class=inputstyle type=\"hidden\" name=\"sqlwhere\" value='".toCharArray();
    _jsp_string16 = "</TD>\r\n      <TD width=35% class=field>\r\n      \r\n        <input class=wuiBrowser type=hidden name=departmentid id=departmentid _url=\"HrmOrgTreeBrowser.jsp?browserType=departmentSingle\"\r\n        	_callBack=\"$('#subcompanyidSpan').html('');$('#subcompanyid').val('');\">\r\n      </TD>\r\n</tr>\r\n<TR style=\"height:1px;\"><TD class=Line colSpan=4></TD>    \r\n<tr>\r\n<TD width=15%>".toCharArray();
    _jsp_string2 = "\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string1 = "\r\n".toCharArray();
    _jsp_string19 = "'>\r\n  <input class=inputstyle type=\"hidden\" name=\"resourceids\" >\r\n<input class=inputstyle type=\"hidden\" name=\"tabid\"  >\r\n	<!--########//Search Table End########-->\r\n	</FORM>\r\n<script language=\"javascript\">\r\n    jQuery(document).ready(function(){\r\n       jQuery(\".wuiBrowser\").modalDialog();\r\n    });\r\n\r\n	var resourceids =\"\"\r\n	var resourcenames = \"\"\r\nfunction reset_onclick(){\r\n	subcompanyspan.innerHtml=\"\"\r\n	departmentspan.innerHtml=\"\"\r\n	rolespan.innerHtml=\"\"\r\n	document.SearchForm.status.value=\"\"\r\n	document.SearchForm.jobtitle.value=\"\"\r\n	document.SearchForm.lastname.value=\"\"\r\n	document.SearchForm.subcompanyid.value=\"\"\r\n	document.SearchForm.departmentid.value=\"\"\r\n	document.SearchForm.roleid.value=\"\"\r\n	document.all(\"subcompanyid\").value=\"\"\r\n	document.all(\"departmentid\").value=\"\"\r\n	document.all(\"roleid\").value=\"\"\r\n}\r\nfunction btnclear_onclick(){\r\n	window.parent.parent.returnValue = {id:\"\",name:\"\"};\r\n	window.parent.parent.close();\r\n}\r\n\r\nfunction btnok_onclick(){\r\n	setResourceStr();\r\n	replaceStr();\r\n	window.parent.parent.returnValue = {id:resourceids,name:resourcenames};\r\n	window.parent.parent.close();\r\n	}\r\nfunction btncancel_onclick(){\r\n     window.close();\r\n}\r\n\r\nvar resourceids=\"\";\r\nfunction btnsub_onclick(){\r\n	setResourceStr() ;\r\n	$(\"input[name=resourceids]\").val(resourceids);\r\n    $(\"input[name=tabid]\").val(2);\r\n    var url=\"/mobile/plugin/browser/MutiResourceSelect.jsp?\"+$(\"#SearchForm\").serialize();  \r\n    $(\"#SearchForm\").attr(\"action\",url);\r\n	$(\"#SearchForm\").submit();\r\n}\r\n\r\nfunction setResourceStr(){\r\n	\r\n	var resourceids1 =\"\"\r\n        var resourcenames1 = \"\"\r\n     try{   \r\n	for(var i=0;i<parent.frame2.resourceArray.length;i++){\r\n		resourceids1 += \",\"+parent.frame2.resourceArray[i].split(\"~\")[0] ;\r\n		\r\n		resourcenames1 += \",\"+parent.frame2.resourceArray[i].split(\"~\")[1] ;\r\n	}\r\n	resourceids=resourceids1\r\n	resourcenames=resourcenames1\r\n     }catch(err){}\r\n}\r\n\r\nfunction replaceStr(){\r\n    var re=new RegExp(\"[ ]*[|][^|]*[|]\",\"g\")\r\n    resourcenames=resourcenames.replace(re,\"|\")\r\n    re=new RegExp(\"[|][^,]*\",\"g\")\r\n    resourcenames=resourcenames.replace(re,\"\")\r\n}    \r\n\r\n</script>\r\n</BODY>\r\n</HTML>".toCharArray();
    _jsp_string11 = "</option>\r\n          <option value=4 >".toCharArray();
    _jsp_string10 = "</option>\r\n          <option value=3 >".toCharArray();
  }
}
