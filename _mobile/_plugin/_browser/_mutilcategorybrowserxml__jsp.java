/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin._browser;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import weaver.hrm.*;
import weaver.general.Util;
import weaver.common.util.xtree.TreeNode;
import weaver.docs.category.DocTreeDocFieldConstant;
import java.util.Map;
import java.util.HashMap;
import weaver.file.FileUpload;

public class _mutilcategorybrowserxml__jsp extends com.caucho.jsp.JavaPage
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
      
FileUpload fu = new FileUpload(request);
request.setCharacterEncoding("UTF-8");
response.setContentType("text/html;charset=UTF-8");
  
  User user = HrmUserVarify.getUser(request , response);
  if(user==null){
	  out.println("\u767b\u9646\u8d85\u65f6,\u8bf7\u91cd\u65b0\u767b\u9646!");
	  return ;
  }

      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.docs.category.DocTreelistManager DocTreelistManager;
      DocTreelistManager = (weaver.docs.category.DocTreelistManager) pageContext.getAttribute("DocTreelistManager");
      if (DocTreelistManager == null) {
        DocTreelistManager = new weaver.docs.category.DocTreelistManager();
        pageContext.setAttribute("DocTreelistManager", DocTreelistManager);
      }
      out.write(_jsp_string2, 0, _jsp_string2.length);
      weaver.hrm.company.CompanyComInfo CompanyComInfo;
      CompanyComInfo = (weaver.hrm.company.CompanyComInfo) pageContext.getAttribute("CompanyComInfo");
      if (CompanyComInfo == null) {
        CompanyComInfo = new weaver.hrm.company.CompanyComInfo();
        pageContext.setAttribute("CompanyComInfo", CompanyComInfo);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      

response.setHeader("cache-control", "no-cache");
response.setHeader("pragma", "no-cache");
response.setHeader("expires", "Mon 1 Jan 1990 00:00:00 GMT");


      out.write(_jsp_string1, 0, _jsp_string1.length);
      
boolean needPeop=Util.null2String(request.getParameter("needPeop")).equals("1")?true:false;

//\u88ab\u5c55\u5f00\u7684\u4e0a\u7ea7\u5355\u4f4did
String superId=Util.null2String(request.getParameter("superId"));


//remember maincateids subcateids
String mainCateIds=Util.null2String(request.getParameter("mainCateIds"));
String subCateIds=Util.null2String(request.getParameter("subCateIds"));

String leveltype=Util.null2String(request.getParameter("leveltype"));
String nodlevelid=Util.null2String(request.getParameter("nodlevelid"));
TreeNode envelope=new TreeNode();
envelope.setTitle("envelope");

TreeNode root=new TreeNode();

//String titleName=DocTreelistComInfo.getTreeDocFieldName(DocTreeDocFieldConstant.TREE_DOC_FIELD_ROOT_ID);
String titleName= CompanyComInfo.getCompanyname("1");
root.setTitle(titleName);
root.setNodeId("field_0");
root.setCheckbox("N");
root.setIcon("/images/treeimages/dept16_wev8.gif");
//if(needPeop){
	if(user.getUID()==1) root.setCheckbox("N");
//} else{
//	root.setCheckbox("Y");
//}
root.setValue(DocTreeDocFieldConstant.TREE_DOC_FIELD_ROOT_ID);
root.setOncheck("check(field_0)");

int maxLevel=DocTreeDocFieldConstant.TREE_DOC_FIELD_MAX_LEVEL;
if(superId.equals("") || leveltype.equals("1")){
	envelope.addTreeNode(root);
	if(!"".equals(mainCateIds) && !",".equals(mainCateIds)){
		DocTreelistManager.getTreeDocFieldTreeListRem(root,"0",0,2,"doclistmulti","",needPeop,user,mainCateIds,subCateIds);
	}else{
		DocTreelistManager.getTreeDocFieldTreeList(root,"0",0,2,"doclistmulti","",needPeop,user);
	}

}else if(!superId.equals("") && leveltype.equals("")){
	DocTreelistManager.getTreeDocFieldTreeListSec(envelope,superId,0,2,"doclistmulti","",needPeop,user);

}else if (!superId.equals("") && leveltype.equals("2")){
	DocTreelistManager.getTreeDocFieldTreeListRd(envelope,superId,0,2,"doclistmulti","",needPeop,user);
}

Map iconMap=new HashMap();
iconMap.put("categoryIcon","/images/treeimages/dept16_wev8.gif");
weaver.common.util.string.StringUtil.parseXml(out, envelope);   

      out.write(' ');
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/browser/MutilCategoryBrowserXML.jsp"), -3899740851896193108L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/browser/MobileInit.jsp"), 1397717249655627205L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string0;
  private final static char []_jsp_string2;
  private final static char []_jsp_string1;
  static {
    _jsp_string0 = "\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string2 = "\r\n".toCharArray();
    _jsp_string1 = "\r\n\r\n".toCharArray();
  }
}
