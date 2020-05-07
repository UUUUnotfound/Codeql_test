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

public class _newsbrowser__jsp extends com.caucho.jsp.JavaPage
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
      
FileUpload fu = new FileUpload(request);
request.setCharacterEncoding("UTF-8");
response.setContentType("text/html;charset=UTF-8");
  
  User user = HrmUserVarify.getUser(request , response);
  if(user==null){
	  out.println("\u767b\u9646\u8d85\u65f6,\u8bf7\u91cd\u65b0\u767b\u9646!");
	  return ;
  }

      out.write(_jsp_string2, 0, _jsp_string2.length);
      
String name = Util.null2String(fu.getParameter("name"));
String publishtype =  Util.null2String(fu.getParameter("publishtype"));
String sqlwhere = "";
int ishead = 0;
if(!sqlwhere.equals("")) ishead = 1;
if(!name.equals("")){
	if(ishead==0){
		ishead = 1;
		sqlwhere += " where frontpagename like '%" +name+"%' ";
	}
	else 
		sqlwhere += " and frontpagename like '%" +name +"%' ";
}
String sqlstr = "";
if(ishead==0){
		ishead = 1;
		sqlwhere += " where id != 0 " ;
}
if(!sqlwhere.equals(""))
{
	if(!publishtype.equals(""))
	{
		ishead = 1;
		sqlwhere += "  and publishtype="+publishtype+" " ;
	}
}
else
{
	if(!publishtype.equals(""))
	{
		ishead = 1;
		sqlwhere += "  where publishtype="+publishtype+" " ;
	}
}
int pagenum=Util.getIntValue(fu.getParameter("pagenum"),1);
//int perpage=Util.getIntValue(request.getParameter("perpage"),0);
int	perpage=30;
//\u6dfb\u52a0\u5224\u65ad\u6743\u9650\u7684\u5185\u5bb9--new

String temptable = "newstemptable"+ Util.getRandom() ;
String news_SearchSql = "";
//System.out.println("sqlwhere:"+sqlwhere);
if(RecordSet.getDBType().equals("oracle")){
	if(user.getLogintype().equals("1")){
		news_SearchSql = "create table "+temptable+"  as select * from (select id, frontpagename, frontpagedesc from DocFrontpage "+ sqlwhere +" order by id desc) where rownum<"+ (pagenum*perpage+2);
	}
}else{
	if(user.getLogintype().equals("1")){
		news_SearchSql = "select top "+(pagenum*perpage+1)+" id, frontpagename, frontpagedesc into "+temptable+" from DocFrontpage  "+ sqlwhere +" order by id desc";  
	}
}

//\u6dfb\u52a0\u5224\u65ad\u6743\u9650\u7684\u5185\u5bb9--new*/
RecordSet.executeSql(news_SearchSql);
RecordSet.executeSql("Select count(id) RecordSetCounts from "+temptable);
boolean hasNextPage=false;
int RecordSetCounts = 0;
if(RecordSet.next()){
	RecordSetCounts = RecordSet.getInt("RecordSetCounts");
}
if(RecordSetCounts>pagenum*perpage){
	hasNextPage=true;
}
	String sqltemp="";
if(RecordSet.getDBType().equals("oracle")){
	sqltemp="select * from (select * from  "+temptable+" order by id) where rownum< "+(RecordSetCounts-(pagenum-1)*perpage+1);
}else{
	sqltemp="select top "+(RecordSetCounts-(pagenum-1)*perpage)+" * from "+temptable+"  order by id";
}
RecordSet.executeSql(sqltemp);

      out.write(_jsp_string3, 0, _jsp_string3.length);
      out.print((publishtype));
      out.write(_jsp_string4, 0, _jsp_string4.length);
      out.print((SystemEnv.getHtmlLabelName(24256,user.getLanguage())));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((name));
      out.write(_jsp_string6, 0, _jsp_string6.length);
      out.print((SystemEnv.getHtmlLabelName(84,user.getLanguage())));
      out.write(_jsp_string7, 0, _jsp_string7.length);
      out.print((SystemEnv.getHtmlLabelName(195,user.getLanguage())));
      out.write(_jsp_string7, 0, _jsp_string7.length);
      out.print((SystemEnv.getHtmlLabelName(433,user.getLanguage())));
      out.write(_jsp_string8, 0, _jsp_string8.length);
      
		
							int i=0;
							int totalline=1;
							if(RecordSet.last()){
								do{
								String ids = RecordSet.getString("id");
								String names = Util.toScreen(RecordSet.getString("frontpagename"),user.getLanguage());
								String descs = Util.toScreen(RecordSet.getString("frontpagedesc"),user.getLanguage());
								if(i==0){
									i=1;
							
      out.write(_jsp_string9, 0, _jsp_string9.length);
      
								}else{
									i=0;
							
      out.write(_jsp_string10, 0, _jsp_string10.length);
      
							}
							
      out.write(_jsp_string11, 0, _jsp_string11.length);
      out.print((ids));
      out.write(_jsp_string12, 0, _jsp_string12.length);
      out.print((names));
      out.write(_jsp_string13, 0, _jsp_string13.length);
      out.print((descs));
      out.write(_jsp_string14, 0, _jsp_string14.length);
      
								if(hasNextPage){
									totalline+=1;
									if(totalline>perpage)	break;
								}
							}while(RecordSet.previous());
							}
							RecordSet.executeSql("drop table "+temptable);
							
      out.write(_jsp_string15, 0, _jsp_string15.length);
      out.print((SystemEnv.getHtmlLabelName(197,user.getLanguage())));
      out.write(_jsp_string16, 0, _jsp_string16.length);
      out.print((SystemEnv.getHtmlLabelName(311,user.getLanguage())));
      out.write(_jsp_string17, 0, _jsp_string17.length);
      out.print((SystemEnv.getHtmlLabelName(201,user.getLanguage())));
      out.write(_jsp_string18, 0, _jsp_string18.length);
      if(pagenum>1){
      out.write(_jsp_string19, 0, _jsp_string19.length);
      out.print((pagenum-1));
      out.write(_jsp_string20, 0, _jsp_string20.length);
      }
      out.write(_jsp_string21, 0, _jsp_string21.length);
      if(hasNextPage){
      out.write(_jsp_string19, 0, _jsp_string19.length);
      out.print((pagenum+1));
      out.write(_jsp_string22, 0, _jsp_string22.length);
      }
      out.write(_jsp_string23, 0, _jsp_string23.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/browser/NewsBrowser.jsp"), 5176338911513194580L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/browser/MobileInit.jsp"), 1397717249655627205L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string20;
  private final static char []_jsp_string19;
  private final static char []_jsp_string22;
  private final static char []_jsp_string5;
  private final static char []_jsp_string16;
  private final static char []_jsp_string15;
  private final static char []_jsp_string0;
  private final static char []_jsp_string13;
  private final static char []_jsp_string21;
  private final static char []_jsp_string9;
  private final static char []_jsp_string4;
  private final static char []_jsp_string3;
  private final static char []_jsp_string18;
  private final static char []_jsp_string7;
  private final static char []_jsp_string10;
  private final static char []_jsp_string6;
  private final static char []_jsp_string8;
  private final static char []_jsp_string11;
  private final static char []_jsp_string17;
  private final static char []_jsp_string2;
  private final static char []_jsp_string12;
  private final static char []_jsp_string14;
  private final static char []_jsp_string1;
  private final static char []_jsp_string23;
  static {
    _jsp_string20 = ";\" value=\"\u4e0a\u4e00\u9875\" />\r\n					 ".toCharArray();
    _jsp_string19 = "\r\n						 <input type=submit  onclick=\"document.all('pagenum').value=".toCharArray();
    _jsp_string22 = ";\" value=\"\u4e0b\u4e00\u9875\"/>\r\n					 ".toCharArray();
    _jsp_string5 = "</TD>\r\n						<TD width=85% class=field><input name=name value=\"".toCharArray();
    _jsp_string16 = "</BUTTON>&nbsp;&nbsp;\r\n					<BUTTON type=\"button\" class=btn accessKey=2  id=\"clearBtn\" onclick=\"btnclear_onclick();\"><U>2</U>-".toCharArray();
    _jsp_string15 = "\r\n					 </TABLE>\r\n                 </div>\r\n				<div align=\"center\" style=\"background:rgb(246, 246, 246);vertical-align: middle;padding-top: 8px;border-top:#dadee5 solid 1px;\">\r\n				     \r\n					 <BUTTON type=\"button\" class=btnSearch onclick=\"document.SearchForm.submit();\" accessKey=S  id=\"searchBtn\"><U>S</U>-".toCharArray();
    _jsp_string0 = "\r\n \r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string13 = " </TD>\r\n								<TD> ".toCharArray();
    _jsp_string21 = "\r\n					  \r\n					 ".toCharArray();
    _jsp_string9 = "\r\n							<TR class=DataLight>\r\n							".toCharArray();
    _jsp_string4 = "'>\r\n\r\n<table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n<colgroup>\r\n<col width=\"10\">\r\n<col width=\"\">\r\n<col width=\"10\">\r\n<tr>\r\n	<td ></td>\r\n	<td valign=\"top\">\r\n		<TABLE class=Shadow  border=\"0\" height=\"100%\" width=\"100%\"> \r\n		<tr>\r\n		<td valign=\"top\">\r\n				<table width=100% class=ViewForm>\r\n					<TR>\r\n						<TD width=15%>".toCharArray();
    _jsp_string3 = "\r\n\r\n<BODY style=\"overflow-y: hidden;padding: 0px;margin: 0px;\">\r\n\r\n<FORM NAME=\"SearchForm\" action=\"NewsBrowser.jsp\" method=post>\r\n<input type=\"hidden\" name=\"pagenum\" value=''>\r\n<input type=\"hidden\" name=\"publishtype\" value='".toCharArray();
    _jsp_string18 = "</BUTTON>\r\n				     ".toCharArray();
    _jsp_string7 = "</TH>      \r\n							<TH> ".toCharArray();
    _jsp_string10 = "\r\n							<TR class=DataDark>\r\n							".toCharArray();
    _jsp_string6 = "\" class=\"inputstyle\"></TD>\r\n					</TR>\r\n					<TR class=Spacing style=\"height:1px;\"><TD class=Line1 colspan=2></TD></TR>\r\n					<TR class=separator style=\"height:1px;\"><TD class=Sep1 colspan=2></TD></TR>\r\n			    </table>\r\n			    <div style=\"height: 420px;overflow: auto;width: 100%\">\r\n					<TABLE ID=BrowseTable class=BroswerStyle cellspacing=\"0\"  cellpadding=\"0\" width=\"100%\" >\r\n						<TR class=DataHeader>\r\n							<TH width=0% style=\"display:none\">".toCharArray();
    _jsp_string8 = "</TH>\r\n						</TR>\r\n					    <TR class=Line style=\"height:1px;\"><TH colSpan=3 style=\"padding:0;\"> </TH></TR>\r\n							".toCharArray();
    _jsp_string11 = "\r\n								<TD style=\"display:none\"><A HREF=#>".toCharArray();
    _jsp_string17 = "</BUTTON>&nbsp;&nbsp;\r\n					<BUTTON type=\"button\" class=btnReset accessKey=T  id=\"cancelBtn\" onclick=\"window.parent.close();\";><U>T</U>-".toCharArray();
    _jsp_string2 = "\r\n<HTML>\r\n<HEAD>\r\n<base target=\"_self\">\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n<link href=\"css/Weaver_wev8.css\" type=text/css rel=STYLESHEET>\r\n<script type='text/javascript' src='/js/jquery/jquery_wev8.js'></script>\r\n</HEAD>\r\n".toCharArray();
    _jsp_string12 = "</A></TD>\r\n								<td style=\"padding-left: 5px\"> ".toCharArray();
    _jsp_string14 = " </TD>\r\n							</TR>\r\n							".toCharArray();
    _jsp_string1 = "\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string23 = "\r\n                 </div>\r\n\r\n		</td>\r\n		</tr>\r\n		</TABLE>\r\n	</td>\r\n	<td></td>\r\n</tr>\r\n<tr>\r\n	<td height=\"10\" colspan=\"3\"></td>\r\n</tr>\r\n</table>\r\n\r\n</FORM>\r\n</BODY>\r\n</HTML>\r\n\r\n<script type=\"text/javascript\">\r\n<!--\r\n\r\nfunction BrowseTable_onmouseover(e){\r\n	var e=e||event;\r\n   var target=e.srcElement||e.target;\r\n   if(\"TD\"==target.nodeName){\r\n		jQuery(target).parents(\"tr\")[0].className = \"Selected\";\r\n   }else if(\"A\"==target.nodeName){\r\n		jQuery(target).parents(\"tr\")[0].className = \"Selected\";\r\n   }\r\n}\r\nfunction BrowseTable_onmouseout(e){\r\n	var e=e||event;\r\n   var target=e.srcElement||e.target;\r\n   var p;\r\n	if(target.nodeName == \"TD\" || target.nodeName == \"A\" ){\r\n      p=jQuery(target).parents(\"tr\")[0];\r\n      if( p.rowIndex % 2 ==0){\r\n         p.className = \"DataDark\";\r\n      }else{\r\n         p.className = \"DataLight\";\r\n      }\r\n   }\r\n}\r\nfunction BrowseTable_onclick(e){\r\n	var e=e||event;\r\n	var target=e.srcElement||e.target;\r\n	if( \"TD\"==target.nodeName||\"A\"==target.nodeNmae){   	\r\n	  window.parent.returnValue = {id:$($(target).parents(\"tr\")[0].cells[0]).text(),name:$($(target).parents(\"tr\")[0].cells[1]).text()};\r\n	   window.parent.close();\r\n	}\r\n}\r\n\r\njQuery(document).ready(function(){\r\n	jQuery(\"#BrowseTable\").bind(\"click\",BrowseTable_onclick);\r\n	jQuery(\"#BrowseTable\").bind(\"mouseover\",BrowseTable_onmouseover);\r\n	jQuery(\"#BrowseTable\").bind(\"mouseout\",BrowseTable_onmouseout);\r\n})\r\n\r\nfunction btnclear_onclick(){\r\n	window.parent.returnValue = {id:\"\",name:\"\"};\r\n	window.parent.close()\r\n}\r\n//-->\r\n</script>\r\n\r\n\r\n".toCharArray();
  }
}