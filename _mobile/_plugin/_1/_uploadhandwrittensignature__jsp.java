/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin._1;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import weaver.general.Util;
import java.util.*;
import weaver.file.FileUpload;
import java.net.*;
import weaver.hrm.*;
import weaver.systeminfo.*;
import weaver.general.*;
import ln.LN;
import weaver.hrm.settings.RemindSettings;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import weaver.workflow.workflow.TestWorkflowCheck;
import weaver.systeminfo.template.UserTemplate;
import weaver.systeminfo.setting.*;

public class _uploadhandwrittensignature__jsp extends com.caucho.jsp.JavaPage
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
    response.setContentType("text/html; charset=GBK");
    request.setCharacterEncoding("GBK");
    try {
      out.write(_jsp_string0, 0, _jsp_string0.length);
      
// \u589e\u52a0\u53c2\u6570\u5224\u65ad\u7f13\u5b58
int isIncludeToptitle = 0;
response.setHeader("cache-control", "no-cache");
response.setHeader("pragma", "no-cache");
response.setHeader("expires", "Mon 1 Jan 1990 00:00:00 GMT");

      out.write(_jsp_string1, 0, _jsp_string1.length);
      
//
User user = HrmUserVarify.getUser (request , response) ;

//\u95ee\u98981
TestWorkflowCheck twc=new TestWorkflowCheck();
if(twc.checkURI(session,request.getRequestURI(),request.getQueryString())){
    response.sendRedirect("/login/Logout.jsp");
    return;
}
if(user == null)  return ;
String isIE = (String)session.getAttribute("browser_isie");
if (isIE == null || "".equals(isIE)) {
	isIE = "true";
	session.setAttribute("browser_isie", "true");
}
if(!"true".equals(isIE)){
	String agent = request.getHeader("user-agent");
	if (agent != null && agent.indexOf("rv:11") != -1) {
	    isIE = "true";
	    session.setAttribute("browser_isie", "true");
	}
}
Log logger= LogFactory.getLog(this.getClass());



//************************************************
//\u8d85\u65f6\u6216\u8005\u91cd\u542fresin\u670d\u52a1\u65f6\uff0c\u5f39\u51fa\u767b\u9646\u5c0f\u7a97\u53e3(TD 2227)
//hubo,050707

//************************************************

String pagepath = request.getServletPath();
if(pagepath.indexOf("HrmResourceOperation.jsp")<0&&pagepath.indexOf("RemindLogin.jsp")<0&&pagepath.indexOf("HrmResourcePassword.jsp")<0){
	String changepwd = (String)request.getSession().getAttribute("changepwd");
	if("n".equals(changepwd)){
		request.getSession().removeAttribute("changepwd");
		response.sendRedirect("/login/Login.jsp");
		return;
	}else if("y".equals(changepwd)){
		request.getSession().removeAttribute("changepwd");
	}
}



//licence\u4fe1\u606f
String companyNametools="";
LN Licenseinit_1 = new LN();
Licenseinit_1.CkHrmnum();
companyNametools = Licenseinit_1.getCompanyname();

//\u7248\u672c\u4fe1\u606f
StaticObj staticobj = null;
staticobj = StaticObj.getInstance();
String software = (String)staticobj.getObject("software") ;
if(software == null) software="ALL";
String portal = (String)staticobj.getObject("portal") ;
if(portal == null) portal="n";
boolean isPortalOK = false;
if(portal.equals("y")) isPortalOK = true;
String multilanguage = (String)staticobj.getObject("multilanguage") ;
if(multilanguage == null) multilanguage="n";
boolean isMultilanguageOK = false;
if(multilanguage.equals("y")) isMultilanguageOK = true;


      out.write(_jsp_string1, 0, _jsp_string1.length);
      
  String fromlogin=(String)session.getAttribute("fromlogin");
  session.removeAttribute("fromlogin");
  if(fromlogin==null) fromlogin="no";

  RemindSettings settings0=(RemindSettings)application.getAttribute("hrmsettings");
  String firmcode0=settings0.getFirmcode();
  String usercode0=settings0.getUsercode();

  int needusb0=user.getNeedusb();
  String usbtype0 = settings0.getUsbType();
  String serial0=user.getSerial();

//\u9650\u5236\u6bcf\u4e2a\u7528\u6237\u53ea\u80fd\u6709\u4e00\u4e2a\u767b\u5165\u7684\u7a97\u53e3
String frommain = Util.null2String(request.getParameter("frommain")) ;

Map logmessages=(Map)application.getAttribute("logmessages");
String a_logmessage="";
if(logmessages!=null)
	a_logmessage=Util.null2String((String)logmessages.get(""+user.getUID()));

String s_logmessage=Util.null2String((String)session.getAttribute("logmessage"));


//TD2125 by mackjoe \u89e3\u51b3\u6570\u636e\u4e2d\u5fc3\u767b\u9646\u4e0d\u4e86\u95ee\u9898
if(s_logmessage==null)  s_logmessage="";

String relogin0=Util.null2String(settings0.getRelogin());


String layoutStyle = (String)request.getSession(true).getAttribute("layoutStyle");
if(layoutStyle==null) layoutStyle ="";

String rtxFromLogintmp = (String)session.getAttribute("RtxFromLogin");


if(!relogin0.equals("1")&&!fromlogin.equals("yes")&&!frommain.equals("yes")&&!s_logmessage.equals(a_logmessage) && !"true".equals(rtxFromLogintmp)){
	if(layoutStyle.equals("") || !layoutStyle.equals("1")){	//\u5982\u679c\u662f\u5c0f\u7a97\u53e3\u767b\u5f55\uff0c\u5219\u4e0d\u5224\u65ad\u662f\u5426\u4e3a\u5f53\u524d\u5de5\u4f5c\u7a97\u53e3


      out.write(_jsp_string2, 0, _jsp_string2.length);
      out.print((SystemEnv.getHtmlLabelName(23274,user.getLanguage())));
      out.write(_jsp_string3, 0, _jsp_string3.length);
      return;}}
      out.write(_jsp_string4, 0, _jsp_string4.length);
      out.print((request.getSession().getId()));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((SystemEnv.getHtmlLabelName(21403,user.getLanguage())));
      out.write(_jsp_string6, 0, _jsp_string6.length);
      out.print((SystemEnv.getHtmlLabelName(21791,user.getLanguage())));
      out.write(_jsp_string7, 0, _jsp_string7.length);
      out.print((user.getUID()));
      out.write(_jsp_string8, 0, _jsp_string8.length);
      out.print((SystemEnv.getHtmlLabelName(26263,user.getLanguage())));
      out.write(_jsp_string9, 0, _jsp_string9.length);
      out.print((URLEncoder.encode(user.getLoginid())));
      out.write(_jsp_string10, 0, _jsp_string10.length);
      out.print((SystemEnv.getHtmlLabelName(21403,user.getLanguage())));
      out.write(_jsp_string11, 0, _jsp_string11.length);
      out.print((SystemEnv.getHtmlLabelName(23670,user.getLanguage())));
      out.write(_jsp_string12, 0, _jsp_string12.length);
      out.print((SystemEnv.getHtmlLabelName(21791,user.getLanguage())));
      out.write(_jsp_string13, 0, _jsp_string13.length);
      if(new weaver.conn.RecordSet().getDBType().equals("oracle")){
      out.write(_jsp_string14, 0, _jsp_string14.length);
      out.print((SystemEnv.getHtmlLabelName(524,user.getLanguage())));
      out.print((SystemEnv.getHtmlLabelName(698,user.getLanguage())));
      out.write(_jsp_string15, 0, _jsp_string15.length);
      out.print((SystemEnv.getHtmlLabelName(20246,user.getLanguage())));
      out.write(_jsp_string15, 0, _jsp_string15.length);
      out.print((SystemEnv.getHtmlLabelName(20247,user.getLanguage())));
      out.write(_jsp_string16, 0, _jsp_string16.length);
      }
      out.write(_jsp_string17, 0, _jsp_string17.length);
      out.print((SystemEnv.getHtmlLabelName(21423,user.getLanguage())));
      out.write(_jsp_string18, 0, _jsp_string18.length);
      out.print((SystemEnv.getHtmlNoteName(14,user.getLanguage())));
      out.write(_jsp_string19, 0, _jsp_string19.length);
      out.print((SystemEnv.getHtmlLabelName(21423,user.getLanguage())));
      out.write(_jsp_string18, 0, _jsp_string18.length);
      out.print((SystemEnv.getHtmlNoteName(14,user.getLanguage())));
      out.write(_jsp_string20, 0, _jsp_string20.length);
      out.print((SystemEnv.getHtmlLabelName(15097,user.getLanguage())));
      out.write(_jsp_string21, 0, _jsp_string21.length);
      out.print((SystemEnv.getHtmlLabelName(22161,user.getLanguage())));
      out.write(_jsp_string22, 0, _jsp_string22.length);
      out.print((companyNametools));
      out.write(_jsp_string23, 0, _jsp_string23.length);
      out.print((SystemEnv.getHtmlLabelName(23714,user.getLanguage())));
      out.write(_jsp_string24, 0, _jsp_string24.length);
      
  if(!fromlogin.equals("yes")&&needusb0==1&&"1".equals(usbtype0)){

      out.write(_jsp_string25, 0, _jsp_string25.length);
      out.print((firmcode0));
      out.write(_jsp_string26, 0, _jsp_string26.length);
      out.print((usercode0));
      out.write(_jsp_string27, 0, _jsp_string27.length);
      out.print((serial0));
      out.write(_jsp_string28, 0, _jsp_string28.length);
      out.print((user.getLanguage()));
      out.write(_jsp_string29, 0, _jsp_string29.length);
      }
      out.write(_jsp_string30, 0, _jsp_string30.length);
      

String curTheme = "ecology7";
//\u5f53\u524d\u76ae\u80a4
String curskin = "default";
String cutoverWay = "";
String transitionTime = "";
String transitionWay = "";

HrmUserSettingComInfo instance = new HrmUserSettingComInfo();

String huscifId = String.valueOf(instance.getId(String.valueOf(user.getUID())));

//curTheme = getCurrWuiConfig(session, user, "theme");
//curskin = getCurrWuiConfig(session, user, "skin");

cutoverWay = instance.getCutoverWay(huscifId);
transitionTime = instance.getTransitionTime(huscifId);
transitionWay = instance.getTransitionWays(huscifId);

      out.write(_jsp_string31, 0, _jsp_string31.length);
      
String ely6flg = "";
if ("ecology6".equals(curTheme.toLowerCase())) {
	curTheme = "ecology7";
	ely6flg = "ecology6";
}
session.setAttribute("SESSION_TEMP_CURRENT_THEME", curTheme);

      out.write(_jsp_string32, 0, _jsp_string32.length);
      out.print((curTheme ));
      out.write(_jsp_string33, 0, _jsp_string33.length);
      out.print((curskin ));
      out.write(_jsp_string34, 0, _jsp_string34.length);
      
if (transitionTime != null && !transitionTime.equals("") && !transitionTime.equals("0")) {

      out.write(_jsp_string35, 0, _jsp_string35.length);
      out.print((cutoverWay ));
      out.write(_jsp_string36, 0, _jsp_string36.length);
      out.print((transitionTime ));
      out.write(_jsp_string37, 0, _jsp_string37.length);
      out.print((transitionWay ));
      out.write(_jsp_string38, 0, _jsp_string38.length);
      
}

      out.write(_jsp_string39, 0, _jsp_string39.length);
      out.print((curTheme ));
      out.write(_jsp_string40, 0, _jsp_string40.length);
      out.print((curskin ));
      out.write(_jsp_string41, 0, _jsp_string41.length);
      weaver.mobile.webservices.workflow.soa.HandwrittenSignatureManager HandwrittenSignatureManager;
      HandwrittenSignatureManager = (weaver.mobile.webservices.workflow.soa.HandwrittenSignatureManager) pageContext.getAttribute("HandwrittenSignatureManager");
      if (HandwrittenSignatureManager == null) {
        HandwrittenSignatureManager = new weaver.mobile.webservices.workflow.soa.HandwrittenSignatureManager();
        pageContext.setAttribute("HandwrittenSignatureManager", HandwrittenSignatureManager);
      }
      out.write(_jsp_string31, 0, _jsp_string31.length);
      
	HandwrittenSignatureManager.resetParameter();
	String opera = HandwrittenSignatureManager.UploadHandwrittenSignature(request);
	response.sendRedirect("HandwrittenSignatureList.jsp");

      out.write(_jsp_string31, 0, _jsp_string31.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/1/UploadHandwrittenSignature.jsp"), -1398355847699506442L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("systeminfo/init.jsp"), 2369989025239464550L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string40;
  private final static char []_jsp_string29;
  private final static char []_jsp_string24;
  private final static char []_jsp_string32;
  private final static char []_jsp_string3;
  private final static char []_jsp_string4;
  private final static char []_jsp_string20;
  private final static char []_jsp_string38;
  private final static char []_jsp_string25;
  private final static char []_jsp_string7;
  private final static char []_jsp_string27;
  private final static char []_jsp_string2;
  private final static char []_jsp_string5;
  private final static char []_jsp_string14;
  private final static char []_jsp_string12;
  private final static char []_jsp_string23;
  private final static char []_jsp_string26;
  private final static char []_jsp_string17;
  private final static char []_jsp_string13;
  private final static char []_jsp_string0;
  private final static char []_jsp_string28;
  private final static char []_jsp_string33;
  private final static char []_jsp_string6;
  private final static char []_jsp_string35;
  private final static char []_jsp_string39;
  private final static char []_jsp_string34;
  private final static char []_jsp_string18;
  private final static char []_jsp_string10;
  private final static char []_jsp_string19;
  private final static char []_jsp_string31;
  private final static char []_jsp_string21;
  private final static char []_jsp_string30;
  private final static char []_jsp_string8;
  private final static char []_jsp_string9;
  private final static char []_jsp_string16;
  private final static char []_jsp_string22;
  private final static char []_jsp_string37;
  private final static char []_jsp_string36;
  private final static char []_jsp_string15;
  private final static char []_jsp_string11;
  private final static char []_jsp_string41;
  private final static char []_jsp_string1;
  static {
    _jsp_string40 = "\";\r\n//\u5f53\u524d\u4e3b\u9898\u4f7f\u7528\u7684\u76ae\u80a4\r\nvar GLOBAL_SKINS_FOLDER = \"".toCharArray();
    _jsp_string29 = "\";\r\ndoCheckusb();\r\n</script>\r\n".toCharArray();
    _jsp_string24 = "\";\r\n\r\n  if(companyname.length >0 ){\r\n  	window.status = str1+companyname;\r\n  }\r\n</script>\r\n<!-- \u5220\u9664 -->\r\n</head></html>\r\n\r\n<!--USB \u9a8c\u8bc1 -->\r\n".toCharArray();
    _jsp_string32 = "\r\n<!--For wui-->\r\n<link type='text/css' rel='stylesheet'  href='/wui/theme/".toCharArray();
    _jsp_string3 = "\");\r\nwindow.top.location=\"/login/Login.jsp\";\r\n</script>\r\n".toCharArray();
    _jsp_string4 = "\r\n\r\n<!-- \u53ea\u6709jquery  wui -->\r\n<script type=\"text/javascript\" src=\"/wui/common/jquery/jquery.js\"></script>\r\n<script type=\"text/javascript\" src=\"/js/jquery/plugins/client/jquery.client.js\"></script>\r\n<script type=\"text/javascript\" src=\"/wui/common/jquery/plugin/jQuery.modalDialog.js\"></script>\r\n\r\n<!-- \u79fb\u9664 -->\r\n\r\n<script language=javascript>\r\nvar ieVersion = 6;//ie\u7248\u672c\r\nwindow[\"_jsessionid\"] = \"".toCharArray();
    _jsp_string20 = "\uff01\");\r\n						return false;\r\n					}\r\n				}\r\n			}\r\n		}\r\n	}\r\n	return true;\r\n}\r\n\r\nfunction isdel(){\r\n	var str = \"".toCharArray();
    _jsp_string38 = ")\">\r\n".toCharArray();
    _jsp_string25 = "\r\n<script language=javascript>\r\nubsfirmcode0 = ".toCharArray();
    _jsp_string7 = "');\r\n}\r\n\r\nfunction check_form(thiswins,items)\r\n{\r\n	/* added by cyril on 2008-08-14 for td:8521 */\r\n	var isconn = false;\r\n	try {\r\n		var xmlhttp;\r\n	    if (window.XMLHttpRequest) {\r\n	    	xmlhttp = new XMLHttpRequest();\r\n	    }  \r\n	    else if (window.ActiveXObject) {\r\n	    	xmlhttp = new ActiveXObject(\"Microsoft.XMLHTTP\");  \r\n	    }\r\n	    var URL = \"/systeminfo/CheckConn.jsp?userid=".toCharArray();
    _jsp_string27 = ";\r\nusbserial0 = \"".toCharArray();
    _jsp_string2 = "\r\n\r\n\r\n<script language=javascript>;\r\nalert(\"".toCharArray();
    _jsp_string5 = "\";\r\nfunction check_conn() {\r\n	return confirm('".toCharArray();
    _jsp_string14 = "\r\n	    try {\r\n		    var lenck = true;\r\n		    var tempfieldvlaue = document.getElementById(\"htmlfieldids\").value;\r\n		    while(true) {\r\n			    var tempfield = tempfieldvlaue.substring(0, tempfieldvlaue.indexOf(\",\"));\r\n			    tempfieldvlaue = tempfieldvlaue.substring(tempfieldvlaue.indexOf(\",\")+1);\r\n			    tempfield = getStrFilter(tempfield);\r\n			    //var fieldid = tempfield.substring(0, tempfield.indexOf(\";\"));\r\n			    //var fieldname = tempfield.substring(tempfield.indexOf(\";\")+1);\r\n			    var arrfield = tempfield.split(\";\");\r\n			    var fieldid,fieldname,fieldtype;\r\n			    fieldid = arrfield[0];\r\n			    fieldname = arrfield[1];\r\n			    if(arrfield.length == 3) {\r\n			    	fieldtype = arrfield[2];\r\n			    } else {\r\n			    	fieldtype = 1;\r\n			    }\r\n			    if(typeof(fieldid) == \"undefined\") fieldid = \"\";\r\n			    if(typeof(fieldname) == \"undefined\") fieldname = \"\";\r\n			    if(fieldname=='') break;\r\n			    if(fieldtype == 2) {\r\n			    	continue;\r\n			    }\r\n			    if(!checkLengthOnly(fieldid,'4000',fieldname,'".toCharArray();
    _jsp_string12 = "';\r\n	   \r\n	    			return false;\r\n	    		}\r\n	    		flag_msg += '\\r\\n\\r\\n".toCharArray();
    _jsp_string23 = "\";\r\n  var str1 = \"".toCharArray();
    _jsp_string26 = ";\r\nusbusercode0 = ".toCharArray();
    _jsp_string17 = "\r\n\r\n	}\r\n	catch(e) {\r\n		return check_conn();\r\n	}\r\n	if(!isconn)\r\n		return check_conn();\r\n    /* end by cyril on 2008-08-14 for td:8521 */\r\n	\r\n	thiswin = thiswins\r\n	items = \",\"+items + \",\";\r\n	\r\n	var tempfieldvlaue1 = \"\";\r\n	try{\r\n		tempfieldvlaue1 = document.getElementById(\"htmlfieldids\").value;\r\n	}catch (e) {\r\n	}\r\n\r\n	for(i=1;i<=thiswin.length;i++){\r\n		tmpname = thiswin.elements[i-1].name;\r\n		tmpvalue = thiswin.elements[i-1].value;\r\n	    if(tmpvalue==null){\r\n	        continue;\r\n	    }\r\n\r\n		if(tmpname!=\"\" && items.indexOf(\",\"+tmpname+\",\")!=-1){\r\n			if(tempfieldvlaue1.indexOf(tmpname+\";\") == -1){\r\n				while(tmpvalue.indexOf(\" \") >= 0){\r\n					tmpvalue = tmpvalue.replace(\" \", \"\");\r\n				}\r\n				while(tmpvalue.indexOf(\"\\r\\n\") >= 0){\r\n					tmpvalue = tmpvalue.replace(\"\\r\\n\", \"\");\r\n				}\r\n\r\n				if(tmpvalue == \"\"){\r\n					if(thiswin.elements[i-1].getAttribute(\"temptitle\")!=null){\r\n						alert(\"\\\"\"+thiswin.elements[i-1].getAttribute(\"temptitle\")+\"\\\"\"+\"".toCharArray();
    _jsp_string13 = "';\r\n	        	//alert(xmlhttp.responseText);\r\n	        	return confirm(flag_msg);\r\n	        }\r\n	    }\r\n	    xmlhttp = null;\r\n\r\n	  	//\u68c0\u67e5\u591a\u884c\u6587\u672c\u6846 oracle\u4e0b\u68c0\u67e5HTML\u4e0d\u80fd\u8d85\u8fc74000\u4e2a\u5b57\u7b26\r\n	    ".toCharArray();
    _jsp_string0 = "\r\n\r\n\r\n \r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string28 = "\";\r\nusblanguage = \"".toCharArray();
    _jsp_string33 = "/skins/".toCharArray();
    _jsp_string6 = "\\r\\n\\r\\n".toCharArray();
    _jsp_string35 = "\r\n    <meta http-equiv=\"".toCharArray();
    _jsp_string39 = "\r\n<!-- \u9875\u9762\u5207\u6362\u6548\u679cEnd -->\r\n\r\n\r\n<script language=\"javascript\">\r\n\r\n//------------------------------\r\n// the folder of current skins \r\n//------------------------------\r\n//\u5f53\u524d\u4f7f\u7528\u7684\u4e3b\u9898\r\nvar GLOBAL_CURRENT_THEME = \"".toCharArray();
    _jsp_string34 = "/wui.css'/>\r\n\r\n<!-- \u5b57\u4f53\u8bbe\u7f6e\uff0cwin7\u3001vista\u7cfb\u7edf\u4f7f\u7528\u96c5\u9ed1\u5b57\u4f53,\u5176\u4ed6\u7cfb\u7edf\u4f7f\u7528\u5b8b\u4f53 Start -->\r\n<link type='text/css' rel='stylesheet'  href='/wui/common/css/w7OVFont.css' id=\"FONT2SYSTEMF\">\r\n<script language=\"javascript\"> \r\nif (jQuery.client.version< 6) {\r\n	document.getElementById('FONT2SYSTEMF').href = \"/wui/common/css/notW7AVFont.css\";\r\n}\r\n</script> \r\n<!-- \u5b57\u4f53\u8bbe\u7f6e\uff0cwin7\u3001vista\u7cfb\u7edf\u4f7f\u7528\u96c5\u9ed1\u5b57\u4f53,\u5176\u4ed6\u7cfb\u7edf\u4f7f\u7528\u5b8b\u4f53 End -->\r\n\r\n<!-- \u9875\u9762\u5207\u6362\u6548\u679cStart -->\r\n".toCharArray();
    _jsp_string18 = "\");\r\n						return false;\r\n					}else{\r\n						alert(\"".toCharArray();
    _jsp_string10 = "\";\r\n					diag.show();\r\n			        return false;\r\n	    		}\r\n	    		else if(response_flag=='2') {\r\n	    			flag_msg = '".toCharArray();
    _jsp_string19 = "\uff01\");\r\n						return false;\r\n					}\r\n				}\r\n			} else {\r\n				var divttt=document.createElement(\"div\");\r\n				divttt.innerHTML = tmpvalue;\r\n				var tmpvaluettt = jQuery.trim(jQuery(divttt).text());\r\n				if(tmpvaluettt == \"\"){\r\n					if(thiswin.elements[i-1].getAttribute(\"temptitle\")!=null){\r\n						alert(\"\\\"\"+thiswin.elements[i-1].getAttribute(\"temptitle\")+\"\\\"\"+\"".toCharArray();
    _jsp_string31 = "\r\n".toCharArray();
    _jsp_string21 = "\";\r\n   if(!confirm(str)){\r\n       return false;\r\n   }\r\n       return true;\r\n } \r\n\r\nfunction issubmit(){\r\n	var str = \"".toCharArray();
    _jsp_string30 = "\r\n\r\n<!--WUI -->\r\n\r\n<!--For wui-->\r\n".toCharArray();
    _jsp_string8 = "&time=\"+new Date();\r\n	    xmlhttp.open(\"GET\",URL, false);\r\n	    xmlhttp.send(null);\r\n	    var result = xmlhttp.status;\r\n	    if(result==200) {\r\n		    isconn = true;\r\n	    	var response_flag = xmlhttp.responseText;\r\n	    	if(response_flag!='0') {\r\n	    		var flag_msg = '';\r\n	    		if(response_flag=='1') {\r\n	    			var diag = new Dialog();\r\n					diag.Width = 300;\r\n					diag.Height = 180;\r\n					diag.ShowCloseButton=false;\r\n					diag.Title = \"".toCharArray();
    _jsp_string9 = "\";\r\n					//diag.InvokeElementId=\"pageOverlay\"\r\n					diag.URL = \"/wui/theme/ecology7/page/loginSmall.jsp?username=".toCharArray();
    _jsp_string16 = "')) {\r\n				    lenck = false;\r\n				    break;\r\n			    }\r\n		    }\r\n		    if(lenck==false) return false;\r\n	    }\r\n	    catch(e) {}\r\n	    ".toCharArray();
    _jsp_string22 = "\";\r\n   if(!confirm(str)){\r\n       return false;\r\n   }\r\n       return true;\r\n   } \r\n\r\n/*\u6d41\u7a0b\u91cc\u9762\u4f7f\u7528\uff0c\u4e3b\u8981\u662f\u56e0\u4e3a\u6d41\u7a0b\u5185\u5bb9\u653e\u5230iframe\u91cc\u9762\uff0c\u901a\u8fc7response\u8fd4\u56de\u7684\u65f6\u5019\uff0c\u8981\u8fd4\u56de\u7684\u5230\u5176\u7236\u7a97\u53e3*/\r\nfunction wfforward(wfurl){\r\n	parent.location.href = wfurl;\r\n}\r\n\r\nfunction wfforward89644(wfurl){\r\n	location.href = wfurl;\r\n}\r\n\r\nfunction myescapecode(str)\r\n{\r\n	return encodeURIComponent(str);\r\n}\r\n</script>\r\n\r\n<script language=\"javascript\" type=\"text/javascript\" src=\"/FCKEditor/swfobject.js\"></script>\r\n<!-- IE\u4e0b\u4e13\u7528vbs\uff08\u4e34\u65f6\uff09 -->\r\n<script language=\"vbs\" src=\"/js/string2VbArray.vbs\"></script>\r\n\r\n<!-- js \u6574\u5408\u5230 init.js -->\r\n<script language=\"javascript\" type=\"text/javascript\" src=\"/js/init.js\"></script>\r\n\r\n<script language=\"javascript\"  src=\"/js/wbusb.js\"></script>\r\n<!-- \u5220\u9664 -->\r\n<html><head>\r\n<meta http-equiv=Content-Type content=\"text/html; charset=GBK\">\r\n<script language=JavaScript> \r\n  var companyname = \"".toCharArray();
    _jsp_string37 = ",transition=".toCharArray();
    _jsp_string36 = "\" content=\"revealTrans(duration=".toCharArray();
    _jsp_string15 = "','".toCharArray();
    _jsp_string11 = "';\r\n	    		}\r\n	    		//\u4e3b\u4ece\u5e10\u6237\u7279\u6b8a\u5904\u7406 by alan for TD10156\r\n	    		if(response_flag=='3') {\r\n	    			flag_msg = '".toCharArray();
    _jsp_string41 = "\";\r\n</script>\r\n\r\n<!--For wuiForm-->\r\n<script type=\"text/javascript\" src=\"/wui/common/jquery/plugin/wuiform/jquery.wuiform.js\"></script>\r\n<script language=\"javascript\">\r\njQuery(document).ready(function(){\r\n	wuiform.init();\r\n});\r\nfunction getStrFilter(str){\r\n	// update \u2014 \r\n	var regStr = new RegExp(\"&mdash;\",\"gi\");\r\n	str = str.replace(regStr,\"\u2014\");\r\n	// update \u00b7\r\n	regStr = new RegExp(\"&middot;\",\"gi\");\r\n	str = str.replace(regStr,\"\u00b7\");\r\n	// update \u201c\r\n	regStr = new RegExp(\"&ldquo;\",\"gi\");\r\n	str = str.replace(regStr,\"\u201c\");\r\n	// update \u201d\r\n	regStr = new RegExp(\"&rdquo;\",\"gi\");\r\n	str = str.replace(regStr,\"\u201d\");\r\n	// update \u2018\r\n	regStr = new RegExp(\"&amp;lsquo;\",\"gi\");\r\n	str = str.replace(regStr,\"\u2018\");\r\n	// update \u2019\r\n	regStr = new RegExp(\"&amp;rsquo;\",\"gi\");\r\n	str = str.replace(regStr,\"\u2019\");\r\n	// update \u2018\r\n	regStr = new RegExp(\"&lsquo;\",\"gi\");\r\n	str = str.replace(regStr,\"\u2018\");\r\n	// update \u2019\r\n	regStr = new RegExp(\"&rsquo;\",\"gi\");\r\n	str = str.replace(regStr,\"\u2019\");\r\n	// update '  \r\n	regStr = new RegExp(\"&#39;\",\"gi\");\r\n	str = str.replace(regStr,\"'\");\r\n	// update <\r\n	regStr = new RegExp(\"&lt;\",\"gi\");\r\n	str = str.replace(regStr,\"<\");\r\n	// update >\r\n	regStr = new RegExp(\"&gt;\",\"gi\");\r\n	str = str.replace(regStr,\">\");\r\n	// update \u2264\r\n	regStr = new RegExp(\"&le;\",\"gi\");\r\n	str = str.replace(regStr,\"\u2264\");\r\n	// update \u2265\r\n	regStr = new RegExp(\"&ge;\",\"gi\");\r\n	str = str.replace(regStr,\"\u2265\");\r\n	// update \u00d7\r\n	regStr = new RegExp(\"&times;\",\"gi\");\r\n	str = str.replace(regStr,\"\u00d7\");\r\n	// update \u00f7\r\n	regStr = new RegExp(\"&divide;\",\"gi\");\r\n	str = str.replace(regStr,\"\u00f7\");\r\n	// update \u2013\r\n	regStr = new RegExp(\"&ndash;\",\"gi\");\r\n	str = str.replace(regStr,\"\u2013\");\r\n	// update \u2026\r\n	regStr= new RegExp(\"&hellip;\",\"gi\");\r\n	str = str.replace(regStr,\"\u2026\");\r\n	// update \u00b1\r\n	regStr= new RegExp(\"&plusmn;\",\"gi\");\r\n	str = str.replace(regStr,\"\u00b1\");\r\n	// update \u221e\r\n	regStr= new RegExp(\"&infin;\",\"gi\");\r\n	str = str.replace(regStr,\"\u221e\");\r\n	// update \u03b4\r\n	regStr= new RegExp(\"&delta;\",\"gi\");\r\n	str = str.replace(regStr,\"\u03b4\");\r\n	// update \u221d\r\n	regStr= new RegExp(\"&prop;\",\"gi\");\r\n	str = str.replace(regStr,\"\u221d\");\r\n	// update \u2228\r\n	regStr= new RegExp(\"&or;\",\"gi\");\r\n	str = str.replace(regStr,\"\u2228\");\r\n	// update \u2227\r\n	regStr= new RegExp(\"&and;\",\"gi\");\r\n	str = str.replace(regStr,\"\u2227\");\r\n	// update \u2030\r\n	regStr= new RegExp(\"&permil;\",\"gi\");\r\n	str = str.replace(regStr,\"\u2030\");\r\n	// update \u00b7\r\n	regStr= new RegExp(\"&#8226;\",\"gi\");\r\n	str = str.replace(regStr,\"\u00b7\");\r\n	// update `\r\n	regStr= new RegExp(\"&bull;\",\"gi\");\r\n	str = str.replace(regStr,\"`\");\r\n	// update \u6b27\u5143\u7b26\u53f7\r\n	//\u672c\u5b57\u7b26\u4e32\u662f\u6b27\u5143\u7b26\u53f7\u7684unicode\u7801, GBK\u7f16\u8f91\u4e2d\u4e0d\u652f\u6301\u6b27\u5143\u7b26\u53f7(\u9700\u66f4\u6539\u4e3aUTF-8), \u6545\u53ea\u80fd\u4f7f\u7528unicode\u7801\r\n	regStr= new RegExp(\"&euro;\",\"gi\");\r\n	str = str.replace(regStr,\"\\u20AC\");\r\n	// update \u2192\r\n	regStr= new RegExp(\"&rarr;\",\"gi\");\r\n	str = str.replace(regStr,\"\u2192\");\r\n	\r\n	regStr= new RegExp(\"&amp;#160;\",\"gi\");\r\n	str = str.replace(regStr,\" \");\r\n	\r\n	regStr= new RegExp(\"&nbsp;\",\"gi\");\r\n	str = str.replace(regStr,\" \");\r\n	return str;\r\n}\r\n</script>\r\n".toCharArray();
    _jsp_string1 = "\r\n\r\n".toCharArray();
  }
}