package autoprep.db;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import autoprep.api.BaseRecord;

@Entity
public class TKC_Item extends BaseRecord
{
    
	private String name;
	
  @OneToOne  
	private TKC_Container container;
	
	private Date expDate;
	
  @OneToOne  
	private TKC_Duration shelfLife;  // TODO this does not belong here, since shelf life is determined my the item type
	
  @OneToOne  
	private TKC_Duration usableLife; // TODO this is determined by the item type and size and therefore doesn't belong here
	
  @OneToOne  
	private TKC_ItemType type;
	
//  @OneToOne  
//	private TKC_Unit unit;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
