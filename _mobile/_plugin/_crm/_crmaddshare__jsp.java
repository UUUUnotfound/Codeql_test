/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin._crm;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import weaver.hrm.company.DepartmentComInfo;
import weaver.email.MailSend;
import java.util.*;
import weaver.hrm.*;
import weaver.systeminfo.*;
import weaver.general.StaticObj;
import weaver.general.Util;
import weaver.hrm.settings.RemindSettings;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class _crmaddshare__jsp extends com.caucho.jsp.JavaPage
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
      
	
	response.setHeader("cache-control", "no-cache");
	response.setHeader("pragma", "no-cache");
	response.setHeader("expires", "Mon 1 Jan 1990 00:00:00 GMT");
	

	User user = HrmUserVarify.getUser (request , response) ;
	if(user == null)  return ;
	Log logger= LogFactory.getLog(this.getClass());
	String isIE = (String)session.getAttribute("browser_isie");

      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.conn.RecordSet rs;
      rs = (weaver.conn.RecordSet) pageContext.getAttribute("rs");
      if (rs == null) {
        rs = new weaver.conn.RecordSet();
        pageContext.setAttribute("rs", rs);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.email.service.MailAccountService mas;
      mas = (weaver.email.service.MailAccountService) pageContext.getAttribute("mas");
      if (mas == null) {
        mas = new weaver.email.service.MailAccountService();
        pageContext.setAttribute("mas", mas);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.email.service.MailManagerService mms;
      mms = (weaver.email.service.MailManagerService) pageContext.getAttribute("mms");
      if (mms == null) {
        mms = new weaver.email.service.MailManagerService();
        pageContext.setAttribute("mms", mms);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.hrm.resource.ResourceComInfo ResourceComInfo;
      ResourceComInfo = (weaver.hrm.resource.ResourceComInfo) pageContext.getAttribute("ResourceComInfo");
      if (ResourceComInfo == null) {
        ResourceComInfo = new weaver.hrm.resource.ResourceComInfo();
        pageContext.setAttribute("ResourceComInfo", ResourceComInfo);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.hrm.company.DepartmentComInfo DepartmentComInfo;
      DepartmentComInfo = (weaver.hrm.company.DepartmentComInfo) pageContext.getAttribute("DepartmentComInfo");
      if (DepartmentComInfo == null) {
        DepartmentComInfo = new weaver.hrm.company.DepartmentComInfo();
        pageContext.setAttribute("DepartmentComInfo", DepartmentComInfo);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.hrm.roles.RolesComInfo RolesComInfo;
      RolesComInfo = (weaver.hrm.roles.RolesComInfo) pageContext.getAttribute("RolesComInfo");
      if (RolesComInfo == null) {
        RolesComInfo = new weaver.hrm.roles.RolesComInfo();
        pageContext.setAttribute("RolesComInfo", RolesComInfo);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.crm.CrmShareBase CrmShareBase;
      CrmShareBase = (weaver.crm.CrmShareBase) pageContext.getAttribute("CrmShareBase");
      if (CrmShareBase == null) {
        CrmShareBase = new weaver.crm.CrmShareBase();
        pageContext.setAttribute("CrmShareBase", CrmShareBase);
      }
      out.write(_jsp_string2, 0, _jsp_string2.length);
      
	String customerid=Util.null2String((String)request.getParameter("customerid"));
	String clienttype = Util.null2String((String)request.getParameter("clienttype"));
	String clientlevel = Util.null2String((String)request.getParameter("clientlevel"));
	String module=Util.null2String((String)request.getParameter("module"));
	String scope=Util.null2String((String)request.getParameter("scope"));
	String opengps = Util.null2String((String)request.getParameter("opengps"));
	
	boolean canview=false;
	boolean canedit=false;
	
	int sharelevel = CrmShareBase.getRightLevelForCRM(""+user.getUID(),customerid);
	if(sharelevel>0){
	     canview=true;
	     //canviewlog=true;
	     //canmailmerge=true;
	     if(sharelevel==2) canedit=true;
	     if(sharelevel==3||sharelevel==4){
	         canedit=true;
	         //canapprove=true;
	     }
	}

      out.write(_jsp_string3, 0, _jsp_string3.length);
      out.print((module));
      out.write(_jsp_string4, 0, _jsp_string4.length);
      out.print((scope));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((customerid));
      out.write(_jsp_string6, 0, _jsp_string6.length);
      if (clienttype.equals("Webclient")) {
      out.write(_jsp_string7, 0, _jsp_string7.length);
      } else {
      out.write(_jsp_string8, 0, _jsp_string8.length);
      }
      out.write(_jsp_string9, 0, _jsp_string9.length);
      out.print((customerid));
      out.write(_jsp_string10, 0, _jsp_string10.length);
      out.print((module));
      out.write(_jsp_string4, 0, _jsp_string4.length);
      out.print((scope));
      out.write(_jsp_string11, 0, _jsp_string11.length);
      out.print((opengps));
      out.write(_jsp_string12, 0, _jsp_string12.length);
      out.print((SystemEnv.getHtmlLabelName(1290,user.getLanguage()) ));
      out.write(_jsp_string13, 0, _jsp_string13.length);
      out.print((SystemEnv.getHtmlLabelName(136,user.getLanguage()) ));
      out.write(_jsp_string14, 0, _jsp_string14.length);
      if(canedit){
      out.write(_jsp_string15, 0, _jsp_string15.length);
      out.print((SystemEnv.getHtmlLabelName(86,user.getLanguage()) ));
      out.write(_jsp_string16, 0, _jsp_string16.length);
      }
      out.write(_jsp_string17, 0, _jsp_string17.length);
      
											rs.executeProc("CRM_ShareInfo_SbyRelateditemid",customerid);
											while(rs.next()){
												int id=rs.getInt("id");
												int shareType=rs.getInt("sharetype");
												//int sharelevel=rs.getInt("sharelevel");
										
      out.write(_jsp_string18, 0, _jsp_string18.length);
      out.print((id));
      out.write(_jsp_string19, 0, _jsp_string19.length);
      if(shareType==1){
      out.write(_jsp_string20, 0, _jsp_string20.length);
      out.print((SystemEnv.getHtmlLabelName(179,user.getLanguage())));
      out.write(_jsp_string21, 0, _jsp_string21.length);
      }else if(shareType==2){
      out.write(_jsp_string20, 0, _jsp_string20.length);
      out.print((SystemEnv.getHtmlLabelName(124,user.getLanguage())));
      out.write(_jsp_string21, 0, _jsp_string21.length);
      }else if(shareType==3){
      out.write(_jsp_string20, 0, _jsp_string20.length);
      out.print((SystemEnv.getHtmlLabelName(122,user.getLanguage())));
      out.write(_jsp_string21, 0, _jsp_string21.length);
      }else if(shareType==4){
      out.write(_jsp_string20, 0, _jsp_string20.length);
      out.print((SystemEnv.getHtmlLabelName(235,user.getLanguage())));
      out.print((SystemEnv.getHtmlLabelName(127,user.getLanguage())));
      out.write(_jsp_string21, 0, _jsp_string21.length);
      } 
      out.write(_jsp_string22, 0, _jsp_string22.length);
      if(shareType==1){
      out.write(_jsp_string20, 0, _jsp_string20.length);
      out.print((Util.toScreen(ResourceComInfo.getResourcename(rs.getString("userid")),user.getLanguage())));
      out.write(_jsp_string21, 0, _jsp_string21.length);
      }else if(shareType==2){
      out.write(_jsp_string20, 0, _jsp_string20.length);
      out.print((Util.toScreen(DepartmentComInfo.getDepartmentname(rs.getString("departmentid")),user.getLanguage())));
      out.write('/');
      out.print((SystemEnv.getHtmlLabelName(683,user.getLanguage())));
      out.write(':');
      out.print((Util.toScreen(rs.getString("seclevel"),user.getLanguage())));
      out.write(_jsp_string23, 0, _jsp_string23.length);
      }else if(shareType==3){
      out.write(_jsp_string20, 0, _jsp_string20.length);
      out.print((Util.toScreen(RolesComInfo.getRolesRemark(rs.getString("roleid")),user.getLanguage())));
      out.write(_jsp_string24, 0, _jsp_string24.length);
       if(rs.getInt("rolelevel")==0)
      out.print((SystemEnv.getHtmlLabelName(124,user.getLanguage())));
      out.write(_jsp_string20, 0, _jsp_string20.length);
       if(rs.getInt("rolelevel")==1)
      out.print((SystemEnv.getHtmlLabelName(141,user.getLanguage())));
      out.write(_jsp_string20, 0, _jsp_string20.length);
       if(rs.getInt("rolelevel")==2)
      out.print((SystemEnv.getHtmlLabelName(140,user.getLanguage())));
      out.write(_jsp_string25, 0, _jsp_string25.length);
      out.print((SystemEnv.getHtmlLabelName(683,user.getLanguage())));
      out.write(':');
      out.print((Util.toScreen(rs.getString("seclevel"),user.getLanguage())));
      out.write(_jsp_string21, 0, _jsp_string21.length);
      }else if(shareType==4){
      out.write(_jsp_string20, 0, _jsp_string20.length);
      out.print((SystemEnv.getHtmlLabelName(683,user.getLanguage())));
      out.write(':');
      out.print((Util.toScreen(rs.getString("seclevel"),user.getLanguage())));
      out.write(_jsp_string21, 0, _jsp_string21.length);
      } 
      out.write(_jsp_string26, 0, _jsp_string26.length);
       if(rs.getInt("sharelevel")==1)
      out.print((SystemEnv.getHtmlLabelName(367,user.getLanguage())));
      out.write(_jsp_string27, 0, _jsp_string27.length);
       if(rs.getInt("sharelevel")>=2)
      out.print((SystemEnv.getHtmlLabelName(93,user.getLanguage())));
      out.write(_jsp_string28, 0, _jsp_string28.length);
      if(canedit){
      out.write(_jsp_string29, 0, _jsp_string29.length);
      out.print((id));
      out.write(_jsp_string30, 0, _jsp_string30.length);
      out.print((SystemEnv.getHtmlLabelName(91,user.getLanguage()) ));
      out.write(_jsp_string31, 0, _jsp_string31.length);
      }
      out.write(_jsp_string32, 0, _jsp_string32.length);
      out.print((id));
      out.write(_jsp_string33, 0, _jsp_string33.length);
      }
      out.write(_jsp_string34, 0, _jsp_string34.length);
      out.print((module));
      out.write(_jsp_string4, 0, _jsp_string4.length);
      out.print((scope));
      out.write(_jsp_string35, 0, _jsp_string35.length);
      out.print((SystemEnv.getHtmlLabelName(18214,user.getLanguage()) ));
      out.write(_jsp_string36, 0, _jsp_string36.length);
      out.print((module));
      out.write(_jsp_string4, 0, _jsp_string4.length);
      out.print((scope));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((customerid));
      out.write(_jsp_string37, 0, _jsp_string37.length);
      out.print((SystemEnv.getHtmlLabelName(30702,user.getLanguage()) ));
      out.write(_jsp_string38, 0, _jsp_string38.length);
      out.print((customerid));
      out.write(_jsp_string10, 0, _jsp_string10.length);
      out.print((module));
      out.write(_jsp_string4, 0, _jsp_string4.length);
      out.print((scope));
      out.write(_jsp_string11, 0, _jsp_string11.length);
      out.print((opengps));
      out.write(_jsp_string39, 0, _jsp_string39.length);
      out.print((SystemEnv.getHtmlLabelName(1290,user.getLanguage()) ));
      out.write(_jsp_string40, 0, _jsp_string40.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/crm/CrmAddShare.jsp"), 2453882634299092870L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("page/maint/common/initNoCache.jsp"), 3270256153856711871L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string12;
  private final static char []_jsp_string4;
  private final static char []_jsp_string13;
  private final static char []_jsp_string39;
  private final static char []_jsp_string37;
  private final static char []_jsp_string11;
  private final static char []_jsp_string30;
  private final static char []_jsp_string32;
  private final static char []_jsp_string35;
  private final static char []_jsp_string18;
  private final static char []_jsp_string22;
  private final static char []_jsp_string10;
  private final static char []_jsp_string19;
  private final static char []_jsp_string29;
  private final static char []_jsp_string38;
  private final static char []_jsp_string33;
  private final static char []_jsp_string28;
  private final static char []_jsp_string24;
  private final static char []_jsp_string23;
  private final static char []_jsp_string20;
  private final static char []_jsp_string25;
  private final static char []_jsp_string21;
  private final static char []_jsp_string0;
  private final static char []_jsp_string27;
  private final static char []_jsp_string31;
  private final static char []_jsp_string34;
  private final static char []_jsp_string7;
  private final static char []_jsp_string14;
  private final static char []_jsp_string17;
  private final static char []_jsp_string8;
  private final static char []_jsp_string15;
  private final static char []_jsp_string1;
  private final static char []_jsp_string26;
  private final static char []_jsp_string9;
  private final static char []_jsp_string40;
  private final static char []_jsp_string2;
  private final static char []_jsp_string3;
  private final static char []_jsp_string36;
  private final static char []_jsp_string16;
  private final static char []_jsp_string5;
  private final static char []_jsp_string6;
  static {
    _jsp_string12 = "\">\r\n									<div style=\"width:56px;height:26px;background:url('/images/bg-top-btn_wev8.png') no-repeat;text-align:center;line-height:26px;color:#000;font-size: 14px\">\r\n										".toCharArray();
    _jsp_string4 = "&scope=".toCharArray();
    _jsp_string13 = "\r\n									</div>\r\n								</a>\r\n							</td>\r\n							<td align=\"center\" valign=\"middle\">\r\n								<div id=\"title\">".toCharArray();
    _jsp_string39 = "\";\r\n				return \"1\";\r\n		}\r\n		\r\n		function getLeftButton(){\r\n				return \"1,".toCharArray();
    _jsp_string37 = "&\"+formData, \"\", function(Data){\r\n						window.location.reload();	\r\n				});\r\n			\r\n			}\r\n		}\r\n		\r\n		\r\n		function Savedata(){\r\n				if(checkRequired()){\r\n					//$(\"#mouldtext\").attr(\"value\",$(\"#mouldtext\").val());\r\n					$(\"#folderid\").attr(\"value\",\"-2\");//\u8bbe\u7f6e\u4e3a\u8349\u7a3f\u72b6\u6001\r\n					$(\"#savedraft\").attr(\"value\",\"1\");//\u53ea\u4fdd\u5b58\u5230\u8349\u7a3f\r\n					 if(flag!=\"4\"){\r\n					 	//\u975e\u8349\u7a3f\u72b6\u6001\u7684\u90ae\u4ef6\u4e0d\u8981\u4f20\u9012\u90ae\u4ef6id\u5230\u540e\u53f0\r\n					 	$(\"#mailid\").val(\"\");\r\n					 } \r\n					$(\"#weaver\").submit();\r\n				}\r\n		}	\r\n			\r\n		function checkRequired()\r\n	 	{\r\n	 		var temp=0;\r\n			$(\" span img\").each(function (){\r\n				if($(this).attr(\"align\")=='absMiddle')\r\n				{\r\n					if($(this).css(\"display\")=='inline')\r\n					{\r\n						temp++;\r\n					}\r\n				}\r\n			});\r\n			if(temp!=0){\r\n				alert(\"".toCharArray();
    _jsp_string11 = "&opengps=".toCharArray();
    _jsp_string30 = ")\">".toCharArray();
    _jsp_string32 = "\r\n											</td>\r\n										</tr>	\r\n										<tr width=\"100%\" class=\"share_".toCharArray();
    _jsp_string35 = "&id=\"+shareid,{},function(data){\r\n					$(\".share_\"+shareid).remove();\r\n				})\r\n			}\r\n		}\r\n		\r\n		function checkNumber(obj){\r\n			if(!isdigit($(obj).val()))\r\n			   $(obj).val(\"0\");\r\n		}\r\n		\r\n		function isdigit(s){\r\n			var r,re;\r\n			re = /\\d*/i; //\\d\u8868\u793a\u6570\u5b57,*\u8868\u793a\u5339\u914d\u591a\u4e2a\u6570\u5b57\r\n			r = s.match(re);\r\n			return (r==s)?true:false;\r\n        }\r\n		\r\n		function changeType(){\r\n			\r\n			$(\"#forwardresources01\").html(\"\");\r\n			$(\"#tospan\").html(\"<img src='/images/BacoError_wev8.gif' align='absMiddle' >\");\r\n			$(\"#sharevalue\").val(\"\");\r\n			$(\"#seclevel\").val(\"0\");\r\n			var sharetype=$(\"#sharetype\").val();\r\n			$(\".sharevaluetr\").show();\r\n			\r\n			if(sharetype==\"1\"){\r\n				$(\".secleveltr\").hide();\r\n			}\r\n			\r\n			if(sharetype==\"2\"){\r\n				$(\".secleveltr\").show();\r\n			}\r\n			\r\n			if(sharetype==\"4\"){\r\n				$(\".secleveltr\").show();\r\n				$(\".sharevaluetr\").hide();\r\n				$(\"#shareValue\").val(\"1\");\r\n			}\r\n			\r\n		}\r\n		function showDialog(){\r\n				var _xuhao=$(\"#sharetype\").val()\r\n				var  selected_input=$(\"#selected_input\").val();\r\n				var  selected_selfid=$(\"#_selfid\").val();\r\n				var selectobj=$(\"#\"+selected_input);\r\n				var _selfid=$(\"#\"+selected_selfid);\r\n				var allid=_selfid.next().next().next().attr(\"id\");\r\n				if(_xuhao==\"1\"||_xuhao==\"2\"){\r\n						 //\u70b9\u51fb\u7684\u662f\u4eba\u529b\u8d44\u6e90\r\n						var _totdid=\"forwardresources01\";\r\n						var _name=\"shareValue\";\r\n						var selids=$(\"#shareValue\").val();\r\n						var url=\"/mobile/plugin/crm/browser.jsp\";\r\n						var data=\"&returnIdField=\"+_name+\"&returnShowField=\"+_totdid+\"&method=listUser&isMuti=1&selids=\"+selids+\"&allid=\"+allid;\r\n						if(_xuhao==\"2\")\r\n							data=\"&returnIdField=\"+_name+\"&returnShowField=\"+_totdid+\"&method=listDepartment&isMuti=1&selids=\"+\"&allid=\"+allid;\r\n								\r\n						var top = ($( window ).height()-150)/2;\r\n						var width = window.innerWidth > 480 ? 480 : window.innerWidth - 20;\r\n						$.open({\r\n							id : \"selectionWindow\",\r\n							url : url,\r\n							data: \"r=\" + (new Date()).getTime() + data,\r\n							title : \"".toCharArray();
    _jsp_string18 = "\r\n										<tr class=\"share_".toCharArray();
    _jsp_string22 = "\r\n											</td>\r\n											<td style=\"width:15px;\"></td>\r\n											<td width=\"*\" class=\"mainFormRowValueTD\">\r\n												".toCharArray();
    _jsp_string10 = "&module=".toCharArray();
    _jsp_string19 = "\">\r\n											<td class=\"mainFormRowNameTD\" align=\"left\">\r\n												".toCharArray();
    _jsp_string29 = "\r\n												<div class=\"operationBtright  \" onclick=\"delShare(".toCharArray();
    _jsp_string38 = "\"+\"!\");\r\n				return false;\r\n			}else{\r\n				return true;\r\n			}\r\n	 	}\r\n	 	function closeDialog(){\r\n	 			$.close(\"selectionWindow\");\r\n	 			var internalto=$(\"#internalto\").val();\r\n	 			var internaltodpid=$(\"#internaltodpid\").val();\r\n	 			var internaltoall=$(\"#internaltoall\").val();\r\n	 			if(internalto==\"\"&&internaltodpid==\"\"&&internaltoall==\"\"){\r\n	 				$(\"#tospan\").html(\"<img src='/images/BacoError_wev8.gif' align='absMiddle' >\");\r\n	 			}else{\r\n	 				$(\"#tospan\").html(\"\");\r\n	 			}\r\n	 	}\r\n	 	function getDialogId(){\r\n				return \"selectionWindow\";\r\n	 	}\r\n\r\n		//\u5f53\u7528\u6237\u70b9\u51fb\u6807\u9898\u4e0a\u5de6\u8fb9\u6216\u53f3\u8fb9\u6309\u94ae\u65f6\uff0c\u5ba2\u6237\u7aef\u4f1a\u8c03\u7528\u9875\u9762\u4e0a\u7684javascript\u65b9\u6cd5:\r\n		function doLeftButton() {\r\n				window.location.href=\"/mobile/plugin/crm/CrmView.jsp?customerid=".toCharArray();
    _jsp_string33 = "\"><td colspan=\"4\" class=\"mainFromSplitLine\"></td></tr>\r\n										".toCharArray();
    _jsp_string28 = "\r\n											</td>\r\n											<td>\r\n											".toCharArray();
    _jsp_string24 = "/\r\n													".toCharArray();
    _jsp_string23 = "/\r\n												".toCharArray();
    _jsp_string20 = "\r\n													".toCharArray();
    _jsp_string25 = " /\r\n													".toCharArray();
    _jsp_string21 = "\r\n												".toCharArray();
    _jsp_string0 = "\r\n \r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string27 = "\r\n												 ".toCharArray();
    _jsp_string31 = "</div>\r\n											".toCharArray();
    _jsp_string34 = "\r\n																		\r\n									</table>\r\n								</div>\r\n							    \r\n					    	</td>\r\n					    	<td class='itemnavpoint'></td>\r\n			    	</tr>\r\n	    	</table>\r\n    	</div> \r\n		</form>\r\n	</td>\r\n</tr>\r\n</table>\r\n\r\n\r\n<script type=\"text/javascript\">\r\n		\r\n		function delShare(shareid){\r\n		    if(confirm(\"\u786e\u8ba4\u5220\u9664\u5171\u4eab\uff1f\")){\r\n				$.post(\"/mobile/plugin/crm/ShareOperation.jsp?method=delete&module=".toCharArray();
    _jsp_string7 = "display:block;".toCharArray();
    _jsp_string14 = "</div>\r\n							</td>\r\n							<td width=\"10%\" align=\"right\" valign=\"middle\" style=\"padding-right:5px;\">\r\n									\r\n							</td>\r\n						</tr>\r\n					</table>\r\n			</div>\r\n				\r\n			<div class='listitem' >\r\n	    	<table    style='width:100%;height:100%;border:0;cellspacing:0;cellpadding:0;table-layout:fixed;'>\r\n			    	<tr>\r\n					    	<td class='itempreview'></td>\r\n					    	<td class='itemcontent' >\r\n					    	  ".toCharArray();
    _jsp_string17 = "\r\n								<div style=\"height:10px;overflow:hidden;\"></div>\r\n								<div class=\"blockHead\">\r\n							   		<table style=\"width: 100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n							   			<tr>\r\n							   				<td align=\"left\"><span class=\"m-l-14\">\u5171\u4eab\u4fe1\u606f</span></td>\r\n							   			</tr>\r\n							   		</table>\r\n								</div>\r\n								<div class=\"tblBlock\" style=\"width: 100%; background: #fff;\" id=\"mainforminfoDiv\">\r\n									<table id=\"head\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\" class=\"mainFormTable\">\r\n										".toCharArray();
    _jsp_string8 = "display:none;".toCharArray();
    _jsp_string15 = "\r\n					    		<div style=\"height:10px;overflow:hidden;\"></div>\r\n								<div class=\"blockHead\">\r\n							   		<table style=\"width: 100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n							   			<tr>\r\n							   				<td align=\"left\"><span class=\"m-l-14\">\u6dfb\u52a0\u5171\u4eab</span></td>\r\n							   			</tr>\r\n							   		</table>\r\n								</div>\r\n								<div class=\"tblBlock\" style=\"width: 100%; background: #fff;\" id=\"mainforminfoDiv\">\r\n									<table id=\"head\" cellspacing=\"0\" cellpadding=\"0\" style=\"width: 100%\" class=\"mainFormTable\">\r\n											<tr>\r\n										    	<td class=\"mainFormRowNameTD\" align=\"left\">\u5171\u4eab\u7c7b\u578b</td>\r\n										    	<td style=\"width:15px;\"></td>\r\n										    	<td width=\"*\" class=\"mainFormRowValueTD\">\r\n										    		 <select id=\"sharetype\" name=\"sharetype\" onchange=\"changeType()\">\r\n										    		 	<option value=\"1\">\u4eba\u529b\u8d44\u6e90</option>\r\n										    		 	<option	value=\"2\">\u90e8\u95e8</option>\r\n										    		 	<option value=\"4\">\u6240\u6709</option>\r\n										    		 </select>	\r\n										    	</td>\r\n											</tr>\r\n											<tr width=\"100%\"><td colspan=\"3\" class=\"mainFromSplitLine\"></td></tr>\r\n											<tr class=\"sharevaluetr\">\r\n												 <td class=\"mainFormRowNameTD\" align=\"left\">\u5171\u4eab\u5185\u5bb9</td>\r\n												 <td style=\"width:15px;\"></td>\r\n												 <td width=\"*\" class=\"mainFormRowValueTD\">\r\n												 	<div onclick=\"showDialog()\"  id=\"selfid01\" style=\"float: left;width: 30px; height: 36px;background: url('/images/search_icon_wev8.png') no-repeat;margin-top: 2px\" class=\"selectPop\"></div> \r\n							    					<div style=\"float: left;height: 36px;line-height: 36px;\">	\r\n								    					<input  type=\"hidden\" name=\"relatedshareid\" id=\"shareValue\"   value=\"\">\r\n														<span id=\"forwardresources01\"></span>	\r\n														<span  id=tospan >\r\n								    						<img src='/images/BacoError_wev8.gif' align=\"absMiddle\" >\r\n								    					</span>\r\n							    					</div>\r\n							    					<div style=\"clear: left;\"></div>\r\n												 </td>\r\n											</tr>\r\n											<tr width=\"100%\" class=\"sharevaluetr\"><td colspan=\"3\" class=\"mainFromSplitLine\"></td></tr>\r\n											<tr>\r\n												 <td class=\"mainFormRowNameTD\" align=\"left\">\u5171\u4eab\u7ea7\u522b</td>\r\n												 <td style=\"width:15px;\"></td>\r\n												 <td width=\"*\" class=\"mainFormRowValueTD\">\r\n										    		<select id=\"sharelevel\" name=\"sharelevel\">\r\n										    			<option value=\"1\">\u67e5\u770b</option>\r\n										    			<option value=\"2\">\u7f16\u8f91</option>\r\n										    		</select>\r\n												 </td>\r\n											</tr>\r\n											<tr width=\"100%\"><td colspan=\"3\" class=\"mainFromSplitLine\"></td></tr>\r\n											<tr class=\"secleveltr\" style=\"display: none;\">\r\n												 <td class=\"mainFormRowNameTD\" align=\"left\">\u5b89\u5168\u7ea7\u522b</td>\r\n												 <td style=\"width:15px;\"></td>\r\n												 <td width=\"*\" class=\"mainFormRowValueTD\">\r\n										    		<input type=\"text\" id=\"seclevel\" name=\"seclevel\" onblur=\"checkNumber(this)\" value=\"0\" style=\"width: 60%\" maxlength=\"4\"/>\r\n												 </td>\r\n											</tr>\r\n											<tr class=\"secleveltr\" width=\"100%\" style=\"display: none;\"><td colspan=\"3\" class=\"mainFromSplitLine\"></td></tr>\r\n											<tr>\r\n												<td colspan=\"3\" align=\"center\" class=\"mainFormRowValueTD\">\r\n													<div class=\"operationBtright  \" onclick=\"submitdata()\">".toCharArray();
    _jsp_string1 = "\r\n".toCharArray();
    _jsp_string26 = "\r\n													/\r\n												 ".toCharArray();
    _jsp_string9 = "\">\r\n					<table style=\"width: 100%; height: 40px;\">\r\n						<tr>\r\n							<td width=\"10%\" align=\"left\" valign=\"middle\" style=\"padding-left:5px;\">\r\n							    <a href=\"/mobile/plugin/crm/CrmView.jsp?customerid=".toCharArray();
    _jsp_string40 = "\";\r\n		}\r\n		\r\n		// \u53d6\u6d88\u8f93\u5165\u6846\u540e\u9762\u8ddf\u968f\u7684\u7ea2\u8272\u60ca\u53f9\u53f7\r\n		function checkinput02(elementname,spanid){\r\n				\r\n			var tmpvalue = $(\"#\"+elementname).value;\r\n		\r\n			// \u5904\u7406$GetEle\u53ef\u80fd\u627e\u4e0d\u5230\u5bf9\u8c61\u65f6\u7684\u60c5\u51b5\uff0c\u901a\u8fc7id\u67e5\u627e\u5bf9\u8c61\r\n		    if(tmpvalue==undefined)\r\n		        tmpvalue=document.getElementById(elementname).value;\r\n		\r\n			while(tmpvalue.indexOf(\" \") >= 0){\r\n				tmpvalue = tmpvalue.replace(\" \", \"\");\r\n			}\r\n			if(tmpvalue != \"\"){\r\n				while(tmpvalue.indexOf(\"\\r\\n\") >= 0){\r\n					tmpvalue = tmpvalue.replace(\"\\r\\n\", \"\");\r\n				}\r\n			\r\n				if(tmpvalue != \"\"){\r\n					$(\"#\"+spanid).html(\"\");\r\n				}else{\r\n					$(\"#\"+spanid).html( \"<IMG src='/images/BacoError_wev8.gif' align=absMiddle>\");\r\n					//$GetEle(elementname).value = \"\";\r\n				}\r\n			}else{\r\n				$(\"#\"+spanid).html( \"<IMG src='/images/BacoError_wev8.gif' align=absMiddle>\");\r\n				//$GetEle(elementname).value = \"\";\r\n			}\r\n		}\r\n\r\n</script>\r\n\r\n</body>\r\n</html>".toCharArray();
    _jsp_string2 = "\r\n<!DOCTYPE html>\r\n<html>\r\n<head>\r\n	<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n	<meta name=\"author\" content=\"Weaver E-Mobile Dev Group\" />\r\n	<meta name=\"description\" content=\"Weaver E-mobile\" />\r\n	<meta name=\"keywords\" content=\"weaver,e-mobile\" />\r\n	<meta name=\"viewport\" content=\"width=device-width,minimum-scale=1.0, maximum-scale=1.0\" />\r\n	<title></title>\r\n	<script type='text/javascript' src='/js/jquery/jquery_wev8.js'></script>\r\n	<link rel=\"stylesheet\" href=\"/wui/common/css/w7OVFont_wev8.css\" type=\"text/css\">\r\n	<script type=\"text/javascript\" src=\"/js/mylibs/asyncbox/AsyncBox.v1.4_wev8.js\"></script>\r\n	<link rel=\"stylesheet\" href=\"/js/mylibs/asyncbox/skins/ZCMS/asyncbox_wev8.css\">\r\n    <link rel=\"stylesheet\" href=\"/mobile/plugin/1/css/r4_wev8.css\" type=\"text/css\">\r\n    <link rel=\"stylesheet\" href=\"/mobile/plugin/crm/css/crm_wev8.css\" type=\"text/css\">\r\n</head>\r\n<body style=\"padding: 0px;margin: 0px;height: 100%\">\r\n\r\n\r\n".toCharArray();
    _jsp_string3 = "\r\n\r\n\r\n<table id=\"page\"  style=\"width: 100%;\"  cellpadding=\"0\" cellspacing=\"0\">\r\n	<tr>\r\n	<td width=\"100%\" valign=\"top\" align=\"left\">\r\n		<form action=\"/mobile/plugin/crm/ShareOperation.jsp?method=add&module=".toCharArray();
    _jsp_string36 = "\",\r\n							width : width,\r\n							height : 155,\r\n							scrolling:'yes',\r\n							top: top,\r\n							callback : function(action, returnValue){\r\n							}\r\n						}); \r\n						$.reload('selectionWindow', url + \"?r=\" + (new Date()).getTime() +data);  \r\n				}\r\n		}\r\n	\r\n	\r\n		//\u53d1\u9001\u90ae\u4ef6\r\n		function submitdata(){\r\n			if($(\"#sharetype\").val()==\"4\"||checkRequired()){\r\n				//$(\"#weaver\").submit();\r\n			\r\n				var formData=$(\"#weaver\").serialize()+\"&data=\"+new Date().getTime();\r\n				$.post(\"/mobile/plugin/crm/ShareOperation.jsp?method=add&module=".toCharArray();
    _jsp_string16 = "</div>\r\n												</td>\r\n											</tr>\r\n											<tr width=\"100%\"><td colspan=\"3\" class=\"mainFromSplitLine\"></td></tr>\r\n								</table>\r\n								</div>\r\n							    ".toCharArray();
    _jsp_string5 = "&CustomerID=".toCharArray();
    _jsp_string6 = "\" method=\"post\" name=\"weaver\" id=\"weaver\" enctype=\"multipart/form-data\">\r\n		\r\n		<div id=\"header\"  style=\"".toCharArray();
  }
}