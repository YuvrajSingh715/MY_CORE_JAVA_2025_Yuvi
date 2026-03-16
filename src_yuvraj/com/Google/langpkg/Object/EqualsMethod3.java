package com.Google.langpkg.Object;

import java.util.Objects;

public class EqualsMethod3 {

	int houseNo;
	String ownerName;
	
	public EqualsMethod3(int houseNo, String ownerName) {
		this.houseNo = houseNo;
		this.ownerName = ownerName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsMethod3 comp = (EqualsMethod3) obj;

		return houseNo == comp.houseNo && Objects.equals(ownerName, comp.ownerName);
		
	}

}
