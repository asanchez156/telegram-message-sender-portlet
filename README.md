# telegram-message-sender-portlet

Liferay portlet that sends messages through https://github.com/asanchez156/api_telegram_client_sender API and stores the message into liferay portal database.

##Installation requirements: 

Donwload Liferay: liferay-portal-6.2-ce-ga5

Download Liferay SDK: liferay-plugins-sdk-6.2

`remember to set the server parent dir into build.*home_user*.properties file which has to be located into liferay sdk plugins folder.`
  
build.user.properties (file) type: `app.server.parent.dir = /home/user/liferay-portal-6.2-ce-ga5`

##Adding this project:
It has to be set into your`./liferay-plugins-sdk-6.2/portlets/` folder.
