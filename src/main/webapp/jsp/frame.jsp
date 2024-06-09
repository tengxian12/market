<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/jsp/common/head.jsp"%>
<div class="right">
    <img class="wColck" src="${pageContext.request.contextPath }/images/clock.jpg" alt=""/>
    <div class="wFont">
        <h2>${userSession.userName }</h2>
        <%--<input type="hidden" id="referer" name="referer" value="<%= org.apache.commons.lang.StringEscapeUtils.escapeHtml(request.getHeader("Referer")) %>"/>
--%>
        <!--对 Referer 值进行适当的转义，确保其不会被当作 HTML 或 JavaScript 代码执行-->
        <p>欢迎来到超市订单管理系统!</p>
    </div>
</div>
</section>
<%@include file="/jsp/common/foot.jsp" %>
