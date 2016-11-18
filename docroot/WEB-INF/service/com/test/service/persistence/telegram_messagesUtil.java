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

package com.test.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.test.model.telegram_messages;

import java.util.List;

/**
 * The persistence utility for the telegram_messages service. This utility wraps {@link telegram_messagesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author asanchez
 * @see telegram_messagesPersistence
 * @see telegram_messagesPersistenceImpl
 * @generated
 */
public class telegram_messagesUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(telegram_messages telegram_messages) {
		getPersistence().clearCache(telegram_messages);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<telegram_messages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<telegram_messages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<telegram_messages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static telegram_messages update(telegram_messages telegram_messages)
		throws SystemException {
		return getPersistence().update(telegram_messages);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static telegram_messages update(
		telegram_messages telegram_messages, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(telegram_messages, serviceContext);
	}

	/**
	* Caches the telegram_messages in the entity cache if it is enabled.
	*
	* @param telegram_messages the telegram_messages
	*/
	public static void cacheResult(
		com.test.model.telegram_messages telegram_messages) {
		getPersistence().cacheResult(telegram_messages);
	}

	/**
	* Caches the telegram_messageses in the entity cache if it is enabled.
	*
	* @param telegram_messageses the telegram_messageses
	*/
	public static void cacheResult(
		java.util.List<com.test.model.telegram_messages> telegram_messageses) {
		getPersistence().cacheResult(telegram_messageses);
	}

	/**
	* Creates a new telegram_messages with the primary key. Does not add the telegram_messages to the database.
	*
	* @param tm_Id the primary key for the new telegram_messages
	* @return the new telegram_messages
	*/
	public static com.test.model.telegram_messages create(int tm_Id) {
		return getPersistence().create(tm_Id);
	}

	/**
	* Removes the telegram_messages with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tm_Id the primary key of the telegram_messages
	* @return the telegram_messages that was removed
	* @throws com.test.NoSuchtelegram_messagesException if a telegram_messages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.telegram_messages remove(int tm_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchtelegram_messagesException {
		return getPersistence().remove(tm_Id);
	}

	public static com.test.model.telegram_messages updateImpl(
		com.test.model.telegram_messages telegram_messages)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(telegram_messages);
	}

	/**
	* Returns the telegram_messages with the primary key or throws a {@link com.test.NoSuchtelegram_messagesException} if it could not be found.
	*
	* @param tm_Id the primary key of the telegram_messages
	* @return the telegram_messages
	* @throws com.test.NoSuchtelegram_messagesException if a telegram_messages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.telegram_messages findByPrimaryKey(int tm_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchtelegram_messagesException {
		return getPersistence().findByPrimaryKey(tm_Id);
	}

	/**
	* Returns the telegram_messages with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tm_Id the primary key of the telegram_messages
	* @return the telegram_messages, or <code>null</code> if a telegram_messages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.telegram_messages fetchByPrimaryKey(int tm_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(tm_Id);
	}

	/**
	* Returns all the telegram_messageses.
	*
	* @return the telegram_messageses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.telegram_messages> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.test.model.telegram_messages> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the telegram_messageses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.telegram_messagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of telegram_messageses
	* @param end the upper bound of the range of telegram_messageses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of telegram_messageses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.telegram_messages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the telegram_messageses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of telegram_messageses.
	*
	* @return the number of telegram_messageses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static telegram_messagesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (telegram_messagesPersistence)PortletBeanLocatorUtil.locate(com.test.service.ClpSerializer.getServletContextName(),
					telegram_messagesPersistence.class.getName());

			ReferenceRegistry.registerReference(telegram_messagesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(telegram_messagesPersistence persistence) {
	}

	private static telegram_messagesPersistence _persistence;
}