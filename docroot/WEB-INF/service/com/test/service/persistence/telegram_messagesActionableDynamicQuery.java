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

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.test.model.telegram_messages;

import com.test.service.telegram_messagesLocalServiceUtil;

/**
 * @author asanchez
 * @generated
 */
public abstract class telegram_messagesActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public telegram_messagesActionableDynamicQuery() throws SystemException {
		setBaseLocalService(telegram_messagesLocalServiceUtil.getService());
		setClass(telegram_messages.class);

		setClassLoader(com.test.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("tm_Id");
	}
}