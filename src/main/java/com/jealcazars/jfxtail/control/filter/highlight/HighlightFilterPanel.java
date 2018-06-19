package com.jealcazars.jfxtail.control.filter.highlight;

import com.jealcazars.jfxtail.control.filter.AbstractFilterPanel;
import com.jealcazars.jfxtail.utils.JfxTailAppPreferences;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class HighlightFilterPanel extends AbstractFilterPanel<HighlightFilter> {

	@Override
	public String getXmlConfig() {
		return "HighlightFiltersPanel.xml";
	}

	@Override
	public HighlightFilter getFiltertoSave() {
		return new HighlightFilter(getEnabled().isSelected(), getToken().getText(),
				getCombo().getSelectionModel().getSelectedItem());
	}

	@Override
	public ObservableList<HighlightFilter> loadFilters() {
		return FXCollections.observableArrayList(JfxTailAppPreferences.loadHighlightFilters());
	}

	@Override
	public void loadFilterToEdit(HighlightFilter filter) {
		getEnabled().setSelected(filter.isEnabled());
		getToken().setText(filter.getToken());
		getCombo().getSelectionModel().select(filter.getColor());
	}

}
