/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin._browser;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import weaver.general.Util;
import java.util.*;
import weaver.hrm.*;
import weaver.file.FileUpload;

public class _mutiresourcebrowser__jsp extends com.caucho.jsp.JavaPage
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
      weaver.filter.XssUtil xssUtil;
      xssUtil = (weaver.filter.XssUtil) pageContext.getAttribute("xssUtil");
      if (xssUtil == null) {
        xssUtil = new weaver.filter.XssUtil();
        pageContext.setAttribute("xssUtil", xssUtil);
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
      
String resourceids=Util.null2String(request.getParameter("resourceids"));
    //\u9875\u9762\u4f20\u8fc7\u6765\u7684\u81ea\u5b9a\u4e49\u7ec4id
String initgroupid=Util.null2String(request.getParameter("groupid"));
String coworkid=Util.null2String(request.getParameter("coworkid"));
String workID = Util.null2String(request.getParameter("workID"));
String cowtypeid = Util.null2String(request.getParameter("cowtypeid"));
String sqlwhere=Util.null2String(request.getParameter("sqlwhere"));
String status=Util.null2String(request.getParameter("status"));
   
String tabid="0";

      out.write(_jsp_string3, 0, _jsp_string3.length);
      out.print((tabid));
      out.write(_jsp_string4, 0, _jsp_string4.length);
      out.print((resourceids));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((initgroupid));
      out.write(_jsp_string6, 0, _jsp_string6.length);
      out.print((coworkid));
      out.write(_jsp_string7, 0, _jsp_string7.length);
      out.print((workID));
      out.write(_jsp_string8, 0, _jsp_string8.length);
      out.print((cowtypeid));
      out.write(_jsp_string9, 0, _jsp_string9.length);
      out.print((xssUtil.put(sqlwhere)));
      out.write(_jsp_string10, 0, _jsp_string10.length);
      out.print((xssUtil.put(sqlwhere)));
      out.write(_jsp_string11, 0, _jsp_string11.length);
      out.print((xssUtil.put(sqlwhere)));
      out.write(_jsp_string12, 0, _jsp_string12.length);
      out.print((status));
      out.write(_jsp_string9, 0, _jsp_string9.length);
      out.print((xssUtil.put(sqlwhere)));
      out.write(_jsp_string13, 0, _jsp_string13.length);
      out.print((tabid));
      out.write(_jsp_string14, 0, _jsp_string14.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/browser/MutiResourceBrowser.jsp"), 4636747336210954026L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/browser/MobileInit.jsp"), 1397717249655627205L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string9;
  private final static char []_jsp_string13;
  private final static char []_jsp_string6;
  private final static char []_jsp_string4;
  private final static char []_jsp_string7;
  private final static char []_jsp_string0;
  private final static char []_jsp_string12;
  private final static char []_jsp_string14;
  private final static char []_jsp_string11;
  private final static char []_jsp_string10;
  private final static char []_jsp_string1;
  private final static char []_jsp_string3;
  private final static char []_jsp_string2;
  private final static char []_jsp_string8;
  private final static char []_jsp_string5;
  static {
    _jsp_string9 = "&sqlwhere=".toCharArray();
    _jsp_string13 = "\";\r\n			try{\r\n				$(curDoc).find(\"#btnsub\").css(\"display\",\"inline\");\r\n			}catch(err){}\r\n			}\r\n	}\r\n	\r\nfunction closeWindow(){\r\n	window.parent.close();\r\n}\r\nresetbanner(".toCharArray();
    _jsp_string6 = "&coworkid=".toCharArray();
    _jsp_string4 = "&resourceids=".toCharArray();
    _jsp_string7 = "&workID=".toCharArray();
    _jsp_string0 = "\r\n \r\n\r\n\r\n".toCharArray();
    _jsp_string12 = "\";\r\n			try{\r\n				$(curDoc).find(\"#btnsub\").css(\"display\",\"none\");\r\n			}catch(err){}\r\n			}\r\n		else if(objid == 2){\r\n			window.frame1.location=\"/mobile/plugin/browser/MutiResourceSearch.jsp?status=".toCharArray();
    _jsp_string14 = ");\r\n</script>\r\n\r\n</body>\r\n</html>".toCharArray();
    _jsp_string11 = "\";\r\n		        try{\r\n					$(curDoc).find(\"#btnsub\").css(\"display\",\"none\");\r\n		        }catch(err){}\r\n		        }			\r\n		else if(objid == 1){\r\n			window.frame1.location=\"/mobile/plugin/browser/SearchByGroup.jsp?sqlwhere=".toCharArray();
    _jsp_string10 = "\" width=100%  height=\"250px\" frameborder=no scrolling=auto>\r\n\u6d4f\u89c8\u5668\u4e0d\u652f\u6301\u5d4c\u5165\u5f0f\u6846\u67b6\uff0c\u6216\u88ab\u914d\u7f6e\u4e3a\u4e0d\u663e\u793a\u5d4c\u5165\u5f0f\u6846\u67b6\u3002\r\n</IFRAME>\r\n\r\n</td>\r\n</tr>\r\n</TBODY>\r\n</table>\r\n\r\n\r\n\r\n<script language=javascript>\r\n	function resetbanner(objid){\r\n	    \r\n		for(i=0;i<=2;i++){\r\n			$(\"#oTDtype_\"+i).attr(\"background\",\"images/bgdark_wev8.gif\");\r\n		}\r\n		$(\"#oTDtype_\"+objid).attr(\"background\",\"images/bglight_wev8.gif\");\r\n		var curDoc;\r\n			if(document.all){\r\n				curDoc=window.frames[\"frame2\"].document\r\n			}\r\n			else{\r\n				curDoc=document.getElementById(\"frame2\").contentDocument	\r\n			}\r\n		if(objid == 0 ){		        \r\n		        window.frame1.location=\"/mobile/plugin/browser/HrmOrgTreeBrowser.jsp?&browserType=resourceMulti&sqlwhere=".toCharArray();
    _jsp_string1 = "\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string3 = "\r\n<HTML>\r\n<HEAD>\r\n  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n  <script src=\"/js/jquery/jquery_wev8.js\" type=\"text/javascript\"></script>\r\n<STYLE type=text/css>PRE {\r\n}\r\nA {\r\n	COLOR:#000000;FONT-WEIGHT: bold; TEXT-DECORATION: none\r\n}\r\nA:hover {\r\n	COLOR:#56275D;TEXT-DECORATION: none\r\n}\r\n*{font-size:12px;}\r\n</STYLE>\r\n\r\n\r\n</HEAD>\r\n<body scroll=\"no\">\r\n\r\n\r\n\r\n<TABLE class=form width=100% id=oTable1 height=100%>\r\n\r\n  <TBODY>\r\n  <tr>\r\n  <td  height=30 colspan=3 background=\"images/bg1_wev8.gif\" align=left style=\"padding: 0px;\">\r\n  <table width=100% border=0 cellspacing=0 cellpadding=0 height=100%  >\r\n  <tr align=\"left\">\r\n  <td nowrap background=\"images/bg1_wev8.gif\" width=15px height=100% align=center></td> \r\n  \r\n  <td nowrap name=\"oTDtype_0\"  id=\"oTDtype_0\" background=\"images/bglight_wev8.gif\" width=70px height=100% align=center onmouseover=\"style.cursor='pointer'\" onclick=\"resetbanner(0)\" ><b>\u6309\u7ec4\u7ec7\u67b6\u6784</b></td>\r\n \r\n <!--\r\n  <td nowrap name=\"oTDtype_1\"  id=\"oTDtype_1\" background=\"images/bglight_wev8.gif\" width=70px height=100% align=center onmouseover=\"style.cursor='pointer'\" onclick=\"resetbanner(1)\" ><b>\u6309\u5b9a\u4e49\u7684\u7ec4</b></td>\r\n  -->\r\n  <td nowrap name=\"oTDtype_2\"  id=\"oTDtype_2\" background=\"images/bglight_wev8.gif\" width=70px height=100% align=center onmouseover=\"style.cursor='pointer'\" onclick=\"resetbanner(2)\" ><b>\u7ec4\u5408\u67e5\u8be2</b></td>\r\n\r\n  <td nowrap name=\"oTDtype_3\"  id=\"oTDtype_3\" height=\"100%\" >&nbsp</td>\r\n  </tr>\r\n  </table>\r\n  </td>\r\n  </tr>\r\n<tr>\r\n<td  id=oTd1 name=oTd1 width=100% height=215>\r\n\r\n<IFRAME name=frame1 id=frame1  width=100%  height=\"260px\" frameborder=no scrolling=auto>\r\n\u6d4f\u89c8\u5668\u4e0d\u652f\u6301\u5d4c\u5165\u5f0f\u6846\u67b6\uff0c\u6216\u88ab\u914d\u7f6e\u4e3a\u4e0d\u663e\u793a\u5d4c\u5165\u5f0f\u6846\u67b6\u3002\r\n</IFRAME>\r\n\r\n</td>\r\n</tr>\r\n<tr>\r\n<td  id=oTd2 name=oTd2 width=100% height=65%>\r\n\r\n<IFRAME name=frame2 id=frame2 src=\"/mobile/plugin/browser/MutiResourceSelect.jsp?tabid=".toCharArray();
    _jsp_string2 = "\r\n".toCharArray();
    _jsp_string8 = "&cowtypeid=".toCharArray();
    _jsp_string5 = "&initgroupid=".toCharArray();
  }
}
