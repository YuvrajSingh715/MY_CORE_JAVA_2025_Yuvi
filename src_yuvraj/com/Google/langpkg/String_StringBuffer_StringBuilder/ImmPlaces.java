package com.Google.langpkg.String_StringBuffer_StringBuilder;

import java.util.List;

final class ImmPlaces {

	private final List<String> locations;

	public ImmPlaces(List<String> locations) {
		this.locations = locations; // direct reference
	}

	public List<String> getLocations() {
		return locations; // returning original list
	}

	@Override
	public String toString() {
		return "ImmPlaces [locations=" + locations + "]";
	}

}
