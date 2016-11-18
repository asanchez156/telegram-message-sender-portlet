package com.test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.ReadOnlyException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ValidatorException;

import org.json.JSONObject;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.OutputStreamWriter;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.test.model.Entry;
import com.test.model.EntryModel;
import com.test.service.EntryLocalServiceUtil;
import com.test.service.telegram_messagesLocalService;
import com.test.service.telegram_messagesLocalServiceUtil;

/**
 * Portlet implementation class MyPortlet
 */
public class TelegramPortlet extends MVCPortlet {

	private static final String URL = "http://85.86.165.252/indaba/sendMessage.php";
	private static final String URL_SAMPLE = "http://echo.jsontest.com/status/0/message/Success";
	
	private static final String USER = "user";
	private static final String MSG = "msg";
	private static final String MESSAGE = "message";
	private static final String DATE = "date";
	private static final String STATUS = "status";

	public void addEntry(ActionRequest request, ActionResponse response) throws SystemException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String user = ParamUtil.getString(request, USER);
		String msg = ParamUtil.getString(request, MESSAGE);
		boolean mode = ParamUtil.getBoolean(request, "mode");
		String date = dateFormat.format(new Date());

		JSONObject json = new JSONObject();
		json.put(USER, user);
		json.put(MSG, msg);
		json.put(STATUS, 0);

		String jsonString = json.toString();

		Logger.getLogger(TelegramPortlet.class.getName()).log(Level.INFO, null, jsonString);
		
		
		boolean sendMessage = false;
		if (mode){
			sendMessage = sendMessage(jsonString, URL);
		}else{
			sendMessage = sendMessage(jsonString, URL_SAMPLE);
		}
		
		if (sendMessage) {
			Entry entry = EntryLocalServiceUtil.createEntry(CounterLocalServiceUtil.increment());
			entry.setUser(user);
			entry.setMessage(msg);
			entry.setDate(date);
			EntryLocalServiceUtil.addEntry(entry);
		}

	}

	private boolean sendMessage(String jsonString, String url) {
		try {
			HttpURLConnection httpcon = (HttpURLConnection) ((new URL(url).openConnection()));
			httpcon.setDoOutput(true);
			httpcon.setDoInput(true);
			httpcon.setRequestProperty("Content-Type", "application/json");
			httpcon.setRequestProperty("Accept", "application/json");
			httpcon.setRequestMethod("POST");
			httpcon.setChunkedStreamingMode(15000);
			httpcon.setConnectTimeout(15000);
			byte[] outputBytes = jsonString.getBytes("UTF-8");

			OutputStreamWriter wr = new OutputStreamWriter(httpcon.getOutputStream());
			wr.write(jsonString);
			wr.flush();

			StringBuffer sb = new StringBuffer();
			InputStream is = null;
			String jsonResponse = "";

			is = new BufferedInputStream(httpcon.getInputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String inputLine = "";

			while ((inputLine = br.readLine()) != null) {
				sb.append(inputLine);
			}
			br.close();
			jsonResponse = sb.toString();

			Logger.getLogger(TelegramPortlet.class.getName()).log(Level.INFO, null, jsonResponse);
			JSONObject json = new JSONObject(jsonResponse);

			httpcon.disconnect();
			if (json.getInt("status") == 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws PortletException, IOException {
		try {
			if (EntryLocalServiceUtil.getEntriesCount() > 0) {
				List<Entry> entriesAux = new ArrayList<Entry>();
				List<Entry> entries = new ArrayList<Entry>();
				entriesAux = EntryLocalServiceUtil.getEntries(0, EntryLocalServiceUtil.getEntriesCount());
				for (Entry e : entriesAux) {
					entries.add(e);
				}
				renderRequest.setAttribute("entries", entries);
			}
		} catch (SystemException e) {
			// e.printStackTrace();
		}
		super.render(renderRequest, renderResponse);
	}

}
