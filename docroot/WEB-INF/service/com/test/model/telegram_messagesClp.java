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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.test.service.ClpSerializer;
import com.test.service.telegram_messagesLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author asanchez
 */
public class telegram_messagesClp extends BaseModelImpl<telegram_messages>
	implements telegram_messages {
	public telegram_messagesClp() {
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
	public int getPrimaryKey() {
		return _tm_Id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setTm_Id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tm_Id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
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

	@Override
	public int getTm_Id() {
		return _tm_Id;
	}

	@Override
	public void setTm_Id(int tm_Id) {
		_tm_Id = tm_Id;

		if (_telegram_messagesRemoteModel != null) {
			try {
				Class<?> clazz = _telegram_messagesRemoteModel.getClass();

				Method method = clazz.getMethod("setTm_Id", int.class);

				method.invoke(_telegram_messagesRemoteModel, tm_Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUser() {
		return _user;
	}

	@Override
	public void setUser(String user) {
		_user = user;

		if (_telegram_messagesRemoteModel != null) {
			try {
				Class<?> clazz = _telegram_messagesRemoteModel.getClass();

				Method method = clazz.getMethod("setUser", String.class);

				method.invoke(_telegram_messagesRemoteModel, user);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMessage() {
		return _message;
	}

	@Override
	public void setMessage(String message) {
		_message = message;

		if (_telegram_messagesRemoteModel != null) {
			try {
				Class<?> clazz = _telegram_messagesRemoteModel.getClass();

				Method method = clazz.getMethod("setMessage", String.class);

				method.invoke(_telegram_messagesRemoteModel, message);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDate() {
		return _date;
	}

	@Override
	public void setDate(String date) {
		_date = date;

		if (_telegram_messagesRemoteModel != null) {
			try {
				Class<?> clazz = _telegram_messagesRemoteModel.getClass();

				Method method = clazz.getMethod("setDate", String.class);

				method.invoke(_telegram_messagesRemoteModel, date);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> gettelegram_messagesRemoteModel() {
		return _telegram_messagesRemoteModel;
	}

	public void settelegram_messagesRemoteModel(
		BaseModel<?> telegram_messagesRemoteModel) {
		_telegram_messagesRemoteModel = telegram_messagesRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _telegram_messagesRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_telegram_messagesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			telegram_messagesLocalServiceUtil.addtelegram_messages(this);
		}
		else {
			telegram_messagesLocalServiceUtil.updatetelegram_messages(this);
		}
	}

	@Override
	public telegram_messages toEscapedModel() {
		return (telegram_messages)ProxyUtil.newProxyInstance(telegram_messages.class.getClassLoader(),
			new Class[] { telegram_messages.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		telegram_messagesClp clone = new telegram_messagesClp();

		clone.setTm_Id(getTm_Id());
		clone.setUser(getUser());
		clone.setMessage(getMessage());
		clone.setDate(getDate());

		return clone;
	}

	@Override
	public int compareTo(telegram_messages telegram_messages) {
		int value = 0;

		value = getDate().compareTo(telegram_messages.getDate());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof telegram_messagesClp)) {
			return false;
		}

		telegram_messagesClp telegram_messages = (telegram_messagesClp)obj;

		int primaryKey = telegram_messages.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{tm_Id=");
		sb.append(getTm_Id());
		sb.append(", user=");
		sb.append(getUser());
		sb.append(", message=");
		sb.append(getMessage());
		sb.append(", date=");
		sb.append(getDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.test.model.telegram_messages");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>tm_Id</column-name><column-value><![CDATA[");
		sb.append(getTm_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>user</column-name><column-value><![CDATA[");
		sb.append(getUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>message</column-name><column-value><![CDATA[");
		sb.append(getMessage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>date</column-name><column-value><![CDATA[");
		sb.append(getDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _tm_Id;
	private String _user;
	private String _message;
	private String _date;
	private BaseModel<?> _telegram_messagesRemoteModel;
	private Class<?> _clpSerializerClass = com.test.service.ClpSerializer.class;
}