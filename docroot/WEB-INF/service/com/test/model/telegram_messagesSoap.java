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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.test.service.http.telegram_messagesServiceSoap}.
 *
 * @author asanchez
 * @see com.test.service.http.telegram_messagesServiceSoap
 * @generated
 */
public class telegram_messagesSoap implements Serializable {
	public static telegram_messagesSoap toSoapModel(telegram_messages model) {
		telegram_messagesSoap soapModel = new telegram_messagesSoap();

		soapModel.setTm_Id(model.getTm_Id());
		soapModel.setUser(model.getUser());
		soapModel.setMessage(model.getMessage());
		soapModel.setDate(model.getDate());

		return soapModel;
	}

	public static telegram_messagesSoap[] toSoapModels(
		telegram_messages[] models) {
		telegram_messagesSoap[] soapModels = new telegram_messagesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static telegram_messagesSoap[][] toSoapModels(
		telegram_messages[][] models) {
		telegram_messagesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new telegram_messagesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new telegram_messagesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static telegram_messagesSoap[] toSoapModels(
		List<telegram_messages> models) {
		List<telegram_messagesSoap> soapModels = new ArrayList<telegram_messagesSoap>(models.size());

		for (telegram_messages model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new telegram_messagesSoap[soapModels.size()]);
	}

	public telegram_messagesSoap() {
	}

	public int getPrimaryKey() {
		return _tm_Id;
	}

	public void setPrimaryKey(int pk) {
		setTm_Id(pk);
	}

	public int getTm_Id() {
		return _tm_Id;
	}

	public void setTm_Id(int tm_Id) {
		_tm_Id = tm_Id;
	}

	public String getUser() {
		return _user;
	}

	public void setUser(String user) {
		_user = user;
	}

	public String getMessage() {
		return _message;
	}

	public void setMessage(String message) {
		_message = message;
	}

	public String getDate() {
		return _date;
	}

	public void setDate(String date) {
		_date = date;
	}

	private int _tm_Id;
	private String _user;
	private String _message;
	private String _date;
}