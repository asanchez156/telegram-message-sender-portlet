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

package com.test.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link telegram_messages}.
 * </p>
 *
 * @author asanchez
 * @see telegram_messages
 * @generated
 */
public class telegram_messagesWrapper implements telegram_messages,
	ModelWrapper<telegram_messages> {
	public telegram_messagesWrapper(telegram_messages telegram_messages) {
		_telegram_messages = telegram_messages;
	}

	@Override
	public Class<?> getModelClass() {
		return telegram_messages.class;
	}

	@Override
	public String getModelClassName() {
		return telegram_messages.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tm_Id", getTm_Id());
		attributes.put("user", getUser());
		attributes.put("message", getMessage());
		attributes.put("date", getDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer tm_Id = (Integer)attributes.get("tm_Id");

		if (tm_Id != null) {
			setTm_Id(tm_Id);
		}

		String user = (String)attributes.get("user");

		if (user != null) {
			setUser(user);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}

		String date = (String)attributes.get("date");

		if (date != null) {
			setDate(date);
		}
	}

	/**
	* Returns the primary key of this telegram_messages.
	*
	* @return the primary key of this telegram_messages
	*/
	@Override
	public int getPrimaryKey() {
		return _telegram_messages.getPrimaryKey();
	}

	/**
	* Sets the primary key of this telegram_messages.
	*
	* @param primaryKey the primary key of this telegram_messages
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_telegram_messages.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the tm_ ID of this telegram_messages.
	*
	* @return the tm_ ID of this telegram_messages
	*/
	@Override
	public int getTm_Id() {
		return _telegram_messages.getTm_Id();
	}

	/**
	* Sets the tm_ ID of this telegram_messages.
	*
	* @param tm_Id the tm_ ID of this telegram_messages
	*/
	@Override
	public void setTm_Id(int tm_Id) {
		_telegram_messages.setTm_Id(tm_Id);
	}

	/**
	* Returns the user of this telegram_messages.
	*
	* @return the user of this telegram_messages
	*/
	@Override
	public java.lang.String getUser() {
		return _telegram_messages.getUser();
	}

	/**
	* Sets the user of this telegram_messages.
	*
	* @param user the user of this telegram_messages
	*/
	@Override
	public void setUser(java.lang.String user) {
		_telegram_messages.setUser(user);
	}

	/**
	* Returns the message of this telegram_messages.
	*
	* @return the message of this telegram_messages
	*/
	@Override
	public java.lang.String getMessage() {
		return _telegram_messages.getMessage();
	}

	/**
	* Sets the message of this telegram_messages.
	*
	* @param message the message of this telegram_messages
	*/
	@Override
	public void setMessage(java.lang.String message) {
		_telegram_messages.setMessage(message);
	}

	/**
	* Returns the date of this telegram_messages.
	*
	* @return the date of this telegram_messages
	*/
	@Override
	public java.lang.String getDate() {
		return _telegram_messages.getDate();
	}

	/**
	* Sets the date of this telegram_messages.
	*
	* @param date the date of this telegram_messages
	*/
	@Override
	public void setDate(java.lang.String date) {
		_telegram_messages.setDate(date);
	}

	@Override
	public boolean isNew() {
		return _telegram_messages.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_telegram_messages.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _telegram_messages.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_telegram_messages.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _telegram_messages.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _telegram_messages.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_telegram_messages.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _telegram_messages.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_telegram_messages.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_telegram_messages.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_telegram_messages.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new telegram_messagesWrapper((telegram_messages)_telegram_messages.clone());
	}

	@Override
	public int compareTo(com.test.model.telegram_messages telegram_messages) {
		return _telegram_messages.compareTo(telegram_messages);
	}

	@Override
	public int hashCode() {
		return _telegram_messages.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.test.model.telegram_messages> toCacheModel() {
		return _telegram_messages.toCacheModel();
	}

	@Override
	public com.test.model.telegram_messages toEscapedModel() {
		return new telegram_messagesWrapper(_telegram_messages.toEscapedModel());
	}

	@Override
	public com.test.model.telegram_messages toUnescapedModel() {
		return new telegram_messagesWrapper(_telegram_messages.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _telegram_messages.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _telegram_messages.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_telegram_messages.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof telegram_messagesWrapper)) {
			return false;
		}

		telegram_messagesWrapper telegram_messagesWrapper = (telegram_messagesWrapper)obj;

		if (Validator.equals(_telegram_messages,
					telegram_messagesWrapper._telegram_messages)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public telegram_messages getWrappedtelegram_messages() {
		return _telegram_messages;
	}

	@Override
	public telegram_messages getWrappedModel() {
		return _telegram_messages;
	}

	@Override
	public void resetOriginalValues() {
		_telegram_messages.resetOriginalValues();
	}

	private telegram_messages _telegram_messages;
}