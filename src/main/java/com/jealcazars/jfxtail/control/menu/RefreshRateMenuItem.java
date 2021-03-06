package com.jealcazars.jfxtail.control.menu;

import java.util.logging.Logger;

import com.jealcazars.jfxtail.utils.JfxTailAppPreferences;

public class RefreshRateMenuItem extends AbstractIntDialogMenuItem {
	private static final Logger LOG = Logger.getLogger(RefreshRateMenuItem.class.getName());

	public RefreshRateMenuItem() {
		super("Refresh Rate", "Refresh Rate im ms:");
	}

	@Override
	public void save(Integer result) {
		LOG.fine("RefreshRateMenuItem new value:" + result);
		JfxTailAppPreferences.setRefreshRate(result);
	}

	@Override
	public Integer getDefaultValue() {
		return JfxTailAppPreferences.getRefreshRate();
	}

}
