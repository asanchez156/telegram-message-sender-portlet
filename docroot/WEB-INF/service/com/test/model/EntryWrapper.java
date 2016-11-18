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
 * This class is a wrapper for {@link Entry}.
 * </p>
 *
 * @author asanchez
 * @see Entry
 * @generated
 */
public class EntryWrapper implements Entry, ModelWrapper<Entry> {
	public EntryWrapper(Entry entry) {
		_entry = entry;
	}

	@Override
	public Class<?> getModelClass() {
		return Entry.class;
	}

	@Override
	public String getModelClassName() {
		return Entry.class.getName();
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
		Long tm_Id = (Long)attributes.get("tm_Id");

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
	* Returns the primary key of this entry.
	*
	* @return the primary key of this entry
	*/
	@Override
	public long getPrimaryKey() {
		return _entry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this entry.
	*
	* @param primaryKey the primary key of this entry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_entry.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the tm_ ID of this entry.
	*
	* @return the tm_ ID of this entry
	*/
	@Override
	public long getTm_Id() {
		return _entry.getTm_Id();
	}

	/**
	* Sets the tm_ ID of this entry.
	*
	* @param tm_Id the tm_ ID of this entry
	*/
	@Override
	public void setTm_Id(long tm_Id) {
		_entry.setTm_Id(tm_Id);
	}

	/**
	* Returns the user of this entry.
	*
	* @return the user of this entry
	*/
	@Override
	public java.lang.String getUser() {
		return _entry.getUser();
	}

	/**
	* Sets the user of this entry.
	*
	* @param user the user of this entry
	*/
	@Override
	public void setUser(java.lang.String user) {
		_entry.setUser(user);
	}

	/**
	* Returns the message of this entry.
	*
	* @return the message of this entry
	*/
	@Override
	public java.lang.String getMessage() {
		return _entry.getMessage();
	}

	/**
	* Sets the message of this entry.
	*
	* @param message the message of this entry
	*/
	@Override
	public void setMessage(java.lang.String message) {
		_entry.setMessage(message);
	}

	/**
	* Returns the date of this entry.
	*
	* @return the date of this entry
	*/
	@Override
	public java.lang.String getDate() {
		return _entry.getDate();
	}

	/**
	* Sets the date of this entry.
	*
	* @param date the date of this entry
	*/
	@Override
	public void setDate(java.lang.String date) {
		_entry.setDate(date);
	}

	@Override
	public boolean isNew() {
		return _entry.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_entry.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _entry.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_entry.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _entry.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _entry.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_entry.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _entry.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_entry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_entry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_entry.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EntryWrapper((Entry)_entry.clone());
	}

	@Override
	public int compareTo(com.test.model.Entry entry) {
		return _entry.compareTo(entry);
	}

	@Override
	public int hashCode() {
		return _entry.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.test.model.Entry> toCacheModel() {
		return _entry.toCacheModel();
	}

	@Override
	public com.test.model.Entry toEscapedModel() {
		return new EntryWrapper(_entry.toEscapedModel());
	}

	@Override
	public com.test.model.Entry toUnescapedModel() {
		return new EntryWrapper(_entry.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _entry.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _entry.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_entry.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EntryWrapper)) {
			return false;
		}

		EntryWrapper entryWrapper = (EntryWrapper)obj;

		if (Validator.equals(_entry, entryWrapper._entry)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Entry getWrappedEntry() {
		return _entry;
	}

	@Override
	public Entry getWrappedModel() {
		return _entry;
	}

	@Override
	public void resetOriginalValues() {
		_entry.resetOriginalValues();
	}

	private Entry _entry;
}