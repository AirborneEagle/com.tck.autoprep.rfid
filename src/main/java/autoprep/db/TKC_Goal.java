package autoprep.db;


import javax.persistence.Entity;

import autoprep.api.BaseRecord;

@Entity
public class TKC_Goal extends BaseRecord
{
    
	private String name;
	
	private TKC_Duration time;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    /**
     * @return the time
     */
    public TKC_Duration getTime()
    {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(TKC_Duration time)
    {
        this.time = time;
    }
	
}
