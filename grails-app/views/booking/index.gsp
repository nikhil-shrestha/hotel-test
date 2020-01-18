<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <g:set var="entityName" value="${message(code: 'booking.label', default: 'Booking')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>
<a href="#list-booking" class="skip" tabindex="-1"><g:message code="default.link.skip.label"
                                                              default="Skip to content&hellip;"/></a>
<g:render template="/templates/nav"/>
<div id="list-booking" class="content scaffold-list" role="main">
    <h1><g:message code="default.list.label" args="[entityName]"/></h1>
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>
    <f:table collection="${bookingList}"/>

    <div class="pagination">
        <g:paginate total="${bookingCount ?: 0}"/>
    </div>
</div>
<fieldset class="buttons">
    <ul>
        <li><g:link controller="booking" class="create" action="create"><g:message code="default.new.label"
                                                                                   args="[entityName]"/></g:link></li>
    </ul>
</fieldset>
</body>
</html>