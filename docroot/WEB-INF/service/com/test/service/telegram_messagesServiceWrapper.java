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
 * Provides a wrapper for {@link telegram_messagesService}.
 *
 * @author asanchez
 * @see telegram_messagesService
 * @generated
 */
public class telegram_messagesServiceWrapper implements telegram_messagesService,
	ServiceWrapper<telegram_messagesService> {
	public telegram_messagesServiceWrapper(
		telegram_messagesService telegram_messagesService) {
		_telegram_messagesService = telegram_messagesService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _telegram_messagesService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_telegram_messagesService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _telegram_messagesService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public telegram_messagesService getWrappedtelegram_messagesService() {
		return _telegram_messagesService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedtelegram_messagesService(
		telegram_messagesService telegram_messagesService) {
		_telegram_messagesService = telegram_messagesService;
	}

	@Override
	public telegram_messagesService getWrappedService() {
		return _telegram_messagesService;
	}

	@Override
	public void setWrappedService(
		telegram_messagesService telegram_messagesService) {
		_telegram_messagesService = telegram_messagesService;
	}

	private telegram_messagesService _telegram_messagesService;
}