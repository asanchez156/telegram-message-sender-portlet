create table Event_Entry (
	tm_Id LONG not null primary key,
	user VARCHAR(75) null,
	message VARCHAR(75) null,
	date_ VARCHAR(75) null
);

create table Event_telegram_messages (
	tm_Id INTEGER not null primary key,
	user VARCHAR(75) null,
	message VARCHAR(75) null,
	date_ VARCHAR(75) null
);