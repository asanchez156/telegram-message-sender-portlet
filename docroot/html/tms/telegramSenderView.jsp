<%
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects />

<liferay-ui:message key="welcome-second-page" />


<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/html/tms/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addEntry" var="addEntryURL"></portlet:actionURL>

<aui:form action="<%= addEntryURL %>" name="<portlet:namespace />fm">
     <aui:fieldset>
         <aui:input name="user" required="true"></aui:input>
         <aui:input name="message" required="true"></aui:input>
         <aui:input type="radio" label="RPI" name="mode" value="true" checked="true"></aui:input>
         <aui:input type="radio" label="Example" name="mode" value="false"></aui:input>
     </aui:fieldset>
     <aui:button-row>
         <aui:button type="submit" value="Send"></aui:button>
         <aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
     </aui:button-row>
</aui:form>