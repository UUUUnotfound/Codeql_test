/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin._1._html;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _operdetail__jsp extends com.caucho.jsp.JavaPage
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
      
	boolean editMode = true;		//true\u5f53\u524d\u884c\u7f16\u8f91\uff0cfalse\u4e0b\u65b9\u5f39\u51faTable\u7f16\u8f91
	if (clienttype.equalsIgnoreCase("ipad")) {
		editMode = true;
	} else if (clienttype.equalsIgnoreCase("iphone")){
		editMode = false;
	} else if (clienttype.equalsIgnoreCase("Webclient")){
		editMode = true;
	} else if (clienttype.equalsIgnoreCase("Android")){
		editMode = false;
	} else if (clienttype.equalsIgnoreCase("AndPad")){
		editMode = true;
	}
	editMode=false;

      out.write(_jsp_string1, 0, _jsp_string1.length);
      if(editMode){	
      out.write(_jsp_string2, 0, _jsp_string2.length);
      } 
      out.write(_jsp_string3, 0, _jsp_string3.length);
      	
	if(workflowRequestInfo!=null&&workflowRequestInfo.getVersion()==2){
              
		WorkflowDetailTableInfo[] detailTableInfoArr=workflowRequestInfo.getWorkflowDetailTableInfos();
		if(detailTableInfoArr !=null && detailTableInfoArr.length>0){
		
      out.write(_jsp_string4, 0, _jsp_string4.length);
      
			for(int groupid=0;groupid<detailTableInfoArr.length;groupid++){
				WorkflowDetailTableInfo detailTableInfo=detailTableInfoArr[groupid];
				String addStr=detailTableInfo.getAddStr();
				addStr=addStr.replaceAll("\r\n","").replaceAll("\r","").replaceAll("\n","");
				addStr=addStr.replaceAll("/","\\\\/");
				addStr=addStr.replaceAll("\"","\\\\\"");
		
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((groupid ));
      out.write(_jsp_string6, 0, _jsp_string6.length);
      out.print((addStr ));
      out.write(_jsp_string7, 0, _jsp_string7.length);
      out.print((groupid ));
      out.write(_jsp_string8, 0, _jsp_string8.length);
      out.print((SystemEnv.getHtmlLabelName(22686,user.getLanguage())));
      out.write(_jsp_string9, 0, _jsp_string9.length);
      out.print((SystemEnv.getHtmlLabelName(15097,user.getLanguage())));
      out.write(_jsp_string10, 0, _jsp_string10.length);
      		//\u63a7\u5236\u660e\u7ec6\u65b0\u589e\u9ed8\u8ba4\u884c
			if("create".equals(method)){
				int detailDefaultRowCount=Util.getIntValue(detailTableInfo.getDefaultRowCount(),0);
				if("1".equals(Util.null2String(detailTableInfo.getDefaultRow()))&&detailDefaultRowCount>0){
		
      out.write(_jsp_string11, 0, _jsp_string11.length);
      out.print((groupid));
      out.write(_jsp_string12, 0, _jsp_string12.length);
      out.print((detailDefaultRowCount ));
      out.write(_jsp_string13, 0, _jsp_string13.length);
      out.print((groupid ));
      out.write('(');
      out.print((groupid ));
      out.write(_jsp_string14, 0, _jsp_string14.length);
      
				}
			}
		
      out.write(_jsp_string15, 0, _jsp_string15.length);
      
			}
		}
	}

      out.write(_jsp_string16, 0, _jsp_string16.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/1/html/operDetail.jsp"), 5058176916479607641L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string1;
  private final static char []_jsp_string7;
  private final static char []_jsp_string9;
  private final static char []_jsp_string10;
  private final static char []_jsp_string3;
  private final static char []_jsp_string16;
  private final static char []_jsp_string8;
  private final static char []_jsp_string6;
  private final static char []_jsp_string13;
  private final static char []_jsp_string4;
  private final static char []_jsp_string15;
  private final static char []_jsp_string5;
  private final static char []_jsp_string14;
  private final static char []_jsp_string11;
  private final static char []_jsp_string12;
  private final static char []_jsp_string2;
  private final static char []_jsp_string0;
  static {
    _jsp_string1 = "\r\n\r\n/**\r\n * \u9884\u7b97\u8d39\u7528\u52a8\u6001\u751f\u6210\u660e\u7ec6\u7f16\u8f91\u9875\u9762\u540e\uff0c\u7ed1\u5b9a\u4e8b\u4ef6\u51fd\u6570\r\n **/\r\nfunction dyeditPageFnaFyFun(groupid,rowId,fieldCount,isedit,isdisplay) {\r\n	return;\r\n}\r\n\r\nfunction controlEditMode(){		//\u63a7\u5236\u7f16\u8f91\u6a21\u5f0f\uff0c\u5e73\u677f\u76f4\u63a5\u5728\u884c\u4e0a\u7f16\u8f91\r\n	".toCharArray();
    _jsp_string7 = "\";\r\n				var recordNum=jQuery(\"#nodenum\"+groupid).val();\r\n				addStr=addStr.replace(/\\$rowIndex\\$/g,recordNum);\r\n				//console.log(addStr);\r\n				jQuery(\"#oTable\"+groupid).children(\"tbody\").append(addStr);\r\n				//\u603b\u8bb0\u5f55\u4e2a\u6570\u52a01\r\n				jQuery(\"#nodenum\"+groupid).val(parseInt(recordNum)+1);\r\n				//\u5e8f\u53f7\u4e3a\u4e0a\u4e00\u5e8f\u53f7\u52a01\r\n				var serialSpan=jQuery(\"tr#trView\"+groupid+\"_\"+recordNum).children(\"td:first-child\").find(\"span\");\r\n				if(recordNum==0){\r\n					serialSpan.text(\"1\");\r\n				}else{\r\n					serialSpan.text(jQuery(\"tr[id^='trView\"+groupid+\"']\").size());\r\n				}\r\n				controlEditMode();\r\n			}\r\n			\r\n			function deleteRow".toCharArray();
    _jsp_string9 = "\");\r\n					return;\r\n				}\r\n				if(confirm(\"".toCharArray();
    _jsp_string10 = "\")){\r\n					delRecords.each(function(){\r\n						var recordid=jQuery(this).val();\r\n						if(recordid!=\"on\"){\r\n							jQuery(\"#deleteId\"+groupid).val(jQuery(\"#deleteId\"+groupid).val()+recordid);\r\n						}\r\n						var tr_id=jQuery(this).closest(\"tr\").attr(\"id\");\r\n						jQuery(\"tr#\"+tr_id).remove();\r\n						jQuery(\"tr#\"+tr_id.replace(\"trView\",\"trEdit\")).remove();\r\n					});\r\n					//\u5e8f\u53f7\u6392\u5e8f\r\n					jQuery(\"input[name='check_node\"+groupid+\"']\").each(function(index){\r\n						jQuery(this).next().text(index+1);\r\n					});\r\n				}\r\n				try{\r\n					calSum(groupid);		//\u884c\u5217\u89c4\u5219\u8ba1\u7b97\r\n				}catch(e){}\r\n			}\r\n		\r\n		".toCharArray();
    _jsp_string3 = "\r\n}\r\n\r\n".toCharArray();
    _jsp_string16 = "\r\n</script>\r\n\r\n<script language=\"javascript\">\r\nfunction detailTrClick(groupid,rowIndex){\r\n	var otable = jQuery(\"table#oTable\"+groupid);\r\n	var viewTrObj=jQuery(\"#trView\"+groupid+\"_\"+rowIndex);\r\n	var editTrObj=jQuery(\"#trEdit\"+groupid+\"_\"+rowIndex);\r\n	if(editTrObj.length>0){		//\u5b58\u5728\uff0c\u70b9\u51fb\u5219remove\r\n		editTrObj.slideUp();\r\n		editTrObj.remove();\r\n	}else{\r\n		//jQuery(\"div[name='hiddenEditdiv']\").css(\"display\",\"\");\r\n		var editTr_id = \"trEdit\"+groupid+\"_\"+rowIndex;\r\n		var editTr_new=jQuery(\"<tr id=\\\"\"+editTr_id+\"\\\" width=\\\"100%\\\"></tr>\");\r\n		var editTd=jQuery(\"<td colspan=\\\"\"+viewTrObj.children(\"td\").size()+\"\\\" width=\\\"100%\\\"></td>\");\r\n		editTd.append(getEditTable(groupid,rowIndex));\r\n		editTr_new.append(editTd);\r\n		viewTrObj.after(editTr_new);\r\n		//\u7531\u4e8e\u7b2c\u4e00\u4e2a\u5b57\u6bb5\u672a\u89e3\u6790\u5de6\u8fb9\u6846\uff0c\u7279\u6b8a\u5904\u7406\r\n		jQuery(\"td[lackLeftBorder='y']\").each(function(){\r\n			jQuery(this).css(\"border-left-width\",jQuery(this).css(\"border-right-width\"));\r\n			jQuery(this).css(\"border-left-style\",jQuery(this).css(\"border-right-style\"));\r\n			jQuery(this).css(\"border-left-color\",jQuery(this).css(\"border-right-color\"));\r\n		});\r\n		//\u63a7\u5236\u6700\u540e\u4e00\u884c\u589e\u52a0bottom\u7ebf\r\n		var last_tr_id = jQuery(\"table#oTable\"+groupid+\">tbody>tr:last\").attr(\"id\");\r\n		if(last_tr_id == editTr_id){\r\n			jQuery(\"#\"+editTr_id).css(\"border-bottom-width\",otable.closest(\"td\").css(\"border-left-width\"))\r\n				.css(\"border-bottom-style\",otable.closest(\"td\").css(\"border-left-style\"))\r\n				.css(\"border-bottom-color\",otable.closest(\"td\").css(\"border-left-color\"));\r\n		}\r\n		//\u6700\u540e\u4e09\u4e2a\u53c2\u6570\u65e0\u7528\r\n		try{dyeditPageFnaFyFun(groupid,rowIndex,0,0,0);}catch(ex){}\r\n	}\r\n}\r\n\r\nfunction getEditTable(groupid,rowIndex){\r\n	var viewTrObj=jQuery(\"#trView\"+groupid+\"_\"+rowIndex);\r\n	var resObj=jQuery(\"<table style=\\\"width:100%;border-collapse:collapse;border:0px;margin:0px;padding:0px;\\\"></table>\");\r\n	var eachObj=viewTrObj.find(\"div[name='hiddenEditdiv']\");\r\n	eachObj.each(function(index){\r\n		var newTr=jQuery(\"<tr></tr>\");\r\n		var newTd=null;\r\n		//\u7a7a\u5217\u7528\u4e8e\u6536\u7f29\u7f16\u8f91TR\r\n		if(index==0){\r\n			newTd=jQuery(\"<td width=\\\"10%\\\"></td>\");\r\n			newTd.attr(\"rowspan\",eachObj.size());\r\n			newTd.attr(\"onclick\",\"javacsript:detailTrClick(\"+groupid+\",\"+rowIndex+\")\");\r\n			newTr.append(newTd);\r\n		}\r\n		//\u53d6\u5f97\u5b57\u6bb5id\uff0c\u751f\u6210\u5b57\u6bb5\u540d\u79f0TD\r\n		var fieldinfo=new Array();\r\n		var isshow_id=jQuery(this).closest(\"td\").find(\"div[id^=isshow]\").attr(\"id\");\r\n		isshow_id=isshow_id.replace(\"isshow\",\"\");\r\n		var fieldinfo=isshow_id.split(\"_\");\r\n		\r\n		var fieldLableObj=jQuery(this).closest(\"table\").find(\"td[_fieldid='\"+fieldinfo[2]+\"']\");\r\n		newTd=jQuery(\"<td width=\\\"30%\\\"></td>\");\r\n		newTd.attr(\"class\",fieldLableObj.closest(\"td\").attr(\"class\"));\r\n		if(index==0){\r\n			newTd.attr(\"lackLeftBorder\",\"y\");\r\n		}\r\n		newTd.html(fieldLableObj.html());\r\n		newTr.append(newTd);\r\n		//\u751f\u6210\u5b57\u6bb5\u7f16\u8f91TD\r\n		var editTdObj=getEditTd(jQuery(this),fieldinfo);\r\n		editTdObj.attr(\"class\",jQuery(this).closest(\"td\").attr(\"class\"));\r\n		newTr.append(editTdObj);\r\n		//\u7a7a\u5217\u95f4\u9694\r\n		if(index==0){\r\n			newTd=jQuery(\"<td width=\\\"5%\\\"></td>\");\r\n			newTd.attr(\"rowspan\",eachObj.size())\r\n			newTr.append(newTd);\r\n		}\r\n		//\u5c06\u7f16\u8f91TR\u653e\u5165Table\r\n		resObj.append(newTr);\r\n	});\r\n	\r\n	return resObj;\r\n}\r\n\r\n\r\nfunction getEditTd(is_editObj,fieldinfo){\r\n	var cloneObj=is_editObj.children().clone();\r\n	var editTdObj=jQuery(\"<td width=\\\"55%\\\"></td>\");\r\n	var fieldid=fieldinfo[2];\r\n	if(cloneObj[0].tagName.toLowerCase()==\"table\"){\r\n		//\u5faa\u73af\u6bcf\u4e2aTD\u53d6\u5185\u5bb9\r\n		cloneObj.find(\"tbody>tr>td\").each(function(index){\r\n			if(!!jQuery(this).attr(\"onclick\")){\r\n				editTdObj.attr(\"onclick\",jQuery(this).attr(\"onclick\"));\r\n			}\r\n			editTdObj.append(jQuery(this).html());\r\n		});\r\n		\r\n		//\u5904\u7406\u7f16\u8f91/\u9690\u85cf\u7684input\u5bf9\u8c61\r\n		editTdObj.find(\"input[name^='field'][name$='_\"+fieldinfo[1]+\"']\").each(function(){\r\n			var elmName=jQuery(this).attr(\"name\");\r\n			var fieldStr=elmName.replace(\"field_lable\",\"\").replace(\"field_chinglish\",\"\").replace(\"field\",\"\");\r\n			var replaceStr=fieldStr+\"_d\";\r\n			//\u5c5e\u6027\u5904\u7406\r\n			jQuery(this).attr(\"name\",jQuery(this).attr(\"name\").replace(new RegExp(fieldStr,\"g\"),replaceStr));\r\n			if(!!jQuery(this).attr(\"id\")){\r\n				//\u7531\u4e8echrome\u4e2d\u5bf9\u539f\u5bf9\u8c61\u4fee\u6539value\u503chtml\u672a\u4fee\u6539\uff0c\u9700\u624b\u52a8\u8d4b\u503c\r\n				jQuery(this).attr(\"value\",jQuery(\"#\"+jQuery(this).attr(\"id\")).val());\r\n				jQuery(this).attr(\"id\",jQuery(this).attr(\"id\").replace(new RegExp(fieldStr,\"g\"),replaceStr));\r\n			}\r\n			if(!!jQuery(this).attr(\"onkeypress\")){\r\n				jQuery(this).attr(\"onkeypress\",jQuery(this).attr(\"onkeypress\").replace(new RegExp(fieldStr,\"g\"),replaceStr));\r\n			}\r\n			if(!!jQuery(this).attr(\"onblur\")){\r\n				jQuery(this).attr(\"onblur\",jQuery(this).attr(\"onblur\").replace(new RegExp(fieldStr,\"g\"),replaceStr));\r\n			}\r\n			if(!!jQuery(this).attr(\"onfocus\")){\r\n				jQuery(this).attr(\"onfocus\",jQuery(this).attr(\"onfocus\").replace(new RegExp(fieldStr,\"g\"),replaceStr));\r\n			}\r\n			if(!!jQuery(this).attr(\"onchange\")){\r\n				jQuery(this).attr(\"onchange\",jQuery(this).attr(\"onchange\").replace(new RegExp(fieldStr,\"g\"),replaceStr));\r\n			}\r\n			\r\n			//\u5904\u7406\u91d1\u989d\u8f6c\u6362\u5b57\u6bb5\u3001\u6d4f\u89c8\u6309\u94ae\u3001\u65e5\u671f\u3001\u65f6\u95f4\r\n			if(elmName.indexOf(\"field_chinglish\")>-1)	return true;\r\n			if(jQuery(this).attr(\"type\")==\"hidden\"&&jQuery(this).attr(\"fieldtype\")==\"browse\"){\r\n				if(jQuery(this).closest(\"td\").children(\"a\").size()>0){\r\n					jQuery(this).closest(\"td\").children(\"a:first-child\").css(\"float\",\"left\");\r\n				}\r\n				var browserVal=jQuery(this).val();\r\n				var browseText=\"\";\r\n				if(!!browserVal){\r\n					if(editTdObj.find(\"span[keyid='\"+browserVal+\"']\").size()>0){\r\n						browseText=editTdObj.find(\"span[keyid='\"+browserVal+\"']\").text();\r\n						editTdObj.find(\"span[keyid='\"+browserVal+\"']\").remove();\r\n					}\r\n				}\r\n				jQuery(this).after(\"<div id=\\\"\"+elmName+\"_span_d\\\" groupid=\\\"\"+fieldinfo[0]+\"\\\" rowid=\\\"\"+fieldinfo[1]+\"\\\" columnid=\\\"\"+fieldinfo[2]+\"\\\" style=\\\"margin-top:11px;\\\">\"+browseText+\"</div>\");\r\n			}\r\n			if(jQuery(this).attr(\"class\")==\"scroller_date\"){\r\n				jQuery(this).scroller({preset: 'date',dateFormat:'yy-mm-dd',theme: 'default',display: 'bottom', mode: 'scroller',endYear:2020,nowText:'\u4eca\u5929',setText:'\u786e\u5b9a',cancelText:'\u53d6\u6d88',monthText:'\u6708',yearText:'\u5e74',dayText:'\u65e5',showNow:true,dateOrder: 'yymmdd',onShow: moveDataTimeContorl});\r\n			}else if(jQuery(this).attr(\"class\")==\"scroller_time\"){\r\n				jQuery(this).scroller({preset: 'time',timeFormat:'HH:ii',theme: 'default',display: 'bottom',mode: 'scroller',nowText:'\u73b0\u5728',setText:'\u786e\u5b9a',cancelText:'\u53d6\u6d88',minuteText:'\u5206',hourText:'\u65f6',timeWheels:'HHii',showNow:true,onShow: moveDataTimeContorl});\r\n			}\r\n			\r\n			//\u589e\u52a0\u7ed1\u5b9aonchange\u4e8b\u4ef6\r\n			if(jQuery(this).attr(\"type\")!=\"hidden\"){\r\n				var changeFun=\"\";\r\n				if(!!jQuery(this).attr(\"onchange\")){\r\n					changeFun=jQuery.trim(jQuery(this).attr(\"onchange\"));\r\n					if(changeFun.length>1&&changeFun.substr(changeFun.length-1)!=\";\"){\r\n						changeFun += \";\";\r\n					}\r\n				}\r\n				changeFun += \"dynamicModify(this)\";\r\n				jQuery(this).attr(\"onchange\",changeFun);\r\n			}\r\n			\r\n			//\u5fc5\u586bSPAN\u5904\u7406\r\n			if(editTdObj.find(\"span[class='ismand'][id^='\"+elmName+\"']\").size()>0){\r\n				editTdObj.find(\"input[type='hidden'][name='ismandfield']\").remove();\r\n				var mandSpanObj=editTdObj.find(\"span[class='ismand'][id^='\"+elmName+\"']\");\r\n				mandSpanObj.attr(\"id\",mandSpanObj.attr(\"id\").replace(new RegExp(fieldStr,\"g\"),replaceStr));\r\n				mandSpanObj.removeClass(\"ismand\");\r\n				mandSpanObj.css(\"color\",\"red\").css(\"font-size\",\"16pt\").css(\"float\",\"right\");\r\n				if(!!jQuery(this).val()){\r\n					mandSpanObj.css(\"display\",\"none\");\r\n				}else{\r\n					mandSpanObj.css(\"display\",\"block\");\r\n				}\r\n				if(jQuery(this).attr(\"type\")==\"hidden\"&&jQuery(this).attr(\"fieldtype\")==\"browse\"){\r\n					mandSpanObj.css(\"margin-top\",\"-10px\");\r\n				}\r\n			}\r\n		});\r\n		//\u5904\u7406checkbox\u5bf9\u8c61\r\n		editTdObj.find(\"input[type='checkbox'][id^='field'][id$='_\"+fieldinfo[1]+\"'][name!^='field']\").each(function(){\r\n			var elmId=jQuery(this).attr(\"id\");\r\n			if(elmId.substr(elmId.length-2)==\"_d\")	return true;\r\n			var elmId_d=elmId+\"_d\";\r\n			//\u5c5e\u6027\u5904\u7406\r\n			jQuery(this).attr(\"id\",elmId_d);\r\n			var changeFun=\"\";\r\n			if(!!jQuery(this).attr(\"onchange\")){\r\n				changeFun=jQuery.trim(jQuery(this).attr(\"onchange\"));\r\n				if(changeFun.length>1&&changeFun.substr(changeFun.length-1)!=\";\"){\r\n					changeFun += \";\";\r\n				}\r\n				changeFun=changeFun.replace(new RegExp(elmId,\"g\"),elmId_d);\r\n			}\r\n			changeFun += \"dynamicModify(this)\";\r\n			jQuery(this).attr(\"onchange\",changeFun);\r\n		});\r\n		//\u5904\u7406textarea\u5bf9\u8c61\r\n		editTdObj.find(\"textarea[name^='field'][name$='_\"+fieldinfo[1]+\"'],select[name^='field'][name$='_\"+fieldinfo[1]+\"']\").each(function(){\r\n			var elmName=jQuery(this).attr(\"name\");\r\n			var elmName_d=elmName+\"_d\";\r\n			jQuery(this).attr(\"name\",elmName_d);\r\n			if(!!jQuery(this).attr(\"id\")){\r\n				jQuery(this).attr(\"id\",jQuery(this).attr(\"id\").replace(new RegExp(elmName,\"g\"),elmName_d));\r\n			}\r\n			\r\n			//\u589e\u52a0\u7ed1\u5b9aonchange\u4e8b\u4ef6\r\n			var changeFun=\"\";\r\n			if(!!jQuery(this).attr(\"onchange\")){\r\n				changeFun=jQuery.trim(jQuery(this).attr(\"onchange\"));\r\n				if(changeFun.length>1&&changeFun.substr(changeFun.length-1)!=\";\"){\r\n					changeFun += \";\";\r\n				}\r\n			}\r\n			changeFun += \"dynamicModify(this)\";\r\n			jQuery(this).attr(\"onchange\",changeFun);\r\n			//textarea\u6240\u5728TD\u9ad8\u5ea6\u589e\u52a0\r\n			if(jQuery(this)[0].tagName.toLowerCase()==\"textarea\"){\r\n				editTdObj.css(\"height\",\"80px\");\r\n			}\r\n			//\u5fc5\u586bSPAN\u5904\u7406\r\n			if(editTdObj.find(\"span[class='ismand'][id^='\"+elmName+\"']\").size()>0){\r\n				editTdObj.find(\"input[type='hidden'][name='ismandfield']\").remove();\r\n				var mandSpanObj=editTdObj.find(\"span[class='ismand'][id^='\"+elmName+\"']\");\r\n				mandSpanObj.attr(\"id\",mandSpanObj.attr(\"id\").replace(new RegExp(elmName,\"g\"),elmName_d));\r\n				mandSpanObj.removeClass(\"ismand\");\r\n				mandSpanObj.css(\"color\",\"red\").css(\"font-size\",\"16pt\").css(\"float\",\"right\");\r\n				if(!!jQuery(this).val()){\r\n					mandSpanObj.css(\"display\",\"none\");\r\n				}else{\r\n					mandSpanObj.css(\"display\",\"block\");\r\n				}\r\n			}\r\n		});\r\n	}else{\r\n		editTdObj.append(cloneObj);\r\n		editTdObj.find(\"input,div\").remove();\r\n		editTdObj.find(\"span\").each(function(){\r\n			if(!!jQuery(this).attr(\"id\")){\r\n				if(jQuery(this).attr(\"id\").indexOf(\"field\"+fieldid)>-1)\r\n					jQuery(this).attr(\"id\",jQuery(this).attr(\"id\")+\"_d\");\r\n			}\r\n			if(!!jQuery(this).attr(\"name\")){\r\n				if(jQuery(this).attr(\"name\").indexOf(\"field\"+fieldid)>-1)\r\n					jQuery(this).attr(\"name\",jQuery(this).attr(\"name\")+\"_d\");\r\n			}\r\n		});\r\n	}\r\n	return editTdObj;\r\n}\r\n\r\n//\u540c\u6b65\u4fee\u6539\u663e\u793a\u7684span\u53cainput\r\nfunction dynamicModify(vthis){\r\n	try{\r\n		var tagName=jQuery(vthis)[0].tagName.toLowerCase();\r\n		var objId=jQuery(vthis).attr(\"id\");\r\n		var objId_hidden=\"\";\r\n		if(objId.substr(objId.length-2)==\"_d\"){\r\n			objId_hidden = objId.substring(0,objId.length-2);\r\n		}\r\n		//\u6587\u672c\u53cd\u5411\u4fee\u6539\r\n		if(tagName==\"input\"&&jQuery(vthis).attr(\"type\")==\"text\"){\r\n			try{\r\n				var objVal=jQuery(vthis).val();\r\n				if(jQuery(vthis).attr(\"datavaluetype\")==\"4\"){\r\n					var fieldIndex=objId.replace(\"field_lable\",\"\");\r\n					var fieldIndex_hidden=objId_hidden.replace(\"field_lable\",\"\");\r\n					var isshowObj=jQuery(\"[name='\"+objId_hidden+\"']\").closest(\"div[name='hiddenEditdiv']\").closest(\"td\").find(\"div[id^=isshow]\");\r\n					if(!!objVal){\r\n						var val_1 = floatFormat(objVal);			//\u8865\u96f6\r\n						var val_2 = milfloatFormat(val_1);			//\u8f6c\u5343\u5206\u4f4d\r\n						var val_3 = numberChangeToChinese(val_1);	//\u8f6c\u5927\u5199\r\n						//\u4e0d\u80fd\u7ed9\u7f16\u8f91\u7684input\u8d4b\u503c\uff0c\u56e0\u4e3aonblur\u4e8b\u4ef6\u4f1a\u8c03\u75281_wev8.js\u7684numberToFormat\u65b9\u6cd5\u8ba1\u7b97\u8d4b\u503c\r\n						jQuery(\"input[name='field\" + fieldIndex_hidden + \"']\").attr(\"value\",val_1);\r\n        				jQuery(\"input[name='field_lable\" + fieldIndex_hidden + \"']\").attr(\"value\",val_2);\r\n        				jQuery(\"input[name='field_chinglish\" + fieldIndex_hidden + \"']\").attr(\"value\",val_3);\r\n						isshowObj.text(val_3+\"(\"+val_2+\")\");\r\n					}else{\r\n						jQuery(\"input[name='field\" + fieldIndex_hidden + \"']\").attr(\"value\",\"\");\r\n						jQuery(\"input[name='field_lable\" + fieldIndex_hidden + \"']\").attr(\"value\",\"\");\r\n        				jQuery(\"input[name='field_chinglish\" + fieldIndex_hidden + \"']\").attr(\"value\",\"\");\r\n        				isshowObj.text(\"\");\r\n					}\r\n				}else{\r\n					if(jQuery(vthis).attr(\"datavaluetype\")==\"2\"){\r\n						objVal=toPrecision(objVal,0);\r\n						jQuery(vthis).attr(\"value\",objVal);\r\n					}else if(jQuery(vthis).attr(\"datavaluetype\")==\"3\"||jQuery(vthis).attr(\"datavaluetype\")==\"5\"){\r\n						var datalength=2;\r\n						datalength=jQuery(vthis).attr(\"datalength\");\r\n						objVal=toPrecision(objVal,parseInt(datalength));\r\n						if(jQuery(vthis).attr(\"datavaluetype\")==\"3\"){\r\n							jQuery(vthis).attr(\"value\",objVal);\r\n						}else if(jQuery(vthis).attr(\"datavaluetype\")==\"5\"){\r\n							objVal=changeToThousandsVal(objVal);\r\n						}\r\n					}\r\n					var inputElement=jQuery(\"input#\"+objId_hidden+\"[type='text']\");\r\n					inputElement.attr(\"value\",objVal);\r\n					inputElement.closest(\"div[name='hiddenEditdiv']\").closest(\"td\").find(\"div[id^=isshow]\").text(objVal);\r\n				}\r\n			}catch(ev){}\r\n		}\r\n		//checkbox\u53cd\u5411\u4fee\u6539\r\n		if(tagName==\"input\"&&jQuery(vthis).attr(\"type\")==\"checkbox\"){\r\n			var checkboxObj=jQuery(\"input[type='checkbox'][id='\"+objId_hidden+\"']\");\r\n			if(jQuery(vthis).attr(\"checked\")){\r\n				checkboxObj.attr(\"checked\",true);\r\n			}else{\r\n				checkboxObj.attr(\"checked\",false);\r\n			}\r\n			jQuery(\"input[type='hidden'][name='\"+objId_hidden+\"']\").attr(\"value\",jQuery(\"input[type='hidden'][name='\"+objId+\"']\").val());\r\n		}\r\n		//\u591a\u884c\u6587\u672c\u53cd\u5411\u4fee\u6539\r\n		if(tagName==\"textarea\"){\r\n			var objVal=jQuery(vthis).val();\r\n			var textareaElement=jQuery(\"textarea#\"+objId_hidden);\r\n			textareaElement.val(objVal);\r\n			textareaElement.closest(\"div[name='hiddenEditdiv']\").closest(\"td\").find(\"div[id^=isshow]\").text(objVal);\r\n		}\r\n		//\u4e0b\u62c9\u6846\u53cd\u5411\u4fee\u6539\r\n		if(tagName==\"select\"){\r\n			var selectOption=jQuery(vthis).find(\"option:selected\");\r\n			var selectElement=jQuery(\"select#\"+objId_hidden);\r\n			selectElement.find(\"option[value='\"+selectOption.val()+\"']\").attr(\"selected\", \"selected\");\r\n			//selectElement.val(selectOption.val());\r\n			selectElement.closest(\"div[name='hiddenEditdiv']\").closest(\"td\").find(\"div[id^=isshow]\").text(selectOption.text());\r\n		}\r\n		//\u63a7\u5236\u5fc5\u586b\u6807\u793a\r\n		if(tagName==\"input\"&&jQuery(vthis).attr(\"datavaluetype\")==\"4\"){		//\u91d1\u989d\u8f6c\u6362\u5b57\u6bb5\u627e\u5fc5\u586bSPAN\r\n			objId=objId.replace(\"field_lable\",\"field\");\r\n		}\r\n		if(jQuery(\"span#\"+objId+\"_ismandspan\").size()>0){\r\n			if(!!jQuery(vthis).val()){\r\n				jQuery(\"span#\"+objId+\"_ismandspan\").css(\"display\",\"none\");\r\n			}else{\r\n				jQuery(\"span#\"+objId+\"_ismandspan\").css(\"display\",\"block\");\r\n			}\r\n		}\r\n	}catch(e){}\r\n}\r\n</script>".toCharArray();
    _jsp_string8 = "(groupid){\r\n				var delRecords=jQuery(\"input[name='check_node\"+groupid+\"']:checked\");\r\n				if(delRecords.size()==0){\r\n					alert(\"".toCharArray();
    _jsp_string6 = "(groupid){\r\n				var addStr=\"".toCharArray();
    _jsp_string13 = ";\r\n				       for(var s=0;s<defaultCount;s++){\r\n					       addRow".toCharArray();
    _jsp_string4 = "\r\n					jQuery(document).ready(function(){\r\n						controlEditMode();\r\n					});	\r\n		".toCharArray();
    _jsp_string15 = "	\r\n		".toCharArray();
    _jsp_string5 = "\r\n			function addRow".toCharArray();
    _jsp_string14 = ");\r\n				       }\r\n			     	});\r\n		".toCharArray();
    _jsp_string11 = "\r\n					jQuery(document).ready(function(){\r\n					   jQuery(\"#nodenum".toCharArray();
    _jsp_string12 = "\").attr(\"value\",\"0\");\r\n				       var defaultCount=".toCharArray();
    _jsp_string2 = "\r\n		var hiddenEditDiv=jQuery(\"div[name='hiddenEditdiv']\");\r\n		hiddenEditDiv.each(function(){\r\n			var editHtml=jQuery(this).html();\r\n			var currentTd=jQuery(this).closest(\"td\");\r\n			currentTd.html(editHtml);\r\n			if(!!currentTd.parent().attr(\"onclick\")){\r\n				currentTd.parent().removeAttr(\"onclick\");\r\n			}\r\n		});\r\n	".toCharArray();
    _jsp_string0 = "\r\n\r\n<script language=\"javascript\">\r\n".toCharArray();
  }
}
