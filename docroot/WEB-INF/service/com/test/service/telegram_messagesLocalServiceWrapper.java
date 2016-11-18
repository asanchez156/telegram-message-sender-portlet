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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link telegram_messagesLocalService}.
 *
 * @author asanchez
 * @see telegram_messagesLocalService
 * @generated
 */
public class telegram_messagesLocalServiceWrapper
	implements telegram_messagesLocalService,
		ServiceWrapper<telegram_messagesLocalService> {
	public telegram_messagesLocalServiceWrapper(
		telegram_messagesLocalService telegram_messagesLocalService) {
		_telegram_messagesLocalService = telegram_messagesLocalService;
	}

	/**
	* Adds the telegram_messages to the database. Also notifies the appropriate model listeners.
	*
	* @param telegram_messages the telegram_messages
	* @return the telegram_messages that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.telegram_messages addtelegram_messages(
		com.test.model.telegram_messages telegram_messages)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _telegram_messagesLocalService.addtelegram_messages(telegram_messages);
	}

	/**
	* Creates a new telegram_messages with the primary key. Does not add the telegram_messages to the database.
	*
	* @param tm_Id the primary key for the new telegram_messages
	* @return the new telegram_messages
	*/
	@Override
	public com.test.model.telegram_messages createtelegram_messages(int tm_Id) {
		return _telegram_messagesLocalService.createtelegram_messages(tm_Id);
	}

	/**
	* Deletes the telegram_messages with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tm_Id the primary key of the telegram_messages
	* @return the telegram_messages that was removed
	* @throws PortalException if a telegram_messages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.telegram_messages deletetelegram_messages(int tm_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _telegram_messagesLocalService.deletetelegram_messages(tm_Id);
	}

	/**
	* Deletes the telegram_messages from the database. Also notifies the appropriate model listeners.
	*
	* @param telegram_messages the telegram_messages
	* @return the telegram_messages that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.telegram_messages deletetelegram_messages(
		com.test.model.telegram_messages telegram_messages)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _telegram_messagesLocalService.deletetelegram_messages(telegram_messages);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _telegram_messagesLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _telegram_messagesLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _telegram_messagesLocalService.dynamicQuery(dynamicQuery, start,
			end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _telegram_messagesLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _telegram_messagesLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _telegram_messagesLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.test.model.telegram_messages fetchtelegram_messages(int tm_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _telegram_messagesLocalService.fetchtelegram_messages(tm_Id);
	}

	/**
	* Returns the telegram_messages with the primary key.
	*
	* @param tm_Id the primary key of the telegram_messages
	* @return the telegram_messages
	* @throws PortalException if a telegram_messages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.telegram_messages gettelegram_messages(int tm_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _telegram_messagesLocalService.gettelegram_messages(tm_Id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _telegram_messagesLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.test.model.telegram_messages> gettelegram_messageses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _telegram_messagesLocalService.gettelegram_messageses(start, end);
	}

	/**
	* Returns the number of telegram_messageses.
	*
	* @return the number of telegram_messageses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int gettelegram_messagesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _telegram_messagesLocalService.gettelegram_messagesesCount();
	}

	/**
	* Updates the telegram_messages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param telegram_messages the telegram_messages
	* @return the telegram_messages that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.telegram_messages updatetelegram_messages(
		com.test.model.telegram_messages telegram_messages)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _telegram_messagesLocalService.updatetelegram_messages(telegram_messages);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _telegram_messagesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_telegram_messagesLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _telegram_messagesLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public telegram_messagesLocalService getWrappedtelegram_messagesLocalService() {
		return _telegram_messagesLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedtelegram_messagesLocalService(
		telegram_messagesLocalService telegram_messagesLocalService) {
		_telegram_messagesLocalService = telegram_messagesLocalService;
	}

	@Override
	public telegram_messagesLocalService getWrappedService() {
		return _telegram_messagesLocalService;
	}

	@Override
	public void setWrappedService(
		telegram_messagesLocalService telegram_messagesLocalService) {
		_telegram_messagesLocalService = telegram_messagesLocalService;
	}

	private telegram_messagesLocalService _telegram_messagesLocalService;
}