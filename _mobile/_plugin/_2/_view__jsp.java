/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin._2;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import weaver.general.*;
import java.util.*;
import weaver.hrm.*;
import weaver.systeminfo.*;
import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.safety.*;
import weaver.mobile.webservices.common.HtmlUtil;

public class _view__jsp extends com.caucho.jsp.JavaPage
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
      weaver.hrm.resource.ResourceComInfo resourceComInfo;
      resourceComInfo = (weaver.hrm.resource.ResourceComInfo) pageContext.getAttribute("resourceComInfo");
      if (resourceComInfo == null) {
        resourceComInfo = new weaver.hrm.resource.ResourceComInfo();
        pageContext.setAttribute("resourceComInfo", resourceComInfo);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.docs.docs.DocManager docManager;
      docManager = (weaver.docs.docs.DocManager) pageContext.getAttribute("docManager");
      if (docManager == null) {
        docManager = new weaver.docs.docs.DocManager();
        pageContext.setAttribute("docManager", docManager);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.docs.docs.DocImageManager docImageManager;
      docImageManager = (weaver.docs.docs.DocImageManager) pageContext.getAttribute("docImageManager");
      if (docImageManager == null) {
        docImageManager = new weaver.docs.docs.DocImageManager();
        pageContext.setAttribute("docImageManager", docImageManager);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.docs.DocDetailLog docDetailLog;
      docDetailLog = (weaver.docs.DocDetailLog) pageContext.getAttribute("docDetailLog");
      if (docDetailLog == null) {
        docDetailLog = new weaver.docs.DocDetailLog();
        pageContext.setAttribute("docDetailLog", docDetailLog);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.splitepage.operate.SpopForDoc spopForDoc;
      spopForDoc = (weaver.splitepage.operate.SpopForDoc) pageContext.getAttribute("spopForDoc");
      if (spopForDoc == null) {
        spopForDoc = new weaver.splitepage.operate.SpopForDoc();
        pageContext.setAttribute("spopForDoc", spopForDoc);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.conn.RecordSet recordSet;
      recordSet = (weaver.conn.RecordSet) pageContext.getAttribute("recordSet");
      if (recordSet == null) {
        recordSet = new weaver.conn.RecordSet();
        pageContext.setAttribute("recordSet", recordSet);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.conn.RecordSet rs;
      rs = (weaver.conn.RecordSet) pageContext.getAttribute("rs");
      if (rs == null) {
        rs = new weaver.conn.RecordSet();
        pageContext.setAttribute("rs", rs);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      
request.setCharacterEncoding("UTF-8");
response.setContentType("text/html;charset=UTF-8");

String detailid = Util.null2String((String)request.getParameter("detailid"));
String module = Util.null2String((String)request.getParameter("module"));
String scope = Util.null2String((String)request.getParameter("scope"));
String title = Util.null2String((String)request.getParameter("title"));
String clienttype = Util.null2String((String)request.getParameter("clienttype"));
String clientlevel = Util.null2String((String)request.getParameter("clientlevel"));

String requestid = Util.null2String((String)request.getParameter("requestid"));
String fromWF = Util.null2String((String)request.getParameter("fromWF"));
int fromRequestid = Util.getIntValue(request.getParameter("fromRequestid"), 0);
//\u6807\u8bb0\u662f\u4ece\u5fae\u641c\u6a21\u5757\u8fdb\u5165start
String fromES=Util.null2String((String)request.getParameter("fromES"));
//\u6807\u8bb0\u662f\u4ece\u5fae\u641c\u6a21\u5757\u8fdb\u5165end
//\u6807\u8bb0\u662f\u4ece\u4efb\u52a1\u7ba1\u7406\u6a21\u5757\u8fdb\u5165start
String fromTask=Util.null2String((String)request.getParameter("fromTask"));
//\u6807\u8bb0\u662f\u4ece\u4efb\u52a1\u7ba1\u7406\u6a21\u5757\u8fdb\u5165end


String fromcowork = Util.null2String((String)request.getParameter("fromcowork"));
String coworkid = Util.null2String((String)request.getParameter("coworkid"));

String readnew = request.getParameter("_readnew_");

String ipaddress = Util.null2String((String)request.getParameter("ipaddress"));

User user = HrmUserVarify.getUser (request , response) ;
if(user == null)  return ;

char flag=Util.getSeparator() ;

int userid=user.getUID();
String logintype = user.getLogintype();
String userType = ""+user.getType();
String userdepartment = ""+user.getUserDepartment();
String usersubcomany = ""+user.getUserSubCompany1();
String userSeclevel = user.getSeclevel();
String userSeclevelCheck = userSeclevel;
if("2".equals(logintype)){
	userdepartment="0";
	usersubcomany="0";
	userSeclevel="0";
}

docManager.resetParameter();
docManager.setId(Util.getIntValue(detailid));
docManager.getDocInfoById();

int doceditionid = docManager.getDocEditionId();
int ishistory = docManager.getIsHistory();

//TD.5434 \u63d0\u9192\u6709\u65b0\u7248\u672c\u6587\u6863
if(doceditionid>-1&&ishistory==1){
    rs.executeSql(" select id from DocDetail where doceditionid = " + doceditionid + " order by id desc ");
    rs.next();
	int newDocId = Util.getIntValue(rs.getString("id"));
	if(newDocId!=Util.getIntValue(detailid)&&newDocId>0){
	
      out.write(_jsp_string2, 0, _jsp_string2.length);
      out.print((SystemEnv.getHtmlLabelName(19986,user.getLanguage())));
      out.write(_jsp_string3, 0, _jsp_string3.length);
      out.print((newDocId));
      out.write(_jsp_string4, 0, _jsp_string4.length);
      out.print((module));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((scope));
      out.write(_jsp_string6, 0, _jsp_string6.length);
      out.print((requestid));
      out.write(_jsp_string7, 0, _jsp_string7.length);
      out.print((fromRequestid));
      out.write(_jsp_string8, 0, _jsp_string8.length);
      
	}
}

//\u6587\u6863\u4fe1\u606f
int maincategory=docManager.getMaincategory();
int subcategory=docManager.getSubcategory();
int seccategory=docManager.getSeccategory();
String docsubject=docManager.getDocsubject();
String doccontent=docManager.getDoccontent();
String docpublishtype=docManager.getDocpublishtype();
String docstatus=docManager.getDocstatus();
ishistory = docManager.getIsHistory();
String usertype=docManager.getUsertype();

//\u5b50\u76ee\u5f55\u4fe1\u606f
recordSet.executeProc("Doc_SecCategory_SelectByID",seccategory+"");
recordSet.next();
String readerCanViewHistoryEdition=Util.null2String(recordSet.getString("readerCanViewHistoryEdition"));

String userInfo=logintype+"_"+userid+"_"+userSeclevelCheck+"_"+userType+"_"+userdepartment+"_"+usersubcomany;
List PdocList = spopForDoc.getDocOpratePopedom(""+detailid,userInfo);

//0:\u67e5\u770b  
boolean canReader = false;
//1:\u7f16\u8f91
boolean canEdit = false;
//2:\u5220\u9664
boolean canDel = false;
//3:\u5171\u4eab
boolean canShare = false ;
//4:\u65e5\u5fd7
boolean canViewLog = false;
//5:\u53ef\u4ee5\u56de\u590d
boolean canReplay = false;
//6:\u6253\u5370
boolean canPrint = false;
//7:\u53d1\u5e03
boolean canPublish = false;
//8:\u5931\u6548
boolean canInvalidate = false;
//9:\u5f52\u6863
boolean canArchive = false;
//10:\u4f5c\u5e9f
boolean canCancel = false;
//11:\u91cd\u65b0\u6253\u5f00
boolean canReopen = false;
//\u7b7e\u51fa
boolean canCheckOut = false;
//\u7b7e\u5165
boolean canCheckIn = false;
//\u5f3a\u5236\u7b7e\u5165
boolean canCheckInCompellably =false ;
//\u65b0\u5efa\u5de5\u4f5c\u6d41
boolean cannewworkflow = true;
//TD12005\u4e0d\u53ef\u4e0b\u8f7d
boolean canDownloadFromShare = false;

if (((String)PdocList.get(0)).equals("true")) canReader = true ;
if (((String)PdocList.get(1)).equals("true")) canEdit = true ;
if (((String)PdocList.get(2)).equals("true")) canDel = true ;
if (((String)PdocList.get(3)).equals("true")) canShare = true ;
if (((String)PdocList.get(4)).equals("true")) canViewLog = true ;
if (((String)PdocList.get(5)).equals("true")) canDownloadFromShare = true ;//TD12005

if(canReader && ((!docstatus.equals("7")&&!docstatus.equals("8")) 
                  ||(docstatus.equals("7")&&ishistory==1&&readerCanViewHistoryEdition.equals("1"))
				  )){
    canReader = true;
}else{
    canReader = false;
}

//\u662f\u5426\u53ef\u4ee5\u67e5\u770b\u5386\u53f2\u7248\u672c
//\u5177\u6709\u7f16\u8f91\u6743\u9650\u7684\u7528\u6237\uff0c\u59cb\u7ec8\u53ef\u89c1\u6587\u6863\u7684\u5386\u53f2\u7248\u672c\uff1b
//\u53ef\u4ee5\u8bbe\u7f6e\u5177\u6709\u53ea\u8bfb\u6743\u9650\u7684\u64cd\u4f5c\u4eba\u662f\u5426\u53ef\u89c1\u5386\u53f2\u7248\u672c\uff1b

if(ishistory==1) {
	//if(SecCategoryComInfo.isReaderCanViewHistoryEdition(seccategory)){
	if(readerCanViewHistoryEdition.equals("1")){
    	if(canReader && !canEdit) canReader = true;
	} else {
	    if(canReader && !canEdit) canReader = false;
	}
}	

//\u7f16\u8f91\u6743\u9650\u64cd\u4f5c\u8005\u53ef\u67e5\u770b\u6587\u6863\u72b6\u6001\u4e3a\uff1a\u201c\u5ba1\u6279\u201d\u3001\u201c\u5f52\u6863\u201d\u3001\u201c\u5f85\u53d1\u5e03\u201d\u6216\u5386\u53f2\u6587\u6863
if(canEdit && ((docstatus.equals("3") || docstatus.equals("5") || docstatus.equals("6") || docstatus.equals("7")) || ishistory==1)) {
	//canEdit = false;
    canReader = true;
}

//if(!canReader) {
//	out.println("no right!");
//	return;
//}

if(docpublishtype.equals("2")){
	int tmppos = doccontent.indexOf("!@#$%^&*");
	if(tmppos!=-1) doccontent = doccontent.substring(tmppos+8,doccontent.length());
}

doccontent = Util.replace(doccontent, "&amp;", "&", 0);
doccontent = doccontent.replaceAll("\u3000", "#SBCnbsp;");//\u5904\u7406\u5168\u89d2\u7a7a\u683c\u4e22\u5931\u95ee\u9898

Whitelist user_content_filter = Whitelist.relaxed();

user_content_filter.addTags("embed","object","param","span","div");
user_content_filter.addAttributes(":all", "style", "class", "id", "name");
user_content_filter.addAttributes("object", "width", "height","classid","codebase");	
user_content_filter.addAttributes("param", "name", "value");
user_content_filter.addAttributes("embed", "src","quality","width","height","allowFullScreen","allowScriptAccess","flashvars","name","type","pluginspage");

String placeholderUri = "http://WeaverReservedURL";
doccontent = Jsoup.clean(doccontent, placeholderUri, user_content_filter).replace(placeholderUri, "");
doccontent = doccontent.replace("#SBCnbsp;", "\u3000");//\u5904\u7406\u5168\u89d2\u7a7a\u683c\u4e22\u5931\u95ee\u9898

int doccreaterid=docManager.getDoccreaterid();

if("Webclient".equalsIgnoreCase(clienttype) || ("1".equals(readnew) && !"Webclient".equalsIgnoreCase(clienttype))) {
	if(userid != doccreaterid || !usertype.equals(logintype)) {
	    rs.executeProc("docReadTag_AddByUser",""+detailid+flag+userid+flag+logintype); 
	    docDetailLog.resetParameter();
	    docDetailLog.setDocId(Util.getIntValue(detailid));
	    docDetailLog.setDocSubject(docsubject);
	    docDetailLog.setOperateType("0");
	    docDetailLog.setOperateUserid(user.getUID());
	    docDetailLog.setUsertype(user.getLogintype());
	    docDetailLog.setClientAddress(ipaddress);
	    docDetailLog.setDocCreater(doccreaterid);
	    docDetailLog.setDocLogInfo();
	}
}

      out.write(_jsp_string9, 0, _jsp_string9.length);
      out.print((docManager.getDocsubject() ));
      out.write(_jsp_string10, 0, _jsp_string10.length);
      out.print((fromWF));
      out.write(_jsp_string11, 0, _jsp_string11.length);
      out.print((fromES));
      out.write(_jsp_string12, 0, _jsp_string12.length);
      out.print((fromcowork));
      out.write(_jsp_string13, 0, _jsp_string13.length);
      out.print((fromTask));
      out.write(_jsp_string14, 0, _jsp_string14.length);
      out.print((fromWF));
      out.write(_jsp_string15, 0, _jsp_string15.length);
      out.print((requestid));
      out.write(_jsp_string16, 0, _jsp_string16.length);
      out.print((module));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((scope));
      out.write(_jsp_string7, 0, _jsp_string7.length);
      out.print((fromRequestid));
      out.write(_jsp_string17, 0, _jsp_string17.length);
      out.print((fromES));
      out.write(_jsp_string18, 0, _jsp_string18.length);
      out.print((fromcowork));
      out.write(_jsp_string19, 0, _jsp_string19.length);
      out.print((fromTask));
      out.write(_jsp_string20, 0, _jsp_string20.length);
      out.print((module));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((scope));
      out.write(_jsp_string21, 0, _jsp_string21.length);
      out.print((coworkid));
      out.write(_jsp_string16, 0, _jsp_string16.length);
      out.print((module));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((scope));
      out.write(_jsp_string22, 0, _jsp_string22.length);
      out.print((module));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((scope));
      out.write(_jsp_string23, 0, _jsp_string23.length);
      out.print((module));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((scope));
      out.write(_jsp_string24, 0, _jsp_string24.length);
      out.print((request.getQueryString()));
      out.write(_jsp_string25, 0, _jsp_string25.length);
      if (clienttype.equals("Webclient")) {
      out.write(_jsp_string26, 0, _jsp_string26.length);
      } else {
      out.write(_jsp_string27, 0, _jsp_string27.length);
      }
      out.write(_jsp_string28, 0, _jsp_string28.length);
      out.print((docManager.getDocsubject() ));
      out.write(_jsp_string29, 0, _jsp_string29.length);
      out.print((resourceComInfo.getLastname(docManager.getDoclastmoduserid()+"") ));
      out.write(_jsp_string30, 0, _jsp_string30.length);
      out.print((docManager.getDoclastmoddate() ));
      out.write(_jsp_string31, 0, _jsp_string31.length);
      out.print((docManager.getDoclastmodtime() ));
      out.write(_jsp_string32, 0, _jsp_string32.length);
      out.print((resourceComInfo.getLastname(docManager.getDoccreaterid()+"") ));
      out.write(_jsp_string30, 0, _jsp_string30.length);
      out.print((docManager.getDoccreatedate() ));
      out.write(_jsp_string31, 0, _jsp_string31.length);
      out.print((docManager.getDoccreatetime() ));
      out.write(_jsp_string33, 0, _jsp_string33.length);
      out.print((resourceComInfo.getLastname(docManager.getOwnerid()+"") ));
      out.write(_jsp_string34, 0, _jsp_string34.length);
      out.print((module));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((scope));
      out.write(_jsp_string35, 0, _jsp_string35.length);
      out.print((detailid));
      out.write(_jsp_string36, 0, _jsp_string36.length);
      out.print((fromWF));
      out.write(_jsp_string37, 0, _jsp_string37.length);
      out.print((requestid));
      out.write(_jsp_string7, 0, _jsp_string7.length);
      out.print((fromRequestid));
      out.write(_jsp_string38, 0, _jsp_string38.length);
      out.print((fromES));
      out.write(_jsp_string39, 0, _jsp_string39.length);
       if(doccontent!=null&&doccontent.length()>0) { 
      out.write(_jsp_string40, 0, _jsp_string40.length);
      out.print((HtmlUtil.translateMarkup(doccontent) ));
      out.write(_jsp_string40, 0, _jsp_string40.length);
       } 
      out.write(_jsp_string41, 0, _jsp_string41.length);
      
		int docImageId = 0;
		int docId = Util.getIntValue(detailid);
		
		rs.executeSql("select * from DocImageFile where docid="+docId+" and (isextfile <> '1' or isextfile is null) and docfiletype <> '1' order by versionId desc");
		if(rs.next()) {
	        String curimgid = rs.getString("imagefileid");
	        long docImagefileSize = docImageManager.getImageFileSize(Util.getIntValue(curimgid));
	        String docImagefilename = Util.null2String(rs.getString("imagefilename"));
	        
	        String docImagefileSizeStr = "";
	        if(docImagefileSize / (1024 * 1024) > 0) {
	        	docImagefileSizeStr = (docImagefileSize / 1024 / 1024) + "M";
	        } else if(docImagefileSize / 1024 > 0) {
	        	docImagefileSizeStr = (docImagefileSize / 1024) + "K";
	        } else {
	        	docImagefileSizeStr = docImagefileSize + "B";
	        }
	        
	        int idx = docImagefilename.length() - 200;
	        String urlfilename = (idx > 0) ? docImagefilename.substring(idx, docImagefilename.length()) : docImagefilename;
	        urlfilename = java.net.URLEncoder.encode(urlfilename,"UTF-8");
		
      out.write(_jsp_string42, 0, _jsp_string42.length);
      out.print((curimgid));
      out.write(_jsp_string16, 0, _jsp_string16.length);
      out.print((module));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((scope));
      out.write(_jsp_string43, 0, _jsp_string43.length);
      out.print((urlfilename));
      out.write(_jsp_string44, 0, _jsp_string44.length);
      out.print((docImagefilename));
      out.write(_jsp_string45, 0, _jsp_string45.length);
      out.print((docImagefileSizeStr));
      out.write(_jsp_string46, 0, _jsp_string46.length);
       }
		
	    docImageManager.resetParameter();
	    docImageManager.setDocid(docId);
	    docImageManager.selectDocImageInfo();
	    while (docImageManager.next()) {
	        int temdiid = docImageManager.getId();
	        if (temdiid == docImageId) {
	            continue;
	        }
	        docImageId = temdiid;
	        String curimgid = docImageManager.getImagefileid();
	       
	        String curimgname = docImageManager.getImagefilename();
	        String docFileType = docImageManager.getDocfiletype();
	        long docImagefileSize = docImageManager.getImageFileSize(Util.getIntValue(curimgid));
	        String docImagefilename = Util.null2String(docImageManager.getImagefilename());
	       
	        int versionId = docImageManager.getVersionId();
	        
	        String docImagefileSizeStr = "";
	        if(docImagefileSize / (1024 * 1024) > 0) {
	        	docImagefileSizeStr = (docImagefileSize / 1024 / 1024) + "M";
	        } else if(docImagefileSize / 1024 > 0) {
	        	docImagefileSizeStr = (docImagefileSize / 1024) + "K";
	        } else {
	        	docImagefileSizeStr = docImagefileSize + "B";
	        }
	        
	        int idx = docImagefilename.length() - 200;
	        String urlfilename = (idx > 0) ? docImagefilename.substring(idx, docImagefilename.length()) : docImagefilename;
	        urlfilename = java.net.URLEncoder.encode(urlfilename,"UTF-8");
		
      out.write(_jsp_string42, 0, _jsp_string42.length);
      out.print((curimgid));
      out.write(_jsp_string16, 0, _jsp_string16.length);
      out.print((module));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((scope));
      out.write(_jsp_string43, 0, _jsp_string43.length);
      out.print((urlfilename));
      out.write(_jsp_string44, 0, _jsp_string44.length);
      out.print((docImagefilename));
      out.write(_jsp_string45, 0, _jsp_string45.length);
      out.print((docImagefileSizeStr));
      out.write(_jsp_string46, 0, _jsp_string46.length);
       } 
      out.write(_jsp_string47, 0, _jsp_string47.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/2/view.jsp"), 1162741892646314797L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string45;
  private final static char []_jsp_string5;
  private final static char []_jsp_string29;
  private final static char []_jsp_string20;
  private final static char []_jsp_string37;
  private final static char []_jsp_string14;
  private final static char []_jsp_string16;
  private final static char []_jsp_string36;
  private final static char []_jsp_string38;
  private final static char []_jsp_string7;
  private final static char []_jsp_string11;
  private final static char []_jsp_string21;
  private final static char []_jsp_string47;
  private final static char []_jsp_string30;
  private final static char []_jsp_string8;
  private final static char []_jsp_string31;
  private final static char []_jsp_string17;
  private final static char []_jsp_string23;
  private final static char []_jsp_string26;
  private final static char []_jsp_string44;
  private final static char []_jsp_string34;
  private final static char []_jsp_string22;
  private final static char []_jsp_string12;
  private final static char []_jsp_string46;
  private final static char []_jsp_string28;
  private final static char []_jsp_string35;
  private final static char []_jsp_string18;
  private final static char []_jsp_string25;
  private final static char []_jsp_string41;
  private final static char []_jsp_string10;
  private final static char []_jsp_string27;
  private final static char []_jsp_string15;
  private final static char []_jsp_string2;
  private final static char []_jsp_string13;
  private final static char []_jsp_string33;
  private final static char []_jsp_string42;
  private final static char []_jsp_string0;
  private final static char []_jsp_string19;
  private final static char []_jsp_string40;
  private final static char []_jsp_string1;
  private final static char []_jsp_string39;
  private final static char []_jsp_string32;
  private final static char []_jsp_string6;
  private final static char []_jsp_string43;
  private final static char []_jsp_string24;
  private final static char []_jsp_string4;
  private final static char []_jsp_string3;
  private final static char []_jsp_string9;
  static {
    _jsp_string45 = "</span></td>\r\n						<td class=\"size\">".toCharArray();
    _jsp_string5 = "&scope=".toCharArray();
    _jsp_string29 = "</div>\r\n		\r\n	</div>\r\n	<div style=\"background-color:#FFFFFF;padding:0px;height:100%\">\r\n	<div id=\"header\">\r\n		<div id=\"title\"></div>\r\n		<div id=\"subhead\">\r\n			\u6700\u540e\u4fee\u6539&nbsp;:&nbsp;".toCharArray();
    _jsp_string20 = "\";\r\n			if(fromES==\"true\"){\r\n				 location = \"/mobile/plugin/fullsearch/list.jsp?module=".toCharArray();
    _jsp_string37 = "&requestid=".toCharArray();
    _jsp_string14 = "\";\r\n		if(fromWF == \"true\" || fromES==\"true\"||fromcowork==\"true\"||fromTask==\"true\") {\r\n			doBack();\r\n			return 1;\r\n		}\r\n	}\r\n	function doBack() {\r\n		var fromWF = \"".toCharArray();
    _jsp_string16 = "&module=".toCharArray();
    _jsp_string36 = "&fromWF=".toCharArray();
    _jsp_string38 = "&fromES=".toCharArray();
    _jsp_string7 = "&fromRequestid=".toCharArray();
    _jsp_string11 = "\";\r\n		var fromES=\"".toCharArray();
    _jsp_string21 = "&fromES=true\";\r\n			}else if(fromcowork==\"true\"){\r\n			     location = '/mobile/plugin/cowork/view.jsp?detailid=".toCharArray();
    _jsp_string47 = "\r\n	\r\n	</div>\r\n	</div>\r\n</div>\r\n\r\n</body>\r\n</html>".toCharArray();
    _jsp_string30 = "&nbsp;,&nbsp;".toCharArray();
    _jsp_string8 = "';\r\n		}\r\n		</script> \r\n	".toCharArray();
    _jsp_string31 = "&nbsp;".toCharArray();
    _jsp_string17 = "';\r\n			return 1;\r\n		} else {\r\n			var fromES=\"".toCharArray();
    _jsp_string23 = "\";\r\n			}else{\r\n			//\u4e0d\u80fd\u5199\u6210\u8fd9\u79cd\u5f62\u5f0f\uff1ahistory.go(-1)\uff0c \u5426\u5219\u5728\u6587\u6863\u6a21\u5757\u4e2d\u8fd4\u56de\u6309\u94ae\u529f\u80fd\u4e0d\u80fd\u6b63\u5e38\u5bfc\u822a\u3002\r\n			location = \"/list.do?module=".toCharArray();
    _jsp_string26 = "display:block;".toCharArray();
    _jsp_string44 = "\">\r\n			<div class=\"attachment\">\r\n				<table style=\"width:100%;table-layout:fixed;\">\r\n					<tr>\r\n						<td class=\"icon\"><img src=\"/images/down_wev8.png\" width=\"24\" height=\"24\"></td>\r\n						<td class=\"name\"><span>".toCharArray();
    _jsp_string34 = "\r\n		</div>\r\n		<a href=\"/mobile/plugin/2/content.jsp?module=".toCharArray();
    _jsp_string22 = "';	\r\n			}else if(fromTask==\"true\"){\r\n				location = \"/mobile/plugin/task/taskDetail.jsp?module=".toCharArray();
    _jsp_string12 = "\";\r\n		var fromcowork=\"".toCharArray();
    _jsp_string46 = "</td>\r\n						<td class=\"flag\"><img src=\"/images/flag_wev8.gif\" width=\"20\" height=\"20\"></td>\r\n					</tr>\r\n				</table>\r\n			</div>\r\n		</a>\r\n		".toCharArray();
    _jsp_string28 = "\">\r\n		<a href=\"javascript:doBack();\">\r\n			<div style=\"position:absolute;left:5px;top:6px;width:56px;height:26px;background:url('/images/bg-top-btn_wev8.png') no-repeat;text-align:center;line-height:26px;color:#000;\">\r\n			\u8fd4\u56de\r\n			</div>\r\n		</a>\r\n		<div id=\"view_title\" style=\"position:absolute;left:65px;top:6px;right:65px;\">".toCharArray();
    _jsp_string35 = "&detailid=".toCharArray();
    _jsp_string18 = "\";\r\n			var fromcowork=\"".toCharArray();
    _jsp_string25 = "\";\r\n		jQuery.ajax({\r\n			type: \"GET\",\r\n			url: ajaxUrl\r\n		});\r\n	}\r\n	\r\n	function img_resize(_this) {\r\n		var innerWidth = window.innerWidth;\r\n		var imgWidth = $(_this).width();\r\n		if (imgWidth >= innerWidth) {\r\n			$(_this).width(\"100%\");\r\n		}\r\n	}\r\n	</script>\r\n</head>\r\n<body>\r\n\r\n<div id=\"view_page\" style=\"height:auto;min-height:100%;background-color:#FFFFFF\">\r\n\r\n	<div id=\"view_header\" style=\"".toCharArray();
    _jsp_string41 = "\r\n	</div>\r\n\r\n	<div id=\"bottom\">\r\n	\r\n		".toCharArray();
    _jsp_string10 = "</title>\r\n	<script type='text/javascript' src='/mobile/plugin/js/jquery/jquery_wev8.js'></script>\r\n	<link rel=\"stylesheet\" href=\"/mobile/plugin/css/mobile_wev8.css\" type=\"text/css\">\r\n	<style type=\"text/css\">\r\n	#header {\r\n		width:100%;\r\n		background: -moz-linear-gradient(top, white, #ECECEC);\r\n		filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#FFFFFF', endColorstr='#ececec');\r\n		background: -webkit-gradient(linear, left top, left bottom, from(#FFFFFF), to(#ECECEC));\r\n		background: -moz-linear-gradient(top, white, #ECECEC);\r\n		border-bottom: #CCC solid 1px;\r\n		filter: alpha(opacity=70);\r\n		-moz-opacity: 0.70;\r\n		opacity: 0.70;\r\n		position:relative;\r\n	}\r\n	#title {\r\n		font-size:16pt;\r\n		font-weight:bold;\r\n		color:#000;\r\n		padding:10px 10px 6px 10px;\r\n		overflow:hidden;\r\n	}\r\n	#subhead {\r\n		padding-left:10px;\r\n		margin-bottom:6px;\r\n		font-size:9pt;\r\n		color:#000;\r\n		overflow:hidden;\r\n	}\r\n	#content,#original {\r\n		color:#3F3F3F;\r\n		padding: 15px 8px 15px 8px;\r\n		min-height: 200px;\r\n		overflow:auto;\r\n		font-family: Arial, Verdana, sans-serif;\r\n	}\r\n	#bottom {\r\n		width:100%;\r\n		top:0px;\r\n	    bottom:0px;\r\n		position:relative;\r\n		padding:20px 0;\r\n	}\r\n	.browser_original_content {\r\n		position:absolute; \r\n		bottom:5px; \r\n		right:10px;\r\n		color:blue;\r\n	}\r\n	.attachment {\r\n		background: -moz-linear-gradient(top, white, #ECECEC);\r\n		filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#FFFFFF', endColorstr='#ececec');\r\n		background: -webkit-gradient(linear, left top, left bottom, from(#FFFFFF), to(#ECECEC));\r\n		background: -moz-linear-gradient(top, white, #ECECEC);\r\n		-moz-border-radius: 8px;  \r\n		-webkit-border-radius: 8px; \r\n		filter: alpha(opacity=70);\r\n		-moz-opacity: 0.70;\r\n		opacity: 0.70;\r\n		border: 1px solid #999; \r\n		padding: 10px;\r\n		margin: 5px 10px;\r\n		position:relative;\r\n	}\r\n	.attachment .icon {\r\n		width:24px;\r\n	}\r\n	.attachment .name {\r\n		font-weight: bold;\r\n		font-size:10pt;\r\n	}\r\n	.attachment .size {\r\n		font-size:9pt;\r\n		color:#777;\r\n		text-align: right;\r\n		width:33px;\r\n	}\r\n	\r\n	.attachment .name span {\r\n        display:inline-block;\r\n        width:100%;\r\n        word-break: break-all;\r\n	}\r\n	\r\n	.attachment .flag {\r\n		width:20px;\r\n	}\r\n	</style>\r\n	<script type=\"text/javascript\">\r\n	function doLeftButton() {\r\n		var fromWF = \"".toCharArray();
    _jsp_string27 = "display:none;".toCharArray();
    _jsp_string15 = "\";\r\n		if(fromWF == \"true\"){\r\n			location = '/mobile/plugin/1/view.jsp?requestid=".toCharArray();
    _jsp_string2 = "\r\n		<script language=javascript>\r\n		if(confirm(\"".toCharArray();
    _jsp_string13 = "\";\r\n		var fromTask = \"".toCharArray();
    _jsp_string33 = "<br/>\r\n			\u6587\u6863\u6240\u6709\u8005&nbsp;:&nbsp;".toCharArray();
    _jsp_string42 = "\r\n		<a href=\"/download.do?fileid=".toCharArray();
    _jsp_string0 = "\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string19 = "\";\r\n			var fromTask = \"".toCharArray();
    _jsp_string40 = "\r\n		".toCharArray();
    _jsp_string1 = "\r\n".toCharArray();
    _jsp_string39 = "\">\r\n		<div class=\"browser_original_content\">\u67e5\u770b\u539f\u6587</div>\r\n		</a>\r\n		<div style=\"clear:both;\"></div>\r\n	</div>\r\n\r\n	<div id=\"content\">\r\n		".toCharArray();
    _jsp_string32 = "<br/>\r\n			\u521b\u5efa&nbsp;:&nbsp;".toCharArray();
    _jsp_string6 = "&fromWF=true&requestid=".toCharArray();
    _jsp_string43 = "&filename=".toCharArray();
    _jsp_string24 = "\";\r\n			}\r\n		}\r\n	}\r\n	//\u53bbnew\u6807\u8bb0\r\n	function reloadData () {\r\n		var ajaxUrl = \"/mobile/plugin/2/view.jsp?_readnew_=1&".toCharArray();
    _jsp_string4 = "+'&module=".toCharArray();
    _jsp_string3 = "\")) {\r\n			location = '/mobile/plugin/2/view.jsp?detailid='+".toCharArray();
    _jsp_string9 = "\r\n<!DOCTYPE html>\r\n<html>\r\n<head>\r\n	<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n	<meta name=\"author\" content=\"Weaver E-Mobile Dev Group\" />\r\n	<meta name=\"description\" content=\"Weaver E-mobile\" />\r\n	<meta name=\"keywords\" content=\"weaver,e-mobile\" />\r\n	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n	<title>".toCharArray();
  }
}
