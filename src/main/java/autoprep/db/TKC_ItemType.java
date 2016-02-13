package autoprep.db;


import javax.persistence.Entity;
import javax.persistence.OneToOne;

import autoprep.api.BaseRecord;

@Entity
public class TKC_ItemType extends BaseRecord
{
    
	private String name;
	
	@OneToOne
	private TKC_ItemType subType;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
