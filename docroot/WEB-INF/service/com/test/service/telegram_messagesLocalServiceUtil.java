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

package com.test.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for telegram_messages. This utility wraps
 * {@link com.test.service.impl.telegram_messagesLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author asanchez
 * @see telegram_messagesLocalService
 * @see com.test.service.base.telegram_messagesLocalServiceBaseImpl
 * @see com.test.service.impl.telegram_messagesLocalServiceImpl
 * @generated
 */
public class telegram_messagesLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.test.service.impl.telegram_messagesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the telegram_messages to the database. Also notifies the appropriate model listeners.
	*
	* @param telegram_messages the telegram_messages
	* @return the telegram_messages that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.telegram_messages addtelegram_messages(
		com.test.model.telegram_messages telegram_messages)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addtelegram_messages(telegram_messages);
	}

	/**
	* Creates a new telegram_messages with the primary key. Does not add the telegram_messages to the database.
	*
	* @param tm_Id the primary key for the new telegram_messages
	* @return the new telegram_messages
	*/
	public static com.test.model.telegram_messages createtelegram_messages(
		int tm_Id) {
		return getService().createtelegram_messages(tm_Id);
	}

	/**
	* Deletes the telegram_messages with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tm_Id the primary key of the telegram_messages
	* @return the telegram_messages that was removed
	* @throws PortalException if a telegram_messages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.telegram_messages deletetelegram_messages(
		int tm_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletetelegram_messages(tm_Id);
	}

	/**
	* Deletes the telegram_messages from the database. Also notifies the appropriate model listeners.
	*
	* @param telegram_messages the telegram_messages
	* @return the telegram_messages that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.telegram_messages deletetelegram_messages(
		com.test.model.telegram_messages telegram_messages)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletetelegram_messages(telegram_messages);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.telegram_messagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.telegram_messagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.test.model.telegram_messages fetchtelegram_messages(
		int tm_Id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchtelegram_messages(tm_Id);
	}

	/**
	* Returns the telegram_messages with the primary key.
	*
	* @param tm_Id the primary key of the telegram_messages
	* @return the telegram_messages
	* @throws PortalException if a telegram_messages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.telegram_messages gettelegram_messages(
		int tm_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().gettelegram_messages(tm_Id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the telegram_messageses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.telegram_messagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of telegram_messageses
	* @param end the upper bound of the range of telegram_messageses (not inclusive)
	* @return the range of telegram_messageses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.telegram_messages> gettelegram_messageses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().gettelegram_messageses(start, end);
	}

	/**
	* Returns the number of telegram_messageses.
	*
	* @return the number of telegram_messageses
	* @throws SystemException if a system exception occurred
	*/
	public static int gettelegram_messagesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().gettelegram_messagesesCount();
	}

	/**
	* Updates the telegram_messages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param telegram_messages the telegram_messages
	* @return the telegram_messages that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.telegram_messages updatetelegram_messages(
		com.test.model.telegram_messages telegram_messages)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatetelegram_messages(telegram_messages);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static telegram_messagesLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					telegram_messagesLocalService.class.getName());

			if (invokableLocalService instanceof telegram_messagesLocalService) {
				_service = (telegram_messagesLocalService)invokableLocalService;
			}
			else {
				_service = new telegram_messagesLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(telegram_messagesLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(telegram_messagesLocalService service) {
	}

	private static telegram_messagesLocalService _service;
}