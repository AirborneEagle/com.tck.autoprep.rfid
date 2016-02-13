package autoprep.db;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import autoprep.api.BaseRecord;

@Entity
public class TKC_Container extends BaseRecord
{
  @OneToOne
	private TKC_ContainerType type;
	
	private List<TKC_Container> subContainer;
	
	@OneToOne
	private TKC_Unit unit;
	
	
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
