package autoprep.db;


import java.util.List;

import javax.persistence.Entity;

import autoprep.api.BaseRecord;

@Entity
public class TKC_Container extends BaseRecord
{
    
	private String name;
	
	private List<TKC_Container> subContainer;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    /**
     * @return the subContainer
     */
    public List<TKC_Container> getSubContainer()
    {
        return subContainer;
    }

    /**
     * @param subContainer the subContainer to set
     */
    public void setSubContainer(List<TKC_Container> subContainer)
    {
        this.subContainer = subContainer;
    }
	
}
