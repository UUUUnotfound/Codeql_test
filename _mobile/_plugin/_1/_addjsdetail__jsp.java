/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin._1;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import weaver.mobile.webservices.workflow.WorkflowRequestTableRecord;
import weaver.mobile.webservices.workflow.WorkflowRequestTableField;
import weaver.general.*;
import java.util.*;
import weaver.mobile.webservices.workflow.WorkflowServiceUtil;
import weaver.hrm.*;

public class _addjsdetail__jsp extends com.caucho.jsp.JavaPage
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
      out.print((i ));
      out.write(_jsp_string1, 0, _jsp_string1.length);
      out.print((i));
      out.write(_jsp_string2, 0, _jsp_string2.length);
      out.print((i));
      out.write(_jsp_string3, 0, _jsp_string3.length);
      out.print((workflowid));
      out.write(_jsp_string4, 0, _jsp_string4.length);
      out.print((nodeId));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((isEdits));
      out.write(_jsp_string6, 0, _jsp_string6.length);
      out.print((isdisplay));
      out.write(_jsp_string7, 0, _jsp_string7.length);
      out.print((tableOrderId));
      out.write(_jsp_string8, 0, _jsp_string8.length);
      out.print((SystemEnv.getHtmlLabelName(22686,user.getLanguage())));
      out.write(_jsp_string9, 0, _jsp_string9.length);
      out.print((SystemEnv.getHtmlLabelName(15097,user.getLanguage())));
      out.write(_jsp_string10, 0, _jsp_string10.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/1/addJsdetail.jsp"), -900494414220978848L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string4;
  private final static char []_jsp_string0;
  private final static char []_jsp_string5;
  private final static char []_jsp_string1;
  private final static char []_jsp_string10;
  private final static char []_jsp_string9;
  private final static char []_jsp_string6;
  private final static char []_jsp_string8;
  private final static char []_jsp_string7;
  private final static char []_jsp_string2;
  private final static char []_jsp_string3;
  static {
    _jsp_string4 = "&nodeId=".toCharArray();
    _jsp_string0 = "\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n<script language=\"javascript\">\r\n  function ajaxinit(){\r\n	             var ajax=false;\r\n		         try {\r\n		             ajax = new ActiveXObject(\"Msxml2.XMLHTTP\");\r\n		        } catch (e) {\r\n		            try {\r\n		                ajax = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n		            } catch (E) {\r\n		                ajax = false;\r\n		            }\r\n		        }\r\n	           if (!ajax && typeof XMLHttpRequest!='undefined') {\r\n	                ajax = new XMLHttpRequest();\r\n	            }\r\n	            return ajax;\r\n  }\r\n  //\u9700\u8981\u6539\u9020ajax\u7684\u65b9\u6cd5\r\n   function addRow".toCharArray();
    _jsp_string5 = "&rowIndex=\"+nodenum+\"&isEdits=".toCharArray();
    _jsp_string1 = "(obj){\r\n        var nodenum = document.getElementById(\"nodenum".toCharArray();
    _jsp_string10 = "\";\r\n      if(!confirm(str)){\r\n            return false;\r\n      }\r\n       return true;\r\n   }\r\n</script>\r\n\r\n".toCharArray();
    _jsp_string9 = "');\r\n		return;\r\n    }\r\n   }\r\n\r\n   function sortDetail(obj,isdeleteCount){\r\n	    var nodenum =document.getElementById(\"nodenum\"+obj).value;\r\n	         var newRowNum = 0;\r\n	         for(var k=0;k<nodenum;k++){\r\n	             if(document.getElementById(\"detailRowNum\"+obj+\"_\"+k)){ //\u5f53\u524d\u884c\u6570\u636e\r\n	                 document.getElementById(\"detailRowNum\"+obj+\"_\"+k).innerHTML = \"\"+(newRowNum+1);\r\n					 //document.getElementById(\"detailRowNum\"+obj+\"_\"+k).setAttribute(\"id\",\"detailRowNum\"+obj+\"_\"+newRowNum);\r\n                      //\u5c06\u5f53\u524d\u884c\u7684\u6240\u6709\u5143\u7d20\u7684\u5e8f\u53f7\u90fd\u53d8\u66f4\u6210\u65b0\u7684\u5e8f\u53f7\r\n                         var  trObj =  document.getElementById(\"detailRowNum\"+obj+\"_\"+k).parentNode;\r\n						 //trobj\u4e8b\u4ef6\u53d8\u66f4\r\n						var  trClickValue = trObj.getAttribute(\"onclick\");\r\n                         trClickValue = trClickValue.split(\",\")[0]+\",\"+newRowNum+\");\"\r\n						 trObj.setAttribute(\"onclick\",trClickValue);\r\n						 //\u663e\u793atr,tdID\u4fee\u6539\r\n						 document.getElementById(\"trspace\"+obj+\"_\"+k).setAttribute(\"id\",\"trspace\"+obj+\"_\"+newRowNum);\r\n						 document.getElementById(\"tdspace\"+obj+\"_\"+k).setAttribute(\"id\",\"tdspace\"+obj+\"_\"+newRowNum);\r\n						  var tdElememtCount = 0;\r\n						 for(var mx=0;mx<trObj.childNodes.length;mx++){\r\n							    var tdObj = trObj.childNodes[mx];\r\n								if(tdObj.nodeType == 1 && tdObj.nodeName == \"TD\"){\r\n										if(tdElememtCount == 0){ //checkbox\u4e0d\u9700\u8981\u53d8\u66f4\r\n										}else if(tdElememtCount == 1){ //\u5e8f\u53f7\u9700\u8981\u53d8\u66f4\u5e8f\u53f7\r\n											tdObj.setAttribute(\"id\",\"detailRowNum\"+obj+\"_\"+newRowNum);\r\n										}else { //\u5176\u4ed6\u5143\u7d20\u9700\u8981\u53d8\u66f4\u5e8f\u53f7\r\n											 var otherObjs =tdObj.childNodes;\r\n											 for(var mw=0;mw<otherObjs.length;mw++){\r\n												  var otherObj = otherObjs[mw];\r\n												  if(otherObj.nodeType ==1 && otherObj.nodeName == 'A'){//\u70b9\u51fb\u4e8b\u4ef6\u9700\u8981\u53d8\u66f4\u5e8f\u53f7\r\n													  if(otherObj.getAttribute(\"id\")&&otherObj.getAttribute(\"onclick\")){\r\n														  try{\r\n														   var aid =   otherObj.getAttribute(\"id\");\r\n														   var ahref =otherObj.getAttribute(\"onclick\");\r\n														   var anewId = aid.split(\"_\")[0]+\"_\"+newRowNum;\r\n														   var anewhref = ahref.split(\"(\")[0]+\"(\"+ahref.split(\"(\")[1].split(\",\")[0]+\",\"+newRowNum+\",\"+ahref.split(\"(\")[1].split(\",\")[2]+\",\"+ahref.split(\"(\")[1].split(\",\")[3]+\",\"+ahref.split(\"(\")[1].split(\",\")[4];\r\n														   otherObj.setAttribute(\"id\",anewId);\r\n														   otherObj.setAttribute(\"onclick\",anewhref);\r\n														  }catch(eother){}\r\n													  }\r\n												   }\r\n												  if(otherObj.nodeType == 1 &&  otherObj.nodeName == 'INPUT'){ //input\u5143\u7d20\r\n													  if(otherObj.getAttribute(\"fieldType\")){\r\n														   if(otherObj.getAttribute(\"id\")){\r\n																otherObj.setAttribute(\"id\",otherObj.getAttribute(\"id\").split(\"_\")[0]+\"_\"+newRowNum);\r\n															 }\r\n															 if(otherObj.getAttribute(\"name\")){\r\n																otherObj.setAttribute(\"name\",otherObj.getAttribute(\"name\").split(\"_\")[0]+\"_\"+newRowNum);\r\n															}\r\n													  }else{\r\n														   var inputValue =  otherObj.getAttribute(\"value\");\r\n														  inputValue = inputValue.split(\"_\")[0]+\"_\"+newRowNum+\"_\"+inputValue.split(\"_\")[2];\r\n														  otherObj.setAttribute(\"value\",inputValue);\r\n													  }    \r\n												  }\r\n												  if(otherObj.nodeType == 1 &&  otherObj.nodeName == 'DIV'){ //DIV\u5143\u7d20\r\n													   var divId = otherObj.getAttribute(\"id\");\r\n													   if(divId != 'isedit'){ //\u5c55\u793a\u6570\u636e\u7684\u5730\u65b9\r\n															 var divNewId =  divId.split(\"_\")[0]+\"_\"+newRowNum+\"_\"+divId.split(\"_\")[2];\r\n															 otherObj.setAttribute(\"id\",divNewId);\r\n															 try{\r\n																for(var su=0;su<otherObj.childNodes.length;su++){\r\n																	 var elementObj= otherObj.childNodes[su];\r\n																	 if(elementObj.nodeType ==1 && elementObj.nodeName == 'SPAN'){\r\n																			if(elementObj.getAttribute(\"id\")){\r\n																				elementObj.setAttribute(\"id\",elementObj.getAttribute(\"id\").split(\"_\")[0]+\"_\"+newRowNum+\"_\"+elementObj.getAttribute(\"name\").split(\"_\")[2]);\r\n																			  }\r\n																			 if(elementObj.getAttribute(\"name\")){\r\n																					elementObj.setAttribute(\"name\",elementObj.getAttribute(\"name\").split(\"_\")[0]+\"_\"+newRowNum+\"_\"+elementObj.getAttribute(\"name\").split(\"_\")[2]);\r\n																			 }\r\n																	 }\r\n																	  if(elementObj.nodeType ==1 && elementObj.nodeName == 'INPUT'){\r\n																			  if(elementObj.getAttribute(\"id\")){\r\n																					   elementObj.setAttribute(\"id\",elementObj.getAttribute(\"id\").split(\"_\")[0]+\"_\"+newRowNum);\r\n																			   }\r\n																			  if(elementObj.getAttribute(\"name\")){\r\n																					elementObj.setAttribute(\"name\",elementObj.getAttribute(\"name\").split(\"_\")[0]+\"_\"+newRowNum);\r\n																			   }\r\n																	  }\r\n																}\r\n															 }catch(e){}\r\n													   }else if(divId == 'isedit'){ //\u7f16\u8f91\u9875\u9762\u7684\u6570\u636e\u53d8\u66f4\r\n															 delEditEvent(otherObj,newRowNum);\r\n													   }\r\n												  }\r\n											 }\r\n\r\n										}\r\n                                    \r\n									tdElememtCount++;\r\n								}\r\n						 }\r\n	                 newRowNum ++;\r\n	             }else{\r\n					 continue;\r\n					 newRowNum --;\r\n				 }\r\n	         }\r\n             \r\n			 document.getElementById(\"nodenum\"+obj).value = parseInt(nodenum) - isdeleteCount;\r\n\r\n\r\n\r\n\r\n\r\n   }\r\n   //\u5220\u9664\u7684\u65f6\u5019\u5c06\u7f16\u8f91\u7684\u5143\u7d20Id\u8fdb\u884c\u53d8\u66f4 divObj \u7f16\u8f91DIV\u5bf9\u8c61\r\n    function delEditEvent(divObj,newRowNum){\r\n	       var tableObjs =  divObj.childNodes;\r\n		   for(var i=0;i<tableObjs.length;i++){\r\n                var tableObj = tableObjs[i];\r\n				//\u53ea\u8bfb\u7684\u60c5\u51b5\r\n				if(tableObj.nodeType == 1 &&  tableObj.nodeName == 'INPUT'){\r\n					     if(tableObj.getAttribute(\"id\")){\r\n                               tableObj.setAttribute(\"id\",tableObj.getAttribute(\"id\").split(\"_\")[0]+\"_\"+newRowNum);\r\n						}\r\n					     if(tableObj.getAttribute(\"name\")){\r\n							 tableObj.setAttribute(\"name\",tableObj.getAttribute(\"name\").split(\"_\")[0]+\"_\"+newRowNum);\r\n						}\r\n				}\r\n				if(tableObj.nodeType == 1 &&  tableObj.nodeName == 'SPAN'){\r\n                      if(tableObj.getAttribute(\"id\")){\r\n                               tableObj.setAttribute(\"id\",tableObj.getAttribute(\"id\").split(\"_\")[0]+\"_\"+newRowNum+\"_\"+tableObj.getAttribute(\"name\").split(\"_\")[2]);\r\n						}\r\n					     if(tableObj.getAttribute(\"name\")){\r\n							 tableObj.setAttribute(\"name\",tableObj.getAttribute(\"name\").split(\"_\")[0]+\"_\"+newRowNum+\"_\"+tableObj.getAttribute(\"name\").split(\"_\")[2]);\r\n						}\r\n				}\r\n				\r\n			   if(tableObj.nodeType == 1 &&  tableObj.nodeName == 'TABLE'){\r\n					if(tableObjs[i].childNodes[0]){ //tbody\r\n						if(tableObjs[i].childNodes[0].childNodes[0]){ //tr\r\n                                var tdObjs = tableObjs[i].childNodes[0].childNodes[0].childNodes;\r\n								var tdCount = 0;\r\n							    for(var j=0;j<tableObjs[i].childNodes[0].childNodes[0].childNodes.length;j++){\r\n								     var tdObj = tableObjs[i].childNodes[0].childNodes[0].childNodes[j];\r\n									 if(tdObj.nodeType ==1 &&  tdObj.nodeName == 'TD'){\r\n										  try{\r\n											  if(tdObj.getAttribute(\"id\")){ //\u5982\u679c\u662f\u6d4f\u89c8\u6846\u7c7b\u578b\u7684td\u4e0a\u5305\u542b\u4e86id\r\n												   var tdIdSplits =  tdObj.getAttribute(\"id\").split(\"_\");\r\n                                                   tdObj.setAttribute(\"id\",tdIdSplits[0]+\"_\"+newRowNum+\"_\"+tdIdSplits[2]);\r\n											  }\r\n											  if(tdObj.getAttribute(\"onclick\")){\r\n												  var newonclick = \"\";\r\n												  var splitValues = tdObj.getAttribute(\"onclick\").split(\"&\");\r\n												  for(var si=0;si<splitValues.length;si++){\r\n													    var splitValue=splitValues[si];\r\n														if(splitValue.indexOf(\"=\")>=0){\r\n															var sequalsValue = splitValue.split(\"=\");\r\n															var newReturnValue =\"\";\r\n															for(var se=0;se<sequalsValue.length;se++){\r\n																 var  sequalsVal =  sequalsValue[se];\r\n                                                                 if(sequalsVal.indexOf(\"_\")>=0){\r\n																	  var splitRealV=sequalsVal.split(\"_\");\r\n																	  if(splitRealV.length == 2){\r\n																		   newReturnValue += splitRealV[0]+\"_\"+newRowNum;\r\n																	  }else if(splitRealV.length == 3){\r\n																		   newReturnValue += splitRealV[0]+\"_\"+newRowNum+\"_\"+splitRealV[2];\r\n																	  } \r\n																 }else{\r\n																	 if(se == 0){\r\n																		  newReturnValue += sequalsVal +\"=\";\r\n																	 }else{\r\n																		   newReturnValue += sequalsVal;\r\n																	 }\r\n                                                                    \r\n																 }\r\n															}\r\n															if(si==(splitValues.length-1)){\r\n                                                                  newonclick += newReturnValue;\r\n															}else{\r\n																 newonclick += newReturnValue + \"&\";\r\n															}\r\n															\r\n														}else{\r\n														    newonclick +=splitValue+\"&\";\r\n														}\r\n														\r\n													    \r\n												  }\r\n                                                  tdObj.setAttribute(\"onclick\",newonclick);\r\n											  }\r\n										  }catch(e){}\r\n										   var elementObjs =   tdObj.childNodes;\r\n										   for(var k=0;k<elementObjs.length;k++){\r\n											     var elementObj = elementObjs[k];\r\n												 if(elementObj.nodeType == 1 && elementObj.nodeName == 'INPUT'){ //input \u5143\u7d20\r\n													 if(tdCount == 0){ //\u975e\u5fc5\u586b\u7684\u60c5\u51b5\r\n														 var oldId = \"\";\r\n														 var newChangeId = \"\";\r\n													     if(elementObj.getAttribute(\"id\")){ //id\u7684\u53d8\u66f4\r\n															  var idValue = elementObj.getAttribute(\"id\");\r\n															   oldId = idValue;\r\n															   if(idValue.indexOf(\"_\")>=0){\r\n																   var splitValues = idValue.split(\"_\");\r\n																   var  newId=\"\";\r\n																   for(var s=0;s<splitValues.length;s++){\r\n																	      \r\n																		  if(s==(splitValues.length -1)){\r\n																			    newId +=newRowNum;\r\n																		  }else{\r\n																			   newId += splitValues[s] +\"_\";\r\n																		  }\r\n																   }\r\n                                                                   newChangeId = newId; \r\n                                                                   elementObj.setAttribute(\"id\",newId);\r\n															   } \r\n														}\r\n														if(elementObj.getAttribute(\"name\")){ //name\u7684\u53d8\u66f4\r\n                                                            var  nameValue = elementObj.getAttribute(\"name\");\r\n															if(nameValue.indexOf(\"_\")>=0){\r\n																   var  newName =\"\";\r\n																   var splitnames = nameValue.split(\"_\");\r\n																   for(s=0;s<splitnames.length;s++){\r\n																	   if(s == (splitnames.length -1)){\r\n																		      newName += newRowNum;\r\n																	   }else{\r\n																		     newName += splitnames[s] + \"_\";\r\n																	   }\r\n																   }\r\n                                                                 elementObj.setAttribute(\"name\",newName);\r\n															} \r\n														}\r\n														if(elementObj.getAttribute(\"onchange\")){\r\n															var reg=new RegExp(oldId,\"gmi\");\r\n                                                             elementObj.setAttribute(\"onchange\",\r\n																 elementObj.getAttribute(\"onchange\").replace(reg,newChangeId));\r\n														}\r\n								\r\n														if(elementObj.getAttribute(\"onkeypress\")){\r\n															var oldMoney = oldId; \r\n															var newMoney = newChangeId;\r\n															if(oldId.indexOf(\"lable\")>=0){\r\n																  oldMoney = oldId.replace(/_lable/g,'');\r\n															}\r\n														    if(newChangeId.indexOf(\"lable\")>=0){\r\n																 newMoney = newChangeId.replace(/_lable/g,'');\r\n															}\r\n                                                             var reg=new RegExp(oldMoney,\"gmi\");\r\n                                                             elementObj.setAttribute(\"onkeypress\",\r\n																 elementObj.getAttribute(\"onkeypress\").replace(reg,newMoney));\r\n														}\r\n\r\n														if(elementObj.getAttribute(\"onblur\")){\r\n															if(elementObj.getAttribute(\"onblur\").indexOf(\"numberToFormat\")>=0){\r\n																  var reg=new RegExp(oldId.replace(/field_lable/g,''),\"gmi\");\r\n																   elementObj.setAttribute(\"onblur\",\r\n																	 elementObj.getAttribute(\"onblur\").replace(reg,newChangeId.replace(/field_lable/g,'')));\r\n															}else{\r\n																 var reg=new RegExp(oldId,\"gmi\");\r\n																 elementObj.setAttribute(\"onblur\",\r\n																	 elementObj.getAttribute(\"onblur\").replace(reg,newChangeId));\r\n															}\r\n														}\r\n\r\n													   if(elementObj.getAttribute(\"onfocus\")){\r\n														   if(elementObj.getAttribute(\"onfocus\").indexOf(\"FormatToNumber\")>=0){\r\n															    var reg=new RegExp(oldId.replace(/field_lable/g,''),\"gmi\");\r\n																   elementObj.setAttribute(\"onfocus\",\r\n																	 elementObj.getAttribute(\"onfocus\").replace(reg,newChangeId.replace(/field_lable/g,'')));\r\n														   }else{\r\n															   var reg=new RegExp(oldId,\"gmi\");\r\n                                                               elementObj.setAttribute(\"onfocus\",\r\n																     elementObj.getAttribute(\"onfocus\").replace(reg,newChangeId));\r\n														   }\r\n                                                            \r\n														}\r\n\r\n													 }else{ //\u9a8c\u8bc1\u5fc5\u586b\u7684\u60c5\u51b5\r\n														 if(elementObj.getAttribute(\"id\") && elementObj.getAttribute(\"id\") == 'ismandfield'){ //id\u7684\u53d8\u66f4\r\n															     var elementValue = elementObj.getAttribute(\"value\");\r\n																  if(elementValue.indexOf(\"_\")>=0){\r\n																     var  newValue = elementValue.split(\"_\")[0]+\"_\"+newRowNum;\r\n                                                                     elementObj.setAttribute(\"value\",newValue);\r\n															      }\r\n														 }\r\n													 }\r\n												 }\r\n\r\n												 if(elementObj.nodeType == 1 && elementObj.nodeName == 'TEXTAREA'){\r\n													   if(elementObj.getAttribute(\"id\")){\r\n                                                            elementObj.setAttribute(\"id\",elementObj.getAttribute(\"id\").split(\"_\")[0]+\"_\"+newRowNum);\r\n													   }\r\n													   if(elementObj.getAttribute(\"name\")){\r\n														     elementObj.setAttribute(\"name\",elementObj.getAttribute(\"name\").split(\"_\")[0]+\"_\"+newRowNum);\r\n													   }\r\n												 }\r\n\r\n												  if(elementObj.nodeType == 1 && elementObj.nodeName == 'SELECT'){\r\n													   if(elementObj.getAttribute(\"id\")){\r\n                                                            elementObj.setAttribute(\"id\",elementObj.getAttribute(\"id\").split(\"_\")[0]+\"_\"+newRowNum);\r\n													   }\r\n													   if(elementObj.getAttribute(\"name\")){\r\n														     elementObj.setAttribute(\"name\",elementObj.getAttribute(\"name\").split(\"_\")[0]+\"_\"+newRowNum);\r\n													   }\r\n												 }\r\n\r\n\r\n												  if(elementObj.nodeType == 1 && elementObj.nodeName == 'SPAN'){ //input \u5143\u7d20\r\n													 if(tdCount == 0){ //\u975e\u5fc5\u586b\u7684\u60c5\u51b5\r\n													     \r\n													 }else{ //\u9a8c\u8bc1\u5fc5\u586b\u7684\u60c5\u51b5\r\n														 if(elementObj.getAttribute(\"id\")){ //id\u7684\u53d8\u66f4\r\n															     var elementValue = elementObj.getAttribute(\"id\");\r\n																  if(elementValue.indexOf(\"_\")>=0){\r\n																     var  newValue = elementValue.split(\"_\")[0]+\"_\"+newRowNum+\"_\"+elementValue.split(\"_\")[2];\r\n                                                                     elementObj.setAttribute(\"id\",newValue);\r\n															      }\r\n														 }\r\n													 }\r\n												 }\r\n										   }\r\n                                          tdCount++; \r\n									 }\r\n				                }\r\n						}\r\n					}\r\n			   }\r\n\r\n		   }\r\n	}\r\n   \r\n   function isdel(){\r\n	  var str = \"".toCharArray();
    _jsp_string6 = "&isdisplay=".toCharArray();
    _jsp_string8 = "\", false);\r\n		ajax.setRequestHeader(\"Content-Type\",\"application/x-www-form-urlencoded\");\r\n		ajax.send(null);\r\n	    if (ajax.status == 200) {\r\n			var htmlStr=ajax.responseText;\r\n			jQuery(oTable).append(htmlStr);\r\n		}\r\n   }\r\n   \r\n   function deleteRow(obj){\r\n       var flag = false;\r\n	   var ids = document.getElementsByName('check_node'+obj);\r\n	   for(i=0; i<ids.length; i++) {\r\n		  if(ids[i].checked==true) {\r\n			  flag = true;\r\n			   break;\r\n		  }\r\n	   }\r\n       if(flag) {\r\n		  if(isdel()){\r\n			  var isdeleteCount = 0;\r\n             for(j=0; j<ids.length; j++) {\r\n		        if(ids[j].checked==true) {\r\n		           try{\r\n		       \r\n		           	if (jQuery(ids[j]).parent().parent().next().children(\"td\").length == 1) {\r\n		           		jQuery(ids[j]).parent().parent().next().remove();\r\n		           	}\r\n		              jQuery(ids[j]).parent().parent().remove();\r\n                      isdeleteCount++;\r\n		           }catch(e){\r\n		           }\r\n		           try{\r\n		             var rowId= ids[j].value;\r\n		             if(rowId != 'on'){\r\n		                document.getElementById(\"deleteId\"+obj).value += rowId+\",\";\r\n		             }\r\n		           }catch(e){}\r\n		          j--;\r\n		        }\r\n	         }\r\n	        //\u5e8f\u53f7\u91cd\u73b0\u6392\u5e8f\u5e76\u5c06\u6240\u6709\u5728\u884c\u7684\u6240\u6709\u5b57\u6bb5\u5e8f\u53f7\u90fd\u53d8\u52a8\r\n			 sortDetail(obj,isdeleteCount);\r\n			 //\u8ba1\u7b97\u884c\u5217\u89c4\u5219\r\n	         calSum(obj);\r\n        }\r\n    }else{\r\n        alert('".toCharArray();
    _jsp_string7 = "&tableOrderId=".toCharArray();
    _jsp_string2 = "\").value;\r\n	    document.getElementById(\"nodenum".toCharArray();
    _jsp_string3 = "\").value = parseInt(nodenum)+1;\r\n        var oTable=document.getElementById('detailInfo'+obj);\r\n        var  htmlStr = \"\";\r\n        var ajax=ajaxinit();\r\n		ajax.open(\"GET\", \"/mobile/plugin/1/detailajax.jsp?groupId=\"+obj+\"&derecorderindex=\"+nodenum+\"&workflowid=".toCharArray();
  }
}
