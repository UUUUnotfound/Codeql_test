/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin._crm;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import weaver.hrm.resource.ResourceComInfo;
import weaver.general.GCONST;
import java.io.File;
import java.util.*;
import weaver.hrm.*;
import weaver.systeminfo.*;
import weaver.general.StaticObj;
import weaver.general.Util;
import weaver.hrm.settings.RemindSettings;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class _crmview__jsp extends com.caucho.jsp.JavaPage
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
      weaver.conn.RecordSet RecordSet;
      RecordSet = (weaver.conn.RecordSet) pageContext.getAttribute("RecordSet");
      if (RecordSet == null) {
        RecordSet = new weaver.conn.RecordSet();
        pageContext.setAttribute("RecordSet", RecordSet);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.conn.RecordSet RecordSet2;
      RecordSet2 = (weaver.conn.RecordSet) pageContext.getAttribute("RecordSet2");
      if (RecordSet2 == null) {
        RecordSet2 = new weaver.conn.RecordSet();
        pageContext.setAttribute("RecordSet2", RecordSet2);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.crm.Maint.SectorInfoComInfo SectorInfoComInfo;
      SectorInfoComInfo = (weaver.crm.Maint.SectorInfoComInfo) pageContext.getAttribute("SectorInfoComInfo");
      if (SectorInfoComInfo == null) {
        SectorInfoComInfo = new weaver.crm.Maint.SectorInfoComInfo();
        pageContext.setAttribute("SectorInfoComInfo", SectorInfoComInfo);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.crm.Maint.CustomerDescComInfo CustomerDescComInfo;
      CustomerDescComInfo = (weaver.crm.Maint.CustomerDescComInfo) pageContext.getAttribute("CustomerDescComInfo");
      if (CustomerDescComInfo == null) {
        CustomerDescComInfo = new weaver.crm.Maint.CustomerDescComInfo();
        pageContext.setAttribute("CustomerDescComInfo", CustomerDescComInfo);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.crm.Maint.CustomerTypeComInfo CustomerTypeComInfo;
      CustomerTypeComInfo = (weaver.crm.Maint.CustomerTypeComInfo) pageContext.getAttribute("CustomerTypeComInfo");
      if (CustomerTypeComInfo == null) {
        CustomerTypeComInfo = new weaver.crm.Maint.CustomerTypeComInfo();
        pageContext.setAttribute("CustomerTypeComInfo", CustomerTypeComInfo);
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
      out.write(_jsp_string2, 0, _jsp_string2.length);
      
		String clienttype = Util.null2String((String)request.getParameter("clienttype"));
		String clientlevel = Util.null2String((String)request.getParameter("clientlevel"));
		String module=Util.null2String((String)request.getParameter("module"));
		String scope=Util.null2String((String)request.getParameter("scope"));
		String opengps = Util.null2String((String)request.getParameter("opengps"));
		//\u6807\u8bb0\u662f\u4ece\u5fae\u641c\u6a21\u5757\u8fdb\u5165start
		String fromES=Util.null2String((String)request.getParameter("fromES"));
		//\u6807\u8bb0\u662f\u4ece\u5fae\u641c\u6a21\u5757\u8fdb\u5165end
		String customerid=Util.null2String((String)request.getParameter("customerid"));
		RecordSet.executeProc("CRM_CustomerInfo_SelectByID",customerid);
		RecordSet.next();
	
      out.write(_jsp_string3, 0, _jsp_string3.length);
      if (clienttype.equals("Webclient")) {
      out.write(_jsp_string4, 0, _jsp_string4.length);
      } else {
      out.write(_jsp_string5, 0, _jsp_string5.length);
      }
      out.write(_jsp_string6, 0, _jsp_string6.length);
      out.print((Util.getMoreStr(RecordSet.getString("name"), 5, "..")));
      out.write(_jsp_string7, 0, _jsp_string7.length);
      out.print((SystemEnv.getHtmlLabelName(30665,user.getLanguage()) ));
      out.write(_jsp_string8, 0, _jsp_string8.length);
      out.print((Util.toScreen(RecordSet.getString("name"),user.getLanguage())));
      out.write(_jsp_string9, 0, _jsp_string9.length);
      out.print((Util.toScreen(RecordSet.getString("address1"),user.getLanguage())));
      out.write(_jsp_string10, 0, _jsp_string10.length);
      out.print((RecordSet.getString("phone")));
      out.write(_jsp_string11, 0, _jsp_string11.length);
      out.print((RecordSet.getString("phone")));
      out.write(_jsp_string12, 0, _jsp_string12.length);
      out.print((RecordSet.getString("fax")));
      out.write(_jsp_string13, 0, _jsp_string13.length);
      out.print((RecordSet.getString("email")));
      out.write(_jsp_string11, 0, _jsp_string11.length);
      out.print((RecordSet.getString("email")));
      out.write(_jsp_string14, 0, _jsp_string14.length);
      out.print((Util.toScreen(CustomerTypeComInfo.getCustomerTypename(RecordSet.getString("type")),user.getLanguage())));
      out.write(_jsp_string15, 0, _jsp_string15.length);
      out.print((Util.toScreen(CustomerDescComInfo.getCustomerDescname(RecordSet.getString("description")),user.getLanguage())));
      out.write(_jsp_string16, 0, _jsp_string16.length);
      
				          String seclist = "";
				          String tmpsecid = RecordSet.getString("sector");
				          String tmpparid = SectorInfoComInfo.getSectorInfoParentid(tmpsecid);
				         while(!tmpsecid.equals("0")&&!tmpparid.equals("")){
				         	if(seclist.equals(""))
				         		seclist = SectorInfoComInfo.getSectorInfoname(tmpsecid) + seclist;
				         	else
				         		seclist = SectorInfoComInfo.getSectorInfoname(tmpsecid) +"->"+ seclist;
				
				          tmpsecid = tmpparid;
				          tmpparid = SectorInfoComInfo.getSectorInfoParentid(tmpsecid);
				         }
         			 
      out.write(_jsp_string17, 0, _jsp_string17.length);
      out.print((seclist));
      out.write(_jsp_string18, 0, _jsp_string18.length);
      out.print((Util.toScreen(ResourceComInfo.getResourcename(RecordSet.getString("manager")),user.getLanguage())));
      out.write(_jsp_string19, 0, _jsp_string19.length);
      
				rs.execute("SELECT id AS contacterid,customerid,fullname,mobilephone,title,JobTitle from CRM_CustomerContacter where customerid="+customerid+" order by id");
				while(rs.next()){
					String title=rs.getString("title");
					String titleName="";
					RecordSet2.execute("select fullname from CRM_ContacterTitle WHERE id="+title);
					if(RecordSet2.next())
						titleName=RecordSet2.getString("fullname");
			
      out.write(_jsp_string20, 0, _jsp_string20.length);
      out.print((rs.getString("fullname")));
      out.write(_jsp_string21, 0, _jsp_string21.length);
      out.print((titleName));
      out.write(_jsp_string22, 0, _jsp_string22.length);
      out.print((rs.getString("JobTitle")));
      out.write(_jsp_string23, 0, _jsp_string23.length);
      out.print((rs.getString("mobilephone")));
      out.write(_jsp_string11, 0, _jsp_string11.length);
      out.print((rs.getString("mobilephone")));
      out.write(_jsp_string24, 0, _jsp_string24.length);
      }
      out.write(_jsp_string25, 0, _jsp_string25.length);
      if(!clienttype.equals("Webclient")){
      out.write(_jsp_string26, 0, _jsp_string26.length);
      }
      out.write(_jsp_string27, 0, _jsp_string27.length);
      out.print((customerid));
      out.write(_jsp_string28, 0, _jsp_string28.length);
      out.print((module));
      out.write(_jsp_string29, 0, _jsp_string29.length);
      out.print((opengps));
      out.write(_jsp_string30, 0, _jsp_string30.length);
      out.print((scope));
      out.write(_jsp_string31, 0, _jsp_string31.length);
      out.print((fromES));
      out.write(_jsp_string32, 0, _jsp_string32.length);
      out.print((module));
      out.write(_jsp_string30, 0, _jsp_string30.length);
      out.print((scope));
      out.write(_jsp_string33, 0, _jsp_string33.length);
      out.print((module));
      out.write(_jsp_string30, 0, _jsp_string30.length);
      out.print((scope));
      out.write(_jsp_string29, 0, _jsp_string29.length);
      out.print((opengps));
      out.write(_jsp_string34, 0, _jsp_string34.length);
      out.print((SystemEnv.getHtmlLabelName(1290,user.getLanguage()) ));
      out.write(_jsp_string35, 0, _jsp_string35.length);
      out.print((clienttype));
      out.write(_jsp_string36, 0, _jsp_string36.length);
      out.print((opengps));
      out.write(_jsp_string37, 0, _jsp_string37.length);
      out.print((customerid));
      out.write(_jsp_string38, 0, _jsp_string38.length);
      out.print((customerid));
      out.write(_jsp_string28, 0, _jsp_string28.length);
      out.print((module));
      out.write(_jsp_string30, 0, _jsp_string30.length);
      out.print((scope));
      out.write(_jsp_string29, 0, _jsp_string29.length);
      out.print((opengps));
      out.write(_jsp_string39, 0, _jsp_string39.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/crm/CrmView.jsp"), -4536600779899194479L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("page/maint/common/initNoCache.jsp"), 3270256153856711871L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string19;
  private final static char []_jsp_string30;
  private final static char []_jsp_string2;
  private final static char []_jsp_string32;
  private final static char []_jsp_string18;
  private final static char []_jsp_string20;
  private final static char []_jsp_string29;
  private final static char []_jsp_string12;
  private final static char []_jsp_string36;
  private final static char []_jsp_string11;
  private final static char []_jsp_string28;
  private final static char []_jsp_string9;
  private final static char []_jsp_string38;
  private final static char []_jsp_string21;
  private final static char []_jsp_string6;
  private final static char []_jsp_string22;
  private final static char []_jsp_string16;
  private final static char []_jsp_string27;
  private final static char []_jsp_string13;
  private final static char []_jsp_string23;
  private final static char []_jsp_string4;
  private final static char []_jsp_string7;
  private final static char []_jsp_string37;
  private final static char []_jsp_string3;
  private final static char []_jsp_string26;
  private final static char []_jsp_string33;
  private final static char []_jsp_string5;
  private final static char []_jsp_string39;
  private final static char []_jsp_string24;
  private final static char []_jsp_string8;
  private final static char []_jsp_string35;
  private final static char []_jsp_string10;
  private final static char []_jsp_string34;
  private final static char []_jsp_string1;
  private final static char []_jsp_string25;
  private final static char []_jsp_string14;
  private final static char []_jsp_string31;
  private final static char []_jsp_string17;
  private final static char []_jsp_string15;
  private final static char []_jsp_string0;
  static {
    _jsp_string19 = "\r\n				</td>\r\n			</tr>	\r\n			<tr width=\"100%\"><td colspan=\"3\" class=\"mainFromSplitLine\"></td></tr>\r\n			\r\n											\r\n		</table>\r\n	</div>\r\n   \r\n   	<div style=\"height:10px;overflow:hidden;\"></div>\r\n   	<div class=\"blockHead\">\r\n		<span class=\"m-l-14\">\u8054\u7cfb\u4eba\u4fe1\u606f</span>\r\n	</div>\r\n	<div class=\"tblBlock\" style=\"width: 100%; background: #fff;\" id=\"mainforminfoDiv\">\r\n		<table id=\"head\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\" class=\"mainFormTable\">\r\n			".toCharArray();
    _jsp_string30 = "&scope=".toCharArray();
    _jsp_string2 = "\r\n<!DOCTYPE html>\r\n<html>\r\n<head>\r\n	<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n	<meta name=\"author\" content=\"Weaver E-Mobile Dev Group\" />\r\n	<meta name=\"description\" content=\"Weaver E-mobile\" />\r\n	<meta name=\"keywords\" content=\"weaver,e-mobile\" />\r\n	<meta name=\"viewport\" content=\"width=device-width,minimum-scale=1.0, maximum-scale=1.0\" />\r\n	<title></title>\r\n	<script type='text/javascript' src='/js/jquery/jquery_wev8.js'></script>\r\n	<link rel=\"stylesheet\" href=\"/wui/common/css/w7OVFont_wev8.css\" type=\"text/css\">\r\n	<link rel=\"stylesheet\" href=\"/mobile/plugin/1/css/r4_wev8.css\" type=\"text/css\">\r\n	<link rel=\"stylesheet\" href=\"/mobile/plugin/crm/css/crm_wev8.css\" type=\"text/css\">\r\n	<script type=\"text/javascript\" src=\"http://api.map.baidu.com/api?v=1.5&ak=C1edf768b08866f84e344fafd229fbe0\"></script>\r\n	<script type=\"text/javascript\" src=\"http://developer.baidu.com/map/jsdemo/demo/convertor_wev8.js\"></script>\r\n<body>\r\n	".toCharArray();
    _jsp_string32 = "\";\r\n			if(fromES==\"true\"){\r\n				 location = \"/mobile/plugin/fullsearch/list.jsp?module=".toCharArray();
    _jsp_string18 = "\r\n				</td>\r\n			</tr>	\r\n			<tr width=\"100%\"><td colspan=\"3\" class=\"mainFromSplitLine\"></td></tr>\r\n			<tr>\r\n				<td class=\"mainFormRowNameTD\" align=\"left\">\r\n					\u5ba2\u6237\u7ecf\u7406\r\n				</td>\r\n				<td style=\"width:15px;\"></td>\r\n				<td width=\"*\" class=\"mainFormRowValueTD\">\r\n					".toCharArray();
    _jsp_string20 = "\r\n				<tr>\r\n					<td class=\"mainFormRowNameTD\" align=\"left\">\r\n						".toCharArray();
    _jsp_string29 = "&opengps=".toCharArray();
    _jsp_string12 = "</a>\r\n				</td>\r\n			</tr>	\r\n			<tr width=\"100%\"><td colspan=\"3\" class=\"mainFromSplitLine\"></td></tr>\r\n			<tr>\r\n				<td class=\"mainFormRowNameTD\" align=\"left\">\r\n					\u4f20\u771f\r\n				</td>\r\n				<td style=\"width:15px;\"></td>\r\n				<td width=\"*\" class=\"mainFormRowValueTD\">\r\n					".toCharArray();
    _jsp_string36 = "\";\r\n		var opengps=\"".toCharArray();
    _jsp_string11 = "\">".toCharArray();
    _jsp_string28 = "&module=".toCharArray();
    _jsp_string9 = "\r\n				</td>\r\n			</tr>	\r\n			<tr width=\"100%\"><td colspan=\"3\" class=\"mainFromSplitLine\"></td></tr>\r\n			<tr>\r\n				<td class=\"mainFormRowNameTD\" align=\"left\">\r\n					\u5730\u5740\r\n				</td>\r\n				<td style=\"width:15px;\"></td>\r\n				<td width=\"*\" class=\"mainFormRowValueTD\">\r\n					".toCharArray();
    _jsp_string38 = "\",\"location\":gps\r\n					  }\r\n			//showLoading(1,1);		  \r\n			$.post(\"/mobile/plugin/crm/CrmContactOperation.jsp?method=addCalendarItem\",param,function(data){\r\n			\r\n				issign=false;\r\n				alert((signtype==\"1\"?\"\u7b7e\u5230\":\"\u7b7e\u9000\")+\"\u6210\u529f\");\r\n				$(thisBtn).html((signtype==\"1\"?\"\u7b7e\u5230\":\"\u7b7e\u9000\"));\r\n				//showLoading(0,1);\r\n			});\r\n		\r\n		}\r\n		\r\n		//\u65f6\u95f4\u65e5\u671f\u683c\u5f0f\u5316\r\n		Date.prototype.pattern=function(fmt) {     \r\n		   var o = {     \r\n		   \"M+\" : this.getMonth()+1, //\u6708\u4efd     \r\n		   \"d+\" : this.getDate(), //\u65e5     \r\n		   \"h+\" : this.getHours()%12 == 0 ? 12 : this.getHours()%12, //\u5c0f\u65f6     \r\n		   \"H+\" : this.getHours(), //\u5c0f\u65f6     \r\n		   \"m+\" : this.getMinutes(), //\u5206     \r\n		   \"s+\" : this.getSeconds(), //\u79d2     \r\n		   \"q+\" : Math.floor((this.getMonth()+3)/3), //\u5b63\u5ea6     \r\n		   \"S\" : this.getMilliseconds() //\u6beb\u79d2     \r\n		   };     \r\n		   var week = {     \r\n		   \"0\" : \"\\u65e5\",     \r\n		   \"1\" : \"\\u4e00\",     \r\n		   \"2\" : \"\\u4e8c\",     \r\n		   \"3\" : \"\\u4e09\",     \r\n		   \"4\" : \"\\u56db\",     \r\n		   \"5\" : \"\\u4e94\",     \r\n		   \"6\" : \"\\u516d\"    \r\n		   };     \r\n		   if(/(y+)/.test(fmt)){     \r\n		       fmt=fmt.replace(RegExp.$1, (this.getFullYear()+\"\").substr(4 - RegExp.$1.length));     \r\n		   }     \r\n		   if(/(E+)/.test(fmt)){     \r\n		       fmt=fmt.replace(RegExp.$1, ((RegExp.$1.length>1) ? (RegExp.$1.length>2 ? \"\\u661f\\u671f\" : \"\\u5468\") : \"\")+week[this.getDay()+\"\"]);     \r\n		   }     \r\n		   for(var k in o){     \r\n		       if(new RegExp(\"(\"+ k +\")\").test(fmt)){     \r\n		           fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : ((\"00\"+ o[k]).substr((\"\"+ o[k]).length)));     \r\n		       }     \r\n		   }     \r\n		  return fmt;     \r\n		 }\r\n		\r\n		function showLoading(type){\r\n		   if(type==1){\r\n			   $(\"#bgAlpha\").show();\r\n			   $(\"#loading\").show();\r\n		   }else{\r\n		   	   $(\"#bgAlpha\").hide();\r\n			   $(\"#loading\").hide();\r\n		   }\r\n		}\r\n		\r\n		function addContact(){\r\n			location.href=\"/mobile/plugin/crm/CrmContact.jsp?customerid=".toCharArray();
    _jsp_string21 = "\r\n					</td>\r\n					<td style=\"width:15px;\"></td>\r\n					<td width=\"*\" class=\"mainFormRowValueTD\">\r\n						".toCharArray();
    _jsp_string6 = "\">\r\n					<table style=\"width: 100%; height: 40px;\">\r\n						<tr>\r\n							<td width=\"10%\" align=\"left\" valign=\"middle\" style=\"padding-left:5px;\">\r\n									<a href=\"javascript:void(0)\" onclick=\"doLeftButton()\">\r\n										<div style=\"width:56px;height:26px;background:url('/images/bg-top-btn_wev8.png') no-repeat;text-align:center;line-height:26px;color:#000;font-size: 14px\">\r\n											 \u8fd4\u56de\r\n										</div>\r\n									</a>\r\n							</td>\r\n							<td align=\"center\" valign=\"middle\">\r\n								<div id=\"title\" >".toCharArray();
    _jsp_string22 = "&nbsp;&nbsp;".toCharArray();
    _jsp_string16 = "\r\n				</td>\r\n			</tr>	\r\n			<tr width=\"100%\"><td colspan=\"3\" class=\"mainFromSplitLine\"></td></tr>\r\n			<tr>\r\n				<td class=\"mainFormRowNameTD\" align=\"left\">\r\n					\u884c\u4e1a\r\n				</td>\r\n				<td style=\"width:15px;\"></td>\r\n				<td width=\"*\" class=\"mainFormRowValueTD\">\r\n					".toCharArray();
    _jsp_string27 = "\r\n	    <div style=\"margin-top: 8px;\">\r\n	   		<div class=\"operationBtright\" style=\"width: 80px;float: left;margin-right: 0px;\" onclick=\"viewShare()\">\u67e5\u770b\u5171\u4eab</div>\r\n	   		<div class=\"operationBtright\" style=\"width: 80px;float: right;margin-right: 0px;\" onclick=\"addContact()\">\u5ba2\u6237\u8054\u7cfb</div>\r\n			<div style=\"clear: left;\"></div>\r\n		</div>\r\n	</div>\r\n	<div style=\"height:10px;overflow:hidden;\"></div>\r\n   </td>\r\n   <td class='itemnavpoint'></td>\r\n  </tr>\r\n</table>\r\n	\r\n	\r\n   <script type=\"text/javascript\">\r\n   		function viewShare(){\r\n   			var url = \"/mobile/plugin/crm/CrmAddShare.jsp?isInternal=1&customerid=".toCharArray();
    _jsp_string13 = "\r\n				</td>\r\n			</tr>	\r\n			<tr width=\"100%\"><td colspan=\"3\" class=\"mainFromSplitLine\"></td></tr>\r\n			<tr>\r\n				<td class=\"mainFormRowNameTD\" align=\"left\">\r\n					\u7535\u5b50\u90ae\u4ef6\r\n				</td>\r\n				<td style=\"width:15px;\"></td>\r\n				<td width=\"*\" class=\"mainFormRowValueTD\">\r\n					<a href=\"mailto::".toCharArray();
    _jsp_string23 = "&nbsp;&nbsp;<a href=\"tel:".toCharArray();
    _jsp_string4 = "display:block;".toCharArray();
    _jsp_string7 = "</div>\r\n							</td>\r\n							<td width=\"10%\" align=\"right\" valign=\"middle\" style=\"padding-right:5px;\">\r\n									\r\n							</td>\r\n						</tr>\r\n					</table>\r\n	</div>\r\n	\r\n	<div id=\"loading\">".toCharArray();
    _jsp_string37 = "\";\r\n		var signtype=\"1\";\r\n		var thisBtn;\r\n		var issign=false;\r\n		\r\n		function doSave(obj,type){\r\n		\r\n			     if(issign) return ; //\u6b63\u5728\u7b7e\u5230\r\n			     thisBtn=obj;\r\n			     \r\n				if(opengps==\"0\"){\r\n					alert(\"\u8bf7\u5728mobile\u540e\u53f0\u5f00\u542fGPS\");\r\n					return ;\r\n				}\r\n				\r\n				signtype=type;\r\n				if(!confirm(\"\u662f\u5426\u786e\u5b9a\"+((signtype==\"1\"?\"\u7b7e\u5230\":\"\u7b7e\u9000\"))+\"\uff1f\"))\r\n					return ;\r\n				//$(obj).attr(\"disabled\",\"true\");\r\n				if(opengps==\"1\"){\r\n					if(clienttype==\"iPhone\"||clienttype==\"iPad\"){\r\n						location=\"emobile:gps:doSaveBlog\";\r\n					}else\r\n						doSaveBlog(\"\");\r\n					\r\n		    	}else\r\n		    		doSaveBlog(\"\");\r\n		}\r\n		\r\n		function doSaveBlog(gps){\r\n			if((clienttype==\"android\"||clienttype==\"androidpad\")&&opengps==\"1\"){\r\n			  var isGpsEnable=mobileInterface.chekGpsEnable()\r\n			  if(isGpsEnable==-1)\r\n				 return ;\r\n		  	}\r\n		\r\n			var locationGps=\"\";\r\n		 	if(clienttype!=\"Webclient\"&&opengps==\"1\"){\r\n		   	 if(clienttype==\"android\"){\r\n		   		 locationGps=mobileInterface.getLocation();\r\n		   	 }else if(clienttype==\"iPhone\"||clienttype==\"iPad\"){\r\n		   		 locationGps=gps;\r\n		   	 }\r\n		    }	\r\n			\r\n			//locationGps=\"31.179544,121.481566\";\r\n			if(opengps==\"1\"&&clienttype!=\"Webclient\"&&(locationGps==\"0,0\"||locationGps==\"\")){\r\n				alert(\"\u65e0\u6cd5\u83b7\u53d6\u5730\u7406\u4f4d\u7f6e\");\r\n				return ;\r\n			}\r\n			\r\n			$(thisBtn).html(\"\u6b63\u5728\"+(signtype==\"1\"?\"\u7b7e\u5230\":\"\u7b7e\u9000\")+\"...\");\r\n			issign=true;\r\n			\r\n			var x=locationGps.split(\",\")[1];\r\n			var y=locationGps.split(\",\")[0];\r\n			\r\n			var point = new BMap.Point(x,y);\r\n			\r\n			var gc = new BMap.Geocoder();\r\n			gc.getLocation(point, function(rs){\r\n			    var addComp = rs.addressComponents;\r\n			    var locationLabel=addComp.district +addComp.street +addComp.streetNumber;\r\n			    saveLocation(locationLabel,locationGps);\r\n			});\r\n		}\r\n		\r\n		function saveLocation(planName,gps){\r\n			\r\n			var now= new Date();\r\n			var nowdate=now.pattern(\"yyyy-MM-dd\");\r\n			var nowtime=now.pattern(\"HH:mm\");\r\n			var description=planName;\r\n			var title=(signtype==\"1\"?\"\u7b7e\u5230:\":\"\u7b7e\u9000:\")+planName;\r\n			var param={\"workPlanType\":\"3\",\"planName\":title,\"urgentLevel\":\"0\",\"remindType\":\"1\",\r\n					    \"urgentLevel\":\"1\",\"beginDate\":nowdate,\"beginTime\":nowtime,\"endDate\":nowdate,\"endTime\":nowtime,\r\n					    \"description\":description,\"crmIDs\":\"".toCharArray();
    _jsp_string3 = "\r\n	<div id=\"header\"  style=\"".toCharArray();
    _jsp_string26 = "\r\n	    <div>\r\n	   		<div class=\"operationBtright\" style=\"width: 80px;float: left;margin-right: 0px;\" onclick=\"doSave(this,1)\">\u7b7e\u5230</div>\r\n	   		<div class=\"operationBtright\" style=\"width: 80px;float: right;margin-right: 0px;\" onclick=\"doSave(this,2)\">\u7b7e\u9000</div>\r\n			<div style=\"clear: left;\"></div>\r\n		</div>\r\n		".toCharArray();
    _jsp_string33 = "&fromES=true\";\r\n			}else{\r\n				window.location.href=\"/mobile/plugin/crm/CrmMain.jsp?module=".toCharArray();
    _jsp_string5 = "display:none;".toCharArray();
    _jsp_string39 = "\";\r\n		}\r\n		\r\n		function showLoading(flag,msgtype){\r\n	   	  if(flag==1){\r\n	   	  	$(\"#loading\").show();\r\n	   	  	$(\"#loadingmask\").show();\r\n	   	  }else{\r\n	   	  	$(\"#loading\").hide();\r\n	   	  	$(\"#loadingmask\").hide();\r\n	   	  }\r\n	   	  var msg=\"\";\r\n	   	  switch(msgtype){\r\n	   	  	case 1:\r\n		   	  	msg=\"\u6b63\u5728\u4fdd\u5b58\u6570\u636e...\";\r\n		   	  	break;\r\n		   	case 2:\r\n		   		msg=\"\u6b63\u5728\u7b7e\u5230...\";\r\n		   	  	break;\r\n		   	 case 2:\r\n		   		msg=\"\u6b63\u5728\u7b7e\u9000...\";\r\n		   	  	break; 	\r\n		   	 default:\r\n		   	 	msg=\"\u6b63\u5728\u83b7\u53d6\u6570\u636e...\";\r\n	   	  }\r\n	   	  $(\"#loading\").html(msg);\r\n	   }\r\n		\r\n   </script>\r\n</body>\r\n</html>\r\n".toCharArray();
    _jsp_string24 = "</a>\r\n					</td>\r\n				</tr>	\r\n				<tr width=\"100%\"><td colspan=\"3\" class=\"mainFromSplitLine\"></td></tr>\r\n			".toCharArray();
    _jsp_string8 = "...</div>\r\n	<div id=\"loadingmask\" ></div>\r\n	\r\n	<table  style='width:100%;border:0;cellspacing:0;cellpadding:0;table-layout:fixed;margin-top: 8px;'>\r\n     <tr>\r\n    	<td class='itempreview'></td>\r\n    	<td class='itemcontent' >\r\n		<div class=\"blockHead\">\r\n			<span class=\"m-l-14\">\u5ba2\u6237\u4fe1\u606f</span>\r\n		</div>\r\n		<div class=\"tblBlock\" style=\"width: 100%; background: #fff;\" id=\"mainforminfoDiv\">\r\n		  <table id=\"head\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\" class=\"mainFormTable\">\r\n			<tr>\r\n				<td class=\"mainFormRowNameTD\" align=\"left\">\r\n					\u5ba2\u6237\u540d\u79f0\r\n				</td>\r\n				<td style=\"width:15px;\"></td>\r\n				<td width=\"*\" class=\"mainFormRowValueTD\">\r\n					".toCharArray();
    _jsp_string35 = "\";\r\n		}\r\n		\r\n		var clienttype=\"".toCharArray();
    _jsp_string10 = "\r\n				</td>\r\n			</tr>	\r\n			<tr width=\"100%\"><td colspan=\"3\" class=\"mainFromSplitLine\"></td></tr>\r\n			<tr>\r\n				<td class=\"mainFormRowNameTD\" align=\"left\">\r\n					\u7535\u8bdd\r\n				</td>\r\n				<td style=\"width:15px;\"></td>\r\n				<td width=\"*\" class=\"mainFormRowValueTD\">\r\n					<a href=\"tel:".toCharArray();
    _jsp_string34 = "\";\r\n			}\r\n			return \"1\";\r\n		}\r\n		\r\n		function getLeftButton(){ \r\n			return \"1,".toCharArray();
    _jsp_string1 = "\r\n".toCharArray();
    _jsp_string25 = "											\r\n		</table>\r\n	</div>\r\n	\r\n	<div style=\"height:10px;overflow:hidden;\"></div>\r\n	<div style=\"margin-bottom: 15px;\">\r\n	    \r\n	    ".toCharArray();
    _jsp_string14 = "</a>\r\n				</td>\r\n			</tr>	\r\n			<tr width=\"100%\"><td colspan=\"3\" class=\"mainFromSplitLine\"></td></tr>\r\n											\r\n		</table>\r\n	</div>\r\n   	<div style=\"height:10px;overflow:hidden;\"></div>\r\n   	<div class=\"blockHead\">\r\n		<span class=\"m-l-14\">\u5ba2\u6237\u5206\u7c7b</span>\r\n	</div>\r\n	<div class=\"tblBlock\" style=\"width: 100%; background: #fff;\" id=\"mainforminfoDiv\">\r\n		<table id=\"head\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\" class=\"mainFormTable\">\r\n			<tr>\r\n				<td class=\"mainFormRowNameTD\" align=\"left\">\r\n					\u7c7b\u578b\r\n				</td>\r\n				<td style=\"width:15px;\"></td>\r\n				<td width=\"*\" class=\"mainFormRowValueTD\">\r\n					 ".toCharArray();
    _jsp_string31 = "&t=\"+Math.random();\r\n   			window.location.href=url;\r\n   		}\r\n   		\r\n   		//\u5f53\u7528\u6237\u70b9\u51fb\u6807\u9898\u4e0a\u5de6\u8fb9\u6216\u53f3\u8fb9\u6309\u94ae\u65f6\uff0c\u5ba2\u6237\u7aef\u4f1a\u8c03\u7528\u9875\u9762\u4e0a\u7684javascript\u65b9\u6cd5:\r\n		function doLeftButton() {\r\n			var fromES=\"".toCharArray();
    _jsp_string17 = "\r\n         			 ".toCharArray();
    _jsp_string15 = "\r\n				</td>\r\n			</tr>	\r\n			<tr width=\"100%\"><td colspan=\"3\" class=\"mainFromSplitLine\"></td></tr>\r\n			<tr>\r\n				<td class=\"mainFormRowNameTD\" align=\"left\">\r\n					\u63cf\u8ff0\r\n				</td>\r\n				<td style=\"width:15px;\"></td>\r\n				<td width=\"*\" class=\"mainFormRowValueTD\">\r\n					".toCharArray();
    _jsp_string0 = "\r\n \r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
  }
}