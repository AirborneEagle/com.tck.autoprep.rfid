package autoprep.db;


import javax.persistence.Entity;

import autoprep.api.BaseRecord;

@Entity
public class TKC_ItemType extends BaseRecord
{
    
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
