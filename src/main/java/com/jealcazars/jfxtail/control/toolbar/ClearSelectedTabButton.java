package com.jealcazars.jfxtail.control.toolbar;

import java.util.logging.Logger;

import com.jealcazars.jfxtail.control.LogFileTab;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;

public class ClearSelectedTabButton extends Button {
	private static final Logger LOG = Logger.getLogger(ClearSelectedTabButton.class.getName());

	public ClearSelectedTabButton() {

		setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				LOG.fine("ClearSelectedTabButtonClick");
				TabPane tabPane = (TabPane) ((Node) event.getSource()).getScene().lookup("#logFilesTabPane");
				if (tabPane.getSelectionModel().getSelectedItem() != null) {
					((LogFileTab) tabPane.getSelectionModel().getSelectedItem()).clear();
				}
			}
		});

	}
}
