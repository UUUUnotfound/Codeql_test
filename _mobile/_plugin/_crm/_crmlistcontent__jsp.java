/*
 * JSP generated by Resin-3.1.8 (built Mon, 17 Nov 2008 12:15:21 PST)
 */

package _jsp._mobile._plugin._crm;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import weaver.hrm.resource.ResourceComInfo;
import weaver.splitepage.transform.SptmForMail;
import weaver.general.SplitPageParaBean;
import weaver.general.SplitPageUtil;
import weaver.conn.RecordSet;
import java.util.*;
import weaver.hrm.*;
import weaver.systeminfo.*;
import weaver.general.StaticObj;
import weaver.general.Util;
import weaver.hrm.settings.RemindSettings;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class _crmlistcontent__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;

  
  		
  			public String getTableString(RecordSet rs ,User user){
  				
  				String id=rs.getString("id");
  				String name=rs.getString("name");
  			    
  				String sql="select top 1 id,fullname,mobilephone from CRM_CustomerContacter where customerid ="+id+" order by main desc,id desc";
  				RecordSet recordSet=new RecordSet();
  				if(recordSet.getDBType().equals("oracle")){
  					sql="select id,fullname,mobilephone from (select * from CRM_CustomerContacter order by main desc,id desc) t3 where t3.customerid ="+id+" and rownum = 1";
  				}
  				recordSet.execute(sql);
  				
  				String str="";
  					 str+="<div class='listitem'  >";
  					 str+="<table   id='tbl_"+id+"'  style='width:100%;height:100%;border:0;cellspacing:0;cellpadding:0;table-layout:fixed;'>";
  					 str+="<tbody>";
  					 str+="	<tr><td class='itempreview'>";
  					 str+="	</td>";
  					 str+="	<td class='itemcontent  trclick'  _id='"+id+"' _folderid='"+0+"' _star='"+0+"'  _isInternal='"+0+"'>";
  					 str+="	<div class='itemcontenttitle'>";
  					 str+="	<table style='width:100%;height:100%;border:0;cellspacing:0;cellpadding:0;table-layout:fixed;'>";
  					 str+="	<tbody>";
  					 str+="	<tr><td class='ictwz'>"+name+"</td>";
  					 str+="	</tr></tbody>";
  					 str+="	</table>";
  					 str+="	</div>";
  					 if(recordSet.next()){
  					 	str+="	<div class='itemcontentitdt'> \u8054\u7cfb\u4eba:"+recordSet.getString("fullname")+"&nbsp;&nbsp;"+"\u7535\u8bdd\uff1a"+recordSet.getString("mobilephone")+"</div>";
  					 }	
  					 str+="</td>";
  					 str+="<td class='itemnavpoint'   _id='"+id+"' _folderid='"+0+"' _star='"+1+"' _isInternal='"+1+"'>";
  					 str+="<img src='/images/icon-right_wev8.png'>";
  					 str+="</td></tr></tbody>";
  					 str+="</table></div>";
  				return str;
  			}		
  		
  		
  
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
      weaver.crm.CrmShareBase CrmShareBase;
      CrmShareBase = (weaver.crm.CrmShareBase) pageContext.getAttribute("CrmShareBase");
      if (CrmShareBase == null) {
        CrmShareBase = new weaver.crm.CrmShareBase();
        pageContext.setAttribute("CrmShareBase", CrmShareBase);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      weaver.conn.RecordSet recordSet;
      recordSet = (weaver.conn.RecordSet) pageContext.getAttribute("recordSet");
      if (recordSet == null) {
        recordSet = new weaver.conn.RecordSet();
        pageContext.setAttribute("recordSet", recordSet);
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      
	String userid=""+user.getUID();
	String backfields="t1.id,t1.name";
	String leftjointable = CrmShareBase.getTempTable(userid);
	String sqlform = "from CRM_CustomerInfo t1 left join "+leftjointable+" t2 on t1.id = t2.relateditemid";
	String sqlprimarykey="t1.id";
	String sqlwhere="t1.deleted = 0  and t1.id = t2.relateditemid";
	String orderBy = "t1.id";
	
	String name=Util.null2String(request.getParameter("name"));
	String sector=Util.null2String(request.getParameter("sector"));
	String type=Util.null2String(request.getParameter("type"));
	
	if(!name.equals(""))
		sqlwhere+=" and name like '%"+name+"%'";
	
	if(!sector.equals(""))
		sqlwhere+=" and sector='"+sector+"'";
	
	if(!type.equals(""))
		sqlwhere+=" and type='"+type+"'";
	
	SplitPageParaBean spp = new SplitPageParaBean();
	SplitPageUtil spu=new SplitPageUtil();
	
	spp.setBackFields(backfields);
	spp.setSqlFrom(sqlform);
	spp.setPrimaryKey(sqlprimarykey);
	spp.setSqlOrderBy(orderBy);
	spp.setSortWay(spp.DESC);
	spp.setDistinct(true);
	
	spp.setSqlWhere(sqlwhere);
	spu.setSpp(spp);
	
	int total = spu.getRecordCount();
	int pagesize=10;
	int pageIndex = Util.getIntValue(request.getParameter("index"),1);
	
	int totalpage=total%pagesize==0?total/pagesize:(total/pagesize+1);
	RecordSet rs = spu.getCurrentPageRs(pageIndex, pagesize);
	 
	//\u52a0\u8f7d\u6570\u636e\u7684\u65b9\u5f0f\uff0c0\u9ed8\u8ba4\u52a0\u8f7d\uff0c1\u66f4\u591a\u52a0\u8f7d
	String loadtype=Util.null2String(request.getParameter("loadtype"));
	StringBuffer day0Table = new StringBuffer();
	while(rs.next()){
		day0Table.append(getTableString(rs,user));	
	}
	if("0".equals(loadtype)){
		//\u9ed8\u8ba4\u52a0\u8f7d\u7684\u65f6\u5019\uff0c\u624d\u8f93\u51fa\u8fd9\u4e2a
		day0Table.append("<input type='hidden' name='TotalPage'  id='TotalPage'  value='"+totalpage+"'>");	
	}
	out.clear();

      out.write(_jsp_string2, 0, _jsp_string2.length);
      out.print((day0Table.toString() ));
      out.write(_jsp_string3, 0, _jsp_string3.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("mobile/plugin/crm/CrmListContent.jsp"), -8715119705023645437L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("page/maint/common/initNoCache.jsp"), 3270256153856711871L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string0;
  private final static char []_jsp_string3;
  private final static char []_jsp_string2;
  private final static char []_jsp_string1;
  static {
    _jsp_string0 = "\r\n \r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string3 = "\r\n\r\n		".toCharArray();
    _jsp_string2 = "\r\n		".toCharArray();
    _jsp_string1 = "\r\n".toCharArray();
  }
}
