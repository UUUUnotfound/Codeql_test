/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin._cowork;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import weaver.hrm.*;
import java.net.*;
import weaver.general.*;
import weaver.systeminfo.*;
import weaver.cowork.*;
import weaver.file.FileUpload;

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
      weaver.conn.RecordSet RecordSet;
      RecordSet = (weaver.conn.RecordSet) pageContext.getAttribute("RecordSet");
      if (RecordSet == null) {
        RecordSet = new weaver.conn.RecordSet();
        pageContext.setAttribute("RecordSet", RecordSet);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.hrm.resource.ResourceComInfo ResourceComInfo;
      ResourceComInfo = (weaver.hrm.resource.ResourceComInfo) pageContext.getAttribute("ResourceComInfo");
      if (ResourceComInfo == null) {
        ResourceComInfo = new weaver.hrm.resource.ResourceComInfo();
        pageContext.setAttribute("ResourceComInfo", ResourceComInfo);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.cowork.CoTypeComInfo CoTypeComInfo;
      CoTypeComInfo = (weaver.cowork.CoTypeComInfo) pageContext.getAttribute("CoTypeComInfo");
      if (CoTypeComInfo == null) {
        CoTypeComInfo = new weaver.cowork.CoTypeComInfo();
        pageContext.setAttribute("CoTypeComInfo", CoTypeComInfo);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      
request.setCharacterEncoding("UTF-8");
response.setContentType("text/html;charset=UTF-8");

User user = HrmUserVarify.getUser (request , response) ;
if(user == null)  return ;
int userid=user.getUID();

FileUpload fu = new FileUpload(request);
String module = Util.null2String((String)fu.getParameter("module"));
String scope = Util.null2String((String)fu.getParameter("scope"));

String titleurl = Util.null2String((String)request.getParameter("title"));
String title = URLDecoder.decode(titleurl,"UTF-8");

String clienttype = Util.null2String((String)fu.getParameter("clienttype"));
String clientlevel = Util.null2String((String)fu.getParameter("clientlevel"));

String keyword = Util.null2String(fu.getParameter("keyword"));
int labelid = Util.getIntValue(fu.getParameter("labelid"), 0);

      out.write(_jsp_string2, 0, _jsp_string2.length);
      if (clienttype.equals("Webclient")) {
      out.write(_jsp_string3, 0, _jsp_string3.length);
      } else {
      out.write(_jsp_string4, 0, _jsp_string4.length);
      }
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((title));
      out.write(_jsp_string6, 0, _jsp_string6.length);
      out.print((keyword ));
      out.write(_jsp_string7, 0, _jsp_string7.length);
      if(labelid==0){
      out.write(_jsp_string8, 0, _jsp_string8.length);
      }else{
      out.write(_jsp_string9, 0, _jsp_string9.length);
      }
      out.write(_jsp_string10, 0, _jsp_string10.length);
      if(labelid==-1){
      out.write(_jsp_string8, 0, _jsp_string8.length);
      }else{
      out.write(_jsp_string9, 0, _jsp_string9.length);
      }
      out.write(_jsp_string11, 0, _jsp_string11.length);
      if(labelid==-2){
      out.write(_jsp_string8, 0, _jsp_string8.length);
      }else{
      out.write(_jsp_string9, 0, _jsp_string9.length);
      }
      out.write(_jsp_string12, 0, _jsp_string12.length);
      if(labelid>0){
      out.write(_jsp_string8, 0, _jsp_string8.length);
      }else{
      out.write(_jsp_string9, 0, _jsp_string9.length);
      }
      out.write(_jsp_string13, 0, _jsp_string13.length);
      out.print((module ));
      out.write(_jsp_string14, 0, _jsp_string14.length);
      out.print((scope ));
      out.write(_jsp_string15, 0, _jsp_string15.length);
      out.print((labelid ));
      out.write(_jsp_string16, 0, _jsp_string16.length);
      
				int curidx = 0;
				RecordSet.execute("select id,name,labelColor,textColor from cowork_label where userid="+userid+" and labelType='label' order by labelOrder");
				while(RecordSet.next()){
					if(curidx > 0) {
						
      out.write(_jsp_string17, 0, _jsp_string17.length);
      
					}
					
      out.write(_jsp_string18, 0, _jsp_string18.length);
      out.print((RecordSet.getString("id")));
      out.write(_jsp_string19, 0, _jsp_string19.length);
      out.print((RecordSet.getString("name")));
      out.write(_jsp_string20, 0, _jsp_string20.length);
      
					curidx++;
				}
				
      out.write(_jsp_string21, 0, _jsp_string21.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/cowork/list.jsp"), -7858835795352680725L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string8;
  private final static char []_jsp_string19;
  private final static char []_jsp_string5;
  private final static char []_jsp_string16;
  private final static char []_jsp_string18;
  private final static char []_jsp_string9;
  private final static char []_jsp_string21;
  private final static char []_jsp_string15;
  private final static char []_jsp_string12;
  private final static char []_jsp_string10;
  private final static char []_jsp_string3;
  private final static char []_jsp_string11;
  private final static char []_jsp_string4;
  private final static char []_jsp_string0;
  private final static char []_jsp_string13;
  private final static char []_jsp_string7;
  private final static char []_jsp_string17;
  private final static char []_jsp_string1;
  private final static char []_jsp_string2;
  private final static char []_jsp_string6;
  private final static char []_jsp_string20;
  private final static char []_jsp_string14;
  static {
    _jsp_string8 = "topBtnDown".toCharArray();
    _jsp_string19 = ")\">".toCharArray();
    _jsp_string5 = "\">\r\n			<table style=\"width: 100%; height: 40px;\">\r\n				<tr>\r\n					<td width=\"10%\" align=\"left\" valign=\"middle\" style=\"padding-left:5px;\">\r\n					<a href=\"javascript:goBack();\">\r\n						<div style=\"width:56px;height:26px;background:url('/images/bg-top-btn_wev8.png') no-repeat;text-align:center;line-height:26px;color:#000;\">\r\n						\u8fd4\u56de\r\n						</div>\r\n					</a>\r\n					</td>\r\n					<td align=\"center\" valign=\"middle\">\r\n						<div id=\"title\">".toCharArray();
    _jsp_string16 = "\">\r\n	\r\n	<div id=\"labeldiv\" style=\"display:none;position: absolute;left:235px;top:110px;color:#FFFFFF;font-size:13px;width:92px;height:196px;background-image:url(/mobile/plugin/cowork/img/label_wev8.png);\">\r\n		<div class=\"labwin\" style=\"text-align:center;width:60px;height:150px;top:25px;left:16px;overflow:hidden;position: relative;z-index: 10;\">\r\n			<div id=\"slide\" style=\"position: absolute;top:0px;z-index: -1;\">\r\n				".toCharArray();
    _jsp_string18 = "<div class=\"lab_title\" onclick=\"changeLabel(this, ".toCharArray();
    _jsp_string9 = "topBtn".toCharArray();
    _jsp_string21 = "\r\n			</div>\r\n		</div>\r\n	</div>\r\n\r\n	<script type=\"text/javascript\">\r\n	$(document).ready(function() {\r\n\r\n		$.ajaxSetup({ cache: false });\r\n		\r\n		loadList(1);\r\n		\r\n		$('#keyword').keypress(function(e) {\r\n	        if(e.which == 13) {\r\n	            jQuery(this).blur();\r\n	            loadList(1);\r\n	        }\r\n	    });\r\n	    \r\n	    var sliding = startClientY = startPixelOffset = pixelOffset = 0;\r\n	    \r\n		$('.labwin').bind('mousedown touchstart', function slideStart(event) {\r\n			if (event.originalEvent.touches)\r\n			event = event.originalEvent.touches[0];\r\n			if (sliding == 0) {\r\n				sliding = 1;\r\n				startClientY = event.clientY;\r\n			}\r\n		});\r\n\r\n		$('.labwin').bind('mousemove mousedown touchmove', function slide(event) {\r\n			event.preventDefault();\r\n			if (event.originalEvent.touches)\r\n				event = event.originalEvent.touches[0];\r\n			var deltaSlide = event.clientY - startClientY;\r\n			if (sliding == 1 && deltaSlide != 0) {\r\n				sliding = 2;\r\n				startPixelOffset = pixelOffset;\r\n			}\r\n			if (sliding == 2) {\r\n				pixelOffset = startPixelOffset + deltaSlide;\r\n				if(pixelOffset < 0 && pixelOffset > $(\".labwin\").height() - $(\"#slide\").height()) {\r\n					$(\"#slide\").css('top',pixelOffset +'px');\r\n				}\r\n			}\r\n		});\r\n		\r\n		$('.labwin').bind('mouseup mousestop touchend', function slideEnd(event) {\r\n			if (sliding == 2) {\r\n				sliding = 0;\r\n				pixelOffset = $(\"#slide\").offset().top-$(\".labwin\").offset().top;\r\n			}\r\n		});\r\n	});\r\n	\r\n	function searchClick() {\r\n		loadList(1);\r\n	}\r\n	\r\n	function loadList(type) {\r\n		var sessionkey = $(\"#sessionkey\").val();\r\n		var module = $(\"#module\").val();\r\n		var scope = $(\"#scope\").val();\r\n		var pageindex = $(\"#pageindex\").val();\r\n		var keyword = $(\"#keyword\").val();\r\n		var pagecount = $(\"#pagecount\").val();\r\n		var labelid = $(\"#labelid\").val();\r\n		\r\n		keyword = encodeURIComponent(keyword);\r\n		\r\n		if(type==1) { //refresh\r\n			pageindex = 1;\r\n			$(\"#list\").html(\"\");\r\n		} else if(type==2) { //add\r\n			pageindex = parseInt(pageindex+\"\") + 1;\r\n		}\r\n		\r\n		$(\"#listItemMore\").html(\"<img src='/mobile/plugin/cowork/img/ajax-loader_wev8.gif' style='vertical-align:middle;'>&nbsp;\u6b63\u5728\u8bfb\u53d6\u6570\u636e...\").unbind(\"click\");\r\n		\r\n		util.getData({\r\n	    	loadingTarget : document.body,\r\n    		paras : \"operation=getCoworkList&pageindex=\"+pageindex+\"&keyword=\"+keyword+\"&labelid=\"+labelid,//\u5f97\u6570\u636e\u7684URL,\r\n    		callback : function (data){\r\n				var errormsg = data.error;\r\n				if(errormsg&&errormsg.length>0) {\r\n					alert(errormsg);\r\n					$(\"#listItemMore\").html(\"\u65e0\u6cd5\u8bfb\u53d6\u6570\u636e...\");\r\n				}\r\n		\r\n				if(data.list) {\r\n					if($(\"#page_\"+data.pageindex).length>0) {\r\n						$(\"#page_\"+data.pageindex).html(\"\");\r\n					} else {\r\n						$(\"#list\").append('<div id=\"page_'+data.pageindex+'\"></div>');\r\n					}\r\n	\r\n					$(\"#pagesize\").val(data.pagesize);\r\n					$(\"#ishavepre\").val(data.ishavepre);\r\n					$(\"#count\").val(data.count);\r\n					$(\"#pagecount\").val(data.pagecount);\r\n					$(\"#pageindex\").val(data.pageindex);\r\n					$(\"#ishavenext\").val(data.ishavenext);\r\n					\r\n					if(data.ishavenext==\"0\") {\r\n						$(\"#listItemMore\").html(\"\u603b\u5171 \"+data.count+\" \u6761\");\r\n					} else {\r\n						$(\"#listItemMore\").html(\"\u70b9\u51fb\u83b7\u53d6\u66f4\u591a...\").bind(\"click\", function(){\r\n							loadList(2);\r\n						});\r\n					}\r\n					\r\n					$.each(data.list,function(j,item){\r\n						var itemstr = \"<div class='listitem' id='id_\"+item.id+\"'>\"+\r\n								\"	<table>\"+\r\n								\"		<tbody>\"+\r\n								\"			<tr>\";\r\n						if(item.important==1) {\r\n							itemstr+=\"			<td class='itempreview markImport' onclick='markCowork(this, \"+item.id+\")'>\"+\r\n									\"				<img src='/mobile/plugin/cowork/img/imp_wev8.png'>\";\r\n						} else {\r\n							itemstr+=\"			<td class='itempreview' onclick='markCowork(this, \"+item.id+\")'>\"+\r\n									\"				<img src='/mobile/plugin/cowork/img/imp0_wev8.png'>\";\r\n						}\r\n						itemstr+=\"				</td>\"+\r\n								\"				<td class='itemcontent' onclick='goPage(\"+item.id+\")'>\"+\r\n								\"					<span class='itemcontenttitle'>\" + item.subject + \"</span>\";\r\n						\r\n						if(item.label) {\r\n							var labelstr = \"\";\r\n							$.each(item.label,function(k,lab){\r\n								labelstr += \"		<span class='lab' style='color:\"+lab.textColor+\";background-color:\"+lab.labelColor+\";'>\"+lab.name+\"</span>\";\r\n							});\r\n							if(labelstr) {\r\n								itemstr += \"<br/>\"+labelstr;\r\n							}\r\n						}\r\n						\r\n						itemstr+=\"				</td>\"+\r\n								\"				<td style='vertical-align: top;width:26px;' onclick='goPage(\"+item.id+\")'>\";\r\n								\r\n						if(item.isnew==1) {\r\n							itemstr+=\"			<img src='/images/new_wev8.gif'>\";\r\n						}\r\n						\r\n						itemstr+=\"				</td>\"+\r\n								\"				<td class='itemnavpoint' onclick='goPage(\"+item.id+\")'>\"+\r\n								\"					<img src='/mobile/plugin/cowork/img/right_wev8.png'>\"+\r\n								\"				</td>\"+\r\n								\"			</tr>\"+\r\n								\"		</tbody>\"+\r\n								\"	</table>\"+\r\n								\"</div>\"+\r\n								\"<div class='blankLines'></div>\";\r\n						$(\"#page_\"+pageindex).append(itemstr);\r\n					});\r\n					\r\n					var d = new Date();\r\n					$(\"#lastupdatedate\").html(\"\u6700\u540e\u66f4\u65b0 \u4eca\u5929: \"+d.getHours()+\":\"+d.getMinutes()+\":\"+d.getSeconds()+\"&nbsp;&nbsp;\");\r\n				}\r\n			}\r\n	    });\r\n	}\r\n	\r\n	function goPage(detailid) {\r\n		var module = $(\"#module\").val();\r\n		var scope = $(\"#scope\").val();\r\n		location = \"/mobile/plugin/cowork/view.jsp?module=\"+module+\"&scope=\"+scope+\"&detailid=\"+detailid;\r\n	}\r\n	\r\n	function goBack() {\r\n		location = \"/home.do\";\r\n	}\r\n	\r\n	function changeLabel(_this, labelid) {\r\n		if(labelid > 0) {\r\n			if($(\"#labelid\").val()!=labelid) {\r\n				$(_this).addClass(\"lab_select\");\r\n				$(_this).siblings(\".lab_title\").removeClass(\"lab_select\");\r\n				$(\"#labelid\").val(labelid);\r\n				loadList(1);\r\n			}\r\n		} else {\r\n			if($(\"#labelid\").val()!=labelid || ($(\"#labelid\").val()==labelid && $(_this).hasClass(\"topBtn\"))) {\r\n				$(\"#slide .lab_title\").removeClass(\"lab_select\")\r\n				$(_this).removeClass(\"topBtn\").addClass(\"topBtnDown\");\r\n				$(_this).siblings(\".topBtnDown\").removeClass(\"topBtnDown\").addClass(\"topBtn\");\r\n				$(\"#labelid\").val(labelid);\r\n				loadList(1);\r\n			}\r\n		}\r\n		\r\n		$(\"#labeldiv\").hide();\r\n	}\r\n	\r\n	function showLabel(_this) {\r\n		$(_this).removeClass(\"topBtn\").addClass(\"topBtnDown\");\r\n		$(_this).siblings(\".topBtnDown\").removeClass(\"topBtnDown\").addClass(\"topBtn\");\r\n		\r\n		$(\"#labeldiv\").css(\"top\", $(\"#labs\").offset().top+19);\r\n		$(\"#labeldiv\").css(\"left\", $(\"#labs\").offset().left-10);\r\n		\r\n		$(\"#labeldiv\").show();\r\n	}\r\n	\r\n	function markCowork(_this, coworkid) {\r\n		if($(_this).hasClass(\"processing\")) return;\r\n		\r\n		$(_this).addClass(\"processing\");\r\n		\r\n		var operation;\r\n		if($(_this).hasClass(\"markImport\")) {\r\n			operation = \"normal\";\r\n		} else {\r\n			operation = \"important\";\r\n		}\r\n		\r\n		$.getJSON(\"/mobile/plugin/cowork/CoworkOperation.jsp?coworkid=\"+coworkid+\"&operation=\"+operation, function(data){\r\n			if(data.result) {\r\n				if($(_this).hasClass(\"markImport\")) {\r\n					$(_this).removeClass(\"markImport\")\r\n					$(_this).find(\"img\").attr(\"src\", \"/mobile/plugin/cowork/img/imp0_wev8.png\");\r\n				} else {\r\n					$(_this).addClass(\"markImport\")\r\n					$(_this).find(\"img\").attr(\"src\", \"/mobile/plugin/cowork/img/imp_wev8.png\");\r\n				}\r\n			}\r\n			\r\n			$(_this).removeClass(\"processing\");\r\n		});\r\n	}\r\n	</script>\r\n\r\n</body>\r\n</html>\r\n".toCharArray();
    _jsp_string15 = "\">\r\n	<input type=\"hidden\" id=\"pageindex\" name=\"pageindex\" value=\"1\">\r\n	<input type=\"hidden\" id=\"pagesize\" name=\"pagesize\" value=\"\">\r\n	<input type=\"hidden\" id=\"ishavepre\" name=\"ishavepre\" value=\"\">\r\n	<input type=\"hidden\" id=\"count\" name=\"count\" value=\"\">\r\n	<input type=\"hidden\" id=\"pagecount\" name=\"pagecount\" value=\"\">\r\n	<input type=\"hidden\" id=\"ishavenext\" name=\"ishavenext\" value=\"\">\r\n	\r\n	<input type=\"hidden\" id=\"labelid\" name=\"labelid\" value=\"".toCharArray();
    _jsp_string12 = "\" style=\"margin-left:6px;\" onclick=\"changeLabel(this, -2)\">\u91cd\u8981</div>\r\n			<div id=\"labs\" class=\"".toCharArray();
    _jsp_string10 = "\" onclick=\"changeLabel(this, 0)\">\u5168\u90e8</div>\r\n			<div class=\"".toCharArray();
    _jsp_string3 = "display:block;".toCharArray();
    _jsp_string11 = "\" style=\"margin-left:6px;\" onclick=\"changeLabel(this, -1)\">\u672a\u8bfb</div>\r\n			<div class=\"".toCharArray();
    _jsp_string4 = "display:none;".toCharArray();
    _jsp_string0 = "\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string13 = "\" style=\"margin-left:6px;\" onclick=\"showLabel(this)\">\u6807\u7b7e</div>\r\n		</div>\r\n  \r\n		<div class=\"list\" id=\"list\">\r\n			\r\n		</div>\r\n		\r\n		<div class=\"listitem listitemmore\" id=\"listItemMore\"></div>\r\n\r\n		<div class=\"lastupdatedate\" id=\"lastupdatedate\"></div>\r\n\r\n	</td></tr></table>\r\n\r\n	<input type=\"hidden\" id=\"sessionkey\" name=\"sessionkey\" value=\"\">\r\n	<input type=\"hidden\" id=\"module\" name=\"module\" value=\"".toCharArray();
    _jsp_string7 = "\"></td>\r\n					<td>&nbsp;</td>\r\n				</tr>\r\n			</table>\r\n		</div>\r\n		\r\n		<div class=\"btnNav\">\r\n			<div class=\"".toCharArray();
    _jsp_string17 = "<div class=\"lab_sp\"></div>".toCharArray();
    _jsp_string1 = "\r\n".toCharArray();
    _jsp_string2 = "\r\n<!DOCTYPE html>\r\n\r\n<html>\r\n<head>\r\n	<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n	<meta name=\"author\" content=\"Weaver E-Mobile Dev Group\" />\r\n	<meta name=\"description\" content=\"Weaver E-mobile\" />\r\n	<meta name=\"keywords\" content=\"weaver,e-mobile\" />\r\n	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n	<title></title>\r\n	<script type='text/javascript' src='/js/jquery/jquery_wev8.js'></script>\r\n	<script type=\"text/javascript\" src=\"/mobile/plugin/cowork/js/script_wev8.js\"></script>\r\n	<style type=\"text/css\">\r\n	html,body {\r\n		height:100%;\r\n		margin:0;\r\n		padding:0;\r\n		font-size:9pt;\r\n		background: #00538D;\r\n	}\r\n	a {\r\n		text-decoration: none;\r\n	}\r\n	table {\r\n		width:100%;\r\n		border-collapse: separate;\r\n		border-spacing: 0px;\r\n	}\r\n	#page {\r\n		width:100%;\r\n		height:100%;\r\n	}\r\n	\r\n	#header {\r\n		width: 100%;\r\n		filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#FFFFFF',\r\n			endColorstr='#ececec' );\r\n		background: -webkit-gradient(linear, left top, left bottom, from(#FFFFFF),\r\n			to(#ECECEC) );\r\n		background: -moz-linear-gradient(top, white, #ECECEC);\r\n		border-bottom: #CCC solid 1px;\r\n		/*\r\n			filter: alpha(opacity=70);\r\n			-moz-opacity: 0.70;\r\n			opacity: 0.70;\r\n			*/\r\n	}\r\n	\r\n	#header #title {\r\n		color: #336699;\r\n		font-size: 20px;\r\n		font-weight: bold;\r\n		text-align: center;\r\n	}\r\n	\r\n	#loading {\r\n		width: 250px;\r\n		height: 65px;\r\n		line-height: 65px;\r\n		position: absolute;\r\n		background: url(\"/images/loading_bg_wev8.png\");\r\n		top: 50%;\r\n		left: 50%;\r\n		display: block;\r\n		text-align: center;\r\n		margin-top: -32px;\r\n		margin-left: -125px;\r\n		z-index: 1002;\r\n	}\r\n	\r\n	#loadingmask {\r\n		width: 100%;\r\n		height: 100%;\r\n		z-index: 1001;\r\n		display:block;\r\n		position:absolute;\r\n		top:0px;\r\n		left:0px;\r\n		background:url(\"/images/bg_w_65_wev8.png\");\r\n	}\r\n	\r\n	/* \u6d41\u7a0b\u641c\u7d22\u533a\u57df */\r\n	.search {\r\n		width: 100%;\r\n		height: 42px;\r\n		text-align: center;\r\n		position: relative;\r\n		background: #7F94AF;\r\n		background: -moz-linear-gradient(0, #A4B0C0, #7F94AF);\r\n		background: -webkit-gradient(linear, 0 0, 0 100%, from(#A4B0C0), to(#7F94AF) );\r\n		border-bottom: 1px solid #5D6875;\r\n	}\r\n	\r\n	/* \u6d41\u7a0b\u641c\u7d22text */\r\n	.searchImg {\r\n		width: 25px;\r\n		padding: 2px;\r\n		margin-left: auto;\r\n		margin-right: auto;\r\n		border-top: 1px solid #687D97;\r\n		border-right: 0;\r\n		border-bottom: 1px solid #687D97;\r\n		border-left: 1px solid #687D97;\r\n		background: #fff;\r\n		-moz-border-radius: 5px 0 0 5px;\r\n		-webkit-border-radius: 5px 0 0 5px;\r\n		border-radius: 5px 0 0 5px;\r\n		-webkit-box-shadow: inset 0px 1px 0px 0px #BCBFC3;\r\n		-moz-box-shadow: inset 0px 1px 0px 0px #BCBFC3;\r\n		box-shadow: inset 0px 1px 0px 0px #BCBFC3;\r\n	}\r\n	.searchText {\r\n		width: 100%;\r\n		margin-left: auto;\r\n		margin-right: auto;\r\n		border-top: 1px solid #687D97;\r\n		border-right: 1px solid #687D97;\r\n		border-bottom: 1px solid #687D97;\r\n		border-left: 0;\r\n		background: #fff;\r\n		overflow:hidden;\r\n		-moz-border-radius: 0 5px 5px 0;\r\n		-webkit-border-radius: 0 5px 5px 0;\r\n		border-radius: 0 5px 5px 0;\r\n		-webkit-box-shadow: inset 0px 1px 0px 0px #BCBFC3;\r\n		-moz-box-shadow: inset 0px 1px 0px 0px #BCBFC3;\r\n		box-shadow: inset 0px 1px 0px 0px #BCBFC3;\r\n	}\r\n	\r\n	.prompt {\r\n		color: #777878;\r\n	}\r\n	\r\n	/* \u5217\u8868\u533a\u57df */\r\n	.list {\r\n		width: 100%;\r\n		background-color:#F1F1F1;\r\n	}\r\n	/* \u5217\u8868\u9879*/\r\n	.listitem {\r\n		width: 100%;\r\n		border-bottom: 1px solid #D8DDE4;\r\n	}\r\n	/* \u5217\u8868\u9879\u540e\u7f6e\u5bfc\u822a */\r\n	.itemnavpoint {\r\n		height: 100%;\r\n		width: 26px;\r\n		text-align: center;\r\n	}\r\n	/* \u5217\u8868\u9879\u540e\u7f6e\u5bfc\u822a\u56fe  */\r\n	.itemnavpoint img {\r\n		width: 20px;\r\n		heigth: 20px;\r\n	}\r\n	/* \u6d41\u7a0b\u521b\u5efa\u4eba\u5934\u50cf\u533a\u57df  */\r\n	.itempreview {\r\n		vertical-align: top;\r\n		height: 100%;\r\n		width: 30px;\r\n		text-align: center;\r\n	}\r\n	/* \u6d41\u7a0b\u521b\u5efa\u4eba\u5934\u50cf  */\r\n	.itempreview img {\r\n		width: 20px;\r\n		height: 20px;\r\n		margin-top: 14px;\r\n	}\r\n	\r\n	/* \u5217\u8868\u9879\u5185\u5bb9\u533a\u57df */\r\n	.itemcontent {\r\n		width: *;\r\n		height: 100%;\r\n		font-size: 14px;\r\n		padding:17px 5px;\r\n	}\r\n	\r\n	/* \u5217\u8868\u9879\u5185\u5bb9\u540d\u79f0 */\r\n	.itemcontenttitle {\r\n		width: 100%;\r\n		color: #000000;\r\n		word-break: break-all;\r\n		text-overflow: ellipsis;\r\n		font-size: 14px;\r\n	}\r\n	\r\n	/* \u66f4\u591a */\r\n	.listitemmore {\r\n		height: 50px;\r\n		text-align: center;\r\n		line-height: 50px;\r\n		font-weight: bold;\r\n		color: #777878;\r\n		background-color:#F1F1F1;\r\n	}\r\n	/* \u5217\u8868\u66f4\u65b0\u65f6\u95f4 */\r\n	.lastupdatedate {\r\n		width: 100%;\r\n		height: 20px;\r\n		text-align: right;\r\n		font-size: 12px;\r\n		line-height: 20px;\r\n		background: #E1E8EC;\r\n		background: -moz-linear-gradient(0, white, #E1E8EC);\r\n		background: -webkit-gradient(linear, 0 0, 0 100%, from(white),\r\n			to(#E1E8EC) );\r\n	}\r\n	/* \u95f4\u9694 */\r\n	.blankLines {\r\n		width: 100%;\r\n		height: 1px;\r\n		overflow: hidden;\r\n	}\r\n	\r\n	/* new */\r\n	.ictnew {\r\n		width: 20px;\r\n	}\r\n	\r\n	.btnNav {\r\n		height:32px;\r\n		border-top:1px solid #FFFFFF;\r\n		border-bottom:1px solid #898989;\r\n		background-image:-webkit-gradient(linear, left top, left bottom, color-stop(0, #DEE6E9), color-stop(1, #BAC5CB));\r\n		padding-left:10px;\r\n		padding-top:5px;\r\n		padding-bottom:5px;\r\n		overflow:hidden;\r\n		font-size: 14px;\r\n	}\r\n	\r\n	.topBtn {\r\n		width:70px;\r\n		height:30px;\r\n		line-height:30px;\r\n		text-align:center;\r\n		border-top:1px solid #738792;\r\n		border-bottom:1px solid #556B78;\r\n		border-left:1px solid #738792;\r\n		border-right:1px solid #738792;\r\n		text-shadow:0 1px #FFFFFF;\r\n		background-image:-webkit-gradient(linear, left top, left bottom, color-stop(0, #D5DADD), color-stop(1, #9DAFBB));\r\n		-webkit-border-radius:4px;\r\n		border-radius:4px;\r\n		float:left;\r\n	}\r\n\r\n	.topBtnDown {\r\n		width:70px;\r\n		height:30px;\r\n		line-height:30px;\r\n		text-align:center;\r\n		border-top:1px solid #29415E;\r\n		border-bottom:1px solid #4C7E9F;\r\n		border-left:1px solid #375A76;\r\n		border-right:1px solid #375A76;\r\n		color:#FFFFFF;\r\n		background-image:-webkit-gradient(linear, left top, left bottom, color-stop(0, #4482B1), color-stop(1, #6297C1));\r\n		-webkit-border-radius:4px;\r\n		border-radius:4px;\r\n		float:left;\r\n	}\r\n	\r\n	.lab {\r\n		padding:2px 8px;\r\n		margin-top:5px;\r\n		font-size:12px;\r\n		background-color:#3F9EDE;\r\n		border-top:1px solid #3A7CB0;\r\n		color:#FFFFFF;\r\n		border-radius:4px;\r\n		display:inline-block;\r\n		word-break: break-all;\r\n	}\r\n	\r\n	.lab_sp {\r\n		width:50px;\r\n		height:2px;\r\n		margin:6px 5px;\r\n		background-image:url(/mobile/plugin/cowork/img/lab_sp_wev8.png);\r\n	}\r\n	\r\n	.lab_select {\r\n		font-weight:bold;\r\n	}\r\n	</style>\r\n</head>\r\n<body>\r\n\r\n	<table id=\"page\"><tr><td width=\"100%\" height=\"100%\" valign=\"top\" align=\"left\">\r\n\r\n		<div id=\"header\" style=\"".toCharArray();
    _jsp_string6 = "</div>\r\n					</td>\r\n					<td width=\"10%\" align=\"right\" valign=\"middle\" style=\"padding-right:5px;\">\r\n					</td>\r\n				</tr>\r\n			</table>\r\n		</div>\r\n\r\n		<div class=\"search\">\r\n			<div style=\"height:5px\"></div>\r\n			<table style=\"width:100%;height: 28px;\">\r\n				<tr>\r\n					<td>&nbsp;</td>\r\n					<td class=\"searchImg\" onclick=\"searchClick()\"><img src=\"/images/icon-search_wev8.png\"></td>\r\n					<td class=\"searchText\"><input type=\"text\" id=\"keyword\" name=\"keyword\" class=\"prompt\" style=\"border: none;width: 100%;height: 26px;\" value=\"".toCharArray();
    _jsp_string20 = "</div>".toCharArray();
    _jsp_string14 = "\">\r\n	<input type=\"hidden\" id=\"scope\" name=\"scope\" value=\"".toCharArray();
  }
}
