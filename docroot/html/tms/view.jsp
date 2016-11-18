<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects />
<jsp:useBean id="entries" class="java.util.ArrayList" scope="request"/>

<aui:button-row cssClass="my-buttons">
    <portlet:renderURL var="addEntryURL">
        <portlet:param name="mvcPath" value="/html/tms/telegramSenderView.jsp"></portlet:param>
    </portlet:renderURL>
    <aui:button onClick="<%= addEntryURL.toString() %>" value="Show"></aui:button>
</aui:button-row>

<liferay-ui:search-container>
    <liferay-ui:search-container-results results="<%= entries %>"/>
    <liferay-ui:search-container-row className="com.test.model.impl.EntryModelImpl" modelVar="entry">
        <liferay-ui:search-container-column-text property="user" />
        <liferay-ui:search-container-column-text property="message"  />
        <liferay-ui:search-container-column-text property="date" />
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>
