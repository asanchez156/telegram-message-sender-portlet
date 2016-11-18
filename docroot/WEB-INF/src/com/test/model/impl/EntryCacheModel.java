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

package com.test.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.test.model.Entry;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Entry in entity cache.
 *
 * @author asanchez
 * @see Entry
 * @generated
 */
public class EntryCacheModel implements CacheModel<Entry>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{tm_Id=");
		sb.append(tm_Id);
		sb.append(", user=");
		sb.append(user);
		sb.append(", message=");
		sb.append(message);
		sb.append(", date=");
		sb.append(date);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Entry toEntityModel() {
		EntryImpl entryImpl = new EntryImpl();

		entryImpl.setTm_Id(tm_Id);

		if (user == null) {
			entryImpl.setUser(StringPool.BLANK);
		}
		else {
			entryImpl.setUser(user);
		}

		if (message == null) {
			entryImpl.setMessage(StringPool.BLANK);
		}
		else {
			entryImpl.setMessage(message);
		}

		if (date == null) {
			entryImpl.setDate(StringPool.BLANK);
		}
		else {
			entryImpl.setDate(date);
		}

		entryImpl.resetOriginalValues();

		return entryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tm_Id = objectInput.readLong();
		user = objectInput.readUTF();
		message = objectInput.readUTF();
		date = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(tm_Id);

		if (user == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(user);
		}

		if (message == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(message);
		}

		if (date == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(date);
		}
	}

	public long tm_Id;
	public String user;
	public String message;
	public String date;
}