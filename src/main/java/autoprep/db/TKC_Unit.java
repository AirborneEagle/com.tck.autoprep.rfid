package autoprep.db;


import javax.persistence.Entity;
import javax.persistence.OneToOne;

import autoprep.api.BaseRecord;

@Entity
public class TKC_Unit extends BaseRecord
{
  @OneToOne  
	private TKC_UnitName name;

	private int unitQty;

	
	 
	public TKC_UnitName getName() {
		return name;
	}

	public void setName(TKC_UnitName name) {
		this.name = name;
	}

    /**
     * @return the unitQty
     */
    public int getUnitQty()
    {
        return unitQty;
    }

    /**
     * @param unitQty the unitQty to set
     */
    public void setUnitQty(int unitQty)
    {
        this.unitQty = unitQty;
    }
	
}
