package org.vaadin.spreadsheet.gwt.client;

import org.vaadin.spreadsheet.Spreadsheet;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.terminal.gwt.client.communication.StateChangeEvent;
import com.vaadin.terminal.gwt.client.ui.AbstractComponentConnector;
import com.vaadin.terminal.gwt.client.ui.Connect;

@Connect(value = Spreadsheet.class)
public class SpreadsheetConnector extends AbstractComponentConnector {

	protected Widget createWidget() {		
		return GWT.create(SpreadsheetView.class);
	}

	@Override
	public SpreadsheetView getWidget() {
		return (SpreadsheetView) super.getWidget();
	}
	
	@Override
	public SpreadsheetState getState() {
		return (SpreadsheetState) super.getState();
	}
	
	@Override
	public void onStateChanged(StateChangeEvent stateChangeEvent) {
		super.onStateChanged(stateChangeEvent);
		getWidget().setModel(getState());
	}
}
